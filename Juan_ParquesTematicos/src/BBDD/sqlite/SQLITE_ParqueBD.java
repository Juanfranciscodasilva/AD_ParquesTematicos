package BBDD.sqlite;

import Clases.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.ZoneId;

public class SQLITE_ParqueBD {
    
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
                LocalDate localDate = LocalDate.parse(result.getString("fecha_apertura"));
                parque.setFecha_apertura(Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
                parque.setDireccion(result.getString("direccion"));
                result.close();
                state.close();
                conexion.close();
                return parque;
            }
            return parque;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
