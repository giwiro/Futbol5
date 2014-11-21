/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.google.gson.Gson;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import pe.edu.ulima.futbolapp.servlets.CanchasNoDisponibles;
import pe.edu.ulima.futbolapp.servlets.RegistroPartido;
import pe.edu.ulima.model.GestorCancha;
import pe.edu.ulima.model.GestorPartido;
import pe.edu.ulima.model.beans.Cancha;
import pe.edu.ulima.model.beans.Partido;
import pe.edu.ulima.model.dao.FactoryMongo;

/**
 *
 * @author iEnzo
 */
public class Pruebas {
    
    public Pruebas() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void insertarPartido(){
        String f = "01/01/2014";

        DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        Date fecha = null;
        try {
            fecha = formatter.parse(f);
        } catch (ParseException ex) {
            Logger.getLogger(RegistroPartido.class.getName()).log(Level.SEVERE, null, ex);
        }

        String nombre = "Los choclones";
        int hora = 1;
        
        GestorPartido.getInstance().setFactoryDAO(new FactoryMongo());
        Partido partido = GestorPartido.getInstance().register(
                nombre,
                hora,
                fecha
        );
        
        assertTrue("FUNCIONO BIEN :D", partido != null);
        
    }
    
    
    @Test
    public void getCanchasNoDisponibles(){
        
        GestorCancha.getInstance().setFactoryDAO(new FactoryMongo());
        
        int hor = 14;
        Calendar cal = Calendar.getInstance();
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            //System.out.println("fecha_talcual: " + request.getParameter("fecha") );
            date = formatter.parse("26/10/2014");
        } catch (ParseException ex) {
            Logger.getLogger(CanchasNoDisponibles.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        List<Cancha> Nodisponibles = GestorCancha.getInstance().getnoDispCanchas(
                date, hor );
        
        System.out.println("NoDisponibles!!!!!  " + Nodisponibles.size());
        
        assertTrue("FUNCIONO BIEN :D", Nodisponibles.size() > 0);
        
        
    }
}
