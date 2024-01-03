/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package guia10ejerciciosguiadetrabajo;

import java.util.Scanner;
import Entidades.Persona;
import Entidades.Dni;
import Entidades.Equipo;
import Entidades.Jugador;
import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class Guia10EjerciciosGuiaDeTrabajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Dni dni = new Dni();
        dni.setSerie('a');
        dni.setNumero(31638443);

        Persona P1 = new Persona();

        P1.setNombre("Rafael");
        P1.setApellido("Barresi");
        P1.setDni(dni);

        System.out.println("Serie:" + P1.getDni().getSerie() + "\n"
                + "Numero: " + P1.getDni().getNumero());
        System.out.println("");

        P1.getDni().setSerie('Z');

        System.out.println("Serie:" + P1.getDni().getSerie() + "\n"
                + "Numero: " + P1.getDni().getNumero());
        System.out.println("");
        
        
//        Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
//y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
//esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
        Equipo equipo = new Equipo();

        ArrayList<Jugador> jugadores = new ArrayList();

        Jugador jugador1 = new Jugador("Georgina", "Erquiaga", "Mesa de entrada", 1);
        Jugador jugador2 = new Jugador("Rafael", "Barresi", "area tecnica", 2);
        Jugador jugador3 = new Jugador("Santiago", "morelli", "Mesa de entrada", 3);
        Jugador jugador4 = new Jugador("juan", "ruperto", "conductor ", 4);

        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);
        jugadores.add(jugador4);

        equipo.setJugadores(jugadores);
        System.out.println("----------EJERCICIO 2---------\n");
        for (int i = 0; i < equipo.getJugadores().size(); i++) {
            System.out.println("Nombre: " + equipo.getJugadores().get(i).getNombre() + "\n"
                    + "Apellido: " + equipo.getJugadores().get(i).getApellido() + "\n"
                    + "Posicion: " + equipo.getJugadores().get(i).getPosicion() + "\n"
                    + "Numero: " + equipo.getJugadores().get(i).getNumero());
            System.out.println("");
        }

    }

}
