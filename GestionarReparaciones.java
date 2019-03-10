
 

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Se gestionan las reparaciones
 * se 
 * @author Carlos de la Calleja
 */
public class GestionarReparaciones {
    
    private ArrayList<Electrodomestico> listaElectrodomesticos;
	
    Listas accederListaElectrodomesticos = new Listas(); 
    
    private ArrayList<Cliente> listaClientes;
	
    Listas accederListaClientes = new Listas();
    
    private ArrayList<Compras> listaCompras;
    
    Listas accederListaCompras = new Listas();
    
    public GestionarReparaciones() {
        
         this.listaCompras = accederListaCompras.getListaCompras();  
         
    }
    
   
    
     public Compras buscarDevolucion() {
		
		
    //buscar cliente por dni
	Scanner sc = new Scanner(System.in);
	String dni;
	Compras devolvercompra = null;

	int i = 0;
	boolean encontrado = false;
		
	System.out.print("Introduzca DNI de la compra del cliente a buscar :");
	dni = sc.nextLine();
			
            while ( i< listaCompras.size() && !encontrado) {
				
		if(listaCompras.get(i).getDni().equalsIgnoreCase(dni)){

                    devolvercompra = listaCompras.get(i);
                    System.out.println("*** Compra encontrada ***");
                    encontrado = true;
		break;
		}
		i++;
				
            }
			
            if (!encontrado)  
		System.out.println("*** la compra no existia***");
            
            return devolvercompra;
			
			
	 }

     /**
      * se comparan las fechas de compra con la de hoy
      * si es superior a 2 años no es gratuita y se debe de abonar un plus
      * 
      * 
      * @param compra compra a analizar
      */
   public void analizarDevolucion(Compras compra){
       
        LocalDate fechadehoy = LocalDate.now();
        LocalDate fechadecompra;
            
                
         // comparar las fechas
         
            fechadecompra = compra.getFechaCompra();
            
            long diferenciaFechas = ChronoUnit.DAYS.between(fechadecompra,fechadehoy);
            
            
            if(diferenciaFechas < 730){
                
                System.out.println("*** La repacion es gratuita ****");
                //se anula la compra y se ponen los productos en el array de products
                
        
                
            }
            else {
                System.out.println("*** La repareacion tiene un coste ha pasado mas de 2 anos de la compra****");
                System.out.println("*** Debera abonar 50 euros mas un 20%****");
                
            }
            
       
    }

            
     
    
}

