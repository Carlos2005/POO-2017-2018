 

/**
 * Esta clase implementa los productos del tipo hogar y sus diferenctes tipoas a partir de una clase enum
 * @author Carlos de la Calleja
 */
public class Hogar extends Electrodomestico{
    private static int stock = 0;
    private TipoHogar tipohogar;
    private int potencia;
    
    //generar la clase enum de hogar
    // cocina, frigorifico, lavadora, aspiradora

    public Hogar(TipoHogar tipohogar, int potencia, String referencia, String marca, String modelo, String color, int precio) {
        super(referencia, marca, modelo, color, precio);
        this.tipohogar = tipohogar;
        this.potencia = potencia;
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
    return  "Referencia: " + referencia + ", Marca: " + marca + ", Modelo: " + modelo +
            ", Color: " + color +   ", Potencia: " +   potencia +  ", Precio: " + precio + " euros";
    

  }
}

