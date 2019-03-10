
 


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Getion de las operaciones relacionadas con los clientes, altas, bajas, consultas
 * @author Carlos de la Calleja
 */
public class GestionListaClientes {
    
    private ArrayList<Cliente> listaClientes;
	
    Listas accederListaClientes = new Listas();
    
    
/** el constructor crea la lista de clientes 
*/
	
    public GestionListaClientes() {
		
             
       this.listaClientes = accederListaClientes.getListaClientes();

    
          
    }
    
    // devolvemos el nombre del array por si hay que serializar
	

     public void crearClientes() {
	
	Scanner sc = new Scanner(System.in);
		
	// declaracion de todos los atributos del cliente
                
	String dni;
	String nombre;
	String apellidos;
        String domicilio;
        String telefono;
	String email;
				
	//boolean financiacion;
		
	System.out.print("DNI del cliente: ");
	dni = sc.nextLine();		
	System.out.print("Nombre del cliente: ");
	nombre = sc.nextLine();
	System.out.print("Apellidos del cliente: ");
	apellidos = sc.nextLine();
        System.out.print("Domicilio del cliente: ");
	domicilio = sc.nextLine();
        System.out.print("Teléfono del cliente: ");
	telefono = sc.nextLine();
	System.out.print("email: ");
	email = sc.nextLine();
		
		
	Cliente cliente = new Cliente (dni, nombre, apellidos, domicilio, telefono, email); // creamos el objeto cliente
		
	
	// Verificamos que ya no este en la lista
		
	boolean encontrado = false;
            for (Cliente clienteTemporal : listaClientes){
			
		if (clienteTemporal.getDni().equalsIgnoreCase(cliente.getDni()))
				encontrado = true;				
			
		}
            
            if (!encontrado){
		listaClientes.add(cliente);
		System.out.println("*** Cliente agregado correctamente ***");}
			
	    else System.out.println("*** Cliente no añadido ya estaba dado de alta ***");
    }	
	
    public void eliminarClientes() {
	//bajas de clientes
	//eliminar cliente por dni
	Scanner sc = new Scanner(System.in);
	String dni;

	int i = 0;
	boolean encontrado = false;
		
	System.out.print("Introduzca el DNI del cliente a eliminar :");
	dni = sc.nextLine();

			
            while ( i< listaClientes.size() && !encontrado) {
				
		if(listaClientes.get(i).getDni().equalsIgnoreCase(dni)){

                    listaClientes.remove(i);
                    System.out.println("*** Cliente eliminado satisfactoriamente ***");
                    encontrado = true;
                    break;
		}
		i++;				
            }
			
            if (!encontrado)  
		System.out.println("*** El cliente no existia ***");
		
    }
	 
	 
    public Cliente buscarClientes() {
		
		
    //buscar cliente por dni
	Scanner sc = new Scanner(System.in);
	String dni;
	Cliente devolvercliente = null;

	int i = 0;
	boolean encontrado = false;
		
	System.out.print("DNI del cliente a buscar ");
	dni = sc.nextLine();
			
            while ( i< listaClientes.size() && !encontrado) {
				
		if(listaClientes.get(i).getDni().equalsIgnoreCase(dni)){

                    devolvercliente = listaClientes.get(i);
                    System.out.println("*** Cliente encontrado ***");
                    encontrado = true;
		break;
		}
		i++;
				
            }
			
            if (!encontrado)  
		System.out.println("*** El cliente no existia ***");
            
            return devolvercliente;
			
			
	 }
    
     public void buscarClientesApellidos() {
		
		
    //buscar cliente por dni
	Scanner sc = new Scanner(System.in);
	String apellidos;
	

	int i = 0;
	boolean encontrado = false;
		
	System.out.print("Introduzca los apellidos del cliente a buscar :");
	apellidos = sc.nextLine();
			
            while ( i< listaClientes.size()) {
				
		if(listaClientes.get(i).getApellidos().equalsIgnoreCase(apellidos)){
                    System.out.println("Cliente encontrado :");
                    System.out.println(listaClientes.get(i));
                    encontrado = true;
		
		}
		i++;
				
            }
			
            if (!encontrado)  
		System.out.println("*** No se ha encontrado ningun cliente con estos apellidos ***");
                      			
	 }
	 
	 
	 //modificaciones de clientes
	 
    public void modificarClientes() {
	 
	Scanner sc = new Scanner(System.in);
                
	String dni;
	String nombre;
	String apellidos;
        String domicilio;
        String telefono;
	String email;
		
	int i = 0;
	boolean encontrado = false;
	System.out.print("DNI del cliente a modificar :");
	dni = sc.nextLine();
		
            while ( i< listaClientes.size() && !encontrado) {
		Cliente clientemodificar = listaClientes.get(i);
				
		if(clientemodificar.getDni().equalsIgnoreCase(dni)){

					//modificacion de los datos del cliente
										
                    System.out.print("DNI del cliente: ");
                    dni = sc.nextLine();		
                    System.out.print("Nombre del cliente: ");
                    nombre = sc.nextLine();
                    System.out.print("Apellidos del cliente: ");
                    apellidos = sc.nextLine();
                    System.out.print("Domicilio del cliente: ");
                    domicilio = sc.nextLine();
                    System.out.print("Telefono del cliente: ");
                    telefono = sc.nextLine();
                    System.out.print("email: ");
                    email = sc.nextLine();


                    clientemodificar.setDni(dni);
                    clientemodificar.setNombre(nombre);
                    clientemodificar.setApellidos(apellidos);
                    clientemodificar.setDomicilio(domicilio);
                    clientemodificar.setTelefono(telefono);
                    clientemodificar.setEmail(email);

                    System.out.println("*** Cliente actualizado correctamente ***");
                    encontrado = true;
                    break;			
												
                }
                i++;
				
            }
			
	if (!encontrado)  
		System.out.println("El cliente no exisitia y no ha podido modificarse");
    }	 
	 
    
   
    
    public void listadoClientes(){
		System.out.println("*******************************");
		System.out.println("*****LISTADO DE CLIENTES*******");
		System.out.println("*******************************");
		/** for (Cliente clientebuscado : listaClientes) {
			System.out.println(clientebuscado);
			}
                */
                //metodo java 8 method reference
		listaClientes.forEach(System.out::println);
    }
}
