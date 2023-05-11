/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boUsuario;

import daoUsuario.DaoUsuario;
import entidades.Usuario;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author pedro
 */
public class BoUsuario {
    
    public static void procesarPeticionInstertarUsuario(HttpServletRequest request, HttpServletResponse response) throws SQLException, ClassNotFoundException, IOException{
    //orientacion a objetos 
    Usuario usuario = new Usuario();
    usuario.setNombre(request.getParameter("nombre_usuario"));
    usuario.setApellido1(request.getParameter("apellido1_usuario"));
    usuario.setApellido2(request.getParameter("apellido2_usuario"));
    usuario.setEmail(request.getParameter("email_usuario"));
    usuario.setContraseña(request.getParameter("contrasena_usuario"));
    
    DaoUsuario.insertarUsuario(usuario.getNombre(),usuario.getApellido1(),usuario.getApellido2(),usuario.getEmail(),usuario.getContraseña());
    
    }
    
    public static void procesarPeticionBorrarUsuario(HttpServletRequest request, HttpServletResponse response) throws SQLException, ClassNotFoundException, IOException{
    //orientacion a objetos 
    Usuario usuario = new Usuario();
    usuario.setId_usuario(Integer.parseInt(request.getParameter("id")));
    
    DaoUsuario.borrarUsuario(usuario.getId_usuario());
   
    }
    
    public static void procesarPeticionListaUsuario(HttpServletRequest request, HttpServletResponse response) throws SQLException, ClassNotFoundException, IOException{
        
    RequestDispatcher rs = request.getRequestDispatcher("/mostrarSsrvletUsuario");
        
        
    }
    
    public static void procesarPeticionActualizarUsuario(HttpServletRequest request, HttpServletResponse response) throws SQLException, ClassNotFoundException, IOException{
        
    Usuario usuario = new Usuario();
    usuario.setId_usuario(Integer.parseInt(request.getParameter("id_usuario")));
    usuario.setNombre(request.getParameter("nombre_usuario"));
    usuario.setApellido1(request.getParameter("apellido1_usuario"));
    usuario.setApellido2(request.getParameter("apellido2_usuario"));
    usuario.setEmail(request.getParameter("email_usuario"));
    usuario.setContraseña(request.getParameter("contrasena_usuario"));

    DaoUsuario.actualizarUsuario(usuario.getId_usuario(),usuario.getNombre(),usuario.getApellido1(),usuario.getApellido2(),usuario.getEmail(),usuario.getContraseña());
        
        
    }           
}       

