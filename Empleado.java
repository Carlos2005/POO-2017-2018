

/**
 * La clase Empleado es subclase de la Persona y superclase de todos los  tipos de empleados:
 * cajero, finanzas, postventa y tecnico
 * 
 * @author Carlos de la Calleja
 *
 */
public class Empleado extends Persona{
    
  
    private String claveAcceso;
    
/**
 * Constructor de la clase Empleado
 * @param claveAcceso  utilizada en los menus protegidos
 * @param dni  DNI del empleado
 * @param nombre Nombre
 * @param apellidos apellidos
 * @param domicilio domicilio
 * @param telefono telefono
 * @param email email
 */

    public Empleado(String claveAcceso, String dni, String nombre, String apellidos, String domicilio, String telefono, String email) {
        super(dni, nombre, apellidos, domicilio, telefono, email);
        this.claveAcceso = claveAcceso;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }
    
  @Override
  public String toString() {
    return   "DNI: " + dni + ", Nombre: " + nombre + ", Apellidos: " + apellidos +
            ", Dirección: " + domicilio + ", Teléfono" + telefono+ ", email: " + email;

  }
    
}

