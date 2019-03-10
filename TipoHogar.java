
 
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase enum, se definen los 4 tipos de clases de productos de hogar:
 * Cocina, Frigorifico, Lavadora y aspiradora
 * 
 * @author Carlos de la Calleja
 */
public enum TipoHogar {
    //Cocina, Frigorifico, Lavadora, Aspiradora, No_existe;
    COCINA("Cocina"), FRIGORIFICO("Frigorifico"), LAVADORA("Lavadora"), ASPIRADORA("Aspiradora");
    
   
    private String nombre;
    
    TipoHogar(String nombre){
        this.nombre = nombre;
        
    }
    
    @Override
    public String toString(){
        return nombre;
            
    }   
        
    
}

