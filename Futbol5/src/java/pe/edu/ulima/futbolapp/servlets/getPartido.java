/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.ulima.futbolapp.servlets;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
 * @author iEnzo
 */
@WebServlet(name = "getPartido", urlPatterns = {"/getPartido/*"})
public class getPartido extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String pathInfo = request.getPathInfo();
            String id = String.valueOf(pathInfo.substring(1));
        
        GestorPartido.getInstance().setFactoryDAO(new FactoryMongo());
        Partido partido = GestorPartido.getInstance().getPartido(id);
        
        RequestDispatcher rd = null;
        
        if(partido != null){
            
            request.setAttribute("nombrePartido", partido.getName());
            request.setAttribute("hora", partido.getHora());
            
            Calendar cal = Calendar.getInstance();
            cal.setTime(partido.getFecha());
            
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
            request.setAttribute("fecha", anio+"-"+mes+"-"+dia);
            
            rd = request.getRequestDispatcher("partido_en_espera.jsp");
        }else{
            System.out.println("no existe :(");
            rd = request.getRequestDispatcher("landing.jsp");
        }
        
        
        rd.forward(request, response);
        
    }

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
        processRequest(request, response);
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
