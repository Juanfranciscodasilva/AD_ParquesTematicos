package BBDD.db4o;

import static BBDD.db4o.DB4O_EspectaculoBD.getById;
import BBDD.mysql.*;
import Clases.*;
import Enum.DB4O_CONNECTIONS;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DB4O_EspectaculoClienteBD {
    
    public static void insertEspectaculoCliente(Espectaculo espe, Cliente cli) throws SQLException, Exception{
        ObjectContainer db = null;
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.espectaculos_clientes);
            EspectaculoCliente inscripcion = new EspectaculoCliente();
            inscripcion.setDniCliente(cli.getDni());
            inscripcion.setIdEspectaculo(espe.getId());
            if(!db.queryByExample(inscripcion).isEmpty()){
                throw new SQLException("El cliente ya está inscrito en el espectáculo","23000",1062);
            }
            db.store(inscripcion);
        }catch(Exception ex){
            throw ex;
        }finally{
            if(db != null){
                db.close();
            }
        }
    }
    
    public static void deleteAllFromEspectaculo(int idEspectaculo) throws SQLException, Exception{
        ObjectContainer db = null;
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.espectaculos_clientes);
            EspectaculoCliente inscripcionBusqueda = new EspectaculoCliente();
            inscripcionBusqueda.setIdEspectaculo(idEspectaculo);
            ObjectSet<EspectaculoCliente> result = db.queryByExample(inscripcionBusqueda);
            while (result.hasNext()) {
                EspectaculoCliente inscripcion = result.next();
                db.delete(inscripcion);
            }
        }catch(Exception ex){
            throw ex;
        }finally{
            if(db != null){
                db.close();
            }
        }
    }
    
    public static void deleteAllFromCliente(String dniCliente) throws SQLException, Exception{
        ObjectContainer db = null;
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.espectaculos_clientes);
            EspectaculoCliente inscripcionBusqueda = new EspectaculoCliente();
            inscripcionBusqueda.setDniCliente(dniCliente);
            ObjectSet<EspectaculoCliente> result = db.queryByExample(inscripcionBusqueda);
            while (result.hasNext()) {
                EspectaculoCliente inscripcion = result.next();
                db.delete(inscripcion);
            }
        }catch(Exception ex){
            throw ex;
        }finally{
            if(db != null){
                db.close();
            }
        }
    }
    
    public static List<EspectaculoCliente> getAllFromCliente(String dniCliente) throws Exception{
        ObjectContainer db = null;
        List<EspectaculoCliente> inscripciones = new ArrayList<>();
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.espectaculos_clientes);
            EspectaculoCliente inscripcionBusqueda = new EspectaculoCliente();
            inscripcionBusqueda.setDniCliente(dniCliente);
            ObjectSet<EspectaculoCliente> result = db.queryByExample(inscripcionBusqueda);
            while (result.hasNext()) {
                EspectaculoCliente inscripcion = result.next();
                inscripciones.add(inscripcion);
            }
            return inscripciones;
        }catch(Exception ex){
            throw ex;
        }finally{
            if(db != null){
                db.close();
            }
        }
    }
    
    public static List<EspectaculoCliente> getAllFromEspectaculo(int idEspectaculo) throws Exception{
        ObjectContainer db = null;
        List<EspectaculoCliente> inscripciones = new ArrayList<>();
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.espectaculos_clientes);
            EspectaculoCliente inscripcionBusqueda = new EspectaculoCliente();
            inscripcionBusqueda.setIdEspectaculo(idEspectaculo);
            ObjectSet<EspectaculoCliente> result = db.queryByExample(inscripcionBusqueda);
            while (result.hasNext()) {
                EspectaculoCliente inscripcion = result.next();
                inscripciones.add(inscripcion);
            }
            return inscripciones;
        }catch(Exception ex){
            throw ex;
        }finally{
            if(db != null){
                db.close();
            }
        }
    }
    
    public static void deleteEspectaculoCliente(int idEspectaculo, String dniCliente) throws SQLException, Exception{
        ObjectContainer db = null;
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.espectaculos_clientes);
            EspectaculoCliente inscripcionBusqueda = new EspectaculoCliente();
            inscripcionBusqueda.setIdEspectaculo(idEspectaculo);
            inscripcionBusqueda.setDniCliente(dniCliente);
            ObjectSet<EspectaculoCliente> result = db.queryByExample(inscripcionBusqueda);
            while (result.hasNext()) {
                EspectaculoCliente inscripcion = result.next();
                db.delete(inscripcion);
            }
        }catch(Exception ex){
            throw ex;
        }finally{
            if(db != null){
                db.close();
            }
        }
    }
}
