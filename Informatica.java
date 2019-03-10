
 

/**
 * Esta clase implementa los productos de electrodomestico
 * 
 * @author Carlos de la Calleja
 */
public class Informatica extends Electrodomestico {
    private static int stock = 0;
    private String memoria;
    private String capacidad;
    private String procesador;


    public Informatica(String referencia, String memoria, String capacidad, String procesador, String marca, String modelo, String color, int precio) {
        super(referencia, marca, modelo, color, precio);
        this.memoria = memoria;
        this.capacidad = capacidad;
        this.procesador = procesador;
        stock ++;
    }



    public static void setStock(int stock) {
        Informatica.stock = stock;
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
    return  "Referencia: " + referencia + ", Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color +
            ", Tamaño de la memoria: " + memoria + ", Capacidad disco duro: " +
            capacidad + ", Modelo de Procesador: " + procesador +  ", Precio: " + precio + " euros";

  }
    
        public static void increaseStock() {
             stock ++;
    }
}
