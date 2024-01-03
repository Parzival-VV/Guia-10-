/*
 Métodos:
 */
package Servicios;

import Entidades.Revolver;
import java.util.Objects;

/**
 *
 * @author Rafael
 */
public class RevolverServicio {
    
    
//    • llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
//deben ser aleatorios.
    
    public void llenarRevolver(Revolver R1){
        
        Integer aleatorio1 = (int) (Math.random() * 6) + 1;
        Integer aleatorio2 = (int) (Math.random() * 6) + 1;
        
        R1.setPosActual(aleatorio1);
        R1.setPosAgua(aleatorio2);
        
    }
    
//    • mojar(): devuelve true si la posición del agua coincide con la posición actual
    
    public boolean mojar(Revolver R1) {
        
        return Objects.equals(R1.getPosActual(), R1.getPosAgua());
        
    }
    
//    • siguienteChorro(): cambia a la siguiente posición del tambor
    
    public void sguienteChorro(Revolver R1) {
        
        if (R1.getPosActual() < 6) {
            R1.setPosActual(R1.getPosActual() + 1);
            
        } else {
            
            R1.setPosActual(1);
        }
    }
    
}
