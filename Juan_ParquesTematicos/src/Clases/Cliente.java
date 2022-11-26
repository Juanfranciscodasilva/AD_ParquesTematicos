package Clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Cliente implements Serializable {
 
    private String dni;
    private String nombre;
    private String apellido1;
    private Date fechaNacimiento;
    private boolean baja;
    
//    ArrayList<VisitaGuiada> visitas = new ArrayList();

    public Cliente() {
    }

    public Cliente(String dni, String nombre, String apellido1, Date fechaNacimiento, boolean baja) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.fechaNacimiento = fechaNacimiento;
        this.baja = baja;
    }
    
    public Cliente(String dni, String nombre, String apellido1, Date fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Cliente(String nombre, String apellido1, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.fechaNacimiento = fechaNacimiento;
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

    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", fechaNacimiento=" + fechaNacimiento + ", baja=" + baja + '}';
    }
    
    
}
