package juan_parquestematicos;

import BBDD.BD_INTERMEDIARIO;
import Enum.*;
import Ventanas.*;
import Clases.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {
    
    public static VSeleccionParque vSeleccionParque;
    public static VPrincipal vPrincipal;
    public static VDatosParque vDatosParque;
    public static VCrearCliente vCrearCliente;
    public static VvmeCliente vVmeCliente;
//    public static VCrearEmpleado vCrearEmpleado;
    
    public static PARQUES parqueSeleccionado;

    public static void main(String[] args) {
        try{
            BD_INTERMEDIARIO.comprobarBasesDeDatos();
        }catch(Exception ex){
            System.out.println("Ha ocurrido un error al comprobar el funcionamiento de las bases de datos");
            System.exit(0);
        }
        vSeleccionParque = new VSeleccionParque();
        vSeleccionParque.setVisible(true);
    }
    
    public static void SeleccionarParque(PARQUES parque){
        parqueSeleccionado = parque;
        BD_INTERMEDIARIO.parqueSeleccionado = parque;
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
    
    public static void abrirVentanaDatosParque(){
        Parque parque = BD_INTERMEDIARIO.obtenerParque();
        if(parque != null){
            vPrincipal.setVisible(false);
            vPrincipal.dispose();
            vDatosParque = new VDatosParque(parque);
            vDatosParque.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al obtener los datos del parque");
        }
        
    }
    
    public static void cerrarVentanaDatosParque(){
        vPrincipal = new VPrincipal(parqueSeleccionado);
        vPrincipal.setVisible(true);
        vDatosParque.setVisible(false);
        vDatosParque.dispose();
    }
    
    public static void abrirCrearCliente(){
        vPrincipal.setVisible(false);
        vPrincipal.dispose();
        vCrearCliente = new VCrearCliente(0,null);
        vCrearCliente.setVisible(true);
    }
    
    public static void cerrarCrearCliente(int opcion){
        vCrearCliente.setVisible(false);
        vCrearCliente.dispose();
        if(opcion==1){
            abrirVMECliente(1);
        }else{
            vPrincipal = new VPrincipal(parqueSeleccionado);
            vPrincipal.setVisible(true);
        }
        
    }
    
    public static void abrirVMECliente(int opcion){
        try{
            List<Cliente> clientes = BD_INTERMEDIARIO.obtenerAllClientes();
            if(vPrincipal != null){
                vPrincipal.setVisible(false);
                vPrincipal.dispose();
            }
            vVmeCliente = new VvmeCliente(opcion, clientes);
            vVmeCliente.setVisible(true);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al abrir la ventana. Intentalo de nuevo.","",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void cerrarVMECliente(){
        vVmeCliente.setVisible(false);
        vVmeCliente.dispose();
        vPrincipal = new VPrincipal();
        vPrincipal.setVisible(true);
    }
    
    public static void abrirModificarCliente(Cliente cli){
        vVmeCliente.setVisible(false);
        vVmeCliente.dispose();
        vCrearCliente = new VCrearCliente(1, cli);
        vCrearCliente.setVisible(true);
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
    
    public static Response insertarCliente(Cliente cli){
        return BD_INTERMEDIARIO.insertarCliente(cli);
    }
    
    public static Response modificarCliente(Cliente cli){
        return BD_INTERMEDIARIO.modificarCliente(cli);
    }
    
    public static Response EliminarCliente(Cliente cli){
        return BD_INTERMEDIARIO.eliminarCliente(cli);
    }
    
    public static void cerrarPrograma(){
        System.exit(0);
    }
    
}
