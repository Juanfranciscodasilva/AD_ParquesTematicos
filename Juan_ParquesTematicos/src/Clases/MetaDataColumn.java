package Clases;

public class MetaDataColumn {
    private boolean primaryKey;
    
    private String nombre;
    
    private String tipo;
    
    private boolean puedeNull;

    public MetaDataColumn() {
        this.primaryKey = false;
    }

    public boolean isPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(boolean primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isPuedeNull() {
        return puedeNull;
    }

    public void setPuedeNull(boolean puedeNull) {
        this.puedeNull = puedeNull;
    }
    
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("- "+this.nombre+"  "+this.tipo);
        if(this.primaryKey){
            builder.append("  PRIMARY KEY");
        }
        builder.append(this.puedeNull ? "  NULL":"  NOT NULL");
        return builder.toString();
    }
    
}
