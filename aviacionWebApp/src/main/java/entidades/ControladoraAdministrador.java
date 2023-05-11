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
public class ControladoraAdministrador {
    
     ControlPersisAdmin controlPersisAdmin = new ControlPersisAdmin();
     
    
    public void crearAdmin(Administrador admin){
        controlPersisAdmin.crearAdmin(admin);
        
        
    }
    
    
    public List<Administrador>traerAdmins(){
        return controlPersisAdmin.traerAdmins();
    }
}
