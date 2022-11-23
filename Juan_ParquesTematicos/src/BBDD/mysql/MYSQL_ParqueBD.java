package BBDD.mysql;

import Clases.*;
import java.sql.*;

public class MYSQL_ParqueBD {
    
    public static Parque getParque(){
        try{
            Connection conexion = MYSQL_BD.conectarBD();
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
