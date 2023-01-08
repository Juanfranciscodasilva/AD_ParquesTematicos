package BBDD;

import BBDD.db4o.*;
import BBDD.mysql.*;
import BBDD.sqlite.*;
import Clases.*;
import Enum.PARQUES;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.sqlite.SQLiteException;

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
                clientes = SQLITE_ClienteBD.getAllClientes();
                break;
            case Disney:
                clientes = DB4O_ClienteBD.getAllClientes();
                break;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            throw ex;
        }
        return clientes;
    }
    
    public static List<Cliente> obtenerAllClientesConEspectaculos() throws Exception{
        List<Cliente> clientes = new ArrayList<>();
        try{
            switch(parqueSeleccionado){
            case Warner:
                clientes = MYSQL_ClienteBD.getAllClientesWithEspectaculos();
                break;
            case Universal:
                clientes = SQLITE_ClienteBD.getAllClientesWithEspectaculos();
                break;
            case Disney:
                clientes = DB4O_ClienteBD.getAllClientesWithEspectaculos();
                break;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            throw ex;
        }
        return clientes;
    }
    
    public static List<Cliente> obtenerAllClientesNoBajaConEspectaculos() throws Exception{
        List<Cliente> clientes = new ArrayList<>();
        try{
            switch(parqueSeleccionado){
            case Warner:
                clientes = MYSQL_ClienteBD.getAllClientesNoBajaConEspectaculos();
                break;
            case Universal:
                clientes = SQLITE_ClienteBD.getAllClientesNoBajaConEspectaculos();
                break;
            case Disney:
                clientes = DB4O_ClienteBD.getAllClientesNoBajaConEspectaculos();
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
                SQLITE_ClienteBD.insertCliente(cli);
                break;
            case Disney:
                DB4O_ClienteBD.insertCliente(cli);
                break;
            }
        }catch(SQLiteException ex){
            System.out.println(ex.getMessage());
            if(ex.getResultCode().code == 1555){
                response.setCorrecto(false);
                response.setMensajeError("Ya hay registrado un cliente con ese DNI");
            }else{
                response.setCorrecto(false);
                response.setMensajeError("Ha ocurrido un error al insertar el cliente");
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            if(ex.getSQLState() != null && ex.getSQLState().equalsIgnoreCase("23000") && ex.getErrorCode() == 1062){
                response.setCorrecto(false);
                response.setMensajeError("Ya hay registrado un cliente con ese DNI");
            }else{
                response.setCorrecto(false);
                response.setMensajeError("Ha ocurrido un error al insertar el cliente");
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            response.setCorrecto(false);
            response.setMensajeError("Ha ocurrido un error al insertar el cliente");
        }
        return response;
    }
    
    public static Response modificarCliente(Cliente cli){
        Response response = new Response();
        try{
            switch(parqueSeleccionado){
            case Warner:
                MYSQL_ClienteBD.updateCliente(cli);
                break;
            case Universal:
                SQLITE_ClienteBD.updateCliente(cli);
                break;
            case Disney:
                DB4O_ClienteBD.updateCliente(cli);
                break;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            response.setCorrecto(false);
            response.setMensajeError("Ha ocurrido un error al modificar el cliente");
        }
        return response;
    }
    
    public static Response eliminarCliente(Cliente cli){
        Response response = new Response();
        try{
            switch(parqueSeleccionado){
            case Warner:
                MYSQL_ClienteBD.deleteCliente(cli);
                break;
            case Universal:
                SQLITE_ClienteBD.deleteCliente(cli);
                break;
            case Disney:
                DB4O_ClienteBD.deleteCliente(cli);
                break;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            response.setCorrecto(false);
            response.setMensajeError("Ha ocurrido un error al eliminar el cliente");
        }
        return response;
    }
    
    public static List<Empleado> obtenerAllEmpleados() throws Exception{
        List<Empleado> empleados = new ArrayList<>();
        try{
            switch(parqueSeleccionado){
            case Warner:
                empleados = MYSQL_EmpleadoBD.getAllEmpleados();
                break;
            case Universal:
                empleados = SQLITE_EmpleadoBD.getAllEmpleados();
                break;
            case Disney:
                empleados = DB4O_EmpleadoBD.getAllEmpleados();
                break;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            throw ex;
        }
        return empleados;
    }
    
    public static List<Empleado> obtenerAllEmpleadosConEspectaculos() throws Exception{
        List<Empleado> empleados = new ArrayList<>();
        try{
            switch(parqueSeleccionado){
            case Warner:
                empleados = MYSQL_EmpleadoBD.getAllEmpleadosWithEspectaculos();
                break;
            case Universal:
                empleados = SQLITE_EmpleadoBD.getAllEmpleadosWithEspectaculos();
                break;
            case Disney:
                empleados = DB4O_EmpleadoBD.getAllEmpleadosWithEspectaculos();
                break;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            throw ex;
        }
        return empleados;
    }
    
    public static List<Empleado> obtenerEmpleadosActivos() throws Exception{
        List<Empleado> empleados = new ArrayList<>();
        try{
            switch(parqueSeleccionado){
            case Warner:
                empleados = MYSQL_EmpleadoBD.getEmpleadosBajaFalse();
                break;
            case Universal:
                empleados = SQLITE_EmpleadoBD.getEmpleadosBajaFalse();
                break;
            case Disney:
                empleados = DB4O_EmpleadoBD.getEmpleadosBajaFalse();
                break;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            throw ex;
        }
        return empleados;
    }
    
    public static Response insertarEmpleado(Empleado emple){
        Response response = new Response();
        try{
            switch(parqueSeleccionado){
            case Warner:
                MYSQL_EmpleadoBD.insertEmpleado(emple);
                break;
            case Universal:
                SQLITE_EmpleadoBD.insertEmpleado(emple);
                break;
            case Disney:
                DB4O_EmpleadoBD.insertEmpleado(emple);
                break;
            }
        }catch(SQLiteException ex){
            System.out.println(ex.getMessage());
            if(ex.getResultCode().code == 1555){
                response.setCorrecto(false);
                response.setMensajeError("Ya hay registrado un empleado con ese DNI");
            }else{
                response.setCorrecto(false);
                response.setMensajeError("Ha ocurrido un error al insertar el empleado");
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            if(ex.getSQLState().equalsIgnoreCase("23000") && ex.getErrorCode() == 1062){
                response.setCorrecto(false);
                response.setMensajeError("Ya hay registrado un empleado con ese DNI");
            }else{
                response.setCorrecto(false);
                response.setMensajeError("Ha ocurrido un error al insertar el empleado");
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            response.setCorrecto(false);
            response.setMensajeError("Ha ocurrido un error al insertar el empleado");
        }
        return response;
    }
    
    public static Response modificarEmpleado(Empleado emple){
        Response response = new Response();
        try{
            switch(parqueSeleccionado){
            case Warner:
                MYSQL_EmpleadoBD.updateEmpleado(emple);
                break;
            case Universal:
                SQLITE_EmpleadoBD.updateEmpleado(emple);
                break;
            case Disney:
                DB4O_EmpleadoBD.updateEmpleado(emple);
                break;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            response.setCorrecto(false);
            response.setMensajeError("Ha ocurrido un error al modificar el empleado");
        }
        return response;
    }
    
    public static Response eliminarEmpleado(Empleado emple){
        Response response = new Response();
        try{
            switch(parqueSeleccionado){
            case Warner:
                MYSQL_EmpleadoBD.deleteEmpleado(emple);
                break;
            case Universal:
                SQLITE_EmpleadoBD.deleteEmpleado(emple);
                break;
            case Disney:
                DB4O_EmpleadoBD.deleteEmpleado(emple);
                break;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            response.setCorrecto(false);
            response.setMensajeError("Ha ocurrido un error al eliminar el empleado");
        }
        return response;
    }
    
    public static Response insertarEspectaculo(Espectaculo espe){
        Response response = new Response();
        try{
            switch(parqueSeleccionado){
            case Warner:
                MYSQL_EspectaculoBD.insertEspectaculo(espe);
                break;
            case Universal:
                SQLITE_EspectaculoBD.insertEspectaculo(espe);
                break;
            case Disney:
                DB4O_EspectaculoBD.insertEspectaculo(espe);
                break;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            response.setCorrecto(false);
            response.setMensajeError("Ha ocurrido un error al insertar el espectáculo");
        }
        return response;
    }
    
    public static Response modificarEspectaculo(Espectaculo espe){
        Response response = new Response();
        try{
            switch(parqueSeleccionado){
            case Warner:
                MYSQL_EspectaculoBD.updateEspectaculo(espe);
                break;
            case Universal:
                SQLITE_EspectaculoBD.updateEspectaculo(espe);
                break;
            case Disney:
                DB4O_EspectaculoBD.updateEspectaculo(espe);
                break;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            response.setCorrecto(false);
            response.setMensajeError("Ha ocurrido un error al modificar el espectáculo");
        }
        return response;
    }
    
    public static Response eliminarEspectaculo(Espectaculo espe){
        Response response = new Response();
        try{
            switch(parqueSeleccionado){
            case Warner:
                MYSQL_EspectaculoBD.deleteEspectaculo(espe);
                break;
            case Universal:
                SQLITE_EspectaculoBD.deleteEspectaculo(espe);
                break;
            case Disney:
                DB4O_EspectaculoBD.deleteEspectaculo(espe);
                break;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            response.setCorrecto(false);
            response.setMensajeError("Ha ocurrido un error al eliminar el espectáculo");
        }
        return response;
    }
    
    public static List<Espectaculo> obtenerAllEspectaculos() throws Exception{
        List<Espectaculo> espectaculos = new ArrayList<>();
        try{
            switch(parqueSeleccionado){
            case Warner:
                espectaculos = MYSQL_EspectaculoBD.getAllEspectaculos();
                break;
            case Universal:
                espectaculos = SQLITE_EspectaculoBD.getAllEspectaculos();
                break;
            case Disney:
                espectaculos = DB4O_EspectaculoBD.getAllEspectaculos();
                break;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            throw ex;
        }
        return espectaculos;
    }
    
    public static List<Espectaculo> obtenerAllEspectaculosConClientes() throws Exception{
        List<Espectaculo> espectaculos = new ArrayList<>();
        try{
            switch(parqueSeleccionado){
            case Warner:
                espectaculos = MYSQL_EspectaculoBD.getAllEspectaculosWithClientes();
                break;
            case Universal:
                espectaculos = SQLITE_EspectaculoBD.getAllEspectaculosWithClientes();
                break;
            case Disney:
                espectaculos = DB4O_EspectaculoBD.getAllEspectaculosWithClientes();
                break;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            throw ex;
        }
        return espectaculos;
    }
    
    public static List<Espectaculo> obtenerAllEspectaculosNoBajaConClientes() throws Exception{
        List<Espectaculo> espectaculos = new ArrayList<>();
        try{
            switch(parqueSeleccionado){
            case Warner:
                espectaculos = MYSQL_EspectaculoBD.getAllEspectaculosNoBajaWithClientes();
                break;
            case Universal:
                espectaculos = SQLITE_EspectaculoBD.getAllEspectaculosNoBajaWithClientes();
                break;
            case Disney:
                espectaculos = DB4O_EspectaculoBD.getAllEspectaculosNoBajaWithClientes();
                break;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            throw ex;
        }
        return espectaculos;
    }
    
    public static Response insertarInscripcionClienteEspectaculo(Espectaculo espec, Cliente cli){
        Response response = new Response();
        try{
            switch(parqueSeleccionado){
            case Warner:
                MYSQL_EspectaculoClienteBD.insertEspectaculoCliente(espec,cli);
                break;
            case Universal:
                SQLITE_EspectaculoClienteBD.insertEspectaculoCliente(espec,cli);
                break;
            case Disney:
                DB4O_EspectaculoClienteBD.insertEspectaculoCliente(espec,cli);
                break;
            }
        }catch(SQLiteException ex){
            System.out.println(ex.getMessage());
            if(ex.getResultCode().code == 1555){
                response.setCorrecto(false);
                response.setMensajeError("El cliente ya está inscrito en el espectáculo");
            }else{
                response.setCorrecto(false);
                response.setMensajeError("Ha ocurrido un error al inscribir el cliente en el espectáculo");
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            if(ex.getSQLState().equalsIgnoreCase("23000") && ex.getErrorCode() == 1062){
                response.setCorrecto(false);
                response.setMensajeError("El cliente ya está inscrito en el espectáculo");
            }else{
                response.setCorrecto(false);
                response.setMensajeError("Ha ocurrido un error al inscribir el cliente en el espectáculo");
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            response.setCorrecto(false);
            response.setMensajeError("Ha ocurrido un error al inscribir el cliente en el espectáculo");
        }
        return response;
    }
    
    public static Response eliminarInscripcionClienteEspectaculo(Espectaculo espec, Cliente cli){
        Response response = new Response();
        try{
            switch(parqueSeleccionado){
            case Warner:
                MYSQL_EspectaculoClienteBD.deleteEspectaculoCliente(espec.getId(),cli.getDni());
                break;
            case Universal:
                SQLITE_EspectaculoClienteBD.deleteEspectaculoCliente(espec.getId(),cli.getDni());
                break;
            case Disney:
                DB4O_EspectaculoClienteBD.deleteEspectaculoCliente(espec.getId(),cli.getDni());
                break;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            response.setCorrecto(false);
            response.setMensajeError("Ha ocurrido un error al retirar el cliente del espectáculo");
        }
        return response;
    }
    
    public static MetaData obtenerMetaData(){
        MetaData meta = new MetaData();
        try{
            switch(parqueSeleccionado){
            case Warner:
                meta = MYSQL_BD.getMetaData();
                break;
            case Universal:
//                meta = SQLITE_EspectaculoClienteBD.deleteEspectaculoCliente(espec.getId(),cli.getDni());
                break;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            System.out.println("Ha ocurrido un error al obtener los metadatos");
            return null;
        }
        return meta;
    }
}
