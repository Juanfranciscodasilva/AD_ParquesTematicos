package BBDD;

import BBDD.db4o.DB4O_BD;
import BBDD.mysql.MYSQL_ParqueBD;
import BBDD.db4o.DB4O_ParqueBD;
import BBDD.mysql.MYSQL_BD;
import BBDD.sqlite.SQLITE_BD;
import BBDD.sqlite.SQLITE_ParqueBD;
import Clases.*;
import Enum.PARQUES;

public class BD_INTERMEDIARIO {
    
    public static void comprobarBasesDeDatos() throws Exception{
        MYSQL_BD.ComprobarYPrepararBD();
        DB4O_BD.ComprobarYPrepararBD();
        SQLITE_BD.ComprobarYPrepararBD();
    }
    
    public static Parque obtenerParque(PARQUES enumParque){
        Parque parque = null;
        switch(enumParque){
            case Warner:
                parque = MYSQL_ParqueBD.getParque();
                break;
            case Universal:
                parque = SQLITE_ParqueBD.getParque();
                break;
            case Disney:
                parque = DB4O_ParqueBD.getParque();
                break;
        }
        return parque;
    }
}
