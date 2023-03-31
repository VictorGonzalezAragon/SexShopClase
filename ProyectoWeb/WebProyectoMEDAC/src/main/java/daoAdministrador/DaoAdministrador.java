/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoAdministrador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import java.util.logging.Level;



public class DaoAdministrador {
    
   private static final Logger log = Logger.getLogger(DaoAdministrador.class
            .getPackage().getName());
   
   private static void insertarAdministrador (int id_administrador,String nombre, String apellido1, String apellido2, String email, String contraseña) throws ClassNotFoundException, SQLException{
       
      Connection conexion = Conexion.conectar(); 
      Statement stm = conexion.createStatement();
      String insertIntoAdministradores = "insert into admnistradores(nombre,apellido1,apellido2,email,contraseña= values"; 
      insertIntoAdministradores += "('" + nombre + "','" + apellido1 + "','" + apellido2 + "','" + email + "','" + contraseña + "')";
      //Execute update nos devuelve el número de filas insertadas
      int filas = stm.executeUpdate(insertIntoAdministradores);
      log.log(Level.INFO,"N\u00famero de filas afectadas... {0]",filas);
      int registrosAfectados = stm.getUpdateCount();
      
      conexion.setAutoCommit(false);
      conexion.commit();
      if (registrosAfectados<1){
          conexion.rollback();
          conexion.close();
      }
      log.log(Level.INFO, "N\u00famero de registros afectados...{0}", registrosAfectados);
      stm.close();
      conexion.close();
      
      boolean checkConexion= conexion.isClosed();
      log.log(Level.INFO,"Conexión cerrada...{0}",checkConexion);
 
      
   }
    
    
    
}
