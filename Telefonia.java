
 

/**
 * Clase que implementa la clase de telefonia
 * 
 * @author Carlos de la Calleja
 */
public class Telefonia extends Electrodomestico{
    private static int stock = 0;
    private String sistemaOperativo;
    private int pulgadasPantalla;
    private String memoria;
    private String resolucionCamara;
    
 

    public Telefonia(String sistemaOperativo, int pulgadasPantalla, String memoria, String resolucionCamara, String referencia, String marca, String modelo, String color, int precio) {
        super(referencia, marca, modelo, color, precio);
        this.sistemaOperativo = sistemaOperativo;
        this.pulgadasPantalla = pulgadasPantalla;
        this.memoria = memoria;
        this.resolucionCamara = resolucionCamara;
        stock ++;
    }
       
    public static int getStock() {
        return stock;
    }
    public static void decreaseStock() {
        if (stock > 0){
            stock --;
        }
    }
    
        public static void increaseStock() {
             stock ++;
    }
   
    @Override
    public String toString() {
    return  "Referencia: " + referencia + ", Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color + ", Tamaño de la memoria" + memoria + ", Resolución cámara: " +
            resolucionCamara + ", Sistema Operativo: " + sistemaOperativo +
            ", Precio: " + precio + " euros" ;
    }

}

