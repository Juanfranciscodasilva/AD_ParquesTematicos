package BBDD.mysql;

import Clases.*;
import java.sql.*;

public class MYSQL_ParqueBD {
    
    private static String url = "jdbc:mysql://localhost:3306/ad_parques_tematicos?autoReconnect=true&useSSL=false";
    private static String username = "root";
    private static String password = "12345Abcde";
    
    public MYSQL_ParqueBD() throws Exception{
        Connection conexion = DriverManager.getConnection(url,username,password);
        String sql = "SELECT * FROM PARQUE";
        Statement state = conexion.createStatement();
        ResultSet result = state.executeQuery(sql);
        while(result.next()){
            System.out.println(result.getString("nombre"));
            System.out.println(result.getString("fecha_apertura"));
            System.out.println(result.getString("id"));
        }
        result.close();
        state.close();
        conexion.close();
    }
    
    private static Connection conectarBD(){
        try{
            return DriverManager.getConnection(url,username,password);
        }catch(Exception ex){
            return null;
        }
    }
    
    public static Parque getParque(){
        try{
            Connection conexion = conectarBD();
            Parque agencia = new Parque();
            String sql = "SELECT * FROM PARQUE";
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
