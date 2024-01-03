/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class Equipo {
    
    private ArrayList<Jugador> jugadores = new  ArrayList();

    public Equipo() {
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    
    
    
}
