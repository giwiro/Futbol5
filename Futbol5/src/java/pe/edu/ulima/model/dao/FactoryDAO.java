/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.ulima.model.dao;

import java.util.Date;
import java.util.List;
import pe.edu.ulima.model.beans.Cancha;
import pe.edu.ulima.model.beans.Partido;
import pe.edu.ulima.model.beans.Usuario;

/**
 *
 * @author iEnzo
 */
public interface FactoryDAO {
    public Usuario getUser(String name); 
    public Usuario registerUser(String dni, String nombre, String apellido, String nick, String password); 
    public void updateKarma(String nickname, int karma);
    public List<Partido> userPartidos(String nickame);
    
    public List<Partido> getPartidos();
    public Partido insertPartido(String nombre, int hora, Date fecha);
    public List<Cancha> nodisponiblesCancha(int hora, Date fecha);
    public List<Cancha> getCanchas();
    public void pushInPartido(String userID, String partidoID);
    public void getPartidosMes(String mes, String year);//new

} 
