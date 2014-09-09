/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.ulima.model;

import pe.edu.ulima.model.beans.Usuario;
import pe.edu.ulima.model.dao.FactoryDAO;

/**
 *
 * @author iEnzo
 */
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
        if(user != null){
            if(user.getPassword().equals(password)){
                return user;
            }else{
                return null;
            } 
        }else{
            return null;
        } 
    }
    
    
    
}
