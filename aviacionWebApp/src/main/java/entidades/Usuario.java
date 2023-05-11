/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Víctor
 */  
@Entity
public class Usuario implements Serializable {
    
    //Atributos(mismo nombre que bbdd)
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id_usuario;   
    
    private String nombre_usuario;
    private String apellido1_usuario;
    private String apellido2_usuario;
    private String nombreUsuario_usuario;
    private String email_usuario;
    private String contraseña_usuario;
    private int id_rol;

    public Usuario() {
    }

    public Usuario(int id_usuario, String nombre_usuario, String apellido1_usuario, String apellido2_usuario, String nombreUsuario_usuario, String email_usuario, String contraseña_usuario, int id_rol) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.apellido1_usuario = apellido1_usuario;
        this.apellido2_usuario = apellido2_usuario;
        this.nombreUsuario_usuario = nombreUsuario_usuario;
        this.email_usuario = email_usuario;
        this.contraseña_usuario = contraseña_usuario;
        this.id_rol = id_rol;
    }

  
    
    
    
    
    
    
    

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getApellido1_usuario() {
        return apellido1_usuario;
    }

    public void setApellido1_usuario(String apellido1_usuario) {
        this.apellido1_usuario = apellido1_usuario;
    }

    public String getApellido2_usuario() {
        return apellido2_usuario;
    }

    public void setApellido2_usuario(String apellido2_usuario) {
        this.apellido2_usuario = apellido2_usuario;
    }

    public String getNombreUsuario_usuario() {
        return nombreUsuario_usuario;
    }

    public void setNombreUsuario_usuario(String nombreUsuario_usuario) {
        this.nombreUsuario_usuario = nombreUsuario_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getContraseña_usuario() {
        return contraseña_usuario;
    }

    public void setContraseña_usuario(String contraseña_usuario) {
        this.contraseña_usuario = contraseña_usuario;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }


    
    

    

            
            
    
}
