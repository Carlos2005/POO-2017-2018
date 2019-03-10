
 

/**
 * Clase que implementa los productos de sonido
 * 
 * @author Carlos de la Calleja
 */
public class Sonido extends Electrodomestico{
    private static int stock = 0;
    String potenciaStereo;
    String respuestaFrecuencia;


    public Sonido(String potenciaStereo, String respuestaFrecuencia, String referencia, String marca, String modelo, String color, int precio) {
        super(referencia, marca, modelo, color, precio);
        this.potenciaStereo = potenciaStereo;
        this.respuestaFrecuencia = respuestaFrecuencia;
        stock ++;
    }
    
    

    public static void setStock(int stock) {
        Sonido.stock = stock;
    }
    public static void decreaseStock() {
        if (stock > 0){
            stock --;
        }
    }

    public static int getStock() {
        return stock;
    }
    
    @Override
    public String toString() {
    return  "Referencia: " + referencia + ", Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color  + ", Potencia: " + potenciaStereo + ", Respuesta en frecuencia: " +
            respuestaFrecuencia +  ", Precio: " + precio + " euros";
}
    
        public static void increaseStock() {
             stock ++;
    }
}
