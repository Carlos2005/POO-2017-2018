
 


import java.time.LocalDate;
import java.util.ArrayList;

/**
 * La clase Compras implementa la clase en la que se almacenan las compras
 * e incluye una lista con todos los electrodomésticos comprados
 *
 * @author Carlos de la Calleja
 * @version 1.00, 27 May 2018
 */


public class Compras {
    private String dniCliente;
    private int precioTotal;
    private LocalDate fechaCompra;
    private ArrayList<Electrodomestico> listaCompras = new ArrayList<>();
    private boolean financiacion;
    
/**
 * 
 * @param dniCliente DNI del cliente
 * @param fechaCompra fecha de compra
 * @param financiacion financiacion
 * @param precioTotal precio de todos los items
 */

    public Compras(String dniCliente, LocalDate fechaCompra, boolean financiacion, int precioTotal) {
        this.dniCliente = dniCliente;
        this.fechaCompra = fechaCompra;
        this.financiacion = financiacion;
    }
    
    //crea metodo para anadir electrodomesticos al array
    
    public void setAddElectrodomestico(Electrodomestico electrodomestico) {
        this.listaCompras.add(electrodomestico);
    }
    
    public void setListaCompras(ArrayList<Electrodomestico> listaCompras) {
        this.listaCompras = listaCompras;
    }
    @Override
    public String toString() {
    return   "DNI: " + dniCliente + ", Fecha: " + fechaCompra + ", Lista de Compras: " + listaCompras;

  }

    public String getDni() {
        return dniCliente;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFinanciacion(boolean financiacion) {
        this.financiacion = financiacion;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public ArrayList<Electrodomestico> getListaCompras() {
        return listaCompras;
    }
    
}

