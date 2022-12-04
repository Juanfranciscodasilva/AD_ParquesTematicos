package BBDD.mysql;

import Clases.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MYSQL_EspectaculoBD {
    
    public static void insertEspectaculo(Espectaculo espe) throws SQLException{
            Connection con = MYSQL_BD.conectarBD();
            String sql = "INSERT INTO ESPECTACULOS VALUES(null,?,?,?,?,0,?)";
            PreparedStatement state = con.prepareStatement(sql);
        try{
            state.setString(1, espe.getNombre());
            state.setInt(2, espe.getAforo());
            state.setString(3, espe.getDescripcion());
            state.setString(4, espe.getLugar());
            state.setString(5, espe.getEncargado().getDni());
            state.executeUpdate();
        }catch(Exception ex){
            throw ex;
        }finally{
            if(state != null){
                state.close();
            }
            if(con != null){
                con.close();
            }
        }
       
    }
    
    public static void updateEspectaculo(Espectaculo espe) throws SQLException{
            Connection con = MYSQL_BD.conectarBD();
            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE ESPECTACULOS SET ");
            sql.append("NOMBRE = ?, AFORO = ?, DESCRIPCION = ?, ");
            sql.append("LUGAR = ?, BAJA = ?, EMPLEADO_FK = ? ");
            sql.append("WHERE ID = ?");
            PreparedStatement state = con.prepareStatement(sql.toString());
        try{
            state.setString(1, espe.getNombre());
            state.setInt(2, espe.getAforo());
            state.setString(3, espe.getDescripcion());
            state.setString(4, espe.getLugar());
            state.setBoolean(5, espe.isBaja());
            state.setString(6, espe.getEncargado().getDni());
            state.setInt(7, espe.getId());
            state.executeUpdate();
        }catch(Exception ex){
            throw ex;
        }finally{
            if(state != null){
                state.close();
            }
            if(con != null){
                con.close();
            }
        }
    }
    
    public static void deleteEspectaculo(Espectaculo espe) throws SQLException{
//            Connection con = MYSQL_BD.conectarBD();
//            StringBuilder sql = new StringBuilder();
//            sql.append("DELETE FROM CLIENTES WHERE DNI = ? ");
//            PreparedStatement state = con.prepareStatement(sql.toString());
//        try{
//            state.setString(1, cli.getNombre());
//            state.setString(2, cli.getApellido1());
//            state.setDate(3, new java.sql.Date(cli.getFechaNacimiento().getTime()));
//            state.setBoolean(4, cli.isBaja());
//            state.setString(5, cli.getDni());
//            state.executeUpdate();
//        }catch(Exception ex){
//            throw ex;
//        }finally{
//            if(state != null){
//                state.close();
//            }
//            if(con != null){
//                con.close();
//            }
//        }
    }
    
    public static List<Espectaculo> getAllEspectaculos() throws SQLException, Exception{
        List<Espectaculo> espectaculos = new ArrayList<>();
        Connection con = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT e.id, e.nombre, e.aforo, e.descripcion, e.lugar, ");
        sql.append("e.baja, em.dni, em.nombre, em.apellido, em.fecha_nacimiento, ");
        sql.append("em.fecha_contrato, em.nacionalidad, em.cargo, em.baja ");
        sql.append("FROM ESPECTACULOS e ");
        sql.append("LEFT JOIN EMPLE em ON e.EMPLEADO_FK = em.DNI ");
        Statement state = null;
        try{
            con = MYSQL_BD.conectarBD();
            state = con.createStatement();
            ResultSet result = state.executeQuery(sql.toString());
            while(result.next()){
                Espectaculo espec = mappearSelectAllWithEncargado(result);
                espectaculos.add(espec);
            }
            result.close();
        }catch(Exception ex){
            throw ex;
        }finally{
            if(state != null){
                state.close();
            }
            if(con != null){
                con.close();
            }
        }
        return espectaculos;
    }
    
    public static List<Espectaculo> getAllEspectaculosWithClientes() throws SQLException, Exception{
        List<Espectaculo> espectaculos = new ArrayList<>();
        Connection con = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT e.id, e.nombre, e.aforo, e.descripcion, e.lugar, ");
        sql.append("e.baja, em.dni, em.nombre, em.apellido, em.fecha_nacimiento, ");
        sql.append("em.fecha_contrato, em.nacionalidad, em.cargo, em.baja ");
        sql.append("FROM ESPECTACULOS e ");
        sql.append("LEFT JOIN EMPLE em ON e.EMPLEADO_FK = em.DNI ");
        Statement state = null;
        try{
            con = MYSQL_BD.conectarBD();
            state = con.createStatement();
            ResultSet result = state.executeQuery(sql.toString());
            while(result.next()){
                Espectaculo espec = mappearSelectAllWithEncargado(result);
                List<Cliente> listaClientes = MYSQL_ClienteBD.getAllClientesFromEspectaculo(espec.getId());
                espec.setListaClientes(listaClientes);
                espectaculos.add(espec);
            }
            result.close();
        }catch(Exception ex){
            throw ex;
        }finally{
            if(state != null){
                state.close();
            }
            if(con != null){
                con.close();
            }
        }
        return espectaculos;
    }
    
    public static List<Espectaculo> getAllEspectaculosNoBajaWithClientes() throws SQLException, Exception{
        List<Espectaculo> espectaculos = new ArrayList<>();
        Connection con = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT e.id, e.nombre, e.aforo, e.descripcion, e.lugar, ");
        sql.append("e.baja, em.dni, em.nombre, em.apellido, em.fecha_nacimiento, ");
        sql.append("em.fecha_contrato, em.nacionalidad, em.cargo, em.baja ");
        sql.append("FROM ESPECTACULOS e ");
        sql.append("LEFT JOIN EMPLE em ON e.EMPLEADO_FK = em.DNI ");
        sql.append("WHERE e.baja = 0 ");
        Statement state = null;
        try{
            con = MYSQL_BD.conectarBD();
            state = con.createStatement();
            ResultSet result = state.executeQuery(sql.toString());
            while(result.next()){
                Espectaculo espec = mappearSelectAllWithEncargado(result);
                List<Cliente> listaClientes = MYSQL_ClienteBD.getAllClientesFromEspectaculo(espec.getId());
                espec.setListaClientes(listaClientes);
                espectaculos.add(espec);
            }
            result.close();
        }catch(Exception ex){
            throw ex;
        }finally{
            if(state != null){
                state.close();
            }
            if(con != null){
                con.close();
            }
        }
        return espectaculos;
    }
    
    public static Espectaculo mappearEspectaculo(ResultSet result) throws Exception{
        Espectaculo espec = new Espectaculo();
        if(result != null){
            espec.setId(result.getInt("ID"));
            espec.setNombre(result.getString("NOMBRE"));
            espec.setAforo(result.getInt("AFORO"));
            espec.setDescripcion(result.getString("DESCRIPCION"));
            espec.setLugar(result.getString("LUGAR"));
            espec.setBaja(result.getBoolean("BAJA"));
        }
        return espec;
    }
    
    public static Espectaculo mappearSelectAllWithEncargado(ResultSet result) throws Exception{
        Espectaculo espec = new Espectaculo();
        if(result != null){
            espec.setId(result.getInt("e.ID"));
            espec.setNombre(result.getString("e.NOMBRE"));
            espec.setAforo(result.getInt("e.AFORO"));
            espec.setDescripcion(result.getString("e.DESCRIPCION"));
            espec.setLugar(result.getString("e.LUGAR"));
            espec.setBaja(result.getBoolean("e.BAJA"));
            Empleado emple = new Empleado();
            emple.setDni(result.getString("em.DNI"));
            emple.setNombre(result.getString("em.NOMBRE"));
            emple.setApellido1(result.getString("em.APELLIDO"));
            emple.setFechaNacimiento(result.getDate("em.FECHA_NACIMIENTO"));
            emple.setFechaContratacion(result.getDate("em.FECHA_CONTRATO"));
            emple.setNacionalidad(result.getString("em.NACIONALIDAD"));
            emple.setCargo(result.getString("em.CARGO"));
            emple.setBaja(result.getBoolean("em.BAJA"));
            espec.setEncargado(emple);
        }
        return espec;
    }
    
    public static List<Espectaculo> getEspectaculosBajaFalse() throws SQLException, Exception{
        List<Espectaculo> espectaculos = new ArrayList<>();
        Connection con = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT e.id, e.nombre, e.aforo, e.descripcion, e.lugar, ");
        sql.append("e.baja, em.dni, em.nombre, em.apellido, em.fecha_nacimiento, ");
        sql.append("em.fecha_contrato, em.nacionalidad, em.cargo, em.baja ");
        sql.append("FROM ESPECTACULOS e ");
        sql.append("LEFT JOIN EMPLE em ON e.EMPLEADO_FK = em.DNI ");
        sql.append("WHERE e.baja = 0");
        Statement state = null;
        try{
            con = MYSQL_BD.conectarBD();
            state = con.createStatement();
            ResultSet result = state.executeQuery(sql.toString());
            while(result.next()){
                Espectaculo espec = mappearSelectAllWithEncargado(result);
                espectaculos.add(espec);
            }
            result.close();
        }catch(Exception ex){
            throw ex;
        }finally{
            if(state != null){
                state.close();
            }
            if(con != null){
                con.close();
            }
        }
        return espectaculos;
    }
    
    public static List<Espectaculo> getAllEspectaculosFromCliente(String dniCliente) throws SQLException, Exception{
        List<Espectaculo> espectaculos = new ArrayList<>();
        Connection con = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT e.* FROM espectaculo_cliente ec ");
        sql.append("LEFT JOIN espectaculos e ON e.ID = ec.ID_ESPECTACULO ");
        sql.append("WHERE ec.DNI_CLIENTE = ? ");
        PreparedStatement state = null;
        try{
            con = MYSQL_BD.conectarBD();
            state = con.prepareStatement(sql.toString());
            state.setString(1, dniCliente);
            ResultSet result = state.executeQuery();
            while(result.next()){
                Espectaculo espe = mappearEspectaculo(result);
                espectaculos.add(espe);
            }
            result.close();
        }catch(Exception ex){
            throw ex;
        }finally{
            if(state != null){
                state.close();
            }
            if(con != null){
                con.close();
            }
        }
        return espectaculos;
    }
}
