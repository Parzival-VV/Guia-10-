/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta

ocupado se muestra una X, sino un espacio vacío.
8 A X | 8 B X | 8 C X | 8 D | 8 E X | 8 F X
7 A X | 7 B X | 7 C X | 7 D X | 7 E | 7 F X
6 A X | 6 B X | 6 C | 6 D X | 6 E X | 6 F
5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
3 A X | 3 B X | 3 C X | 3 D | 3 E X | 3 F X
2 A X | 2 B | 2 C X | 2 D X | 2 E X | 2 F
1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X

Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.
 */
package Service;

import Entidades.Cine;
import Entidades.Pelicula;
import Entidades.Sala;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class CineService {
    
    Scanner leer = new Scanner(System.in);
    
    public void crearCine() {

        Cine cine = new Cine();
        Sala sala = new Sala();
        PeliculaService Ps = new PeliculaService();
        SalaService Ss = new SalaService();

        System.out.println("\n******     CINE VIVORATA    ******\n");

        boolean salir = false;

        while (!salir) {

            System.out.println("ELIGA OPCION:  " + "\n"
                    + "1- Cargar peliculas. " + "\n"
                    + "2- Llenar salas. " + "\n"
                    + "3- Mostrar Sala de pelicula especifica. " + "\n"
                    + "4- Salir." + "\n\n"
                    + "OPCION: ");
            Integer opcion = null;

            do {

                opcion = validarInteger(leer);

                if (opcion > 4) {

                    System.out.println("El numero ingresado esta fuera de rango;");

                }

            } while (opcion < 1 || opcion > 4);

            switch (opcion) {

                case 1:

                    cine.setPeliculas(Ps.crearPelicula());
                    
                    break;

                case 2:

                    boolean salirSala = false;

                    Integer opc = null;

                    while (!salirSala) {

                        System.out.println("\nEliga una de las siguientes peliculas: " + "\n");

                        for (int i = 0; i < cine.getPeliculas().size(); i++) {

                            System.out.println((i + 1) + "- " + cine.getPeliculas().get(i).getTitulo());

                        }

                        do {

                            opc = validarInteger(leer);

                            if (opc > cine.getPeliculas().size()) {

                                System.out.println("El numero ingresado esta fuera de rango;");

                            }

                        } while (opc < 1 || opcion > cine.getPeliculas().size());
                        
                        
                        sala = Ss.llenarSala(cine, cine.getPeliculas().get(opc - 1));
                        
                        cine.getSala().add(sala);
                        
                        String respuesta = null;

                        System.out.println("\nDesea salir SI o NO?");

                        do {

                            respuesta = validacionString(leer.nextLine());

                            if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                                System.out.println("Ingrese respuesta correcta");
                            }

                        } while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));

                        if (respuesta.equalsIgnoreCase("si")) {

                            salirSala = true;
                        }

                    }

                    break;
                    
                case 3:
                    
                    System.out.println("\nEliga una de las siguientes peliculas: " + "\n");

                        for (int i = 0; i < cine.getPeliculas().size(); i++) {

                            System.out.println((i + 1) + "- " + cine.getPeliculas().get(i).getTitulo());

                        }
                        
                        Integer opc1 = null;

                        do {

                            opc1 = validarInteger(leer);

                            if (opc1 > cine.getPeliculas().size()) {

                                System.out.println("El numero ingresado esta fuera de rango;");

                            }

                        } while (opc1 < 1 && opcion > cine.getPeliculas().size());
                        
                        Ss.imprimirSala(cine.getSala().get(opc1 - 1));
                 
                    break;
                    
                case 4:
                    
                    break;
                    
                default: 
                    break;

            }

        }

    }
    
    /**
     * valida que lo que viene por teclado sea un entero y no termina hasta que asi sea.
     *
     * @param leer
     * @return Integer validado.
     */
        public Integer validarInteger(Scanner leer) {
        
        Integer integer = 0;
        
        while (true) {
           
            if(leer.hasNextInt()) {
                integer = leer.nextInt();
                leer.nextLine();
                 break;
    
            } else {
                
                System.out.println("ERROR dato no valido \n"
                                 + "Intentelo de nuevo: ");
                leer.nextLine();
            }
            
        }
           
        return integer;
    }
    
    /**
     * valida que el dato ingresado sea String, puede contener espacios, mayusculas y minusculas
     * no termina hasta que la comprovacion sea  la deseada retorna un nuevo String
     * @param dato
     * @return 
     */    
    public String validacionString(String dato){
        
       String string = dato;
       
      while (true) {
       if (!string.matches("^[a-zA-Z ]+$")){
           
           System.out.println("ERROR dato no valido!!! \n"
                   + "Intentelo de nuevo: ");
           string = leer.nextLine();
           
       } else {
           break;
       }
       
      }       
           return string;
    }
    
}
