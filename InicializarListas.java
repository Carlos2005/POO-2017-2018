
 

import java.util.ArrayList;

/**Esta clase inicializa con valores de prueba todas las listas
 *
 * @author Carlos de la Calleja
 */
public class InicializarListas {
    
    
    private ArrayList<Electrodomestico> listaElectrodomesticos;	
    private ArrayList<Cliente> listaClientes;    
    private ArrayList<Empleado> listaEmpleados;
	
    Listas accederListaClientes = new Listas();    
    Listas accederListaElectrodomesticos = new Listas();       
    Listas accederListaEmpleados = new Listas(); 
    
    public InicializarListas(){
        
       this.listaElectrodomesticos = accederListaElectrodomesticos.getListaElectrodomesticos();
         
       listaElectrodomesticos.add(new Informatica ("Id001", "8M", "1T", "Core i5", "Acer", "X223",  "plateado",  740));
       listaElectrodomesticos.add(new Informatica ("Id002", "16M", "2T", "Core i7", "Asus", "T582",  "negro",  806));
       Informatica tablet = new Informatica ("Id003", "4M", "250GB", "A3", "Sansung", "B78",  "blanco",  399);
       listaElectrodomesticos.add(tablet);
       
       Telefonia iphone8 = new Telefonia("IOS 11", 5, "32GB", "4K", "id004", "Apple", "iphone8", "Silver", 700);
       listaElectrodomesticos.add(iphone8);
       
       Sonido cadenakawai = new Sonido("250", "10-50K", "ID020", "Kawai", "TX-10", "Plateado", 355); 
       listaElectrodomesticos.add(cadenakawai);
       
       Imagen televisorsony = new Imagen(42,"4K", 60, "ID033", "Sony", "Aquarius", "Blanco", 1100);
       listaElectrodomesticos.add(televisorsony);
               
       Hogar aspiradora1 = new Hogar(TipoHogar.ASPIRADORA, 1000, "id005", "Nilfix", "X33", "rojo", 450);
       listaElectrodomesticos.add(aspiradora1);
       
       Hogar aspiradora2 = new Hogar(TipoHogar.ASPIRADORA, 1500, "id006", "Sansung", "J3", "azul", 350);
       listaElectrodomesticos.add(aspiradora2);
       
       this.listaClientes = accederListaClientes.getListaClientes();
              // anadir clientes de prueba
       Cliente cliente1 = new Cliente ("451288", "Antonio", "Smith","Calle 250", "898 58d 158", "cliente1@tienda.com");
       Cliente cliente2 = new Cliente ("21523", "Michael", "Smith", "Calle 8", "333" ,"cliente2@tienda.com");
       Cliente cliente3 = new Cliente ("125435", "Roberto","Morgan Smith", "Calle 76" ,"895 584 548","cliente2@tienda.com");
       listaClientes.add(cliente1);
       listaClientes.add(cliente2);
       listaClientes.add(cliente3);
       
       this.listaEmpleados = accederListaEmpleados.getListaEmpleados();
       
       Cajero cajero1 = new Cajero( "cajero1","090765", "Jose", "Taylor","Calle 58", "898 586 158", "empleado1@tienda.com");
       listaEmpleados.add(cajero1);
       
       Cajero cajero2 = new Cajero( "cajero2", "57564", "Antonio", "Smith","Calle 256", "898 587 158", "empleado2@tienda.com");
       listaEmpleados.add(cajero1);
        
       Financiero financiero1 = new Financiero( "financiero1", "57545","James", "Perello","Calle 88", "898 589 158", "empleado3@tienda.com");
       listaEmpleados.add(financiero1);
        
       
       Postventa postventa1 = new Postventa( "postventa1", "35643", "Johan", "Lee","Calle 112", "898 580 158", "empleado4@tienda.com");
       listaEmpleados.add(postventa1);
       
       Tecnico tecnico1 = new Tecnico( "tecnico1", "586225", "Pedro", "Douglas Smith","Calle 59", "898 581 158", "empleado4@tienda.com");
       listaEmpleados.add(tecnico1);
    }

    
}

