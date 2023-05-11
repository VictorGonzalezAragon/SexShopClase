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
   
   public static void insertarAdministrador (String nombre, String apellido1, String apellido2, String email, String contraseña) throws ClassNotFoundException, SQLException{
       
      Connection conexion = Conexion.conectar(); 
      Statement stm = conexion.createStatement();
      String insertIntoAdministrador = "insert into administrador(nombre_adm,apellido1_adm,apellido2_adm,email_adm,contraseña_adm) values"; 
      insertIntoAdministrador += "('" + nombre + "','" + apellido1 + "','" + apellido2 + "','" + email + "','" + contraseña + "')";
      //Execute update nos devuelve el número de filas insertadas
      int filas = stm.executeUpdate(insertIntoAdministrador);
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
    
    public static void borrarAdministrador(int id_administrador) throws ClassNotFoundException, SQLException{
         
        Connection conexion = Conexion.conectar(); 
      Statement stm = conexion.createStatement();
      String borrarAdministrador = "delete from administrador where id_administrador =" + id_administrador; 
      
      int filas = stm.executeUpdate(borrarAdministrador);
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
