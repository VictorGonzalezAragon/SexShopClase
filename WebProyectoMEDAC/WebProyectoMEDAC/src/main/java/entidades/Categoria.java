/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Víctor
 */
public class Categoria {
    
    private int id_categoria;
    private String nombre_categoria;

    public Categoria() {
    }
    
    public Categoria(int id_categoria){
        this.id_categoria = id_categoria;
    }

    public Categoria(int id_categoria, String nombre_categoria) {
        this.id_categoria = id_categoria;
        this.nombre_categoria = nombre_categoria;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }
    
    public void setearNombreCatPorId(Categoria c, int i){
        
        switch (i) {
            case 1:
                c.setNombre_categoria("juguetes");
                break;
                
            case 2:
                c.setNombre_categoria("aceites");
            break;
            
            default:
                throw new AssertionError();
        }
    }     
    
    
    
}
