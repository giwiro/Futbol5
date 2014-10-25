/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.ulima.futbolapp.servlets;

import com.google.gson.Gson;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.ulima.model.GestorCancha;
import pe.edu.ulima.model.GestorPartido;
import pe.edu.ulima.model.beans.Cancha;
import pe.edu.ulima.model.beans.Partido;
import pe.edu.ulima.model.dao.FactoryMongo;

/**
 *
 * @author Davalos
 */
public class RegistroPartido extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String f = request.getParameter("fecha");
        
        request.setAttribute("fecha_talcual", f);
        DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        Date fecha = null;
        try {
            fecha = formatter.parse(f);
        } catch (ParseException ex) {
            Logger.getLogger(RegistroPartido.class.getName()).log(Level.SEVERE, null, ex);
        }

        String nombre = request.getParameter("nombrePartido");
        int hora = Integer.parseInt(request.getParameter("hora"));
        
        GestorPartido.getInstance().setFactoryDAO(new FactoryMongo());
        Partido partido = GestorPartido.getInstance().register(
                nombre,
                hora,
                fecha
        );
        
        RequestDispatcher rd = null;
        
        if(partido != null){
            
            request.setAttribute("nombrePartido", partido.getName());
            request.setAttribute("hora", partido.getHora());
            
            Calendar cal = Calendar.getInstance();
            cal.setTime(fecha);
            
            int anio = cal.get(Calendar.YEAR);
            int mes = cal.get(Calendar.MONTH);
            mes++;
            int dia = cal.get(Calendar.DAY_OF_MONTH);
            dia++;
            
            GestorCancha.getInstance().setFactoryDAO(new FactoryMongo());
            List<Cancha> disponibles = GestorCancha.getInstance().getCanchas();

            final Gson gson = new Gson();
            String formatJson = gson.toJson(disponibles);
            
            request.setAttribute("todasCanchas", formatJson);

            /*response.setContentType("application/json");
            try (PrintWriter out = response.getWriter()) {
                out.println(formatJson);
            }*/

            /*request.setAttribute("dia", dia);
            request.setAttribute("mes", mes);
            request.setAttribute("anio", anio);*/
        
        
            
            request.setAttribute("fecha", anio+"-"+mes+"-"+dia);
            
            rd = request.getRequestDispatcher("partido_en_espera.jsp");
        }else{
            System.out.println("no existe :(");
            rd = request.getRequestDispatcher("landing.jsp");
        }
        
        
        rd.forward(request, response);
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
