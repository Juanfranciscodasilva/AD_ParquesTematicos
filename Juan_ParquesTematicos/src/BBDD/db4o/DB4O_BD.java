package BBDD.db4o;

import Clases.Parque;
import Enum.DB4O_CONNECTIONS;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Date;

public class DB4O_BD {
    
    final static String BD_parques = "db4o_parques.yap";
    final static String BD_clientes = "db4o_clientes.yap";
    final static String BD_empleados = "db4o_empleados.yap";
    final static String BD_espectaculos = "db4o_espectaculos.yap";
    final static String BD_espectaculos_clientes = "db4o_espectaculos_clientes.yap";
    
    public static void ComprobarYPrepararBD() throws Exception{
        try{
            ObjectContainer db= conectarBD(DB4O_CONNECTIONS.parques);
            if(!comprobarExistenciaParque(db)){
                System.out.print("DB4O: no se ha encontrado registrado el parque.");
                Parque parque = new Parque(1,"Disney",new Date(),"Direccion de Disney");
                db.store(parque);
                System.out.print("DB4O: se ha registrado el parque.");
            }
            db.close();
            db= conectarBD(DB4O_CONNECTIONS.clientes);
            db.close();
            db= conectarBD(DB4O_CONNECTIONS.empleados);
            db.close();
            db= conectarBD(DB4O_CONNECTIONS.espectaculos);
            db.close();
            db= conectarBD(DB4O_CONNECTIONS.espectaculos_clientes);
            db.close();
        }catch(Exception ex){
            System.out.println("DB4O: Ha ocurrido un error al hacer la conexión con la BD db4o");
            throw new Exception("Ha ocurrido un error al hacer la conexión con la BD db4o");
        }
    }
    
    private static boolean comprobarExistenciaParque(ObjectContainer db){
        ObjectSet<Parque> result = db.queryByExample(new Parque());
            while (result.hasNext()) {
                return true;
            }
        return false;
    }
    
    public static ObjectContainer conectarBD(DB4O_CONNECTIONS opcion){
        try{
            switch(opcion){
                case parques:
                    return Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),BD_parques);
                case clientes:
                    return Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),BD_clientes);
                case empleados:
                    return Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),BD_empleados);
                case espectaculos:
                    return Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),BD_espectaculos);
                case espectaculos_clientes:
                    return Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),BD_espectaculos_clientes);
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
        return null;
    }
}
