package Clases;

import java.util.ArrayList;
import java.util.List;

public class Espectaculo {
    private int id;
    private String nombre;
    private int aforo;
    private String descripcion;
    private String lugar;
    private boolean baja;
    
    private Empleado encargado;
    
    private List<Cliente> listaClientes;
    //TODO añadir el empleado¿?

    public Espectaculo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    public Empleado getEncargado() {
        return encargado;
    }

    public void setEncargado(Empleado encargado) {
        this.encargado = encargado;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
    public String toString2(){
        return "- "+nombre+": "+descripcion+". En: "+lugar+" para "+aforo+" personas."+(baja ? " (de baja)":"");
    }
    
    public Espectaculo clonar(){
        Espectaculo clon = new Espectaculo();
        clon.setId(getId());
        clon.setNombre(getNombre());
        clon.setAforo(getAforo());
        clon.setDescripcion(getDescripcion());
        clon.setLugar(getLugar());
        clon.setBaja(isBaja());
        clon.setEncargado(new Empleado());
        clon.setListaClientes(new ArrayList<>());
        return clon;
    }
    
}
