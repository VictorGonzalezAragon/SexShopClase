/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controladorServletProducto;

import boProducto.BoProducto;
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

/**
 *
 * @author Víctor
 */
@WebServlet(name = "ControladorServletProducto", urlPatterns = {"/ControladorServletProducto"})
public class ControladorServletProducto extends HttpServlet {

    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
       
            String action  = request.getParameter("action");
            RequestDispatcher rs;
            
            switch (action) {
            case "insertar_producto":
               
                BoProducto.procesarPeticionInstertarProducto(request, response);
                rs = request.getRequestDispatcher("/HtmlCode/Inicio.html");
                rs.forward(request, response);

                break;
            case "borrar_producto":
                BoProducto.procesarPeticionBorrarProducto(request, response);
                rs = request.getRequestDispatcher("/HtmlCode/Inicio.html");
                rs.forward(request, response);
            
            case"mostrar_usuario":
                BoProducto.procesarPeticionListaUsuario(request, response);
                rs = request.getRequestDispatcher("/HtmlCode/Inicio.html");
                rs.forward(request, response);

            default:
                throw new AssertionError();
        }

        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        
        
        
        
        
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorServletProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControladorServletProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorServletProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControladorServletProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
