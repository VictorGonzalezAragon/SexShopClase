/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import entidades.ControladoraUsuario;
import entidades.Usuario;
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

/*import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;*/

/**
 *
 * @author Víctor
 */
@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {
    
    ControladoraUsuario controlUsu = new ControladoraUsuario();

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Usuario> listaUsuarios = new ArrayList<>();
         
        listaUsuarios = controlUsu.traerUsuarios();
        
              
        HttpSession misession = request.getSession();
        misession.setAttribute("listaUsuarios", listaUsuarios);
        
        response.sendRedirect("JSPCode/mostrarUsuarios.jsp");

    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
        RequestDispatcher rs;
        
        /*Dentro de getParameter tiene que estar metido exactamente lo mismo
        que el "name" de un input del JSP o HTML*/
        
            String nombre_usu = request.getParameter("nombre_usuario");
            String apellido1_usu = request.getParameter("apellido1_usuario");
            String apellido2_usu = request.getParameter("apellido2_usuario");
            String nombreUsuario_usu = request.getParameter("nombreUsuario_usuario");
            String correo_usu = request.getParameter("correo_usuario");
            String contraseña_usu = request.getParameter("contraseña_usuario");

            
            
            Usuario usu = new Usuario();
            
            usu.setNombre_usuario(nombre_usu);
            usu.setApellido1_usuario(apellido1_usu);
            usu.setApellido2_usuario(apellido2_usu);
            usu.setNombreUsuario_usuario(nombreUsuario_usu);
            usu.setEmail_usuario(correo_usu);
            usu.setContraseña_usuario(contraseña_usu);
            usu.setId_rol(2);
            
            
            controlUsu.crearUsuario(usu);
            
            

            rs = request.getRequestDispatcher("/JSPCode/index.jsp");
            rs.forward(request, response);
            
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
    
    
    
}
