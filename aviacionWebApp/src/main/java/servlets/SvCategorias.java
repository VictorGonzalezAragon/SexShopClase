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
@WebServlet(name = "SvCategorias", urlPatterns = {"/SvCategorias"})
public class SvCategorias extends HttpServlet {

    
    ControladoraCategorias controlCats = new ControladoraCategorias();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Categorias> listaCategorias = new ArrayList<>();
        
        listaCategorias = controlCats.traerCategoria();
        
        HttpSession misessionCat = request.getSession();
        misessionCat.setAttribute("listaCategoria", listaCategorias);
        
                response.sendRedirect("JSPCode/mostrarCategorias.jsp");

        
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
                RequestDispatcher rs;

        
        String  nombre_cat = request.getParameter("nombre_categoria");
        
        Categorias cat = new Categorias();
        
        cat.setNombre_categoria(nombre_cat);
        
        controlCats.crearCategoria(cat);
        
        rs = request.getRequestDispatcher("/JSPCode/index.jsp");
            rs.forward(request, response);                
                
                
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
