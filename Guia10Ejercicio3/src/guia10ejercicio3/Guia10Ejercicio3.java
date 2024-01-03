/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package guia10ejercicio3;

import Entidades.Baraja;
import Entidades.Carta;
import Servicios.BarajaServicios;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Guia10Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Baraja B1 = new Baraja();

        BarajaServicios Bs = new BarajaServicios();
        
        Bs.barajar(B1);

        boolean salir = false;

        while (!salir) {
            System.out.println("-----JUEGO DE CARTAS------\n\n"
                    + "Eliga una de las siguientes opciones: " + "\n"
                    + "1 - Dar una carta." + "\n"
                    + "2 - Barajar." + "\n"
                    + "3 - Numero de cartas disponibles." + "\n"
                    + "4 - Dar cartas." + "\n"
                    + "5 - Ver cartas repartidas." + "\n"
                    + "6 - Cartas disponibles." + "\n"
                    + "7 - Salir.");
            
            boolean entero = false;
            int opcion = 0;
            
            while (!entero) {
                
                System.out.println("\nRESPUESTA: ");
                
                if (leer.hasNextInt()) {
                    opcion = leer.nextInt();
                    leer.nextLine();
                    if (opcion > 7 || opcion < 1) {
                        
                        System.out.println("\nIngrese un numero entre 1 y 7: ");
                        
                    } else {
                        
                        entero = true;
                    }
                    
                } else {
                    System.out.println("\nERROR dato no valido.");
                    leer.nextLine();
                }
                
            }
            
            switch (opcion) {
                
                case 1 :
                    
                    System.out.println("Carta entregada: " +"\n"
                            + Bs.siguienteCarta(B1) +"\n");
                    
                    break;
                    
                case 2 :
                    
                    System.out.println("\n" + B1.toString() + "\n");
                    
                    Bs.barajar(B1);
                    
                    System.out.println("\n" + B1.toString() + "\n");
                    
                    break;
                    
                case 3 :
                    
                    System.out.println("\nEL numero de cartas disponibles es: " + Bs.cartasDisponibles(B1) + "\n");
                    
                    break;
                    
                case 4:

                    System.out.println("Ingrese el numero de cartas que desea dar: ");
                    
                    int cantidad = 0;
                    boolean entero1 = false;

                    while (!entero1) {

                        if (leer.hasNextInt()) {
                            
                            cantidad = leer.nextInt();
                            leer.nextLine();
                            
                            if (cantidad > Bs.cartasDisponibles(B1) || cantidad < 1) {
                                
                                System.out.println("\nLa cantidad ingresada esta fuera de rango.");

                            } else {
                                entero1 = true;
                            }
                        } else {
                            
                            System.out.println("\nERROR dato no valido.");
                            leer.nextLine();
                        }
                    }
                    
                    ArrayList<Carta> darCartas = Bs.darCartas(B1, cantidad);
                    
                    if (darCartas == null) {
                        
                        System.out.println("\nEl maso se encuentra vacio no hay cartas para repartir.");
                        
                    } else {
                        
                        System.out.println("Las cartas repartidas fueron: ");
                        
                        for (int i = 0; i < darCartas.size(); i++) {
                            
                            System.out.println("carta numero: " + (i + 1) + " Palo: " + darCartas.get(i).getPalo() + " Numero: " + darCartas.get(i).getNumero());
                            
                        }
                        System.out.println("");
                    }

                    break;
                    
                case 5 :
                    
                    Bs.cartasMonton();
                    System.out.println("");
                    
                    break;
                    
                case 6 :
                    
                    Bs.mostrarBaraja(B1);
                    
                    
                    break;
                    
                case 7 :
                    
                    System.out.println("*****FIN DEL PROGRAMA******");
                    
                    salir = true;
                    
                    break;
                    
                default :
                    break;
            }
            System.out.println("\n\n");

        }

    }

}
