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
public class ControladoraCategorias {
    
    ControlPersisCategoria controlPersisCategoria = new ControlPersisCategoria();
    
    public void crearCategoria(Categorias cat){
        controlPersisCategoria.crearCategoria(cat);
        
    }
    
    public List<Categorias> traerCategoria(){
    return controlPersisCategoria.traerCategoria();
}
    
    
    
    
}
