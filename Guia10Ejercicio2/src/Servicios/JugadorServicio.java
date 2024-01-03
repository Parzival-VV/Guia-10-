/*
 El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:

 */
package Servicios;

import Entidades.Jugador;
import Entidades.Revolver;

/**
 *
 * @author Rafael
 */
public class JugadorServicio {
//    • disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.
    
    public boolean disparo(Jugador J1, Revolver R1) {
    RevolverServicio Rs = new RevolverServicio();
    
    if (Rs.mojar(R1)) {
        J1.setMojado(true);
    } else {
        J1.setMojado(false);
    }
        
        return J1.getMojado();
    }
    
    
}
