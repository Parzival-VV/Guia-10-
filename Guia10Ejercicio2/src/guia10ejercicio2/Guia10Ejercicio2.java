/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package guia10ejercicio2;

import java.util.Scanner;
import Entidades.Jugador;
import Entidades.Revolver;
import Entidades.Juego;
import Servicios.JuegoServicio;
import java.util.ArrayList;

/**
 *
 * @author Rafael
 *
 * Me planteo el ejercicio como nos fue sugerido cuando empezamos con POO
 * organizar las clases en entidades y los servicios de cada clase entidad en
 * una clase servicio independiente, haciendo convergencia en la clase main. a
 * modo de practica para proyectos mas complejos y respetar un metodo.
 */
public class Guia10Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("----RULETA RUSA DE AGUA---\n"
                + "Carga de jugadores, recuerda que el maximo de jugadores por partida es de 6 " + "\n"
                + "El numero de jugadores por defecto es de 6\n ");

        Integer cantJugadores = 6;
        boolean match5 = false;
        boolean salir = false;
        int respuesta = 0;
        
        
        while (!salir) {
            
            
            while (!match5) {

                System.out.println("1 para elegir cantidad de jugadores entre 1 y 6. " + "\n"
                        + "2 para cantidad de jugadores por defecto." + match5);
               
                
                if (leer.hasNextInt()) {
                    
                    int buffer = leer.nextInt();
                
                 if (buffer == 1 || buffer == 2){
                     
                     respuesta = buffer;
                     match5 = true;
                 } else {
                     
                    leer.nextLine();
                    System.out.println("Ingrese 1 o 2. ");
                    
                }

                    
                     

                } else {
                    String noValido = leer.nextLine();
                    System.out.println(noValido + " NO ES UN DATO NO VALIDO\n" + "Ingrese un dato valido: ");
                    
                }
            }

            switch (respuesta) {
                
                case 1:
                    
                    System.out.println("\nEligio opcion 1, ingrese un valor entre 1 y 6:");
                    
                    boolean match = false;
                    while (!match) {
                        
                        if (!leer.hasNextInt()) {
                            
                            System.out.println("\nERROR dato no valido.");
                            leer.next();
                        } else {
                            cantJugadores = leer.nextInt();
                            
                            if (cantJugadores > 6 || cantJugadores < 1) {
                                
                                System.out.println("\nEl numero ingresado esta fuera de rango");
                                
                            }else {
                                
                                match = true;
                                leer.nextLine();
                            }
                        }
                    }
                    salir = true;
                    break;
                    
                case 2:
                    
                    cantJugadores = 6;
                    System.out.println(cantJugadores);
                    salir = true;
                    break;

                    
            }

                
            }
            //CARGA DE JUGADORES A ARRAYLIST

            ArrayList<Jugador> jugadores = new ArrayList();

            for (int i = 0; i < cantJugadores; i++) {

                Jugador J1 = new Jugador(i + 1);

                jugadores.add(J1);

            }

            System.out.println(jugadores.toString());

            Revolver revolver = new Revolver();

            JuegoServicio juegoNuevo = new JuegoServicio();

            Juego J1 = juegoNuevo.llenarJuego(jugadores, revolver);

            juegoNuevo.ronda(J1);

        }

    }
