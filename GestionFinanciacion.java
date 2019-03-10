
 

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Gestiona la financiacion, calcula si se aprueba o denega el crédito
 * @author Carlos de la Calleja
 */
public class GestionFinanciacion {
        private ArrayList<Electrodomestico> listaElectrodomesticos;
	
    Listas accederListaElectrodomesticos = new Listas(); 
    
    private ArrayList<Cliente> listaClientes;
	
    Listas accederListaClientes = new Listas();
    
    
    private ArrayList<Compras> listaCompras;
    
    Listas accederListaCompras = new Listas();

    public GestionFinanciacion() {
        
    this.listaElectrodomesticos = accederListaElectrodomesticos.getListaElectrodomesticos();
        
    this.listaClientes = accederListaClientes.getListaClientes();   
    
    this.listaCompras = accederListaCompras.getListaCompras();  
        
    }
    
    
   /**
    * Se calcula si 
    * si el credito se aprueba la compra se añade a la listade compras
    * y los productos se eliminan del la lista de electrodomésticos
    * 
    * @param compra se introduce la compra
    */ 
  
    
    public void analizarCompra(Compras compra){
       
     int nomina; 
     int meses;
     int cuotamensual;
     Scanner teclado = new Scanner(System.in);
     
    
        System.out.println("El precio total a financiar es: " + compra.getPrecioTotal()) ;
        System.out.println("------------------------------" ) ;
        
        System.out.println("Introduza la última nomina del cliente: " ) ;
        nomina = teclado.nextInt();
        
        System.out.println("Introduza el numero de meses a financiar: " ) ;
        meses = teclado.nextInt();
        
        cuotamensual = compra.getPrecioTotal()/meses;
        if((0.15*nomina) >= cuotamensual ){
            
            System.out.println("*** crédito aprobado ***");
        }
        else {System.out.println("*** credito denegado, se ha anulado la compra ***");
             
        
        //devolucion de productos
        //compra.getListaCompras();
        //compra.getDni();
        
        //volvemos a anadir los electrodomesticos
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
    
     }
    
     public Compras buscarFinanciacion() {
		
		
    //buscar cliente por dni
	Scanner sc = new Scanner(System.in);
	String dni;
	Compras devolvercompra = null;

	int i = 0;
	boolean encontrado = false;
		
	System.out.print("Introduzca el DNI del cliente que ha efectuado la compra: ");
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
    


