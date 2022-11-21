package juan_parquestematicos;

import BBDD.BD_INTERMEDIARIO;
import Enum.*;
import Ventanas.*;
import Clases.*;

public class Main {
    
    public static VSeleccionParque vSeleccionParque;
    public static VPrincipal vPrincipal;
//    public static VDatosAgencia vDatosAgencia;
//    public static VCrearCliente vCrearCliente;
//    public static VCrearEmpleado vCrearEmpleado;
    
    public static PARQUES parqueSeleccionado;

    public static void main(String[] args) {
        try{
            BD_INTERMEDIARIO.comprobarBasesDeDatos();
        }catch(Exception ex){
            System.out.println("Ha ocurrido un error al comprobar el funcionamiento de las bases de datos");
            System.exit(0);
        }
        
        //        MYSQL_AgenciaBD bdMysql = new MYSQL_AgenciaBD();
//          DB4O_AgenciaBD bdDB4O = new DB4O_AgenciaBD();
//          SQLITE_AgenciaBD sqlite = new SQLITE_AgenciaBD();
//        vSeleccionParque = new VSeleccionParque();
//        vSeleccionParque.setVisible(true);
    }
    
    public static void SeleccionarAgencia(PARQUES agencia){
        parqueSeleccionado = agencia;
        abrirVentanaPrincipal();
    }
    
    public static void abrirVentanaPrincipal(){
        vSeleccionParque.setVisible(false);
        vSeleccionParque.dispose();
        vPrincipal = new VPrincipal(parqueSeleccionado);
        vPrincipal.setVisible(true);
    }
    
    public static void cerrarSesion(){
        vPrincipal.setVisible(false);
        vPrincipal.dispose();
        vSeleccionParque = new VSeleccionParque();
        vSeleccionParque.setVisible(true);
    }
    
    public static void abrirVentanaDatosAgencia(){
//        vPrincipal.setVisible(false);
//        vPrincipal.dispose();
//        Agencia agencia = BD_INTERMEDIARIO.obtenerAgencia(agenciaSeleccionada);
//        vDatosAgencia = new VDatosAgencia(agencia);
//        vDatosAgencia.setVisible(true);
    }
    
    public static void cerrarVentanaDatosAgencia(){
//        vPrincipal = new VPrincipal(agenciaSeleccionada);
//        vPrincipal.setVisible(true);
//        vDatosAgencia.setVisible(false);
//        vDatosAgencia.dispose();
    }
    
    public static void abrirCrearCliente(){
//        vPrincipal.setVisible(false);
//        vPrincipal.dispose();
//        vCrearCliente = new VCrearCliente();
//        vCrearCliente.setVisible(true);
    }
    
    public static void cerrarCrearCliente(){
//        vPrincipal = new VPrincipal(agenciaSeleccionada);
//        vPrincipal.setVisible(true);
//        vCrearCliente.setVisible(false);
//        vCrearCliente.dispose();
    }
    
    public static void abrirCrearEmpleado(){
//        vPrincipal.setVisible(false);
//        vPrincipal.dispose();
//        vCrearEmpleado = new VCrearEmpleado();
//        vCrearEmpleado.setVisible(true);
    }
    
    public static void cerrarCrearEmpleado(){
//        vPrincipal = new VPrincipal(agenciaSeleccionada);
//        vPrincipal.setVisible(true);
//        vCrearEmpleado.setVisible(false);
//        vCrearEmpleado.dispose();
    }
    
    public static void cerrarPrograma(){
        System.exit(0);
    }
    
//    public static Response insertarCliente(Cliente cli){
//        //TODO mandar a insertar a BD
//        return new Response();
//    }
//    
//    public static Response insertarEmpleado(Empleado emple){
//        //TODO mandar a insertar a BD
//        return new Response();
//    }
    
}
