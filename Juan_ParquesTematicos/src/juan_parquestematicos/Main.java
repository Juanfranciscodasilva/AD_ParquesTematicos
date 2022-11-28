package juan_parquestematicos;

import BBDD.BD_INTERMEDIARIO;
import Enum.*;
import Ventanas.*;
import Clases.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {
    
    public static VCargando vCargando;
    public static VSeleccionParque vSeleccionParque;
    public static VPrincipal vPrincipal;
    public static VDatosParque vDatosParque;
    public static VCrearCliente vCrearCliente;
    public static VvmeCliente vVmeCliente;
    public static VCrearEmpleado vCrearEmpleado;
    public static VvmeEmpleado vVmeEmpleado;
    public static VCrearEspectaculo vCrearEspectaculo;
    public static VvmeEspectaculo vVmeEspectaculo;
    
    public static PARQUES parqueSeleccionado;

    public static void main(String[] args) {
        try{
            vCargando = new VCargando();
            vCargando.setVisible(true);
            BD_INTERMEDIARIO.comprobarBasesDeDatos();
        }catch(Exception ex){
            System.out.println("Ha ocurrido un error al comprobar el funcionamiento de las bases de datos");
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al comprobar las bases de datos. Intentalo de nuevo.","",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }finally{
            if(vCargando != null){
                vCargando.setVisible(false);
                vCargando.dispose();
            }
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
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al obtener los datos del parque","",JOptionPane.ERROR_MESSAGE);
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
        vPrincipal = new VPrincipal(parqueSeleccionado);
        vPrincipal.setVisible(true);
    }
    
    public static void abrirModificarCliente(Cliente cli){
        vVmeCliente.setVisible(false);
        vVmeCliente.dispose();
        vCrearCliente = new VCrearCliente(1, cli);
        vCrearCliente.setVisible(true);
    }
    
    public static void abrirCrearEmpleado(){
        vPrincipal.setVisible(false);
        vPrincipal.dispose();
        vCrearEmpleado = new VCrearEmpleado(0,null);
        vCrearEmpleado.setVisible(true);
    }
    
    public static void cerrarCrearEmpleado(int opcion){
        vCrearEmpleado.setVisible(false);
        vCrearEmpleado.dispose();
        if(opcion==1){
            abrirVMEEmpleado(1);
        }else{
            vPrincipal = new VPrincipal(parqueSeleccionado);
            vPrincipal.setVisible(true);
        }
        
    }
    
    public static void abrirVMEEmpleado(int opcion){
        try{
            List<Empleado> empleados = BD_INTERMEDIARIO.obtenerAllEmpleados();
            if(vPrincipal != null){
                vPrincipal.setVisible(false);
                vPrincipal.dispose();
            }
            vVmeEmpleado = new VvmeEmpleado(opcion, empleados);
            vVmeEmpleado.setVisible(true);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al abrir la ventana. Intentalo de nuevo.","",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void cerrarVMEEmpleado(){
        vVmeEmpleado.setVisible(false);
        vVmeEmpleado.dispose();
        vPrincipal = new VPrincipal(parqueSeleccionado);
        vPrincipal.setVisible(true);
    }
    
    public static void abrirModificarEmpleado(Empleado emple){
        vVmeEmpleado.setVisible(false);
        vVmeEmpleado.dispose();
        vCrearEmpleado = new VCrearEmpleado(1, emple);
        vCrearEmpleado.setVisible(true);
    }
    
    public static void abrirCrearEspectaculo(){
         try{
            List<Empleado> empleados = BD_INTERMEDIARIO.obtenerEmpleadosActivos();
            if(vPrincipal != null){
                vPrincipal.setVisible(false);
                vPrincipal.dispose();
            }
            vCrearEspectaculo = new VCrearEspectaculo(0,null,empleados);
            vCrearEspectaculo.setVisible(true);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al abrir la ventana. Intentalo de nuevo.","",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void cerrarCrearEspectaculo(int opcion){
        vCrearEspectaculo.setVisible(false);
        vCrearEspectaculo.dispose();
        if(opcion==1){
            abrirVMEEspectaculo(1);
        }else{
            vPrincipal = new VPrincipal(parqueSeleccionado);
            vPrincipal.setVisible(true);
        }
        
    }
    
    public static void abrirVMEEspectaculo(int opcion){
        try{
            List<Espectaculo> espectaculos = BD_INTERMEDIARIO.obtenerAllEspectaculos();
            if(vPrincipal != null){
                vPrincipal.setVisible(false);
                vPrincipal.dispose();
            }
            vVmeEspectaculo = new VvmeEspectaculo(opcion, espectaculos);
            vVmeEspectaculo.setVisible(true);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al abrir la ventana. Intentalo de nuevo.","",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void cerrarVMEEspectaculo(){
        vVmeEspectaculo.setVisible(false);
        vVmeEspectaculo.dispose();
        vPrincipal = new VPrincipal(parqueSeleccionado);
        vPrincipal.setVisible(true);
    }
    
    public static void abrirModificarEspectaculo(Espectaculo espec){
        try{
            List<Empleado> empleados = BD_INTERMEDIARIO.obtenerEmpleadosActivos();
            if(vVmeEspectaculo != null){
                vVmeEspectaculo.setVisible(false);
                vVmeEspectaculo.dispose();
            }
            vCrearEspectaculo = new VCrearEspectaculo(1,espec,empleados);
            vCrearEspectaculo.setVisible(true);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al abrir la ventana. Intentalo de nuevo.","",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static Response insertarCliente(Cliente cli){
        return BD_INTERMEDIARIO.insertarCliente(cli);
    }
    
    public static Response modificarCliente(Cliente cli){
        return BD_INTERMEDIARIO.modificarCliente(cli);
    }
    
    public static Response eliminarCliente(Cliente cli){
        return BD_INTERMEDIARIO.eliminarCliente(cli);
    }
    
    public static Response insertarEmpleado(Empleado emple){
        return BD_INTERMEDIARIO.insertarEmpleado(emple);
    }
    
    public static Response modificarEmpleado(Empleado emple){
        return BD_INTERMEDIARIO.modificarEmpleado(emple);
    }
    
    public static Response eliminarEmpleado(Empleado emple){
        return BD_INTERMEDIARIO.eliminarEmpleado(emple);
    }
    
    public static Response insertarEspectaculo(Espectaculo espe){
        return BD_INTERMEDIARIO.insertarEspectaculo(espe);
    }
    
    public static Response modificarEspectaculo(Espectaculo espe){
        return BD_INTERMEDIARIO.modificarEspectaculo(espe);
    }
    
    public static Response eliminarEspectaculo(Espectaculo espe){
        return BD_INTERMEDIARIO.eliminarEspectaculo(espe);
    }
    
    public static void cerrarPrograma(){
        System.exit(0);
    }
    
}
