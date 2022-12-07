package BBDD.db4o;

import BBDD.mysql.*;
import Clases.*;
import Enum.DB4O_CONNECTIONS;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DB4O_ClienteBD {
    
    public static void insertCliente(Cliente cli) throws Exception{
        ObjectContainer db = null;
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.clientes);
            Cliente c = new Cliente();
            c.setDni(cli.getDni());
            if(!db.queryByExample(c).isEmpty()){
                throw new SQLException("Ya hay un empleado registrado con ese DNI","23000",1062);
            }
            db.store(cli);
        }catch(Exception ex){
            throw ex;
        }finally{
            if(db != null){
                db.close();
            }
        }
    }
    
    public static void updateCliente(Cliente cli) throws Exception{
        ObjectContainer db = null;
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.clientes);
            Cliente cliente = getByDni(db,cli.getDni());
            if(cliente == null){
                throw new Exception("Ha ocurrido un error al modificar el cliente");
            }
            cliente.setNombre(cli.getNombre());
            cliente.setApellido1(cli.getApellido1());
            cliente.setFechaNacimiento(cli.getFechaNacimiento());
            cliente.setBaja(cli.isBaja());
            db.store(cliente);
        }catch(Exception ex){
            throw ex;
        }finally{
            if(db != null){
                db.close();
            }
        }
    }
    
    public static void deleteCliente(Cliente cli) throws Exception{
        ObjectContainer db = null;
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.clientes);
            Cliente cliente = getByDni(db,cli.getDni());
            if(cliente == null){
                throw new Exception("Ha ocurrido un error al eliminar el cliente");
            }
            DB4O_EspectaculoClienteBD.deleteAllFromCliente(cli.getDni());
            db.delete(cliente);
        }catch(Exception ex){
            throw ex;
        }finally{
            if(db != null){
                db.close();
            }
        }
    }
    
    public static List<Cliente> getAllClientes() throws Exception{
        ObjectContainer db = null;
        List<Cliente> clientes = new ArrayList<>();
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.clientes);
            ObjectSet<Cliente> result = db.queryByExample(new Cliente());
            while (result.hasNext()) {
                Cliente cliente = result.next();
                clientes.add(cliente);
            }
            return clientes;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }finally{
            if(db != null){
                db.close();
            }
        }
    }
    
    public static Cliente getByDni(ObjectContainer db,String dni) throws Exception{
        Cliente cliEncontrado = null;
        try{
            Cliente cliBuscar = new Cliente();
            cliBuscar.setDni(dni);
            ObjectSet<Cliente> result = db.queryByExample(cliBuscar);
            while (result.hasNext()) {
                cliEncontrado = result.next();
                break;
            }
            if(cliEncontrado != null && cliEncontrado.getListaEspectaculos() == null){
                cliEncontrado.setListaEspectaculos(new ArrayList<>());
            }
            return cliEncontrado;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }
    
    public static List<Cliente> getAllClientesWithEspectaculos() throws Exception{
        ObjectContainer db = null;
        ObjectContainer dbEspe = null;
        List<Cliente> clientes = new ArrayList<>();
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.clientes);
            dbEspe = DB4O_BD.conectarBD(DB4O_CONNECTIONS.espectaculos);
            ObjectSet<Cliente> result = db.queryByExample(new Cliente());
            while (result.hasNext()) {
                Cliente cliente = result.next();
                cliente.setListaEspectaculos(new ArrayList<>());
                List<EspectaculoCliente> inscripciones = DB4O_EspectaculoClienteBD.getAllFromCliente(cliente.getDni());
                for(EspectaculoCliente inscripcion : inscripciones){  
                    Espectaculo espe = DB4O_EspectaculoBD.getById(dbEspe, inscripcion.getIdEspectaculo());
                    cliente.getListaEspectaculos().add(espe);
                }
                clientes.add(cliente);
            }
            return clientes;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }finally{
            if(db != null){
                db.close();
            }
            if(dbEspe != null){
                dbEspe.close();
            }
        }
    }
    
    public static List<Cliente> getAllClientesNoBajaConEspectaculos() throws Exception{
        ObjectContainer db = null;
        ObjectContainer dbEspe = null;
        List<Cliente> clientes = new ArrayList<>();
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.clientes);
            dbEspe = DB4O_BD.conectarBD(DB4O_CONNECTIONS.espectaculos);
            Cliente cliBusqueda = new Cliente();
            cliBusqueda.setBaja(false);
            ObjectSet<Cliente> result = db.queryByExample(cliBusqueda);
            while (result.hasNext()) {
                Cliente cliente = result.next();
                List<EspectaculoCliente> inscripciones = DB4O_EspectaculoClienteBD.getAllFromCliente(cliente.getDni());
                for(EspectaculoCliente inscripcion : inscripciones){  
                    Espectaculo espe = DB4O_EspectaculoBD.getById(dbEspe, inscripcion.getIdEspectaculo());
                    cliente.getListaEspectaculos().add(espe);
                }
                clientes.add(cliente);
            }
            return clientes;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }finally{
            if(db != null){
                db.close();
            }
            if(dbEspe != null){
                dbEspe.close();
            }
        }
    }
}
