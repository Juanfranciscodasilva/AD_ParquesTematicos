package BBDD;

import BBDD.db4o.*;
import BBDD.mysql.*;
import BBDD.sqlite.*;
import Clases.*;
import Enum.PARQUES;
import java.sql.SQLException;
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
    
    public static List<Cliente> obtenerAllClientesNoBajaConEspectaculos() throws Exception{
        List<Cliente> clientes = new ArrayList<>();
        try{
            switch(parqueSeleccionado){
            case Warner:
                clientes = MYSQL_ClienteBD.getAllClientesNoBajaConEspectaculos();
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
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            if(ex.getSQLState().equalsIgnoreCase("23000") && ex.getErrorCode() == 1062){
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
                
                break;
            case Disney:
                
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
                
                break;
            case Disney:
                
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
                
                break;
            case Disney:
                
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
                
                break;
            case Disney:
                
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
                
                break;
            case Disney:
                
                break;
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
                
                break;
            case Disney:
                
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
                
                break;
            case Disney:
                
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
                
                break;
            case Disney:
                
                break;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            response.setCorrecto(false);
            response.setMensajeError("Ha ocurrido un error al insertar el empleado");
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
                
                break;
            case Disney:
                
                break;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            response.setCorrecto(false);
            response.setMensajeError("Ha ocurrido un error al modificar el empleado");
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
                
                break;
            case Disney:
                
                break;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            response.setCorrecto(false);
            response.setMensajeError("Ha ocurrido un error al eliminar el empleado");
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
                
                break;
            case Disney:
                
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
                
                break;
            case Disney:
                
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
                
                break;
            case Disney:
                
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
                
                break;
            case Disney:
                
                break;
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            if(ex.getSQLState().equalsIgnoreCase("23000") && ex.getErrorCode() == 1062){
                response.setCorrecto(false);
                response.setMensajeError("El cliente ya está inscrito en el espectáculo");
            }else{
                response.setCorrecto(false);
                response.setMensajeError("Ha ocurrido un error al insertar el cliente");
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            response.setCorrecto(false);
            response.setMensajeError("Ha ocurrido un error al insertar el empleado");
        }
        return response;
    }
}
