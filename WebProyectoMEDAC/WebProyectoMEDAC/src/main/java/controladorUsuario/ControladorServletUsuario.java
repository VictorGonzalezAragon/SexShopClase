/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controladorUsuario;

import boUsuario.BoUsuario;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(name = "ControladorServletUsuario", urlPatterns = {"/ControladorServletUsuario"})
public class ControladorServletUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        
        String action = request.getParameter("action");
        
        if(action.contains("insertar")) {
            BoUsuario.procesarPeticionInstertarUsuario(request, response);
            RequestDispatcher rs = request.getRequestDispatcher("/HtmlCode/Inicio.html");
            rs.forward(request,response);
            
        }
        
        if(action.equals("borrar")){
            BoUsuario.procesarPeticionBorrarUsuario(request, response);
            RequestDispatcher re = request.getRequestDispatcher("/HtmlCode/Inicio.html");
            re.forward(request,response);
        }
        
        if(action.equals("listado")){
            BoUsuario.procesarPeticionBorrarUsuario(request, response);
            RequestDispatcher re = request.getRequestDispatcher("/HtmlCode/Inicio.html");
            re.forward(request,response);
        }
        
        if(action.equals("actualizar")){
            BoUsuario.procesarPeticionActualizarUsuario(request, response);
            RequestDispatcher re = request.getRequestDispatcher("/HtmlCode/Inicio.html");
            re.forward(request,response);
        }
        
        
        
        //BoUsuario.procesarPeticionInstertarUsuario(request,response);
        //BoAdministrador.procesarPeticionBorrarAdministrador(request,response);
      
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
        try {
            processRequest(request, response);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ControladorServletUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ControladorServletUsuario.class.getName()).log(Level.SEVERE, null, ex);
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
