package Clases;

import java.util.Date;

public class Parque {
    private int id;
    
    private String nombre;
    
    private Date fecha_apertura;
    
    private String direccion;
    
    public Parque() {
        
    }

    public Parque(int id, String nombre, Date fecha_apertura, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_apertura = fecha_apertura;
        this.direccion = direccion;
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

    public Date getFecha_apertura() {
        return fecha_apertura;
    }

    public void setFecha_apertura(Date fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
