
 

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Gestiona todas las operaciones con electrodomesticos, altas, bajas, listados
 * @author Carlos de la Calleja
 */
public class GestionElectrodomesticos {
    
    private ArrayList<Electrodomestico> listaElectrodomesticos;
	
    Listas accederListaElectrodomesticos = new Listas();    
    
     private int tipo;

    public GestionElectrodomesticos() {
        
        this.listaElectrodomesticos = accederListaElectrodomesticos.getListaElectrodomesticos();
           
    }
    
    
    public void crearElectrodomestico() {
	
	Scanner sc = new Scanner(System.in);
		
	// declaracion de todos los atributos del cliente
        
        String referencia;
        String marca;
        String modelo;
        String color;
        int precio;
        
        System.out.print("Referencia del electrodomestico: ");
	referencia = sc.nextLine();					
	System.out.print("Marca del electrodomestico: ");
	marca = sc.nextLine();		
	System.out.print("Modelo del electrodomestico: ");
	modelo = sc.nextLine();
	System.out.print("Color del electrodomestico: ");
	color = sc.nextLine();
        System.out.print("Precio del electrodomestico: ");
	precio = sc.nextInt();
		
	Electrodomestico electrodomestico = new Electrodomestico (referencia, marca, modelo, color, precio); // creamos el objeto cliente
		
	
	listaElectrodomesticos.add(electrodomestico);
	System.out.println("Electrodomestico agregado correctamente");
			

    }	
/**
 * Crea producto de informatica
 * 
 */	
    
    public void crearInformatica() {
	
	Scanner sc = new Scanner(System.in);
		
	// declaracion de todos los atributos del cliente
                
        String marca;
        String modelo;
        String color;
        int precio;
        String memoria;
        String capacidad;
        String procesador;
        String referencia;
        
        System.out.print("Introduzca la referencia: ");
	referencia = sc.nextLine();
				
	System.out.print("Marca del ordenador: ");
	marca = sc.nextLine();		
	System.out.print("Modelo del ordenador: ");
	modelo = sc.nextLine();
	System.out.print("Color del ordenador: ");
	color = sc.nextLine();
        System.out.print("Precio del ordenador: ");
	precio = sc.nextInt();        
        System.out.print("Memoria del ordenador: ");
	memoria = sc.nextLine();		
	System.out.print("Capacidad del ordenador: ");
	capacidad = sc.nextLine();
	System.out.print("Procesador del ordenador: ");
	procesador = sc.nextLine();
		
	Informatica informatica = new Informatica (referencia, memoria, capacidad, procesador,  marca, modelo,  color,  precio); // creamos el objeto cliente
		
	
	listaElectrodomesticos.add(informatica);
	System.out.println(" ** Ordenador agregado correctamente **");
      

    }	
/**
 * Crea producto de la gama de sonido
 * 
 */
        public void crearSonido() {
	
	Scanner sc = new Scanner(System.in);
		
	// declaracion de todos los atributos del cliente
                
        String marca;
        String modelo;
        String color;
        int precio;
        String potenciaStereo;
        String respuestaFrecuencia;
        String referencia;
        
        System.out.print("Introduzca la Referencia: ");
	referencia = sc.nextLine();
				
	System.out.print("Marca del aparato de sonido: ");
	marca = sc.nextLine();		
	System.out.print("Modelo del aparato de sonido: ");
	modelo = sc.nextLine();
	System.out.print("Color del aparato de sonido: ");
	color = sc.nextLine();
        System.out.print("Precio del aparato de sonido: ");
	precio = sc.nextInt();
        
        System.out.print("Potencia del aparado de sonido: ");
	potenciaStereo = sc.nextLine();		
	System.out.print("Capacidad del ordenador: ");
	respuestaFrecuencia = sc.nextLine();

		
	Sonido sonido = new Sonido(potenciaStereo, respuestaFrecuencia, referencia, marca, modelo, color, precio); // creamos el objeto cliente
		
		listaElectrodomesticos.add(sonido);
	System.out.println("Aparato de sonido agregado correctamente");
			
    }
        
/**
 * Crea producto de la gama de imagen
 * 
 */
        public void crearImagen() {
	
	Scanner sc = new Scanner(System.in);
		
	// declaracion de todos los atributos del cliente
                
        String marca;
        String modelo;
        String color;
        int precio;
        int pulgadasPantalla;
        String resolucion;
        int frecuencia;
        String referencia;
        
        System.out.print("Introduzca la Referencia del aparato de sonido: ");
	referencia = sc.nextLine();
				
	System.out.print("Marca del aparato de imagen: ");
	marca = sc.nextLine();		
	System.out.print("Modelo del aparato de imagen: ");
	modelo = sc.nextLine();
	System.out.print("Color del aparato de imagen: ");
	color = sc.nextLine();
        System.out.print("Precio del aparato de imagen: ");
	precio = sc.nextInt();
        
        System.out.print("Tamaño de la pantalle en pulgadas: ");
	pulgadasPantalla = sc.nextInt();		
	System.out.print("Frecuencia en de refresco en Hz: ");
	frecuencia = sc.nextInt();
        
        System.out.print("Resolucion de la pantalla: ");
	resolucion = sc.nextLine();

		
	Imagen imagen = new Imagen(pulgadasPantalla, resolucion, frecuencia, referencia, marca, modelo, color, precio); // creamos el objeto cliente
		
		listaElectrodomesticos.add(imagen);
	System.out.println("Aparato de sonido agregado correctamente");
			
    } 
        
       public void crearTelefonia() {
	
	Scanner sc = new Scanner(System.in);
		
	// declaracion de todos los atributos del cliente
                
        String marca;
        String modelo;
        String color;
        int precio;
        String sistemaOperativo;
        int pulgadasPantalla;
        String memoria;
        String resolucionCamara;

        String referencia;
        
        System.out.print("Introduzca la Referencia del Smartphone: ");
	referencia = sc.nextLine();
				
	System.out.print("Marca del Smartphone ");
	marca = sc.nextLine();		
	System.out.print("Modelo del Smartphone ");
	modelo = sc.nextLine();
	System.out.print("Color del Smartphone ");
	color = sc.nextLine();
        System.out.print("Precio del Smartphone ");
	precio = sc.nextInt();
        
        System.out.print("Tamaño de la pantalle en pulgadas: ");
	pulgadasPantalla = sc.nextInt();	
        
	System.out.print("Capacidad de memoria del smartphone: ");
	memoria = sc.nextLine();
        
        System.out.print("Resolucion de la camara: ");
	resolucionCamara = sc.nextLine();
        
        System.out.print("Sistema operativo del smartphone: ");
	sistemaOperativo = sc.nextLine();
        
        		
	Telefonia telefonia = new Telefonia(sistemaOperativo, pulgadasPantalla, memoria, resolucionCamara, referencia, marca, modelo, color, precio); // creamos el objeto cliente
		
        listaElectrodomesticos.add(telefonia);
	System.out.println("Aparato de sonido agregado correctamente");
			
    } 
         
/**
 * Crea producto de la gama de hogar
 * 
 */      
       public void crearHogar() {
	
	Scanner sc = new Scanner(System.in);
		
	// declaracion de todos los atributos del cliente
        
                      
        String marca;
        String modelo;
        String color;
        int precio;
        int potencia;
        String referencia;
        TipoHogar hogarClase;
        
        System.out.print("Introduzca la Referencia: ");
	referencia = sc.nextLine();
				
	System.out.print("Marca del aparato de hogar: ");
	marca = sc.nextLine();		
	System.out.print("Modelo del aparato de hogar: ");
	modelo = sc.nextLine();
	System.out.print("Color del aparato de hogar: ");
	color = sc.nextLine();
        System.out.print("Precio del aparato de hogar: ");
	precio = sc.nextInt();
        
        System.out.print("Potencia del aparado de hogar: ");
	potencia = sc.nextInt();
        
        System.out.println("Introduzca el tipo de Hogar");
        System.out.println("1 - Tipo Cocina");
        System.out.println("2 - Tipo Frigorifico");
        System.out.println("3 - Tipo Lavadora");
        System.out.println("4 - Tipo Aspiradora");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir numero: ");
        boolean correcto = false;        
        while (correcto == false){
            try{
                tipo = teclado.nextInt();
                System.out.println("");
                correcto = true;
            } catch (InputMismatchException e) {
                System.out.println("Debe introducir un numero");
                teclado.next();
            }
        }    
                 
          
            switch (tipo) {
                case 1:
                    listaElectrodomesticos.add(new Hogar(TipoHogar.COCINA, potencia, referencia, marca, modelo, color, precio));                  
                    break;
                case 2:
                   listaElectrodomesticos.add(new Hogar(TipoHogar.FRIGORIFICO, potencia, referencia, marca, modelo, color, precio));   
                    break;
                 case 3:
                    listaElectrodomesticos.add(new Hogar(TipoHogar.LAVADORA, potencia, referencia, marca, modelo, color, precio));  
                    break; 
                 case 4:
                    listaElectrodomesticos.add(new Hogar(TipoHogar.ASPIRADORA, potencia, referencia, marca, modelo, color, precio));                     
                    break;                    
                 case 5:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Por favor, introduzca una opcion valida.");
                    break;
               
            }
            
             System.out.println("Aparato de hogar agregado correctamente");
                
        };
        
/**
 * Listado de todos los electrodomesticos
 * 
 */        
    public void listadoElectrodomesticos(){
		System.out.println("*******************************************");
		System.out.println("********LISTADO DE ELECTRODOMESTICOS*******");
		System.out.println("*******************************************");
             for (Electrodomestico electrodomesticobuscado : listaElectrodomesticos) {
                        if(electrodomesticobuscado instanceof Informatica){
                            System.out.println(" ARTICULOS INFORMATICA");
                        }
                        if(electrodomesticobuscado instanceof Sonido){
                            System.out.println(" ARTICULOS SONIDO");
                        }
                        if(electrodomesticobuscado instanceof Hogar){
                            System.out.println(" ARTICULOS HOGAR");
                        }
                        if(electrodomesticobuscado instanceof Imagen){
                            System.out.println(" ARTICULOS IMAGEN");
                        }                        
                        if(electrodomesticobuscado instanceof Telefonia){
                            System.out.println(" ARTICULOS TELEFONIA");
                        }
			System.out.println(electrodomesticobuscado);
			}
             
                  //metodo java 8 method reference
		//listaClientes.forEach(System.out::println);
    }
/**
 * Listado productos informatica
 * 
 */      
    
     public void listadoElectrodomesticosInformatica(){
		System.out.println("*******************************************");
		System.out.println("********LISTADO DE ELECTRODOMESTICO INFORMATICA*******");
		System.out.println("*******************************************");
             for (Electrodomestico electrodomesticobuscado : listaElectrodomesticos) {
                        if(electrodomesticobuscado instanceof Informatica){
                            System.out.println(electrodomesticobuscado);
                        }
             }             
     }
/**
 * Listado productos sonido
 * 
 */ 
     public void listadoElectrodomesticosSonido(){
		System.out.println("*******************************************");
		System.out.println("********LISTADO DE ELECTRODOMESTICO SONIDO*******");
		System.out.println("*******************************************");
             for (Electrodomestico electrodomesticobuscado : listaElectrodomesticos) {
                        if(electrodomesticobuscado instanceof Sonido){
                            System.out.println(electrodomesticobuscado);
                        }
             }             
     } 
/**
 * Listado productos imagen
 * 
 */ 
       public void listadoElectrodomesticosImagen(){
		System.out.println("*******************************************");
		System.out.println("********LISTADO DE ELECTRODOMESTICO IMAGEN*******");
		System.out.println("*******************************************");
             for (Electrodomestico electrodomesticobuscado : listaElectrodomesticos) {
                        if(electrodomesticobuscado instanceof Imagen){
                            System.out.println(electrodomesticobuscado);
                        }
             }             
     } 
/**
 * Listado productos telefonia
 * 
 */      
         public void listadoElectrodomesticosTelefonia(){
		System.out.println("*******************************************");
		System.out.println("********LISTADO DE ELECTRODOMESTICO TELEFONIA*******");
		System.out.println("*******************************************");
             for (Electrodomestico electrodomesticobuscado : listaElectrodomesticos) {
                        if(electrodomesticobuscado instanceof Telefonia){
                            System.out.println(electrodomesticobuscado);
                        }
             }             
     } 

/**
 * Listado productos hogar
 * 
 */ 
     public void listadoElectrodomesticosHogar(){
		System.out.println("*******************************************");
		System.out.println("********LISTADO DE ELECTRODOMESTICO HOGAR*******");
		System.out.println("*******************************************");
             for (Electrodomestico electrodomesticobuscado : listaElectrodomesticos) {
                        if(electrodomesticobuscado instanceof Hogar){
                            System.out.println(electrodomesticobuscado);
                        }
             }             
     }  
     
     
/** 
 * Inventario de electrodomesticos, muestra el número de productos de cada clase
 */  
     
    public void inventarioElectrodomesticos(){
        
        System.out.println("*******************************************");
        System.out.println("********INVENTARIO DE ELECTRODOMESTICOS*******");
	System.out.println("*******************************************");
              
        System.out.println("Numero total de articulos de informatica: " + Informatica.getStock());
        System.out.println("Numero total de articulos de sonido: " + Sonido.getStock());
        System.out.println("Numero total de articulos de imagen: " + Imagen.getStock());
        System.out.println("Numero total de articulos de telefonia: " + Telefonia.getStock());
        System.out.println("Numero total de articulos de hogar: " + Hogar.getStock());
        System.out.println("*******************************************");
        
    }
    
    
    public void buscarElectrodomestico(){
		
		
    //buscar electrodomestico por referencia
	Scanner sc = new Scanner(System.in);
	String referencia;	
	int i = 0;
	boolean encontrado = false;
		
	System.out.print("Introduzca la referencia del producto a buscar: ");
	referencia = sc.nextLine();
			
            while (i< listaElectrodomesticos.size() && !encontrado) {
				
		if(listaElectrodomesticos.get(i).getReferencia().equalsIgnoreCase(referencia)){

                    System.out.println("*** producto encontrado ***");
                    System.out.println(listaElectrodomesticos.get(i));
                    encontrado = true;                       
                    break;
		}
		i++;
				
            }
			
            if (!encontrado)  
		System.out.println("*** El producto no exite ***");
            
            		
			
	 }
   
    
        public void buscarElectrodomesticoMarca(){
		
		
    //buscar electrodomestico por marca
	Scanner sc = new Scanner(System.in);
	String referencia;	
	int i = 0;
	boolean encontrado = false;
		
	System.out.print("Introduzca la marca del producto a buscar: ");
	referencia = sc.nextLine();
			
            while (i< listaElectrodomesticos.size()) {
				
		if(listaElectrodomesticos.get(i).getMarca().equalsIgnoreCase(referencia)){

                    System.out.println(listaElectrodomesticos.get(i));
                    encontrado = true;                       
                    break;
		}
		i++;
				
            }
			
            if (!encontrado)  
		System.out.println("*** No existe ningún producto de esta marca ***");
            
            		
			
	 }
        
        //buscar electrodomestico por modelo
        public void buscarElectrodomesticoModelo(){
		
	Scanner sc = new Scanner(System.in);
	String referencia;	
	int i = 0;
	boolean encontrado = false;
		
	System.out.print("Introduzca el del producto a buscar: ");
	referencia = sc.nextLine();
			
            while (i< listaElectrodomesticos.size()) {
				
		if(listaElectrodomesticos.get(i).getModelo().equalsIgnoreCase(referencia)){

                    System.out.println(listaElectrodomesticos.get(i));
                    encontrado = true;                       
                    break;
		}
		i++;
				
            }
			
            if (!encontrado)  
		System.out.println("*** No existe ningún producto de este modelo ***");
            
            		
			
	 }
    
    
    public void eliminarElectrodomestico() {
	
	Scanner sc = new Scanner(System.in);
	String referencia;

	int i = 0;
	boolean encontrado = false;
		
	System.out.print("Referencia del electro a elimnar ");
	referencia = sc.nextLine();

			
            while ( i< listaElectrodomesticos.size() && !encontrado) {
				
		if(listaElectrodomesticos.get(i).getReferencia().equalsIgnoreCase(referencia)){
                    
                    
                    //actualizarmos stock
                   if (listaElectrodomesticos.get(i) instanceof Informatica){
                       Informatica.decreaseStock();
                        }
                   else if (listaElectrodomesticos.get(i) instanceof Hogar){
                       Hogar.decreaseStock();
                        }
                   else if (listaElectrodomesticos.get(i) instanceof Imagen){
                       Imagen.decreaseStock();
                        }
                   else if (listaElectrodomesticos.get(i) instanceof Sonido){
                       Sonido.decreaseStock();
                        }
                   else if (listaElectrodomesticos.get(i)instanceof Telefonia){
                       Telefonia.decreaseStock();
                        }
                    

                    listaElectrodomesticos.remove(i);
                    System.out.println("*** Electrodomestico eliminado satisfactoriamente ***");
                    encontrado = true;
                    break;
		}
		i++;				
            }
			
            if (!encontrado)  
		System.out.println("*** El electrodoméstico no existía ***");
		
    }
}

