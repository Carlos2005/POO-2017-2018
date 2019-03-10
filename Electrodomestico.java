
 

/**Electrodomestico implementa la clase padre para todos los tipos de electrodomestico
 * que se encuentran en la tienda.
 * 
 * @author Carlos de la Calleja
 
 */
public class Electrodomestico{
    protected String referencia;
    protected String marca;
    protected String modelo;
    protected String color;
    protected int precio;
    
/**
 * 
 * @param referencia referenia del electrodomestico
 * @param marca marca del electrodomestico
 * @param modelo modelo
 * @param color color
 * @param precio precio
 */

    public Electrodomestico(String referencia, String marca, String modelo, String color, int precio) {
        this.referencia = referencia;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public void setReferencia(String referencia) {
        this.marca = referencia;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getReferencia() {
        return referencia;
    }

    public int getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
           
}

