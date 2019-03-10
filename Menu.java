
 

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase que implementa todos los menus del programa:
 * Gestionar Clientes
 * Gestionar Empleados
 * Gestionar Electrodomesticos
 * Gestionar Compras--acceso restringido
 * Gestionar Financiacion---acceso restringido
 * Gestionar Devoluciones---acceso restringido
 * Gestionar Reparaciones---acceso restringido
 * 
 * @author Carlos de la Calleja
 */
public class Menu {
    
    
    private int opcionPrincipal;
    private int opcionClientes;
    private int opcionElectrodomesticos;
    private int opcionCompras;   
    private int opcionFinanciacion;
    private int opcionEmpleados;
    private int opcionBusquedaElectrodomesticos;
    private int opcionDevolucion;
    private int opcionReparacion;
    private int opcionListadoElectrodomesticos;
     
    GestionListaClientes gestionarclientes = new GestionListaClientes();
    GestionElectrodomesticos gestionarelectrodomesticos = new GestionElectrodomesticos();
    GestionCompras gestionarcompras = new GestionCompras();
    GestionDevoluciones gestionardevoluciones = new GestionDevoluciones();
    
    GestionFinanciacion gestionarfinanciacion = new GestionFinanciacion();
    GestionarReparaciones gestionarreparacion = new GestionarReparaciones();
  
    GestionEmpleados gestionempleados = new GestionEmpleados();


    public void gestionMenuPrincipal() {
     
        do {
            menuPrincipal();
            switch (opcionPrincipal) {
                case 1:
                    gestionClientes();                  
                    break;
                case 2:
                   gestionEmpleados();
                    break;
                 case 3:
                    gestionElectrodomesticos();
                    break; 
                 case 4:
                     if (gestionempleados.buscarCajero() == true){
                         gestionCompras(); 
                            }    
                     else accesoDenegado();
                    break;
                  case 5:
                     if (gestionempleados.buscarFinanciero() == true){
                         gestionFinanciacion(); 
                            }  
                     else accesoDenegado();
                    break;   
                    
                 case 6:
                     if (gestionempleados.buscarPostventa() == true){
                         gestionDevolucion(); 
                            }  
                     else accesoDenegado();                  
                    break;
                    
                 case 7:
                     if (gestionempleados.buscarTecnico()== true){
                         gestionReparacion(); 
                            }  
                     else accesoDenegado();                  
                    break;                   
                                   
                case 8:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Por favor, introduzca una opcion valida. ");
                    break;
            }
        } while (opcionPrincipal != 8);
        
	
    }

    public void menuPrincipal() {
        
        System.out.println("");
        System.out.println("*******************************");
        System.out.println("* M E N U   P R I N C I P A L *");
        System.out.println("*******************************");
        System.out.println("");
        System.out.println("1 - Gestionar Clientes");
        System.out.println("2 - Gestionar Empleados");
        System.out.println("3 - Gestionar Electrodomesticos");
        System.out.println("4 - Gestionar Compras");
        System.out.println("5 - Gestionar Financiacion");
        System.out.println("6 - Gestionar Devoluciones");
        System.out.println("7 - Gestionar Reparaciones");
        System.out.println("8 - Salir del programa");
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        
       
        System.out.print("Por favor, introduzca el número de la opción deseada: ");
        boolean flag = false;
        do
        {
            try
                {
                    opcionPrincipal = teclado.nextInt();
                    flag=true;
                }
                catch (InputMismatchException exception)
                {
                    System.out.println("Por favor, introduzca sólo valores numéricos");
                    teclado.next();
                }
        }       
        while ( !flag );
        
        
        
       // opcionPrincipal = teclado.nextInt();
        //System.out.print(opcionPrincipal);
        //System.out.println("");
    }
    
     public void gestionClientes() {
        do {
            menuClientes();
            switch (opcionClientes) {
                case 1:
                    gestionarclientes.crearClientes();                    
                    break;
                case 2:
                    gestionarclientes.eliminarClientes();
                    break;
                 case 3:
                    gestionarclientes.listadoClientes();
                    break; 
                 case 4:
                    System.out.println(" el cliente es: " + gestionarclientes.buscarClientes());
                    break;
                
                case 5:
                    gestionarclientes.buscarClientesApellidos();
                    break; 
                    
                case 6:
                    gestionarclientes.modificarClientes();
                    break;   
                case 7:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Por favor, introduzca una opción válida.");
                    break;
            }
        } while (opcionClientes != 7);
    }
      public void menuClientes() {
        // Muestro el menu de opciones y recojo la escogida
            
       
        System.out.println("=================");
        System.out.println("M E N U  CLIENTES");
        System.out.println("=================");
        System.out.println("");
        System.out.println("1 - Alta cliente");
        System.out.println("2 - Baja clientes");
        System.out.println("3 - Listado clientes");
        System.out.println("4 - Buscar cliente por DNI");
        System.out.println("5 - Buscar cliente por apellidos");
        System.out.println("6 - Modificar datos cliente");
        System.out.println("7 - Volver al menu principal");
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        
        // falta poner el try and catch  minuto 1h03 minuto del video 1
        System.out.print("Por favor, introduzca el número de la opción deseada: ");
        boolean flag = false;
        do
        {
            try
                {
                    opcionClientes = teclado.nextInt();
                    flag=true;
                }
                catch (InputMismatchException exception)
                {
                    System.out.println("Por favor, introduzca sólo valores numéricos");
                    teclado.next();
                }
        }       
        while ( !flag );
        
      
       
      }
      
      
      
      
      public void gestionEmpleados() {
        do {
            menuEmpleados();
            switch (opcionEmpleados) {
                case 1:
                    gestionempleados.altaCajero();
                    break;
                case 2:
                    gestionempleados.altaFinanciero();
                    break;
                 case 3:
                    gestionempleados.altaPostventa();
                    break; 
                 case 4:
                    gestionempleados.altaTecnico();
                    break;                
                case 5:
                    gestionempleados.eliminarEmpleado();
                    break;                     
                case 6:
                    gestionempleados.listarEmpleado();
                    break;   
                case 7:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Por favor, introduzca una opción válida.");
                    break;
            }
        } while (opcionEmpleados != 7);
    }
      public void menuEmpleados() {
        // Muestro el menu de opciones y recojo la escogida
            
       
        System.out.println("===================");
        System.out.println("M E N U  EMPLEADOS");
        System.out.println("===================");
        System.out.println("");
        System.out.println("1 - Alta Cajero");
        System.out.println("2 - Alta Financiero");
        System.out.println("3 - Alta Postventa");
        System.out.println("4 - Alta Tecnico");
        System.out.println("5 - Baja empleado");
        System.out.println("6 - Listado empleados");
        System.out.println("7 - Volver al menu principal");
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        
        // falta poner el try and catch  minuto 1h03 minuto del video 1
        System.out.print("Por favor, introduzca el número de la opción deseada: ");
        boolean flag = false;
        do
        {
            try
                {
                    opcionEmpleados = teclado.nextInt();
                    flag=true;
                }
                catch (InputMismatchException exception)
                {
                    System.out.println("Por favor, introduzca sólo valores numéricos");
                    teclado.next();
                }
        }       
        while ( !flag );
        
      
       
      }
      
      
           
      
       public void gestionElectrodomesticos() {
        do {
            menuElectrodomesticos();
            switch (opcionElectrodomesticos) {
                case 1:
                    gestionarelectrodomesticos.crearInformatica();
                    
                    break;
                case 2:
                    gestionarelectrodomesticos.crearSonido();
                    break;
                    
                case 3:
                    gestionarelectrodomesticos.crearImagen();
                    break;
                    
                case 4:
                    gestionarelectrodomesticos.crearTelefonia();
                    break;
                    
                case 5:
                    gestionarelectrodomesticos.crearHogar();
                    break;                    
            
                 case 6:                    
                    gestionListadoElectrodomesticos();
                    break; 
                 case 7:
                    gestionarelectrodomesticos.inventarioElectrodomesticos();
                    break;
                    
                case 8:
                    gestionBusquedaElectrodomesticos();
                    break;
                case 9:
                    gestionarelectrodomesticos.eliminarElectrodomestico();
                    break;
             
                case 10:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Por favor, introduzca una opcion valida.");
                    break;
            }
        } while (opcionElectrodomesticos != 10);
    }
      public void menuElectrodomesticos() {
        // Muestro el menu de opciones y recojo la escogida
            
        System.out.println("=======================");
        System.out.println("MENU ELECTRODOMESTICOS");
        System.out.println("=======================");
        System.out.println("");
        System.out.println(" 1 - Alta informatica");
        System.out.println(" 2 - Alta sonido");
        System.out.println(" 3 - Alta imagen");
        System.out.println(" 4 - Alta telefonia");
        System.out.println(" 5 - Alta hogar");
        System.out.println(" 6 - Listado");
        System.out.println(" 7 - Inventario");
        System.out.println(" 8 - Buscar");
        System.out.println(" 9 - Bajas");
        System.out.println("10 - Volver al menu principal");
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        
       
         System.out.print("Por favor, introduzca el número de la opción deseada: ");
         boolean flag = false;
        do
        {
            try
                {
                    opcionElectrodomesticos = teclado.nextInt();
                    flag=true;
                }
                catch (InputMismatchException exception)
                {
                    System.out.println("Por favor, introduzca sólo valores numéricos");
                    teclado.next();
                }
        }       
        while ( !flag );
        
      
      }
      
      
      public void gestionListadoElectrodomesticos() {
        do {
            menuListadoElectrodomesticos();
            switch (opcionListadoElectrodomesticos) {
                case 1:
                    gestionarelectrodomesticos.listadoElectrodomesticos();
                    
                    break;
                case 2:
                    gestionarelectrodomesticos.listadoElectrodomesticosInformatica();
                    break;
                    
                case 3:
                    gestionarelectrodomesticos.listadoElectrodomesticosSonido();
                    break;
                    
                case 4:
                    gestionarelectrodomesticos.listadoElectrodomesticosImagen();
                    break;
                    
                case 5:
                    gestionarelectrodomesticos.listadoElectrodomesticosTelefonia();
                    break;                    
            
                 case 6:                    
                    gestionarelectrodomesticos.listadoElectrodomesticosHogar();
                    break; 
                         
                case 7:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Por favor, introduzca una opcion valida.");
                    break;
            }
        } while (opcionListadoElectrodomesticos != 7);
    }
      
      
      public void menuListadoElectrodomesticos() {
        // Muestro el menu de opciones y recojo la escogida
            
        System.out.println("==============================");
        System.out.println("MENU LISTADO ELECTRODOMESTICOS");
        System.out.println("==============================");
        System.out.println("");
        System.out.println(" 1 - Listado de todos los artículos");
        System.out.println(" 2 - Listado artículos informática");
        System.out.println(" 3 - Listado artículos sonido");
        System.out.println(" 4 - Listado artículos imagen");
        System.out.println(" 5 - Listado artículos telefonía");
        System.out.println(" 6 - Listado artículos hogar");
        System.out.println(" 7 - Volver al menú anterior");
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        
       
         System.out.print("Por favor, introduzca el número de la opción deseada: ");
         boolean flag=false;
         do
        {
            try
                {
                    opcionListadoElectrodomesticos = teclado.nextInt();
                    flag=true;
                }
                catch (InputMismatchException exception)
                {
                    System.out.println("Por favor, introduzca sólo valores numéricos");
                    teclado.next();
                }
        }       
        while ( !flag );
        
      
      }
            
       public void gestionBusquedaElectrodomesticos() {
        do {
            menuBusquedaElectrodomesticos();
            switch (opcionBusquedaElectrodomesticos) {
                case 1:
                    gestionarelectrodomesticos.buscarElectrodomestico();
                    
                    break;
                case 2:
                    gestionarelectrodomesticos.buscarElectrodomesticoMarca();
                    break;
                    
                case 3:
                    gestionarelectrodomesticos.buscarElectrodomesticoModelo();
                    break;
                    
                case 4:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Por favor, introduzca una opcion valida.");
                    break;
            }
        } while (opcionBusquedaElectrodomesticos != 4);
    }
      
      
      public void menuBusquedaElectrodomesticos() {
        // Muestro el menu de opciones y recojo la escogida
            
        System.out.println("===============================");
        System.out.println("MENU BUSQUEDA ELECTRODOMESTICOS");
        System.out.println("===============================");
        System.out.println("");
        System.out.println(" 1 - Búsqueda por referencia");
        System.out.println(" 2 - Búsqueda por marca");
        System.out.println(" 3 - Búsqueda por modelo");
        System.out.println(" 4 - Menú principal");
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        
        
         System.out.print("Por favor, introduzca el número de la opción deseada: ");
         boolean flag=false;
         do
        {
            try
                {
                    opcionBusquedaElectrodomesticos = teclado.nextInt();
                    flag=true;
                }
                catch (InputMismatchException exception)
                {
                    System.out.println("Por favor, introduzca sólo valores numéricos");
                    teclado.next();
                }
        }       
        while ( !flag );
        
        
      }
            
     
      
     public void gestionCompras() {
        do {
            menuCompras();
                        
            
            switch (opcionCompras) {
                case 1:                    
                     gestionarcompras.altaCompras();                             
                    break;
                case 2:
                    gestionarcompras.buscarCompras();
                    break;
                 case 3:
                    gestionarcompras.imprimirCompras();
                    break;                  
                case 4:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Por favor, introduzca una opcion valida.");
                    break;
            }
        } while (opcionCompras != 4);
    }
     
     
      public void menuCompras() {
        // Muestro el menu de opciones y recojo la escogida
            
        System.out.println("=================");
        System.out.println("MENU COMPRAS");
        System.out.println("=================");
        System.out.println("");
        System.out.println("1 - Vender producto");
        System.out.println("2 - Buscar Compras");
        System.out.println("3 - Listado Compras");
        System.out.println("4 - Menu principal");

        Scanner teclado = new Scanner(System.in);
        
       
        System.out.print("Por favor, introduzca el número de la opción deseada: ");
        boolean flag=false;
         do
        {
            try
                {
                    opcionCompras = teclado.nextInt();
                    flag=true;
                }
                catch (InputMismatchException exception)
                {
                    System.out.println("Por favor, introduzca sólo valores numéricos");
                    teclado.next();
                }
        }       
        while ( !flag );
        
       
      }
           
      
      public void gestionFinanciacion() {
          
          Compras compra;
          
        do {
            menuFinanciacion();
                        
            
            switch (opcionFinanciacion) {
                case 1:
                    
                    compra = gestionarfinanciacion.buscarFinanciacion();
                    
                     if (compra != null){
                         gestionarfinanciacion.analizarCompra(compra);
                     }
                            
                    break;
                  
                case 2:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Por favor, introduzca una opcion valida.");
                    break;
            }
        } while (opcionFinanciacion != 2);
    }
      public void menuFinanciacion() {
        // Muestro el menu de opciones y recojo la escogida
            
        System.out.println("");
        System.out.println("MENU FINANCIACION");
        System.out.println("=================");
        System.out.println("Seleccionar Opcion:");
        System.out.println("1 - Analizar financiacion");
         System.out.println("2 - Menu principal");

        Scanner teclado = new Scanner(System.in);
        
       
        System.out.print("Por favor, introduzca el número de la opción deseada: ");
        boolean flag=false;
         do
        {
            try
                {
                    opcionFinanciacion = teclado.nextInt();
                    flag=true;
                }
                catch (InputMismatchException exception)
                {
                    System.out.println("Por favor, introduzca sólo valores numéricos");
                    teclado.next();
                }
        }       
        while ( !flag );
        
        //System.out.println("");
      }
      
      
        public void gestionDevolucion() {
          
          Compras compra;
          
        do {
            menuDevolucion();
                        
            
            switch (opcionDevolucion) {
                case 1:
                    
                    compra = gestionardevoluciones.buscarDevolucion();
                    
                     if (compra != null){
                         gestionardevoluciones.analizarDevolucion(compra);
                     }
                            
                    break;
                  
                case 2:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Por favor, introduzca una opcion valida.");
                    break;
            }
        } while (opcionDevolucion != 2);
    }
      public void menuDevolucion() {
        // Muestro el menu de opciones y recojo la escogida
            
        System.out.println("===============");
        System.out.println("MENU DEVOLUCION");
        System.out.println("===============");
        System.out.println("1 - Analizar devolucion");
        System.out.println("2 - Menu principal");
        System.out.println("");

        Scanner teclado = new Scanner(System.in);
        
        
        System.out.print("Por favor, introduzca el número de la opción deseada: ");
        boolean flag=false;
         do
        {
            try
                {
                    opcionDevolucion = teclado.nextInt();
                    flag=true;
                }
                catch (InputMismatchException exception)
                {
                    System.out.println("Por favor, introduzca sólo valores numéricos");
                    teclado.next();
                }
        }       
        while ( !flag );
        
                
      }
      
        
       public void gestionReparacion() {
          
          Compras compra;
          
        do {
            menuReparacion();
                        
            
            switch (opcionReparacion) {
                case 1:
                    
                    compra = gestionarreparacion.buscarDevolucion();
                    
                     if (compra != null){
                         gestionarreparacion.analizarDevolucion(compra);
                     }
                            
                    break;
                  
                case 2:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Por favor, introduzca una opcion valida.");
                    break;
            }
        } while (opcionReparacion != 2);
    }
      public void menuReparacion() {
        // Muestro el menu de opciones y recojo la escogida
            
        System.out.println("===============");
        System.out.println("MENU REPARACION");
        System.out.println("===============");
        System.out.println("1 - Analizar reparacion");
        System.out.println("2 - Menu principal");
        System.out.println("");

        Scanner teclado = new Scanner(System.in);
       
        System.out.print("Por favor, introduzca el número de la opción deseada: ");
        boolean flag=false;
         do
        {
            try
                {
                    opcionReparacion = teclado.nextInt();
                    flag=true;
                }
                catch (InputMismatchException exception)
                {
                    System.out.println("Por favor, introduzca sólo valores numéricos");
                    teclado.next();
                }
        }       
        while ( !flag );
                     
      }
      
     
      
      public void accesoDenegado(){
          System.out.println("");
          System.out.println("************************");
          System.out.println("** USUARIO INCORRECTO **");
          System.out.println("**   ACCESO DENEGADO  **");
          System.out.println("************************");
      }
 
}

