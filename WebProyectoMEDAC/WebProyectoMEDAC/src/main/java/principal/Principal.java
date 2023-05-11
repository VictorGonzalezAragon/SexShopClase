/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import conexion.Conexion;
import java.sql.SQLException;

public class Principal {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Conexion.conectar();
        Conexion.cerrarConexion();
    }
}
