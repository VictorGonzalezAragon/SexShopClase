/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencias;
import entidades.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencias.exceptions.NonexistentEntityException;

/**
 *
 * @author Víctor
 */
public class ControladoraPersisUsuario {
    
    UsuariosJpaController usuJpa = new UsuariosJpaController();
    
    
    //Operacion create el JpaController crea un nuevo usuario
    public void crearUsuario(Usuario usu){
        
        usuJpa.create(usu);
        
        
    }
    
    //Operacion READ    
    public List<Usuario> traerUsuarios(){
        //nos trae todos los usuarios de la base de datos
        return usuJpa.findUsuariosEntities();
    }

    public void borrarUsuario(int id_eliminar) {
        try {
            usuJpa.destroy(id_eliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersisUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Usuario traerUsuario(int id_editar) {
        return usuJpa.findUsuarios(id_editar);
    }
    
    
}
