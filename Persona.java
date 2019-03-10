

/**
 * Clase persona superclase para los clientes y empleados
 * 
 * @author Carlos de la Calleja
 */
public class Persona {
    
    protected String dni;
    protected String nombre;
    protected String apellidos;
    protected String domicilio;
    protected String telefono;
    protected String email;     

    /**
     * 
     * @param dni DNI
     * @param nombre Nombre
     * @param apellidos Apellidos
     * @param domicilio Domicilio
     * @param telefono Telefono
     * @param email email
     */

    public Persona(String dni, String nombre, String apellidos, String domicilio, String telefono, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.email = email;

    }

    public String getDni() {
        return dni;
    }
    
}

