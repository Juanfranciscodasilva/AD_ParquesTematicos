package BBDD;

import BBDD.mysql.MYSQL_AgenciaBD;
import BBDD.db4o.DB4O_AgenciaBD;
import BBDD.sqlite.SQLITE_AgenciaBD;
import Clases.Agencia;
import Enum.EnumAgencias;

public class BD_INTERMEDIARIO {
    
    public static Agencia obtenerAgencia(EnumAgencias enumAgencia){
        Agencia agencia = null;
        switch(enumAgencia){
            case el_caminante:
                agencia = MYSQL_AgenciaBD.getAgencia();
                break;
            case viajes_araba:
                agencia = SQLITE_AgenciaBD.getAgencia();
                break;
            case viajes_eroski:
                agencia = DB4O_AgenciaBD.getAgencia();
                break;
        }
        return agencia;
    }
}
