package BBDD.mysql;

import Clases.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MYSQL_EmpleadoBD {
    
    public static void insertEmpleado(Empleado emple) throws SQLException{
            Connection con = MYSQL_BD.conectarBD();
            String sql = "INSERT INTO EMPLE VALUES(?,?,?,?,?,?,?,0)";
            PreparedStatement state = con.prepareStatement(sql);
        try{
            state.setString(1, emple.getDni());
            state.setString(2, emple.getNombre());
            state.setString(3, emple.getApellido1());
            state.setDate(4, new java.sql.Date(emple.getFechaNacimiento().getTime()));
            state.setDate(5, new java.sql.Date(emple.getFechaContratacion().getTime()));
            state.setString(6, emple.getNacionalidad());
            state.setString(7, emple.getCargo());
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
    
    public static void updateEmpleado(Empleado emple) throws SQLException{
            Connection con = MYSQL_BD.conectarBD();
            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE EMPLE SET ");
            sql.append("NOMBRE = ?, APELLIDO = ?, FECHA_NACIMIENTO = ?, ");
            sql.append("FECHA_CONTRATO = ?, NACIONALIDAD = ?, CARGO = ?,  ");
            sql.append("BAJA = ? WHERE DNI = ?");
            PreparedStatement state = con.prepareStatement(sql.toString());
        try{
            state.setString(1, emple.getNombre());
            state.setString(2, emple.getApellido1());
            state.setDate(3, new java.sql.Date(emple.getFechaNacimiento().getTime()));
            state.setDate(4, new java.sql.Date(emple.getFechaContratacion().getTime()));
            state.setString(5, emple.getNacionalidad());
            state.setString(6, emple.getCargo());
            state.setBoolean(7, emple.isBaja());
            state.setString(8, emple.getDni());
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
    
    public static void deleteEmpleado(Empleado emple) throws SQLException{
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
    
    public static List<Empleado> getAllEmpleados() throws SQLException, Exception{
        List<Empleado> empleados = new ArrayList<>();
        Connection con = null;
        String sql = "SELECT * FROM EMPLE";
        Statement state = null;
        try{
            con = MYSQL_BD.conectarBD();
            state = con.createStatement();
            ResultSet result = state.executeQuery(sql);
            while(result.next()){
                Empleado emple = mappearEmpleado(result);
                empleados.add(emple);
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
        return empleados;
    }
    
    public static List<Empleado> getAllEmpleadosWithEspectaculos() throws SQLException, Exception{
        List<Empleado> empleados = new ArrayList<>();
        Connection con = null;
        String sql = "SELECT * FROM EMPLE";
        Statement state = null;
        try{
            con = MYSQL_BD.conectarBD();
            state = con.createStatement();
            ResultSet result = state.executeQuery(sql);
            while(result.next()){
                Empleado emple = mappearEmpleado(result);
                List<Espectaculo> espectaculos = MYSQL_EspectaculoBD.getAllEspectaculosFromEmpleado(emple.getDni());
                emple.setListaEspectaculos(espectaculos);
                empleados.add(emple);
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
        return empleados;
    }
    
    public static List<Empleado> getEmpleadosBajaFalse() throws SQLException, Exception{
        List<Empleado> empleados = new ArrayList<>();
        Connection con = null;
        String sql = "SELECT * FROM EMPLE WHERE BAJA = 0";
        Statement state = null;
        try{
            con = MYSQL_BD.conectarBD();
            state = con.createStatement();
            ResultSet result = state.executeQuery(sql);
            while(result.next()){
                Empleado emple = mappearEmpleado(result);
                empleados.add(emple);
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
        return empleados;
    }
    
    public static Empleado mappearEmpleado(ResultSet result) throws Exception{
        Empleado emple = new Empleado();
        emple.setDni(result.getString("DNI"));
        emple.setNombre(result.getString("NOMBRE"));
        emple.setApellido1(result.getString("APELLIDO"));
        emple.setFechaNacimiento(result.getDate("FECHA_NACIMIENTO"));
        emple.setFechaContratacion(result.getDate("FECHA_CONTRATO"));
        emple.setNacionalidad(result.getString("NACIONALIDAD"));
        emple.setCargo(result.getString("CARGO"));
        emple.setBaja(result.getBoolean("BAJA"));
        return emple;
    }
}
