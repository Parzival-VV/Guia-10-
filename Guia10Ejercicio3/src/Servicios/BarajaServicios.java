/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
*/
package Servicios;

import Entidades.Baraja;
import Entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class BarajaServicios {
    
    private ArrayList<Carta> cartasRepartidas = new ArrayList();
    
    Scanner leer = new Scanner(System.in);
    
//    • barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar(Baraja baraja) {
        
        Collections.shuffle(baraja.getBaraja());
        
    }
    
//    • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.
    /**
     * devuelve un objeto carta si la baraja esta vacia el objeto tiene valor null.
     * @param baraja
     * @return 
     */
    public Carta siguienteCarta(Baraja baraja) {
        
        Carta C1 = null;
        
        if (!baraja.getBaraja().isEmpty()) {
            
            C1 = baraja.getBaraja().get(0);
            baraja.getBaraja().remove(0);
            cartasRepartidas.add(C1);
        }
          
        
        return C1;
    }
    
//    • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    
    public int cartasDisponibles(Baraja baraja) {
        
         int cantidad = baraja.getBaraja().size();
        
         return cantidad;
    
    }
    
//    • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.
    
    public ArrayList<Carta> darCartas(Baraja baraja, int cantidad){
        
        ArrayList<Carta> cartas = new ArrayList();
        
        if (cantidad < baraja.getBaraja().size()) {
            
            for (int i = 0; i < cantidad; i++) {
               
                cartas.add(siguienteCarta(baraja));
                
            }
            
        } else cartas = null;
        
        return cartas;
        
    }
    
//    • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario
    
    public static Comparator<Carta> ordenarCaratas = new Comparator<Carta>() {
        @Override
        public int compare(Carta t, Carta t1) {
            return t.getNumero().compareTo(t1.getNumero());
        }
    };
    
    public static Comparator<Carta> ordenarPorNombre = new Comparator<Carta>() {
        @Override
        public int compare(Carta t, Carta t1) {
           return t.getPalo().compareTo(t1.getPalo());
        }
    };
    
    
    
    public void cartasMonton() {
        cartasRepartidas.sort(ordenarCaratas);
        cartasRepartidas.sort(ordenarPorNombre);
        
        System.out.println("\n-----CARTAS REPARTIDAS-----\n");
        
        for (int i = 0; i < cartasRepartidas.size(); i++) {
            
            System.out.println(cartasRepartidas.get(i).toString());
            
            if (i != 0 && i %10 == 0) {
                System.out.println("");
            }
            
        }
        
    }
    
//    • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.
    
    public void mostrarBaraja(Baraja baraja) {
        
        baraja.getBaraja().sort(ordenarCaratas);
        baraja.getBaraja().sort(ordenarPorNombre);
        
        System.out.println("\n-----CARTAS DISPONIBLES EN EL MASO-----\n");
        
        for (int i = 0; i < baraja.getBaraja().size(); i++) {
            
            System.out.print(baraja.getBaraja().get(i).toString());
            
            if (i != 0 && i%4 == 0) {
                System.out.println("");
            }
            
        }
        
    }
    
}
