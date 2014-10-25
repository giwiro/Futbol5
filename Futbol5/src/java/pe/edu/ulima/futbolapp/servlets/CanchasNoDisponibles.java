/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.ulima.futbolapp.servlets;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.ulima.model.GestorCancha;
import pe.edu.ulima.model.beans.Cancha;
import pe.edu.ulima.model.dao.FactoryMongo;

/**
 *
 * @author iEnzo
 */
@WebServlet(name = "CanchasNoDisponibles", urlPatterns = {"/CanchasNoDisponibles"})
public class CanchasNoDisponibles extends HttpServlet {

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


    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        GestorCancha.getInstance().setFactoryDAO(new FactoryMongo());
        
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "GET, PUT, POST, OPTIONS, DELETE");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        response.addHeader("Access-Control-Max-Age", "86400");
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            //System.out.println("fecha_talcual: " + request.getParameter("fecha") );
            date = formatter.parse(request.getParameter("fecha"));
        } catch (ParseException ex) {
            Logger.getLogger(CanchasNoDisponibles.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        List<Cancha> disponibles = GestorCancha.getInstance().getnoDispCanchas(
                date, Integer.parseInt(request.getParameter("hora")));
        
        final Gson gson = new Gson();
        String formatJson = gson.toJson(disponibles);
        
        response.setContentType("application/json");
        try (PrintWriter out = response.getWriter()) {
            out.println(formatJson);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
