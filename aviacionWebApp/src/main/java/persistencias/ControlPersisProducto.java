/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencias;

import entidades.*;
import java.util.List;

/**
 *
 * @author Víctor
 */
public class ControlPersisProducto {
    
    
    ProductoJpaController ProJpa = new ProductoJpaController();
    
    public void crearProducto(Producto producto){
        ProJpa.create(producto);
    }
    
    //Operacion READ    
    public List<Producto> traerProducto(){
        return ProJpa.findProductoEntities();
        
                
    }
    
    
    
    
}
