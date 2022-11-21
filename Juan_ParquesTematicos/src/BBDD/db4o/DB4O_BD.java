package BBDD.db4o;

import Clases.Parque;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Date;

public class DB4O_BD {
    
    final static String BD = "ad_parques_tematicos.yap";
    
    public static void ComprobarYPrepararBD() throws Exception{
        try{
            ObjectContainer db= conectarBD();
            if(!comprobarExistenciaParque(db)){
                System.out.print("DB4O: no se ha encontrado registrado el parque.");
                Parque parque = new Parque(1,"Disney",new Date(),"Direccion de Disney");
                db.store(parque);
                System.out.print("DB4O: se ha registrado el parque.");
            }
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
    
    public static ObjectContainer conectarBD(){
        try{
            return Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),BD);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
