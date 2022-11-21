package BBDD.sqlite;

import Clases.Agencia;
import java.sql.*;

public class SQLITE_ParqueBD {
    
    public final static String url = "jdbc:sqlite:C:/sqlite/ad_agenciasTurismo.db";
    
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
        
    private static Connection conectarBD(){
        try{
            return DriverManager.getConnection(url);
        }catch(Exception ex){
            return null;
        }
    }
    
    public static Agencia getAgencia(){
        try{
            Connection conexion = conectarBD();
            Agencia agencia = new Agencia();
            String sql = "SELECT * FROM AGENCIA";
            Statement state = conexion.createStatement();
            ResultSet result = state.executeQuery(sql);
            while(result.next()){
                agencia.setId(result.getInt("id"));
                agencia.setNombre(result.getString("nombre"));
                agencia.setFecha_apertura(result.getDate("fecha_apertura"));
                agencia.setDireccion(result.getString("direccion"));
                result.close();
                state.close();
                conexion.close();
                return agencia;
            }
            return agencia;
        }catch(Exception ex){
            return null;
        }
    }
}
