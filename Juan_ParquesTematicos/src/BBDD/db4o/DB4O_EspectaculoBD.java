package BBDD.db4o;

import static BBDD.db4o.DB4O_EmpleadoBD.getByDni;
import BBDD.mysql.*;
import Clases.*;
import Enum.DB4O_CONNECTIONS;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DB4O_EspectaculoBD {
    
    public static void insertEspectaculo(Espectaculo espe) throws Exception{
        ObjectContainer db = null;
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.espectaculos);
            int id = generarIdEspectaculo(db);
            espe.setId(id);
            espe.setListaClientes(new ArrayList<>());
            Empleado emple = DB4O_EmpleadoBD.getByDni(null, espe.getEncargado().getDni());
            espe.setEncargado(emple);
            db.store(espe);
        }catch(Exception ex){
            throw ex;
        }finally{
            if(db != null){
                db.close();
            }
        }
       
    }
    
    private static int generarIdEspectaculo(ObjectContainer db) throws Exception{
        int id = -1;
        try{
            ObjectSet<Espectaculo> result = db.queryByExample(new Espectaculo());
            while (result.hasNext()) {
                Espectaculo espeEncontrado = result.next();
                if(espeEncontrado.getId() > id){
                    id = espeEncontrado.getId();
                }
            }
            return id+1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return -1;
        }
    }
    
    public static Espectaculo getById(ObjectContainer db,int id) throws Exception{
        Espectaculo espeEncontrado = null;
        try{
            Espectaculo espeBuscar = new Espectaculo();
            espeBuscar.setId(id);
            ObjectSet<Espectaculo> result = db.queryByExample(espeBuscar);
            while (result.hasNext()) {
                espeEncontrado = result.next();
                break;
            }
            return espeEncontrado;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }
    
    public static void updateEspectaculo(Espectaculo espe) throws Exception{
        ObjectContainer db = null;
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.espectaculos);
            Espectaculo espectaculo = getById(db,espe.getId());
            if(espectaculo == null){
                throw new Exception("Ha ocurrido un error al modificar el espectáculo");
            }
            espectaculo.setNombre(espe.getNombre());
            espectaculo.setAforo(espe.getAforo());
            espectaculo.setDescripcion(espe.getDescripcion());
            espectaculo.setLugar(espe.getLugar());
            espectaculo.setBaja(espe.isBaja());
            
            Empleado emple = DB4O_EmpleadoBD.getByDni(null, espe.getEncargado().getDni());
            espectaculo.setEncargado(emple);

            db.store(espectaculo);
        }catch(Exception ex){
            throw ex;
        }finally{
            if(db != null){
                db.close();
            }
        }
    }
    
    public static void deleteEspectaculo(Espectaculo espe) throws SQLException, Exception{
        ObjectContainer db = null;
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.espectaculos);
            Espectaculo espectaculo = getById(db,espe.getId());
            if(espectaculo == null){
                throw new Exception("Ha ocurrido un error al eliminar el espectáculo");
            }
            DB4O_EspectaculoClienteBD.deleteAllFromEspectaculo(espe.getId());
            db.delete(espectaculo);
        }catch(Exception ex){
            throw ex;
        }finally{
            if(db != null){
                db.close();
            }
        }
    }
    
    public static List<Espectaculo> getAllEspectaculos() throws SQLException, Exception{
        ObjectContainer db = null;
        List<Espectaculo> espectaculos = new ArrayList<>();
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.espectaculos);
            ObjectSet<Espectaculo> result = db.queryByExample(new Espectaculo());
            while (result.hasNext()) {
                Espectaculo espectaculo = result.next();
                espectaculos.add(espectaculo);
            }
            return espectaculos;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }finally{
            if(db != null){
                db.close();
            }
        }
    }
    
    public static List<Espectaculo> getAllEspectaculosWithClientes() throws SQLException, Exception{
        ObjectContainer db = null;
        ObjectContainer dbCli = null;
        List<Espectaculo> espectaculos = new ArrayList<>();
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.espectaculos);
            dbCli = DB4O_BD.conectarBD(DB4O_CONNECTIONS.clientes);
            ObjectSet<Espectaculo> result = db.queryByExample(new Espectaculo());
            while (result.hasNext()) {
                Espectaculo espectaculo = result.next();
                espectaculo.setListaClientes(new ArrayList<>());
                Empleado encargado = DB4O_EmpleadoBD.getByDni(null, espectaculo.getEncargado().getDni());
                espectaculo.setEncargado(encargado);
                List<EspectaculoCliente> inscripciones = DB4O_EspectaculoClienteBD.getAllFromEspectaculo(espectaculo.getId());
                for(EspectaculoCliente inscripcion : inscripciones){  
                    Cliente cli = DB4O_ClienteBD.getByDni(dbCli, inscripcion.getDniCliente());
                    espectaculo.getListaClientes().add(cli);
                }
                espectaculos.add(espectaculo);
            }
            return espectaculos;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }finally{
            if(db != null){
                db.close();
            }
            if(dbCli != null){
                dbCli.close();
            }
        }
    }
    
    public static List<Espectaculo> getAllEspectaculosNoBajaWithClientes() throws SQLException, Exception{
        ObjectContainer db = null;
        ObjectContainer dbCli = null;
        List<Espectaculo> espectaculos = new ArrayList<>();
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.espectaculos);
            dbCli = DB4O_BD.conectarBD(DB4O_CONNECTIONS.clientes);
            Espectaculo espeBusqueda = new Espectaculo();
            espeBusqueda.setBaja(false);
            ObjectSet<Espectaculo> result = db.queryByExample(espeBusqueda);
            while (result.hasNext()) {
                Espectaculo espectaculo = result.next();
                espectaculo.setListaClientes(new ArrayList<>());
                Empleado encargado = DB4O_EmpleadoBD.getByDni(null, espectaculo.getEncargado().getDni());
                espectaculo.setEncargado(encargado);
                List<EspectaculoCliente> inscripciones = DB4O_EspectaculoClienteBD.getAllFromEspectaculo(espectaculo.getId());
                for(EspectaculoCliente inscripcion : inscripciones){  
                    Cliente cli = DB4O_ClienteBD.getByDni(dbCli, inscripcion.getDniCliente());
                    espectaculo.getListaClientes().add(cli);
                }
                espectaculos.add(espectaculo);
            }
            return espectaculos;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }finally{
            if(db != null){
                db.close();
            }
            if(dbCli != null){
                dbCli.close();
            }
        }
    }
    
    public static List<Espectaculo> getAllEspectaculosNoBaja() throws SQLException, Exception{
        ObjectContainer db = null;
        List<Espectaculo> espectaculos = new ArrayList<>();
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.espectaculos);
            Espectaculo espeBusqueda = new Espectaculo();
            espeBusqueda.setBaja(false);
            ObjectSet<Espectaculo> result = db.queryByExample(espeBusqueda);
            while (result.hasNext()) {
                Espectaculo espectaculo = result.next();
                Empleado encargado = DB4O_EmpleadoBD.getByDni(null, espectaculo.getEncargado().getDni());
                espectaculo.setEncargado(encargado);
                espectaculos.add(espectaculo);
            }
            return espectaculos;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }finally{
            if(db != null){
                db.close();
            }
        }
    }
}
