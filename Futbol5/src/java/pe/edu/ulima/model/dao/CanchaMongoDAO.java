
package pe.edu.ulima.model.dao;

import com.google.code.morphia.Morphia;
import com.google.code.morphia.dao.BasicDAO;
import com.mongodb.Mongo;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;
import pe.edu.ulima.model.beans.Cancha;

public class CanchaMongoDAO extends BasicDAO<Cancha, ObjectId>{

     public CanchaMongoDAO(Mongo mongo, Morphia morphia, String dbName) {
        super(mongo, morphia, dbName);
    }
     
     public List<Cancha> disponiblesCancha(Date fecha, int hora){
         return ds.find(Cancha.class)
                 .field("calendar.fecha").notEqual(fecha)
                 .field("calendar.hora").notEqual(hora)
                 .asList();
     }
     
     
    
}
