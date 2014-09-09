
package pe.edu.ulima.model.dao;

import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;
import java.io.UnsupportedEncodingException;
import javax.xml.registry.infomodel.User;
import pe.edu.ulima.model.beans.Usuario;
import pe.edu.ulima.util.MongoUtil;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    @Override
    public Usuario registerUser(String dni, String nombre, String apellido, String nickname, String password) {
        initiate();
        Usuario userInsert = new Usuario();
        userInsert.setId(dni);
        userInsert.setName(nombre);
        userInsert.setLastname(apellido);
        userInsert.setNickname(nickname);
        
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
            md.update(password.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(FactoryMongo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FactoryMongo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String hash = new String(md.digest());
        System.out.println("Password: " + hash);
        userInsert.setPassword(hash);
        
        Usuario inserted = userDao.insertUsuario(userInsert);
        return inserted;
    }
    
}
