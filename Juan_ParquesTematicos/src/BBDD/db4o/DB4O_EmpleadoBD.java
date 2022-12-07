package BBDD.db4o;

import static BBDD.db4o.DB4O_ClienteBD.getByDni;
import BBDD.mysql.*;
import Clases.*;
import Enum.DB4O_CONNECTIONS;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DB4O_EmpleadoBD {
    
    public static void insertEmpleado(Empleado emple) throws Exception{
        ObjectContainer db = null;
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.empleados);
            Empleado e = new Empleado();
            e.setDni(emple.getDni());
            if(!db.queryByExample(e).isEmpty()){
                throw new SQLException("Ya hay un empleado registrado con ese DNI","23000",1062);
            }
            emple.setListaEspectaculos(new ArrayList<>());
            db.store(emple);
        }catch(Exception ex){
            throw ex;
        }finally{
            if(db != null){
                db.close();
            }
        }
    }
    
    public static Empleado getByDni(ObjectContainer db,String dni) throws Exception{
        Empleado empEncontrado = null;
        boolean cerrarConexion = false;
        try{
            if(db == null){
                cerrarConexion = true;
                db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.empleados);
            }
            Empleado empBuscar = new Empleado();
            empBuscar.setDni(dni.toUpperCase());
            ObjectSet<Empleado> result = db.queryByExample(empBuscar);
            while (result.hasNext()) {
                empEncontrado = result.next();
                break;
            }
            if(empEncontrado != null && empEncontrado.getListaEspectaculos() == null){
                empEncontrado.setListaEspectaculos(new ArrayList<>());
            }
            return empEncontrado;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }finally{
            if(db != null && cerrarConexion){
                db.close();
            }
        }
    }
    
    public static void updateEmpleado(Empleado emple) throws Exception{
        ObjectContainer db = null;
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.empleados);
            Empleado empleado = getByDni(db,emple.getDni());
            if(empleado == null){
                throw new Exception("Ha ocurrido un error al modificar el empleado");
            }
            empleado.setNombre(emple.getNombre());
            empleado.setApellido1(emple.getApellido1());
            empleado.setFechaNacimiento(emple.getFechaNacimiento());
            empleado.setFechaContratacion(emple.getFechaContratacion());
            empleado.setNacionalidad(emple.getNacionalidad());
            empleado.setCargo(emple.getCargo());
            empleado.setBaja(emple.isBaja());
            db.store(empleado);
        }catch(Exception ex){
            throw ex;
        }finally{
            if(db != null){
                db.close();
            }
        }
    }
    
    public static void deleteEmpleado(Empleado emple) throws Exception{
        ObjectContainer db = null;
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.empleados);
            Empleado empleado = getByDni(db,emple.getDni());
            if(empleado == null){
                throw new Exception("Ha ocurrido un error al eliminar el empleado");
            }
            db.delete(empleado);
        }catch(Exception ex){
            throw ex;
        }finally{
            if(db != null){
                db.close();
            }
        }
    }
    
    public static List<Empleado> getAllEmpleados() throws Exception{
        ObjectContainer db = null;
        List<Empleado> empleados = new ArrayList<>();
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.empleados);
            ObjectSet<Empleado> result = db.queryByExample(new Empleado());
            while (result.hasNext()) {
                Empleado empleado = result.next();
                empleados.add(empleado);
            }
            return empleados;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }finally{
            if(db != null){
                db.close();
            }
        }
    }
    
    public static List<Empleado> getAllEmpleadosWithEspectaculos() throws Exception{
        ObjectContainer db = null;
        List<Empleado> empleados = new ArrayList<>();
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.empleados);
            ObjectSet<Empleado> result = db.queryByExample(new Empleado());
            while (result.hasNext()) {
                Empleado empleado = result.next();
                empleado.setListaEspectaculos(new ArrayList<>());
                List<Espectaculo> espectaculos = DB4O_EspectaculoBD.getAllEspectaculos();
                for(Espectaculo espe : espectaculos){  
                    if(espe.getEncargado().getDni().equalsIgnoreCase(empleado.getDni())){
                        empleado.getListaEspectaculos().add(espe);
                    }
                }
                empleados.add(empleado);
            }
            return empleados;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }finally{
            if(db != null){
                db.close();
            }
        }
    }

    public static List<Empleado> getEmpleadosBajaFalse() throws Exception{
        ObjectContainer db = null;
        List<Empleado> empleados = new ArrayList<>();
        try{
            db = DB4O_BD.conectarBD(DB4O_CONNECTIONS.empleados);
            Empleado emple = new Empleado();
            emple.setBaja(false);
            ObjectSet<Empleado> result = db.queryByExample(emple);
            while (result.hasNext()) {
                Empleado empleado = result.next();
                empleados.add(empleado);
            }
            return empleados;
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
