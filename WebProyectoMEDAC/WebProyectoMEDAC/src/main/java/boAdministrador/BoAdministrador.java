/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boAdministrador;

import daoAdministrador.DaoAdministrador;
import entidades.Administrador;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author pedro
 */
public class BoAdministrador {
    
    public static void procesarPeticionInstertarAdministrador(HttpServletRequest request, HttpServletResponse response) throws SQLException, ClassNotFoundException, IOException{
    //orientacion a objetos 
    Administrador administrador = new Administrador();
    administrador.setNombre(request.getParameter("nombre_adm"));
    administrador.setApellido1(request.getParameter("apellido1_adm"));
    administrador.setApellido2(request.getParameter("apellido2_adm"));
    administrador.setEmail(request.getParameter("email_adm"));
    administrador.setContraseña(request.getParameter("contrasena_adm"));
    
    DaoAdministrador.insertarAdministrador(administrador.getNombre(),administrador.getApellido1(),administrador.getApellido2(),administrador.getEmail(),administrador.getContraseña());
    
    }
    
    public static void procesarPeticionBorrarAdministrador(HttpServletRequest request, HttpServletResponse response) throws SQLException, ClassNotFoundException, IOException{
    //orientacion a objetos 
    Administrador administrador = new Administrador();
    administrador.setId_administrador(Integer.parseInt(request.getParameter("id_adm")));
    
    DaoAdministrador.borrarAdministrador(administrador.getId_administrador());
    
    
    
    
    
    }
    
}
