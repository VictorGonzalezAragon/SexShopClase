/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.List;
import persistencias.*;

/**
 *
 * @author Víctor
 */
public class ControladoraProducto {
    ControlPersisProducto controlPersisProducto = new ControlPersisProducto();
    
    public void crearProducto(Producto producto){
        controlPersisProducto.crearProducto(producto);
        
        
    }
    
    
    public List<Producto>traerProducto(){
        return controlPersisProducto.traerProducto();
    }

}
