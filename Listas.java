

import java.util.ArrayList;

/**
 * Esta clase implementa las 4 listas estáticas que usan el resto de la clases y metodos de la applicacion
 * lista de: clientes, electrodomesticos, compras y empleados
 * 
 * @author Carlos de la Calleja
 */
public class Listas {
    
    
    private static ArrayList<Cliente> listaClientes = new ArrayList();
    
    private static ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList();
    
    private static ArrayList<Compras> listaCompras = new ArrayList();
    
    private static ArrayList<Empleado> listaEmpleados = new ArrayList();

    
    public Listas() {
     
       
    }
    
    public static void addItemListaCompras(Compras compra){
        
        listaCompras.add(compra);
        
    }
    public static void printListaCompras(){
        
        
        listaCompras.forEach(System.out::println);
    }
    
   public ArrayList<Compras> getListaCompras(){
        
        return listaCompras;
    }
    public ArrayList<Cliente> getListaClientes(){
        
        return listaClientes;
    }
    
    public ArrayList<Empleado> getListaEmpleados(){
        
        return listaEmpleados;
    }
    
     public ArrayList<Electrodomestico> getListaElectrodomesticos(){
        
        return listaElectrodomesticos;
    }
    public void imprimeListadoClientes(){
        
        System.out.println("****************************");
		System.out.println("*****listado clientes*******");
		System.out.println("****************************");		
                //metodo java 8 method reference
		listaClientes.forEach(System.out::println);
    }
    
    
}

