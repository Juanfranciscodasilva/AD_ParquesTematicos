package Clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Empleado implements Serializable {
 
    private int id;
    private String dni;
    private String nombre;
    private String apellido1;
    private Date fechaNacimiento;
    private Date fechaContratacion;
    private String nacionalidad;
    private String cargo;
    private boolean baja;
    
    List<Espectaculo> listaEspectaculos;

    public Empleado() {
    }
    
    public Empleado(int id, String dni, String nombre, String apellido1, Date fechaNacimiento, Date fechaContratacion, String nacionalidad, String cargo, boolean baja) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContratacion = fechaContratacion;
        this.nacionalidad = nacionalidad;
        this.cargo = cargo;
        this.baja = baja;
    }

    public Empleado(int id, String dni, String nombre, String apellido1, Date fechaNacimiento, Date fechaContratacion, String nacionalidad, String cargo) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContratacion = fechaContratacion;
        this.nacionalidad = nacionalidad;
        this.cargo = cargo;
    }

    public Empleado(String nombre, String apellido1, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    public List<Espectaculo> getListaEspectaculos() {
        return listaEspectaculos;
    }

    public void setListaEspectaculos(List<Espectaculo> listaEspectaculos) {
        this.listaEspectaculos = listaEspectaculos;
    }

}
