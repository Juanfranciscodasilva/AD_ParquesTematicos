package BBDD;

import BBDD.db4o.DB4O_BD;
import BBDD.mysql.MYSQL_ParqueBD;
import BBDD.db4o.DB4O_ParqueBD;
import BBDD.mysql.MYSQL_BD;
import BBDD.mysql.MYSQL_ClienteBD;
import BBDD.sqlite.SQLITE_BD;
import BBDD.sqlite.SQLITE_ParqueBD;
import Clases.*;
import Enum.PARQUES;
import java.util.ArrayList;
import java.util.List;

public class BD_INTERMEDIARIO {
    
    public static PARQUES parqueSeleccionado;
    
    public static void comprobarBasesDeDatos() throws Exception{
        MYSQL_BD.ComprobarYPrepararBD();
        DB4O_BD.ComprobarYPrepararBD();
        SQLITE_BD.ComprobarYPrepararBD();
    }
    
    public static Parque obtenerParque(){
        Parque parque = null;
        switch(parqueSeleccionado){
            case Warner:
                parque = MYSQL_ParqueBD.getParque();
                break;
            case Universal:
                parque = SQLITE_ParqueBD.getParque();
                break;
            case Disney:
                parque = DB4O_ParqueBD.getParque();
                break;
        }
        return parque;
    }
    
    public static List<Cliente> obtenerAllClientes() throws Exception{
        List<Cliente> clientes = new ArrayList<>();
        try{
            switch(parqueSeleccionado){
            case Warner:
                clientes = MYSQL_ClienteBD.getAllClientes();
                break;
            case Universal:
                
                break;
            case Disney:
                
                break;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            throw ex;
        }
        return clientes;
    }
    
    public static Response insertarCliente(Cliente cli){
        Response response = new Response();
        try{
            switch(parqueSeleccionado){
            case Warner:
                MYSQL_ClienteBD.insertCliente(cli);
                break;
            case Universal:
                
                break;
            case Disney:
                
                break;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            response.setCorrecto(false);
            response.setMensajeError("Ha ocurrido un error al insertar el cliente");
        }
        return response;
    }
}
