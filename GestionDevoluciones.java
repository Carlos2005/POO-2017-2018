
 

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta clase gestiona la devolución de electrodomesticos.
 * Compara la fecha de hoy con la fecha de la compra, si han pasado
 * más de 90 días desde la compra, la devolución es rechazada
 * 
 * @author Carlos de la Calleja
 */
public class GestionDevoluciones {
    
    
    private ArrayList<Electrodomestico> listaElectrodomesticos;	
    Listas accederListaElectrodomesticos = new Listas(); 
    
    private ArrayList<Cliente> listaClientes;	
    Listas accederListaClientes = new Listas();
    
    private ArrayList<Compras> listaCompras;    
    Listas accederListaCompras = new Listas();
    
    public GestionDevoluciones() {
        
         this.listaCompras = accederListaCompras.getListaCompras();  
         
    }
    
   /** Busca las devoluciones por DNI del cliente
    * 
    * @return devolverCompra
    */
    
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
		System.out.println("*** La compra no existe***");
            
            return devolvercompra;
			
			
	 }
     
    /**
     * Analiza la fecha de hoy con la fecha de compra
     * @param compra input compra
     */

   public void analizarDevolucion(Compras compra){
       
        LocalDate fechadehoy = LocalDate.now();
        LocalDate fechadecompra;
            
                
         // comparar las fechas
         
            fechadecompra = compra.getFechaCompra();
            
            long diferenciaFechas = ChronoUnit.DAYS.between(fechadecompra,fechadehoy);
            
            
            if(diferenciaFechas < 90){
                
                System.out.println("*** Compra devuelta ****");
                //se anula la compra y se ponen los productos en el array de products
                 compra.getListaCompras().forEach((electrodomesticoDevuelto) -> {
            listaElectrodomesticos.add(electrodomesticoDevuelto);
            
            if (electrodomesticoDevuelto instanceof Informatica){
                       Informatica.increaseStock();
                        }
                   else if (electrodomesticoDevuelto instanceof Hogar){
                       Hogar.increaseStock();
                        }
                   else if (electrodomesticoDevuelto instanceof Imagen){
                       Imagen.increaseStock();
                        }
                   else if (electrodomesticoDevuelto instanceof Sonido){
                       Sonido.increaseStock();
                        }
                   else if (electrodomesticoDevuelto instanceof Telefonia){
                       Telefonia.increaseStock();
                        }
             }); 
        
                 //eliminamos la compra de la lista de compras
                 eliminarCompra(compra.getDni());
                
            }
            else System.out.println("*** No se puede devolverse porque han pasado más de 3 meses desde la fecha de la commpra****");
            
       
    }
     
    public void eliminarCompra(String dni) {
	
	
	int i = 0;
	boolean encontrado = false;
		
			
            while ( i< listaCompras.size() && !encontrado) {
				
		if(listaCompras.get(i).getDni().equalsIgnoreCase(dni)){

                    listaCompras.remove(i);
                    System.out.println("*** Compra eliminada satisfactoriamente ***");
                    encontrado = true;
                    break;
		}
		i++;				
            }
            
     }
}