/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

    
    public class Conexion {
    private static final Logger logConexion = Logger.getLogger("conexion");
    private static Connection conect; 
    private static String host;
    private static String user;
    private static String password;
    
    private Conexion(){
        
    }
    
    public static Connection conectar() throws ClassNotFoundException, SQLException{
        host = "localhost:3306/banana_sandia";
        user = "root";
        password = "666666";
        CargarDriver.cargarDriver();
        //Class.forName("com.mysql.cj.jdbc.Driver");//clase que ya no se usa, obsoleta.
        conect = DriverManager.getConnection("jdbc:mysql://" + host + "?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false&" + "user=" + user + "&password=" + password );
        if (conect.isClosed()){
            logConexion.info("No se ha establecido la conexión");
        }
        else {
            logConexion.info("Se ha podido establecer la conexión");
        }
        return conect;
        
       }
    public static void cerrarConexion() throws SQLException{
        if (conect.isClosed()){
            conect.close();
            logConexion.info("La conexión no está abierta");
        }
        
        else {
            logConexion.info("Se ha cerrado la conexión");
            }
    }
}


