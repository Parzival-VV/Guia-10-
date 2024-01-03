/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package guia10ejercicio1;

import Entidades.Perro;
import Entidades.Persona;

/**
 *
 * @author Rafael
 */
public class Guia10Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona P1 = new Persona("Rafael", "Barresi", 45896327, 28);
        Persona P2 = new Persona("Georgina", "Erquiaga", 25478968, 26);
        
        Perro polar = new Perro("Polar", "Border collie", 2, "Mediano");
        Perro olaf = new Perro("Olaf", "Pekinez", 2, "Chico");
        
        P1.setPerro(polar);
        P2.setPerro(olaf);
        
        System.out.println("-------INFORMACION DESDE OBJETO PERSONA-------" + "\n\n"
                + "PERSONA: " + "\n"
                + "Nombre: "   + P1.getNombre() +"\n"
                + "Apellido: " + P1.getApellido() + "\n"
                + "D.N.I: "    + P1.getDni() + "\n"
                + "Edad: "     + P1.getEdad() + "\n\n"
                + "-----DATOS PERRO " + P1.getNombre() + "-----\n\n"
                + "Nombre: "   + P1.getPerro().getNombre() + "\n"
                + "Raza: "     + P1.getPerro().getRaza() + "\n"
                + "Edad: "     + P1.getPerro().getEdad() + "\n"
                + "Tamaño: "   + P1.getPerro().getTamanio() + "\n\n"
                        
                + "-----INFORMACION DESDE OBJETO PERSONA-----" + "\n\n"
                        
                               + "PERSONA: " + "\n"
                        
                + "Nombre: "   + P2.getNombre() +"\n"
                + "Apellido: " + P2.getApellido() + "\n"
                + "D.N.I: "    + P2.getDni() + "\n"
                + "Edad: "     + P2.getEdad() + "\n\n"
                        + "-----DATOS PERRO " + P2.getNombre() + "-----\n\n"
                + "Nombre: "   + P2.getPerro().getNombre() + "\n"
                + "Raza: "     + P2.getPerro().getRaza() + "\n"
                + "Edad: "     + P2.getPerro().getEdad() + "\n"
                + "Tamaño: "   + P2.getPerro().getTamanio() + "\n\n");
        
        
    }
    
}
