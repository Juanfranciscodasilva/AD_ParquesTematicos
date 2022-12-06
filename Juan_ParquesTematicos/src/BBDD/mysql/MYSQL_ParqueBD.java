package BBDD.mysql;

import Clases.*;
import java.sql.*;

public class MYSQL_ParqueBD {
    
    public static Parque getParque(){
        try{
            Connection conexion = MYSQL_BD.conectarBD();
            Parque parque = null;
            String sql = "SELECT * FROM PARQUE";
            Statement state = conexion.createStatement();
            ResultSet result = state.executeQuery(sql);
            while(result.next()){
                parque = new Parque();
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
