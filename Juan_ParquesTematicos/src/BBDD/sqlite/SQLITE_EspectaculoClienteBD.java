package BBDD.sqlite;

import BBDD.mysql.*;
import Clases.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SQLITE_EspectaculoClienteBD {
    
    public static void insertEspectaculoCliente(Espectaculo espe, Cliente cli) throws SQLException, Exception{
            Connection con = SQLITE_BD.conectarBD();
            String sql = "INSERT INTO ESPECTACULO_CLIENTE(ID_ESPECTACULO,DNI_CLIENTE) VALUES(?,?)";
            PreparedStatement state = con.prepareStatement(sql);
        try{
            state.setInt(1, espe.getId());
            state.setString(2, cli.getDni());
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
    
    public static void deleteAllFromEspectaculo(int idEspectaculo) throws SQLException, Exception{
        Connection con = SQLITE_BD.conectarBD();
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM espectaculo_cliente WHERE ID_ESPECTACULO = ? ");
        PreparedStatement state = con.prepareStatement(sql.toString());
        try{
            state.setInt(1, idEspectaculo);
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
    
    public static void deleteAllFromCliente(String dniCliente) throws SQLException, Exception{
        Connection con = SQLITE_BD.conectarBD();
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM espectaculo_cliente WHERE DNI_CLIENTE = ? ");
        PreparedStatement state = con.prepareStatement(sql.toString());
        try{
            state.setString(1, dniCliente);
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
    
    public static void deleteEspectaculoCliente(int idEspectaculo, String dniCliente) throws SQLException, Exception{
        Connection con = SQLITE_BD.conectarBD();
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM espectaculo_cliente WHERE ID_ESPECTACULO = ? AND DNI_CLIENTE = ? ");
        PreparedStatement state = con.prepareStatement(sql.toString());
        try{
            state.setInt(1, idEspectaculo);
            state.setString(2, dniCliente);
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
}
