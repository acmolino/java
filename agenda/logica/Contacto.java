package agenda.logica;

/**
 *
 * @author A Molino
 */

/*La clase contacto con sus atributos y métodos básicos*/
public class Contacto {
    /*Atributos*/
    private String nombre;
    private String apellido;
    private String telefono;

   /*Constructores*/
    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Contacto() {
    }

     /*Getters y Setters*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
    
}
