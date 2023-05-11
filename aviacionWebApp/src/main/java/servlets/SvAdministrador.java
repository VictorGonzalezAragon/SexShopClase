/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import entidades.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Víctor
 */
@WebServlet(name = "SvAdministrador", urlPatterns = {"/SvAdministrador"})
public class SvAdministrador extends HttpServlet {
    ControladoraAdministrador controlAdmin = new ControladoraAdministrador();

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        
         List<Administrador> listaAdmins = new ArrayList<>();
         
        listaAdmins = controlAdmin.traerAdmins();
        
              
        HttpSession misession = request.getSession();
        misession.setAttribute("listaAdmins", listaAdmins);
        
        response.sendRedirect("JSPCode/mostrarAdmins.jsp");
        
        
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        RequestDispatcher rs;

        /*Dentro de getParameter tiene que estar metido exactamente lo mismo
        que el "name" de un input del JSP o HTML*/
        
            String nombre_admin = request.getParameter("nombre_admin");
            String apellido1_admin = request.getParameter("apellido1_admin");
            String apellido2_admin = request.getParameter("apellido2_admin");
            String correo_admin = request.getParameter("correo_admin");
            String contraseña_admin = request.getParameter("contraseña_admin");
        
        
            Administrador admin = new Administrador();
            admin.setNombre_administrador(nombre_admin);
            admin.setApellido1_administrador(apellido1_admin);
            admin.setApellido2_administrador(apellido2_admin);
            admin.setEmail_administrador(correo_admin);
            admin.setContraseña_administrador(contraseña_admin);
            admin.setId_rol(1);
            
            controlAdmin.crearAdmin(admin);
            
            
            
            rs = request.getRequestDispatcher("/JSPCode/index.jsp");
            rs.forward(request, response);

        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
