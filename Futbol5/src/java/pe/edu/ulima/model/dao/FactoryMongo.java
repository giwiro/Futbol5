
package pe.edu.ulima.model.dao;

import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;
import org.junit.Before;
import pe.edu.ulima.model.beans.Usuario;
import pe.edu.ulima.util.MongoUtil;

/**
 *
 * @author iEnzo
 */

public class FactoryMongo implements FactoryDAO {
    private Mongo mongo;
    private Morphia morphia;
    private UsuarioMongoDAO userDao;
    private final String dbname = "futbol5";
    
    public void initiate(){
        mongo = MongoUtil.getMongo();
        morphia = new Morphia();
        morphia.map(Usuario.class);
        userDao = new UsuarioMongoDAO(mongo, morphia, dbname);
    }
    
    @Override
    public  Usuario getUser(String nick){
        initiate();
        Usuario user = userDao.getUsuario(nick);
        return user;
    }
    
}
