/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
 */
package Entidades;

import java.util.List;

/**
 *
 * @author Rafael
 */
public class Juego {
    
    private List<Jugador> jugadores;
    private Revolver revolver;
    private Integer cantJugadores;
    
    public Juego(){
        
    }
    
    public Juego(List<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public void setCantJugadores(Integer cantJugadores) {
        this.cantJugadores = cantJugadores;
    }
    
    

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public Integer getCantJugadores() {
        return cantJugadores;
    }
    
    
    
    
    
}
