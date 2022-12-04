package BBDD.mysql;

import Clases.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MYSQL_EspectaculoClienteBD {
    
    public static void insertEspectaculoCliente(Espectaculo espe, Cliente cli) throws SQLException{
            Connection con = MYSQL_BD.conectarBD();
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
    
    public static void deleteEspectaculoCliente() throws SQLException{
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
}
