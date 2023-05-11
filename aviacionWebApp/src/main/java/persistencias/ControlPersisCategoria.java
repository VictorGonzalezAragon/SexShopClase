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
public class ControlPersisCategoria {
    
    CategoriasJpaController CateJpa = new CategoriasJpaController();
    
    //Operacion create del JPAController, este crea una nueva categoria
    
    public void crearCategoria(Categorias cat){
        CateJpa.create(cat);
    }
    
    //Operacion READ    
    public List<Categorias> traerCategoria(){
        return CateJpa.findCategoriasEntities();
        
                
    }
    
    
    
    
    
}
