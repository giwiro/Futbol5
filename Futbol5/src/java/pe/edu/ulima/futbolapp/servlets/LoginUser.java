/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.ulima.futbolapp.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pe.edu.ulima.model.GestorSession;
import pe.edu.ulima.model.GestorUsuario;
import pe.edu.ulima.model.beans.Usuario;
import pe.edu.ulima.model.dao.FactoryMongo;

/**
 *
 * @author iEnzo
 */
@WebServlet(name = "LoginUser", urlPatterns = {"/LoginUser"})
public class LoginUser extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        GestorUsuario.getInstance().setFactoryDAO(new FactoryMongo());
        
        Usuario user = GestorUsuario.getInstance().loguin(
                request.getParameter("nickname"), request.getParameter("password"));
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher rd = null;
        if(user != null){
            HttpSession ses = request.getSession(true);
            GestorSession.getInstance().putUser(ses, user);
            rd = request.getRequestDispatcher("landing.jsp");
        }else{
            request.setAttribute("fail","display: block");
            rd = request.getRequestDispatcher("index.jsp");
        }
        
        rd.forward(request, response);
        
        /*final Gson gson = new Gson();
        String formatJson = gson.toJson(user);
                
        
        response.setContentType("application/json");
        try (PrintWriter out = response.getWriter()) {

            if(user != null){
                out.println(formatJson);
            }else{
                out.println("<h1>Tu usuario o password sin incorrectos </h1>");
            }
        }*/
     
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
