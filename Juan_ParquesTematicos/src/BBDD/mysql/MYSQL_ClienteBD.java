package BBDD.mysql;

import Clases.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MYSQL_ClienteBD {
    
    public static void insertCliente(Cliente cli) throws SQLException{
            Connection con = MYSQL_BD.conectarBD();
            String sql = "INSERT INTO CLIENTES VALUES(?,?,?,?,0)";
            PreparedStatement state = con.prepareStatement(sql);
        try{
            state.setString(1, cli.getDni());
            state.setString(2, cli.getNombre());
            state.setString(3, cli.getApellido1());
            state.setDate(4, new java.sql.Date(cli.getFechaNacimiento().getTime()));
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
    
    public static void updateCliente(Cliente cli) throws SQLException{
            Connection con = MYSQL_BD.conectarBD();
            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE CLIENTES SET ");
            sql.append("NOMBRE = ?, APELLIDO = ?, FECHA_NACIMIENTO = ?, ");
            sql.append("BAJA = ? WHERE DNI = ? ");
            PreparedStatement state = con.prepareStatement(sql.toString());
        try{
            state.setString(1, cli.getNombre());
            state.setString(2, cli.getApellido1());
            state.setDate(3, new java.sql.Date(cli.getFechaNacimiento().getTime()));
            state.setBoolean(4, cli.isBaja());
            state.setString(5, cli.getDni());
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
    
    public static void deleteCliente(Cliente cli) throws SQLException{
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
    
    public static List<Cliente> getAllClientes() throws SQLException, Exception{
        List<Cliente> clientes = new ArrayList<>();
        Connection con = null;
        String sql = "SELECT * FROM CLIENTES";
        Statement state = null;
        try{
            con = MYSQL_BD.conectarBD();
            state = con.createStatement();
            ResultSet result = state.executeQuery(sql);
            while(result.next()){
                Cliente cli = new Cliente();
                cli.setDni(result.getString("DNI"));
                cli.setNombre(result.getString("NOMBRE"));
                cli.setApellido1(result.getString("APELLIDO"));
                cli.setFechaNacimiento(result.getDate("FECHA_NACIMIENTO"));
                cli.setBaja(result.getBoolean("BAJA"));
                clientes.add(cli);
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
        return clientes;
    }
}
