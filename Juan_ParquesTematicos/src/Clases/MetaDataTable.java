package Clases;

import java.util.ArrayList;
import java.util.List;

public class MetaDataTable {
    
    private String esquema;
    
    private String nombre;
    
    private List<MetaDataColumn> listaColumnas;

    public MetaDataTable() {
        this.listaColumnas = new ArrayList<>();
    }

    public String getEsquema() {
        return esquema;
    }

    public void setEsquema(String esquema) {
        this.esquema = esquema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<MetaDataColumn> getListaColumnas() {
        return listaColumnas;
    }

    public void setListaColumnas(List<MetaDataColumn> listaColumnas) {
        this.listaColumnas = listaColumnas;
    }
    
    
}
