/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencias;

import entidades.*;
import java.util.List;



public class ControlPersisAdmin {
     
    
    AdministradorJpaController AdminJpa = new AdministradorJpaController();
    
    
    //Operacion create el JpaController crea un nuevo usuario
    public void crearAdmin(Administrador admin){
        
        AdminJpa.create(admin);
        
        
    }
    
    //Operacion READ    
    public List<Administrador> traerAdmins(){
        //nos trae todos los usuarios de la base de datos
        return AdminJpa.findAdministradorEntities();
    }
}
