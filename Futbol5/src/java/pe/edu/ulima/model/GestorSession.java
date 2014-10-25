/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ulima.model;

import javax.servlet.http.HttpSession;
import pe.edu.ulima.model.beans.Usuario;

/**
 *
 * @author gdavalos
 */
public class GestorSession {
    
    private static GestorSession gestor = null;

    private GestorSession(){}
    
    public static GestorSession getInstance(){
        if(gestor == null){
            gestor = new GestorSession();
        }
        return gestor;
    }
    
    public void putUser(HttpSession ses, Usuario us){
        ses.setAttribute("Usuario", us);
        ses.setAttribute("Nombre", us.getName());
        ses.setAttribute("Karma", us.getKarma());
    }
    
    public Usuario getUser(HttpSession ses){
        Usuario user = (Usuario)ses.getAttribute("Usuario");
        return user;
    }
    
    public void destroy(HttpSession ses){
        ses.setAttribute("Usuario", null);
        ses.setAttribute("Nombre", null);
        ses.setAttribute("Karma", null);
        ses.invalidate();
    }
    
}
