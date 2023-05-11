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
public class ControladoraUsuario {
    
    ControladoraPersisUsuario controlPersisUsu = new ControladoraPersisUsuario();
    
    public void crearUsuario(Usuario usu){
        controlPersisUsu.crearUsuario(usu);
        
        
    }
    
    
    public List<Usuario>traerUsuarios(){
        return controlPersisUsu.traerUsuarios();
    }
    
    
    
    public void borrarUsuario(int id_eliminar){
        controlPersisUsu.borrarUsuario(id_eliminar);
        


    }

    public Usuario traerUsuario(int id_editar) {
        return controlPersisUsu.traerUsuario(id_editar);
    }
    
    
}
