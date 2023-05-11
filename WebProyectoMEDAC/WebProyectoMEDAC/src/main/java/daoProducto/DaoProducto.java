/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoProducto;

import conexion.Conexion;
import daoUsuario.DaoUsuario;
import entidades.Categoria;
import entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DaoProducto {
    private static final Logger log = Logger.getLogger(DaoUsuario.class
            .getPackage().getName());

    public static void insertarProducto(int id_producto, String nombre_producto, double precio_producto, int stockDisponible_producto, String descripcion_producto, Categoria cat) throws ClassNotFoundException, SQLException {

        Connection conexion = Conexion.conectar();
        
        String insertIntoUsuario = "insert into producto(id_producto, nombre_producto,precio_producto,stockDisponible_producto,descripcion_producto, id_categoria) values (?,?,?,?,?,?)";
        PreparedStatement pstmt = conexion.prepareStatement(insertIntoUsuario);
        
        pstmt.setInt(1, id_producto);
        pstmt.setString(2, nombre_producto);
        pstmt.setDouble(3, precio_producto);
        pstmt.setInt(4, stockDisponible_producto);
        pstmt.setString(5, descripcion_producto);
        pstmt.setInt(6, cat.getId_categoria());
        

        //Execute update nos devuelve el número de filas insertadas
        int filas = pstmt.executeUpdate();
        log.log(Level.INFO, "N\u00famero de filas afectadas... {0]", filas);
        int registrosAfectados = pstmt.getUpdateCount();

        conexion.setAutoCommit(false);
        conexion.commit();
        if (registrosAfectados < 1) {
            conexion.rollback();
            conexion.close();
        }
        log.log(Level.INFO, "N\u00famero de registros afectados...{0}", registrosAfectados);
        pstmt.close();
        conexion.close();

        boolean checkConexion = conexion.isClosed();
        log.log(Level.INFO, "Conexión cerrada...{0}", checkConexion);

    }
    
    
    
        public static void borrarProducto(int id_producto) throws ClassNotFoundException, SQLException {

    
    //delete from usuarios where id_usuario = 20;
        Connection conexion = Conexion.conectar();

        
        
        String borrarProducto = "delete from producto where id_producto = ?";
        
        PreparedStatement pstmt = conexion.prepareStatement(borrarProducto);
        pstmt.setInt(1, id_producto);


        int filas = pstmt.executeUpdate(borrarProducto);
        log.log(Level.INFO, "N\u00famero de filas afectadas... {0]", filas);
        int registrosAfectados = pstmt.getUpdateCount();

        conexion.setAutoCommit(false);
        conexion.commit();
        if (registrosAfectados < 1) {
            conexion.rollback();
            conexion.close();
        }
        log.log(Level.INFO, "N\u00famero de registros afectados...{0}", registrosAfectados);
        pstmt.close();
        conexion.close();

        boolean checkConexion = conexion.isClosed();
        log.log(Level.INFO, "Conexión cerrada...{0}", checkConexion);

    }
        
        
        
        public static void mostrarProductos(int id_producto, String nombre_producto, double precio_producto, int stockDisponible_producto, String descripcion_producto, Categoria cat) throws ClassNotFoundException, SQLException {
             
            Connection conexion = Conexion.conectar();
            String mostrarProductosql = "SELECT * FROM producto";
            
            Statement statmnt = conexion.createStatement();
            ResultSet rsProducto = statmnt.executeQuery(mostrarProductosql);
            

            List<Producto> mostrarProducto = new ArrayList<>();
            while (rsProducto.next()) {
                rsProducto.getString("nombre_producto");
                rsProducto.getDouble("precio_producto");
                rsProducto.getInt("precio_producto");
                rsProducto.getString("stockDisponible_producto");
                rsProducto.getString("descripcion_productos");
                rsProducto.getInt("uds_vendidas");
                rsProducto.getObject("id_categoria");
                
            }
            statmnt.close();
            conexion.close();
            
            
            
        }

}
