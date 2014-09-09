/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.ulima.model.dao;

import com.google.code.morphia.Morphia;
import com.google.code.morphia.dao.BasicDAO;
import org.bson.types.ObjectId;
import com.mongodb.Mongo;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import pe.edu.ulima.model.beans.Partido;
import pe.edu.ulima.model.beans.Usuario;

/**
 *
 * @author iEnzo
 */
public class PartidoMongoDAO extends BasicDAO<Usuario, ObjectId>{

    public PartidoMongoDAO(Mongo mongo, Morphia morphia, String dbName) {
        super(mongo, morphia, dbName);
    }
    
     public Iterator<Usuario> findByeName(String name){
        Pattern regExp = Pattern.compile(name + ".*",
                Pattern.CASE_INSENSITIVE);
        return ds.find(entityClazz).filter("name", regExp).iterator();
    }
    
    public List<Partido> getPartidos() {
        return ds.find(Partido.class).asList();
    }
    
    public Partido insertPartido(Partido partidoInsert) {
        ds.save(partidoInsert);
        return partidoInsert;
    }
    
}
