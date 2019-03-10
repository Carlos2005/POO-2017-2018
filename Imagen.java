 

/**
 * Implementa los productos del tipo de imagen
 * @author Carlos de la Calleja
 */
public class Imagen extends Electrodomestico {
    private static int stock = 0;
    private int pulgadasPantalla;
    private String resolucion;
    private int frecuencia;

    public Imagen(int pulgadasPantalla, String resolucion, int frecuencia, String referencia, String marca, String modelo, String color, int precio) {
        super(referencia, marca, modelo, color, precio);
        this.pulgadasPantalla = pulgadasPantalla;
        this.resolucion = resolucion;
        this.frecuencia = frecuencia;
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
    return   "Referencia :" + referencia +", Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color  + ", Frecuencia: " + frecuencia + ", Resolucion de la imagen: " +
            resolucion +  ", precio: " + precio + " euros";
    }
}

