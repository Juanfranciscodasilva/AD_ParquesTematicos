package Clases;

import java.util.ArrayList;
import java.util.List;

public class MetaData {
    
    private String nombreBD;
    
    private String driverBD;
    
    private String urlDB;
    
    private String clienteDB;
    
    private List<MetaDataTable> listaTablas;

    public MetaData() {
        this.listaTablas = new ArrayList<>();
    }

    public String getNombreBD() {
        return nombreBD;
    }

    public void setNombreBD(String nombreBD) {
        this.nombreBD = nombreBD;
    }

    public String getDriverBD() {
        return driverBD;
    }

    public void setDriverBD(String driverBD) {
        this.driverBD = driverBD;
    }

    public String getUrlDB() {
        return urlDB;
    }

    public void setUrlDB(String urlDB) {
        this.urlDB = urlDB;
    }

    public String getClienteDB() {
        return clienteDB;
    }

    public void setClienteDB(String clienteDB) {
        this.clienteDB = clienteDB;
    }

    public List<MetaDataTable> getListaTablas() {
        return listaTablas;
    }

    public void setListaTablas(List<MetaDataTable> listaTablas) {
        this.listaTablas = listaTablas;
    }
    
    
}
