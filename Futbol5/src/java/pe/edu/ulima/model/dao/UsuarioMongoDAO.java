/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.ulima.model.dao;

import com.google.code.morphia.Morphia;
import com.google.code.morphia.dao.BasicDAO;
import org.bson.types.ObjectId;
import com.google.code.morphia.query.Query;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.QueryBuilder;
import com.mongodb.ServerAddress;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.regex.Pattern;
import pe.edu.ulima.model.beans.Usuario;

/**
 *
 * @author iEnzo
 */
public class UsuarioMongoDAO extends BasicDAO<Usuario, ObjectId>{

    public UsuarioMongoDAO(Mongo mongo, Morphia morphia, String dbName) {
        super(mongo, morphia, dbName);
    }
    
     public Iterator<Usuario> findByeName(String name){
        Pattern regExp = Pattern.compile(name + ".*",
                Pattern.CASE_INSENSITIVE);
        return ds.find(entityClazz).filter("name", regExp).iterator();
    }
    
    public Usuario getUsuario(String nick) {
        return ds.find(Usuario.class).field("nickname").equal(nick).get();
    }
    
    public Usuario insertUsuario(Usuario userInsert) {
        ds.save(userInsert);
        return userInsert;
    }
    
}
