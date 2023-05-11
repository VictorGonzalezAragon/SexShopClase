/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boProducto;

import daoProducto.*;
import entidades.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author Víctor
 */
public class BoProducto {
    
    public static void procesarPeticionInstertarProducto(HttpServletRequest request, HttpServletResponse response) throws SQLException, ClassNotFoundException, IOException{
   
        Producto prod = new Producto();
        
        Categoria cat1 = new Categoria(Integer.parseInt(request.getParameter("categoria_producto")));
        cat1.setearNombreCatPorId(cat1, cat1.getId_categoria());
        
        prod.setId_producto(Integer.parseInt(request.getParameter("id_producto")));
        prod.setNombre_producto(request.getParameter("nombre_producto"));
        prod.setPrecio_producto(Double.parseDouble(request.getParameter("precio_producto")));
        prod.setStockDisponible_producto(Integer.parseInt(request.getParameter("stockDisponible_producto")));
        prod.setDescripcion_productos(request.getParameter("descripcion_producto"));
        prod.setId_categoria(cat1);
        
        
        DaoProducto.insertarProducto(prod.getId_producto(), prod.getNombre_producto(),
                    prod.getPrecio_producto(), prod.getStockDisponible_producto(), prod.getDescripcion_productos(),
                     prod.getId_categoria());
        
        
    }
  
    public static void procesarPeticionBorrarProducto(HttpServletRequest request, HttpServletResponse response) throws SQLException, ClassNotFoundException, IOException{
    //orientacion a objetos 
    Producto product = new Producto();
    product.setId_producto(Integer.parseInt(request.getParameter("id_producto")));
    
    DaoProducto.borrarProducto(product.getId_producto());
   
    }
    
    
    
    
    
    public static void procesarPeticionListaUsuario(HttpServletRequest request, HttpServletResponse response) throws SQLException, ClassNotFoundException, IOException{
        
       
        Producto product = new Producto();
        Categoria cat1 = new Categoria(Integer.parseInt(request.getParameter("categoria_producto")));
        
        product.setId_producto(Integer.parseInt(request.getParameter("id_producto")));
        product.setNombre_producto("nombre_producto");
        product.setPrecio_producto(Double.parseDouble("precio_producto"));
        product.setStockDisponible_producto(Integer.parseInt("stockDisponible_producto"));
        product.setDescripcion_productos("descripcion_producto");
        product.setUds_vendidas(Integer.parseInt("uds_vendidas"));
        product.setId_categoria(cat1);

        
        DaoProducto.mostrarProductos(product.getId_producto(), product.getNombre_producto(), product.getPrecio_producto(),
                product.getStockDisponible_producto(), product.getDescripcion_productos(), product.getId_categoria());
        
    
       /* 
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
    */
    
}
}
