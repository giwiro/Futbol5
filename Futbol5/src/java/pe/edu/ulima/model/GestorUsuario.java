

package pe.edu.ulima.model;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.edu.ulima.model.beans.Usuario;
import pe.edu.ulima.model.dao.FactoryDAO;
import pe.edu.ulima.model.dao.FactoryMongo;


public class GestorUsuario {
    private static GestorUsuario gestor = null;
    
    private FactoryDAO mFactory;
    
    private GestorUsuario(){}
    
    public static GestorUsuario getInstance(){
        if(gestor == null){
            gestor = new GestorUsuario();
        }
        return gestor;
    }
    
    public void setFactoryDAO(FactoryDAO factoryDAO){
        mFactory = factoryDAO;
    }
    
    public Usuario loguin(String nickname, String password){
        Usuario user = mFactory.getUser(nickname);
        
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
        
        if(user != null){
            if(user.getPassword().equals(hash)){
                return user;
            }else{
                return null;
            } 
        }else{
            return null;
        } 
    }
    
    public Usuario register(String dni, String nombre, String apellido, String nickname, String password){
        Usuario user = mFactory.registerUser(dni, nombre, apellido, nickname, password);
        return user;
    }
    
    
    
}
