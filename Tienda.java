
 

/**
 * Clase lanzadora de la tienda de electrodomesticos
 *
 * @author Carlos de la Calleja
 * @version 1.0
 * @since 27-05-2018
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //cargar elementos de prueba
        
        InicializarListas loadlistas = new InicializarListas();
        
        //llama al menu
        
        Menu menu = new Menu();
        menu.gestionMenuPrincipal();
        
             
    }
  
 }
