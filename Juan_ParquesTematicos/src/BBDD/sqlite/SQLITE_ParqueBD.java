package BBDD.sqlite;

import Clases.*;
import java.sql.*;

public class SQLITE_ParqueBD {
    
    public final static String url = "jdbc:sqlite:C:/sqlite/ad_parques_tematicos.db";
    
    public SQLITE_ParqueBD(){
        Connection conn = null;
        try {
            // create a connection to the database
            conn = DriverManager.getConnection(url);
//            String sql = "INSERT INTO agencia VALUES(null,?,?,?)";
//
//            PreparedStatement pstmt = conn.prepareStatement(sql);
//            pstmt.setString(1, "Viajes Araba");
//            java.util.Date utilDate = new java.util.Date();
//            Date date = new Date(utilDate.getTime());
//            pstmt.setDate(2, date);
//            pstmt.setString(3, "C/ ejemplo araba 7");
//            pstmt.executeUpdate();
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static Parque getParque(){
        try{
            Connection conexion = SQLITE_BD.conectarBD();
            Parque parque = new Parque();
            String sql = "SELECT * FROM PARQUE";
            Statement state = conexion.createStatement();
            ResultSet result = state.executeQuery(sql);
            while(result.next()){
                parque.setId(result.getInt("id"));
                parque.setNombre(result.getString("nombre"));
                parque.setFecha_apertura(result.getDate("fecha_apertura"));
                parque.setDireccion(result.getString("direccion"));
                result.close();
                state.close();
                conexion.close();
                return parque;
            }
            return parque;
        }catch(Exception ex){
            return null;
        }
    }
}
