
package entidades;


public class Administrador {
    
   private int id_administrador;
   private String nombre_administrador;
   private String apellido1_administrador;
   private String apellido2_administrador;
   private String email_administrador;
   private String contraseña_administrador;

    public Administrador() {
    }

    public Administrador(int id_administrador, String nombre_administrador, String apellido1_administrador, String apellido2_administrador, String email_administrador, String contraseña_administrador) {
        this.id_administrador = id_administrador;
        this.nombre_administrador = nombre_administrador;
        this.apellido1_administrador = apellido1_administrador;
        this.apellido2_administrador = apellido2_administrador;
        this.email_administrador = email_administrador;
        this.contraseña_administrador = contraseña_administrador;
    }

    public int getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(int id_administrador) {
        this.id_administrador = id_administrador;
    }

    public String getNombre_administrador() {
        return nombre_administrador;
    }

    public void setNombre_administrador(String nombre_administrador) {
        this.nombre_administrador = nombre_administrador;
    }

    public String getApellido1_administrador() {
        return apellido1_administrador;
    }

    public void setApellido1_administrador(String apellido1_administrador) {
        this.apellido1_administrador = apellido1_administrador;
    }

    public String getApellido2_administrador() {
        return apellido2_administrador;
    }

    public void setApellido2_administrador(String apellido2_administrador) {
        this.apellido2_administrador = apellido2_administrador;
    }

    public String getEmail_administrador() {
        return email_administrador;
    }

    public void setEmail_administrador(String email_administrador) {
        this.email_administrador = email_administrador;
    }

    public String getContraseña_administrador() {
        return contraseña_administrador;
    }

    public void setContraseña_administrador(String contraseña_administrador) {
        this.contraseña_administrador = contraseña_administrador;
    }

   
    
    
    
    
    
    
}
