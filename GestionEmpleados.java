
 

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta clase gestiona los empleados, altas, bajas y listados.
 * Tambien gestiona los derechos de acceso para los menus restringidos: ventas, develucion, financiacion y reparacion
 * @author Carlos de la Calleja
 */
public class GestionEmpleados {
    
      
    
        private ArrayList<Empleado> listaEmpleados;
	
        Listas accederListaEmpleados = new Listas();

    public GestionEmpleados() {
        
        this.listaEmpleados = accederListaEmpleados.getListaEmpleados();
    }

/**
 * Alta del empleado cajero
 */
    
 public void altaCajero() {
	
	Scanner sc = new Scanner(System.in);
		
	// declaracion de todos los atributos del Cajero
                
	String password;
	String dni;
	String nombre;
	String apellidos;
        String domicilio;
        String telefono;
	String email;
				
	//boolean financiacion;
		
	System.out.print("Nueva clave de acceso del Cajero: ");
	password = sc.nextLine();	
	System.out.print("DNI del Cajero: ");
	dni = sc.nextLine();		
	System.out.print("Nombre del Cajero: ");
	nombre = sc.nextLine();
	System.out.print("Apellidos del Cajero: ");
	apellidos = sc.nextLine();
        System.out.print("Domicilio del Cajero: ");
	domicilio = sc.nextLine();
        System.out.print("Teléfono del Cajero: ");
	telefono = sc.nextLine();
	System.out.print("email: ");
	email = sc.nextLine();
		
		
	Cajero Cajero = new Cajero (password,dni, nombre, apellidos, domicilio, telefono, email); // creamos el objeto Cajero
		
	
	// Verificamos que ya no este en la lista
		
	boolean encontrado = false;
            for (Empleado CajeroTemporal : listaEmpleados){
			
		if (CajeroTemporal.getDni().equalsIgnoreCase(Cajero.getDni()))
				encontrado = true;				
			
		}
            
            if (!encontrado){
		listaEmpleados.add(Cajero);
		System.out.println("*** Cajero agregado correctamente ***");}
			
	    else System.out.println("*** Cajero no añadido ya estaba dado de alta ***");
    }	
	   
  
 
/**
 * Alta del empleado financiero
 */
 public void altaFinanciero() {
	
	Scanner sc = new Scanner(System.in);
		
	// declaracion de todos los atributos del Financiero
                
	String password;
	String dni;
	String nombre;
	String apellidos;
        String domicilio;
        String telefono;
	String email;
				
	//boolean financiacion;
		
	System.out.print("Nueva clave de acceso del Financiero: ");
	password = sc.nextLine();	
	System.out.print("DNI del Financiero: ");
	dni = sc.nextLine();		
	System.out.print("Nombre del Financiero: ");
	nombre = sc.nextLine();
	System.out.print("Apellidos del Financiero: ");
	apellidos = sc.nextLine();
        System.out.print("Domicilio del Financiero: ");
	domicilio = sc.nextLine();
        System.out.print("Teléfono del Financiero: ");
	telefono = sc.nextLine();
	System.out.print("email: ");
	email = sc.nextLine();
		
		
	Financiero Financiero = new Financiero (password,dni, nombre, apellidos, domicilio, telefono, email); // creamos el objeto Financiero
		
	
	// Verificamos que ya no este en la lista
		
	boolean encontrado = false;
            for (Empleado FinancieroTemporal : listaEmpleados){
			
		if (FinancieroTemporal.getDni().equalsIgnoreCase(Financiero.getDni()))
				encontrado = true;				
			
		}
            
            if (!encontrado){
		listaEmpleados.add(Financiero);
		System.out.println("*** Financiero agregado correctamente ***");}
			
	    else System.out.println("*** Financiero no añadido ya estaba dado de alta ***");
    }	
	
 
/**
 * Alta del empleado postventa
 */
 public void altaPostventa() {
	
	Scanner sc = new Scanner(System.in);
		
	// declaracion de todos los atributos del Postventa
                
	String password;
	String dni;
	String nombre;
	String apellidos;
        String domicilio;
        String telefono;
	String email;
				
	//boolean financiacion;
		
	System.out.print("Nueva clave de acceso del Postventa: ");
	password = sc.nextLine();	
	System.out.print("DNI del Postventa: ");
	dni = sc.nextLine();		
	System.out.print("Nombre del Postventa: ");
	nombre = sc.nextLine();
	System.out.print("Apellidos del Postventa: ");
	apellidos = sc.nextLine();
        System.out.print("Domicilio del Postventa: ");
	domicilio = sc.nextLine();
        System.out.print("Teléfono del Postventa: ");
	telefono = sc.nextLine();
	System.out.print("email: ");
	email = sc.nextLine();
		
		
	Postventa Postventa = new Postventa (password, dni, nombre, apellidos, domicilio, telefono, email); // creamos el objeto Postventa
		
	
	// Verificamos que ya no este en la lista
		
	boolean encontrado = false;
            for (Empleado PostventaTemporal : listaEmpleados){
			
		if (PostventaTemporal.getDni().equalsIgnoreCase(Postventa.getDni()))
				encontrado = true;				
			
		}
            
            if (!encontrado){
		listaEmpleados.add(Postventa);
		System.out.println("*** Postventa agregado correctamente ***");}
			
	    else System.out.println("*** Postventa no añadido ya estaba dado de alta ***");
    }	
	
   
/**
 * Alta del empleado tecnico
 */ 
 
 public void altaTecnico() {
	
	Scanner sc = new Scanner(System.in);
		
	// declaracion de todos los atributos del Tecnico
                
	String password;
	String dni;
	String nombre;
	String apellidos;
    String domicilio;
    String telefono;
	String email;
				
	//boolean financiacion;
		
	System.out.print("Nueva clave de acceso del Tecnico: ");
	password = sc.nextLine();	
	System.out.print("DNI del Tecnico: ");
	dni = sc.nextLine();		
	System.out.print("Nombre del Tecnico: ");
	nombre = sc.nextLine();
	System.out.print("Apellidos del Tecnico: ");
	apellidos = sc.nextLine();
        System.out.print("Domicilio del Tecnico: ");
	domicilio = sc.nextLine();
        System.out.print("Teléfono del Tecnico: ");
	telefono = sc.nextLine();
	System.out.print("email: ");
	email = sc.nextLine();
		
		
	Tecnico Tecnico = new Tecnico (password, dni, nombre, apellidos, domicilio, telefono, email); // creamos el objeto Tecnico
		
	
	// Verificamos que ya no este en la lista
		
	boolean encontrado = false;
            for (Empleado TecnicoTemporal : listaEmpleados){
			
		if (TecnicoTemporal.getDni().equalsIgnoreCase(Tecnico.getDni()))
				encontrado = true;				
			
		}
            
            if (!encontrado){
		listaEmpleados.add(Tecnico);
		System.out.println("*** Tecnico agregado correctamente ***");}
			
	    else System.out.println("*** Tecnico no añadido ya estaba dado de alta ***");
    }	
	

/**
 * Baja de empleado por DNI
 */
 
public void eliminarEmpleado() {
	//bajas de empleados
	//eliminar empleados por dni
	Scanner sc = new Scanner(System.in);
	String dni;

	int i = 0;
	boolean encontrado = false;
		
	System.out.print("Introduzca el DNI del empleado a eliminar :");
	dni = sc.nextLine();

			
            while ( i< listaEmpleados.size() && !encontrado) {
				
		if(listaEmpleados.get(i).getDni().equalsIgnoreCase(dni)){

                    listaEmpleados.remove(i);
                    System.out.println("*** Empleado eliminado satisfactoriamente ***");
                    encontrado = true;
                    break;
		}
		i++;				
            }
			
            if (!encontrado)  
		System.out.println("*** El Empleado no existia ***");
		
    }


/**
 * Listadoo de empleados
 */
 public void listarEmpleado(){
		System.out.println("*******************************************");
		System.out.println("*********** LISTADO DE EMPLEADOS **********");
		System.out.println("*******************************************");
             for (Empleado empleadobuscado : listaEmpleados) {
                        if(empleadobuscado instanceof Cajero){
                            System.out.println("Empleado del grupo de cajeros");
                        }
                        if(empleadobuscado instanceof Financiero){
                            System.out.println("Empleado del grupo de financieros");
                        }
                        if(empleadobuscado instanceof Postventa){
                            System.out.println("Empleado del grupo de postventa");
                        }
                        if(empleadobuscado instanceof Tecnico){
                            System.out.println("Empleado del grupo de técnicos");
                        }                        
                       
			System.out.println(empleadobuscado);
			}             
                
    }

 

/**
 * Devuelve el acceso para empleado cajero
 * 
 * @return encontrado
 */
 public boolean buscarCajero() {
		
		
    //buscar cajero por dni
	Scanner sc = new Scanner(System.in);
	String claveAcceso;

	boolean encontrado = false;
		
	System.out.println("**Acceso restringido**");
	System.out.print("Introduzca su clave de acceso de cajero: ");
	claveAcceso = sc.nextLine();
        
        for (Empleado cajeroabuscar : listaEmpleados) {
                        if((cajeroabuscar instanceof Cajero) && (cajeroabuscar.getClaveAcceso().equalsIgnoreCase(claveAcceso)) ){
                            encontrado = true;
                            break;
                        }
             }  
			
        return encontrado;			
			
	 }

 /**
 * Devuelve el acceso para empleado financiero
 * 
 * @return encontrado
 */
    public boolean buscarFinanciero() {
		
		
    //buscar cajero por dni
	Scanner sc = new Scanner(System.in);
	String claveacceso;

	boolean encontrado = false;
		
	System.out.println("**Acceso restringido**");
	System.out.print("Introduzca su clave de acceso de financiero: ");
	claveacceso = sc.nextLine();
        
        for (Empleado financieroabuscar : listaEmpleados) {
                        if((financieroabuscar instanceof Financiero) && (financieroabuscar.getClaveAcceso().equalsIgnoreCase(claveacceso)) ){
                            encontrado = true;
                            break;
                        }
             }  
			
        return encontrado;			
			
	 }
    /**
 * Devuelve el acceso para empleado postventa
 * 
 * @return encontrado
 */
    
     public boolean buscarPostventa() {
		
		
    //buscar cajero por dni
	Scanner sc = new Scanner(System.in);
	String claveacceso;

	boolean encontrado = false;
		
	System.out.println("**Acceso restringido**");
	System.out.print("Introduzca su clave de acceso de tecnico postventa: ");
	claveacceso = sc.nextLine();
        
        for (Empleado postventaabuscar : listaEmpleados) {
                        if((postventaabuscar instanceof Postventa) && (postventaabuscar.getClaveAcceso().equalsIgnoreCase(claveacceso)) ){
                            encontrado = true;
                            break;
                        }
             }  
			
        return encontrado;			
			
	 }
     
     /**
 * Devuelve el acceso para empleado tecnico
 * 
 * @return encontrado
 */
     public boolean buscarTecnico() {
		
		
    //buscar cajero por dni
	Scanner sc = new Scanner(System.in);
	String claveacceso;

	boolean encontrado = false;
	
        System.out.println("**Acceso restringido**");
	System.out.print("Introduzca su clave de acceso de tecnico de reparaciones: ");
	claveacceso = sc.nextLine();
        
        for (Empleado tecnicoabuscar : listaEmpleados) {
                        if((tecnicoabuscar instanceof Tecnico) && (tecnicoabuscar.getClaveAcceso().equalsIgnoreCase(claveacceso)) ){
                            encontrado = true;
                            break;
                        }
             }  
			
        return encontrado;			
			
	 }
     
     
}

