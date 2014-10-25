
package pe.edu.ulima.model.dao;

import com.google.code.morphia.Morphia;
import com.google.code.morphia.dao.BasicDAO;
import com.mongodb.Mongo;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;
import pe.edu.ulima.model.beans.Cancha;

public class CanchaMongoDAO extends BasicDAO<Cancha, ObjectId>{

     public CanchaMongoDAO(Mongo mongo, Morphia morphia, String dbName) {
        super(mongo, morphia, dbName);
    }
     
     public List<Cancha> disponiblesCancha(Date fecha, int hora){
        String hor = hora + "";
        Calendar cal = Calendar.getInstance();
        
        System.out.println("request fecha: " + fecha);
        cal.setTime(fecha);
        
        int anio = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH);
        mes++;
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        dia++;
        
        String fecha_comp = dia + "/" + mes + "/" + anio; 
        
        System.out.println("fecha_comp: " + fecha_comp);
        
        return ds.find(Cancha.class)
                 .field("calendar.fecha").equal(fecha_comp)
                 .field("calendar.hora").equal(hor)
                 .asList();
     }
     
     public List<Cancha> getCancha(){
        return ds.find(Cancha.class).retrievedFields(true, "name", "direccion").asList();   
     }
     
}
