package BBDD.sqlite;

import Clases.*;
import java.sql.*;

public class SQLITE_BD {
    
    public final static String schema = "ad_parques_tematicos";
    public final static String rutaLocalBD = "C:/sqlite/"+schema+".db";
    public final static String url = "jdbc:sqlite:"+rutaLocalBD;
    
    public SQLITE_BD(){

    }
        
    public static Connection conectarBD(){
        try{
            return DriverManager.getConnection(url);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }
    
    public static void ComprobarYPrepararBD() throws Exception{
        Connection conexion = conectarBD();
        if(conexion != null){
            ComprobarTablas(conexion);
            conexion.close();
        }else{
            System.out.println("SQLITE: Ha ocurrido un error al hacer la conexión con la BD SQLite");
            throw new Exception("Ha ocurrido un error al hacer la conexión con la BD SQLite");
        }
    }
    
    private static void ComprobarTablas(Connection conexion)throws Exception {
        try{
            ComprobarTablaPARQUE(conexion);
            ComprobarTablaEMPLEADOS(conexion);
            ComprobarTablaCLIENTES(conexion);
            ComprobarTablaESPECTACULOS(conexion);
            ComprobarTablaESPECTACULO_CLIENTE(conexion);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
    private static void ComprobarTablaPARQUE(Connection con) throws Exception{
        if(!ExisteTabla(con, "PARQUE")){
            try{
                System.out.println("SQLITE: no se ha detectado la tabla \"PARQUE\"");
                StringBuilder sql = new StringBuilder();
                sql.append("CREATE TABLE PARQUE( ");
                sql.append("ID INTEGER PRIMARY KEY AUTOINCREMENT, ");
                sql.append("NOMBRE VARCHAR(50) NOT NULL, ");
                sql.append("FECHA_APERTURA DATE NOT NULL, ");
                sql.append("DIRECCION VARCHAR(100) NOT NULL ");
                sql.append("); ");
                Statement state = con.createStatement();
                state.executeUpdate(sql.toString());
                System.out.println("SQLITE: Se ha creado la tabla \"PARQUE\"");
            }catch(Exception ex){
                System.out.println("SQLITE: Ha ocurrido un error al crear la tabla \"PARQUE\"");
                throw ex;
            }
            
            try{
                InsertarParque(con);
                System.out.println("SQLITE: Se ha insertado el parque correspondiente");
            }catch(Exception ex){
                System.out.println("SQLITE: Ha ocurrido un error al cargar el parque");
                throw ex;
            }
        }else{
            Parque parque = SQLITE_ParqueBD.getParque();
            if(parque == null){
                System.out.println("SQLITE: No se ha detectado el parque correspondiente");
                InsertarParque(con);
                System.out.println("SQLITE: Se ha insertado el parque correspondiente");
            }
        }
    }
    
    private static void ComprobarTablaEMPLEADOS(Connection con) throws Exception{
        if(!ExisteTabla(con, "EMPLE")){
            try{
                System.out.println("SQLITE: no se ha detectado la tabla \"EMPLE\"");
                StringBuilder sql = new StringBuilder();
                sql.append("CREATE TABLE EMPLE( ");
                sql.append("DNI VARCHAR(15) PRIMARY KEY, ");
                sql.append("NOMBRE VARCHAR(50) NOT NULL, ");
                sql.append("APELLIDO VARCHAR(50) NOT NULL, ");
                sql.append("FECHA_NACIMIENTO DATE NOT NULL, ");
                sql.append("FECHA_CONTRATO DATE NOT NULL, ");
                sql.append("NACIONALIDAD VARCHAR(50) NOT NULL, ");
                sql.append("CARGO VARCHAR(50) NOT NULL, ");
                sql.append("BAJA BOOLEAN DEFAULT 0 ");
                sql.append("); ");
                Statement state = con.createStatement();
                state.executeUpdate(sql.toString());
                System.out.println("SQLITE: Se ha creado la tabla \"EMPLE\"");
            }catch(Exception ex){
                System.out.println("SQLITE: Ha ocurrido un error al crear la tabla \"EMPLE\"");
                throw ex;
            }
        }
    }
    
    private static void ComprobarTablaCLIENTES(Connection con) throws Exception{
        if(!ExisteTabla(con, "CLIENTES")){
            try{
                System.out.println("SQLITE: no se ha detectado la tabla \"CLIENTES\"");
                StringBuilder sql = new StringBuilder();
                sql.append("CREATE TABLE CLIENTES( ");
                sql.append("DNI VARCHAR(15) PRIMARY KEY, ");
                sql.append("NOMBRE VARCHAR(50) NOT NULL, ");
                sql.append("APELLIDO VARCHAR(50) NOT NULL, ");
                sql.append("FECHA_NACIMIENTO DATE NOT NULL, ");
                sql.append("BAJA BOOLEAN DEFAULT 0 ");
                sql.append("); ");
                Statement state = con.createStatement();
                state.executeUpdate(sql.toString());
                System.out.println("SQLITE: Se ha creado la tabla \"CLIENTES\"");
            }catch(Exception ex){
                System.out.println("SQLITE: Ha ocurrido un error al crear la tabla \"CLIENTES\"");
                throw ex;
            }
        }
    }
    
    private static void ComprobarTablaESPECTACULOS(Connection con) throws Exception{
        if(!ExisteTabla(con, "ESPECTACULOS")){
            try{
                System.out.println("SQLITE: no se ha detectado la tabla \"ESPECTACULOS\"");
                StringBuilder sql = new StringBuilder();
                sql.append("CREATE TABLE ESPECTACULOS( ");
                sql.append("ID INTEGER PRIMARY KEY AUTOINCREMENT, ");
                sql.append("NOMBRE VARCHAR(50) NOT NULL, ");
                sql.append("AFORO INTEGER DEFAULT 0, ");
                sql.append("DESCRIPCION VARCHAR(150), ");
                sql.append("LUGAR VARCHAR(50) NOT NULL, ");
                sql.append("BAJA BOOLEAN DEFAULT 0, ");
                sql.append("EMPLEADO_FK VARCHAR(15), ");
                sql.append("FOREIGN KEY (EMPLEADO_FK) REFERENCES EMPLE(DNI) ");
                sql.append("); ");
                Statement state = con.createStatement();
                state.executeUpdate(sql.toString());
                System.out.println("SQLITE: Se ha creado la tabla \"ESPECTACULOS\"");
            }catch(Exception ex){
                System.out.println("SQLITE: Ha ocurrido un error al crear la tabla \"ESPECTACULOS\"");
                throw ex;
            }
        }
    }
    
    private static void ComprobarTablaESPECTACULO_CLIENTE(Connection con) throws Exception{
        if(!ExisteTabla(con, "ESPECTACULO_CLIENTE")){
            try{
                System.out.println("SQLITE: no se ha detectado la tabla \"ESPECTACULO_CLIENTE\"");
                StringBuilder sql = new StringBuilder();
                sql.append("CREATE TABLE ESPECTACULO_CLIENTE( ");
                sql.append("ID_ESPECTACULO INTEGER NOT NULL, ");
                sql.append("DNI_CLIENTE INTEGER NOT NULL, ");
                sql.append("FOREIGN KEY (ID_ESPECTACULO) REFERENCES ESPECTACULOS(ID), ");
                sql.append("FOREIGN KEY (DNI_CLIENTE) REFERENCES CLIENTES(DNI), ");
                sql.append("PRIMARY KEY (ID_ESPECTACULO,DNI_CLIENTE) ");
                sql.append("); ");
                Statement state = con.createStatement();
                state.executeUpdate(sql.toString());
                System.out.println("SQLITE: Se ha creado la tabla \"ESPECTACULO_CLIENTE\"");
            }catch(Exception ex){
                System.out.println("SQLITE: Ha ocurrido un error al crear la tabla \"ESPECTACULO_CLIENTE\"");
                throw ex;
            }
        }
    }
    
    private static void InsertarParque(Connection con) throws Exception{
        try{
            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO PARQUE VALUES( ");
            sql.append("null,'Universal',DATE(),'Direccion test para Universal' );");
            Statement state = con.createStatement();
            state.executeUpdate(sql.toString());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            throw ex;
        }
    }
    
    public static MetaData getMetaData(){
        try{
            Connection con = conectarBD();
            DatabaseMetaData metaBD = con.getMetaData();
            MetaData meta = new MetaData();
            meta.setNombreBD(metaBD.getDatabaseProductName());
            meta.setDriverBD(metaBD.getDriverName());
            meta.setUrlDB(metaBD.getURL());
            meta.setClienteDB(metaBD.getUserName());
            ResultSet tables = metaBD.getTables(schema, null, null, new String[]{"TABLE"});
            while(tables.next()){
                MetaDataTable tabla = new MetaDataTable();
                String nombreTabla = tables.getString("TABLE_NAME");
                ResultSet primaryKeys = metaBD.getPrimaryKeys(schema, null, nombreTabla);
                while(primaryKeys.next()){
                    MetaDataColumn column = new MetaDataColumn();
                    column.setNombre(primaryKeys.getString("COLUMN_NAME"));
                    column.setPrimaryKey(true);
                    tabla.getListaColumnas().add(column);
                }
                ResultSet columns = metaBD.getColumns(schema,null, nombreTabla, null);
                while(columns.next()){ 
                    String columnName = columns.getString("COLUMN_NAME");
                    MetaDataColumn column = tabla.getListaColumnas().stream()
                            .filter(c -> c.getNombre().equalsIgnoreCase(columnName))
                            .findFirst()
                            .orElse(null);
                    if(column == null){
                        column = new MetaDataColumn();
                        column.setNombre(columnName);
                        tabla.getListaColumnas().add(column);
                    }
                    column.setTipo(columns.getString("TYPE_NAME"));
                    column.setPuedeNull(columns.getBoolean("NULLABLE"));
                }
                tabla.setNombre(nombreTabla);
                tabla.setEsquema(schema);
                meta.getListaTablas().add(tabla);
            }
            return meta;
        }catch(Exception ex){
            return null;
        }
    }
    
    private static boolean ExisteTabla(Connection con, String tabla) throws Exception{
        DatabaseMetaData meta = con.getMetaData();
        ResultSet tables = meta.getTables(null, null, tabla, null);
        if(tables.next()){
            return true;
        }else{
            return false;
        }
    }
}
