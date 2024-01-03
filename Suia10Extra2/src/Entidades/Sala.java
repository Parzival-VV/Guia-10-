
package Entidades;

import java.util.Arrays;
import java.util.HashSet;



/**
 *Clase que crea una objeto sala 
 * @author Rafael
 */
public class Sala {
    
    private Pelicula pelicula;
    private HashSet<Espectador> espectadores;
    private Asiento[][] asientos = new Asiento[8][6];
    
    
    //constructor que inizializa la sala cargada con un objeto Asiento por cada una de las ubizaciones de la matriz asientos.
    public Sala(){
        
        int fila = 1;
        for (int i = asientos.length - 1; i >= 0; i--) {
            
            fila ++;
            for (int j = 0; j < asientos[i].length; j++) {
                
                char [] letras = {'A','B','C','D','E','F'};
                String nombreAsiento =  String.valueOf(fila) + String.valueOf(letras[j]);
                asientos[i][j] = new Asiento(nombreAsiento);         
            }
            fila++;
        }
        
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void setEspectadores(HashSet<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public HashSet<Espectador> getEspectadores() {
        return espectadores;
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    @Override
    public String toString() {
        return "Sala{" + "espectadores=" + espectadores + ", asientos=" + Arrays.toString(asientos) + '}';
    }
    
    
    
    
    
}
