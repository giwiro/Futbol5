
package pe.edu.ulima.model.dao;

import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.edu.ulima.model.beans.Cancha;
import pe.edu.ulima.model.beans.Partido;
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
    private PartidoMongoDAO partidoMongoDao;
    private final String dbname = "futbol5";
    private CanchaMongoDAO canchaMongoDao;
    
    public void initiate(){
        mongo = MongoUtil.getMongo();
        morphia = new Morphia();
        morphia.map(Usuario.class);
        userDao = new UsuarioMongoDAO(mongo, morphia, dbname);
        partidoMongoDao = new PartidoMongoDAO(mongo, morphia, dbname); //refactori por aqui
        canchaMongoDao = new CanchaMongoDAO(mongo, morphia, dbname); //refactori por aqui
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
        userInsert.setKarma(0);
        
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

    @Override
    public List<Partido> getPartidos() {
        initiate();
        return partidoMongoDao.getPartidos();
    }

    @Override
    public Partido insertPartido(String nombre, int hora, Date fecha, String nickname) {
        initiate();
        Partido partidoInsert = new Partido();
        partidoInsert.setName(nombre);
        partidoInsert.setHora(hora);
        partidoInsert.setEstado("espera");
        partidoInsert.setNickname(nickname);
       
        Partido partido = partidoMongoDao.insertPartido(partidoInsert);
        
        return partido;
    }

    @Override
    public List<Cancha> nodisponiblesCancha(int hora, Date fecha) {
       initiate();
       List<Cancha> CanchasnoDisp = canchaMongoDao.disponiblesCancha(fecha, hora);
        return CanchasnoDisp;
    }

    @Override
    public List<Cancha> getCanchas() {
        initiate();
        List<Cancha> allcanchas = canchaMongoDao.getCancha();
        return allcanchas;
    }

    @Override
    public void updateKarma(String nickname, int karma) {
       initiate();
       userDao.updateKarma(nickname, karma);
    }

    @Override
    public void pushInPartido(String idNikcname, String idPartido) {
       initiate();
       partidoMongoDao.pushInPartido(idNikcname, idPartido);
    }

    @Override
    public void getPartidosMes(String mes, String year) {
       
    }

    @Override
    public List<Partido> userPartidos(String nickame) {
       initiate();
       return partidoMongoDao.userPartidos(nickame);
    }
    @Override
    public Partido getPartido(String idPartido) {
        return partidoMongoDao.getPartido(idPartido);
    }
    
}
