/*
Métodos:
 */
package Servicios;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class JuegoServicio {
//    • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//y el revolver para guardarlos en los atributos del juego.

    public Juego llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver) {
        Juego juegoNuevo = new Juego();

        juegoNuevo.setJugadores(jugadores);
        juegoNuevo.setRevolver(revolver);

        return juegoNuevo;

    }

//    • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    public void ronda(Juego juegoNuevo) {

        RevolverServicio Rs = new RevolverServicio();
        Rs.llenarRevolver(juegoNuevo.getRevolver());

         int i = 0;
        int ronda = 1;
        JugadorServicio Js = new JugadorServicio();

        while(true) {           
        //for (int i = 0; i < juegoNuevo.getJugadores().size(); i++) {

            System.out.println("-----RONDA: " + ronda + "-----\n");

            if (Js.disparo(juegoNuevo.getJugadores().get(i), juegoNuevo.getRevolver())) {

                System.out.println("                                     *     *            _");
                System.out.println("   *****************************     *  *  *  *****     *  *****  **    *****");
                System.out.println("   **                         ***    *  *  *  *   *  *  *  * * *  *  *  *   *");
                System.out.println("    *   **  ********************     *     *  *****  ****  *   *  **    *****  *");
                System.out.println("     *   **   *");
                System.out.println("     *   ***  *");
                System.out.println("     *******");
                System.out.println("     *******");
                System.out.println("     *******");
                System.out.println("     ********");

                System.out.println("\nEL judaor mojado: ");
                System.out.println("--" + juegoNuevo.getJugadores().get(i).getNombre());
                System.out.println(juegoNuevo.getJugadores().get(i).toString());
                System.out.println("\n----------FIN DEL JUEGO----------\n");

                break;

            } else {

                Rs.sguienteChorro(juegoNuevo.getRevolver());
                System.out.println(juegoNuevo.getRevolver().toString());
                System.out.println("---EL JUGADOR NO FUE MOJADO!!!---");

                if (i < juegoNuevo.getJugadores().size() - 1) {
                    i++;
                } else {
                    i = 0;
                }
            }
            ronda++;
        }

    }

}
