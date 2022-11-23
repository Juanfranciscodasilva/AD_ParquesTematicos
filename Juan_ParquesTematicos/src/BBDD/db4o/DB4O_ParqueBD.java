package BBDD.db4o;

import Clases.*;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Date;

public class DB4O_ParqueBD {
    
    public static Parque getParque(){
        ObjectContainer db = null;
        try{
            db = DB4O_BD.conectarBD();
            ObjectSet<Parque> result = db.queryByExample(new Parque());
            while (result.hasNext()) {
                Parque parque = result.next();
                return parque;
            }
            return null;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }finally{
            if(db != null){
                db.close();
            }
        }
    }
    
    
}
