/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boUsuario;

import daoUsuario.DaoUsuario;
import entidades.Usuario;
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
    usuario.setNombre(request.getParameter("Nombre"));
    usuario.setApellido1(request.getParameter("apellido1"));
    usuario.setApellido2(request.getParameter("Apellido2"));
    usuario.setEmail(request.getParameter("Email"));
    usuario.setContraseña(request.getParameter("Contraseña"));
    DaoUsuario.insertarUsuario(usuario.getNombre(),usuario.getApellido1(),usuario.getApellido2(),usuario.getEmail(),usuario.getContraseña());
    
    
    
    
    
    }
    
            
            
            }       

