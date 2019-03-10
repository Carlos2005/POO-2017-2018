
 

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta clase gestiona todas las operaciones relacionadas con las compras,
 * empieza añadiendo al carrito de compra, el cliente que efectúa las compras y
 * buscando los productos.
 * Si la venta es al contado, los productos pasan a la compra y desaparecen del inventario.
 * Si la venta tiene que ser financiado la compra se queda en suspenso hasta la validación
 * del financiero.
 * 
 * @author Carlos de la Calleja
 */
public class GestionCompras {

    private ArrayList<Electrodomestico> listaElectrodomesticos;
	
    Listas accederListaElectrodomesticos = new Listas(); 
    
    private ArrayList<Cliente> listaClientes;
	
    Listas accederListaClientes = new Listas();
    
    
    private ArrayList<Compras> listaCompras;
    
    Listas accederListaCompras = new Listas();
    
  //  private static ArrayList<Compras> listaCompras = new ArrayList();
    
    
    public GestionCompras() {
        
    this.listaElectrodomesticos = accederListaElectrodomesticos.getListaElectrodomesticos();
        
    this.listaClientes = accederListaClientes.getListaClientes();   
    
    this.listaCompras = accederListaCompras.getListaCompras();     
          
                
    }
    
     public Cliente buscarClientes() {
		
		
    //buscar cliente por dni
	Scanner sc = new Scanner(System.in);
	String dni;
	Cliente devolvercliente = null;

	int i = 0;
	boolean encontrado = false;
		
	System.out.print("Introduzca el DNI del cliente que efectuará la compra: ");
	dni = sc.nextLine();
			
            while ( i< listaClientes.size() && !encontrado) {
				
		if(listaClientes.get(i).getDni().equalsIgnoreCase(dni)){

                    devolvercliente = listaClientes.get(i);
                    System.out.println("*** El cliente ya está dado de alta ***");
                    encontrado = true;
		break;
		}
		i++;
				
            }
			
            if (!encontrado)  
		System.out.println("*** El cliente no existia ***");
            
            return devolvercliente;
			
			
	 }
	 
	 
    public Cliente altacliente() {
	
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
        System.out.print("Telefono del cliente: ");
	telefono = sc.nextLine();
	System.out.print("email: ");
	email = sc.nextLine();
		
	//System.out.print("financiacion del cliente: ");
	//financiacion = sc.nextBoolean();
		
	Cliente cliente = new Cliente (dni, nombre, apellidos, domicilio, telefono, email); // creamos el objeto cliente
		
	
	//verificamos que ya no este en la lista
		
	boolean encontrado = false;
            for (Cliente clienteTemporal : listaClientes){
			
		if (clienteTemporal.getDni().equalsIgnoreCase(cliente.getDni()))
				encontrado = true;				
			
		}
            
            if (!encontrado){
		listaClientes.add(cliente);
		System.out.println("Cliente agregado correctamente");}
			
	    else System.out.println("Cliente no se ha añadido, ya estaba dado de alta");
            
            return cliente;
    }	
	
       
     public Electrodomestico buscarElectrodomestico() {
		
		
    //buscar electrodomestico por referncia
	Scanner sc = new Scanner(System.in);
	String referencia;
	Electrodomestico devolverelectrodomestico = null;

	int i = 0;
	boolean encontrado = false;
		
	System.out.print("Introduzca la referencia del producto a comprar: ");
	referencia = sc.nextLine();
			
            while ( i< listaElectrodomesticos.size() && !encontrado) {
				
		if(listaElectrodomesticos.get(i).getReferencia().equalsIgnoreCase(referencia)){

                    devolverelectrodomestico = listaElectrodomesticos.get(i);
                    System.out.println("*** producto encontrado y añadido al carrito***");
                    encontrado = true;
                    
                                   
                    // hay que borrarlo del inventario
                    listaElectrodomesticos.remove(i);
                    
                   //actualizarmos stock
                   if (devolverelectrodomestico instanceof Informatica){
                       Informatica.decreaseStock();
                        }
                   else if (devolverelectrodomestico instanceof Hogar){
                       Hogar.decreaseStock();
                        }
                   else if (devolverelectrodomestico instanceof Imagen){
                       Imagen.decreaseStock();
                        }
                   else if (devolverelectrodomestico instanceof Sonido){
                       Sonido.decreaseStock();
                        }
                   else if (devolverelectrodomestico instanceof Telefonia){
                       Telefonia.decreaseStock();
                        }
                    
		break;
		}
		i++;
				
            }
			
            if (!encontrado)  
		System.out.println("*** El producto no encontrado no ha podido añadirse al carrito ***");
            
            return devolverelectrodomestico;
			
			
	 }
    
/**
 * 
 * El método altaCompras es el encargado de gestionar las compras
 */
     
     public void altaCompras(){
         
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
         boolean comprarMas = false;
         String respuesta;
         int solicitaFinanciacion=0;
         
         LocalDate fecha= LocalDate.now();
         Cliente cliente;
         Electrodomestico electrodomestico;
         int precioTotal=0;
         boolean financiacion = false;
         Scanner teclado = new Scanner(System.in);
         
         if ((cliente=buscarClientes())== null){
                        
                       cliente = altacliente();                        
                    }
        
        
        //creamos carrito de compra
        //solicitamos la fecha

        
        System.out.println("Introduzca la fecha de la compra formato: dd/mm/aaaa");
        respuesta = teclado.nextLine();
        
        try{
        fecha = LocalDate.parse(respuesta, formatter);
         System.out.printf("");
         System.out.printf("La fecha introducida es: %s%n", fecha);
        }
        catch(DateTimeParseException exc){
            
            System.out.println("** Formato de fecha incorrecto ***");
            System.out.printf("%s is not parsable!%n", fecha);
        }        
        
        Compras compra = new Compras (cliente.getDni(), fecha, financiacion, precioTotal); 
        
        do {
            electrodomestico = buscarElectrodomestico();
            System.out.println("El electrodoméstico a comprar es: " + electrodomestico);
            if (electrodomestico != null){
                
               
                //anadimos la compra al carrito
                compra.setAddElectrodomestico(electrodomestico);
                precioTotal = precioTotal + electrodomestico.getPrecio();
                System.out.println("** Compra añadida **");
            }
            
            System.out.println("¿Desea comprar más productos? S/N");
            respuesta = teclado.nextLine().trim().toLowerCase();
            
                     
        } while (respuesta.equals("s"));
                    
    
        //carrito validado
        //añadimos la lista al carrito de compras

        
        System.out.println("El precio total son: " + precioTotal + " euros");
        compra.setPrecioTotal(precioTotal);
        //System.out.println(listaCompras);
        //Listas.printListaCompras();
        
  
             System.out.println("¿Pagará al contado o solicitará financiación?  ");
             System.out.println("1- Contado");
             System.out.println("2- Financiación");
             System.out.println("");
        
             solicitaFinanciacion = teclado.nextInt();
        
  
        if(solicitaFinanciacion == 1){
            System.out.println("*** La compra se ha realizado satifactoriamente ***");
            compra.setFinanciacion(false);
            Listas.addItemListaCompras(compra);
            Listas.printListaCompras();
                         
        }
        else {
            compra.setFinanciacion(true);
            System.out.println("*** Por favor, vaya al menu de financiación para su aprobación ***");
            Listas.addItemListaCompras(compra);
        }
    
          } 
     
            
	public void imprimirCompras(){
            
             Listas.printListaCompras();
        }	
        
    /** Buscamos la compras en la lista de compras
     * 
     */      
    public void buscarCompras(){  
        	
    //buscar compras por dni
	Scanner sc = new Scanner(System.in);
	String dni;
	
	int i = 0;
	boolean encontrado = false;
		
	System.out.print("DNI de la ficha de compra a buscar: ");
	dni = sc.nextLine();
			
            while ( i< listaCompras.size() && !encontrado) {
				
		if(listaCompras.get(i).getDni().equalsIgnoreCase(dni)){

                    System.out.println("*** Compra encontrada ***");
                    System.out.println(listaClientes.get(i));
                     System.out.println("");
        
                    encontrado = true;
		break;
		}
		i++;
				
            }
			
            if (!encontrado)  
		System.out.println("*** La compra no existía ***");
            
            			
	 }
    
      
}
