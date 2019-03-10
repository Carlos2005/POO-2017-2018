
import java.util.ArrayList;

/**
 * La clase Cliente implementa los datos de los clientes
 *
 * @author Carlos de la Calleja
 * @version 1.00, 27 May 2018
 */


public class Cliente extends Persona{
    //private ArrayList<Compras> listaCompras;
    public Cliente(String dni, String nombre, String apellidos, String domicilio, String telefono, String email) {
        super(dni, nombre, apellidos, domicilio, telefono, email);
        //this.listaCompras = new ArrayList<>();
    }
    
  
  @Override
  public String toString() {
    return   "DNI: " + dni + ", Nombre: " + nombre + ", Apellidos: " + apellidos +
            ", Dirección: " + domicilio + ", Teléfono: " + telefono + ", email: " + email;

  }

 

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

 

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }


  
}
