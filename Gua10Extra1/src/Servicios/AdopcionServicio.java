/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package Servicios;

import Entidades.Adopcion;
import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *Clase de servicio para el proceso de adopcion.
 * 
 * @author Rafael
 */
public class AdopcionServicio {
    Scanner leer = new Scanner(System.in);
    //Creo este metodo que me devuelve un objeto "Adopcion" que contiene un arrayList de objetos perro y otro de objetos persona
    //el objetivo es tener los datos cargados para aplicar al ejercicios sin tener que cargarlos por teclado ya que el objetivo en 
    //este caso es probar los metodos con los datos mencionados.
 
    public Adopcion adoptar(){
        
        Adopcion adoptar = new Adopcion();

        ArrayList<Perro> perritos = new ArrayList();

        Perro P1 = new Perro("Olaf", null, null, null, Boolean.FALSE);
        perritos.add(P1);
        Perro P2 = new Perro("Polar", null, null, null, Boolean.FALSE);
        perritos.add(P2);
        Perro P3 = new Perro("Sam", null, null, null, Boolean.FALSE);
        perritos.add(P3);
        Perro P4 = new Perro("Leon", null, null, null, Boolean.FALSE);
        perritos.add(P4);
        Perro P5 = new Perro("Oto", null, null, null, Boolean.FALSE);
        perritos.add(P5);
        Perro P6 = new Perro("Porota", null, null, null, Boolean.FALSE);
        perritos.add(P6);
        
        adoptar.setPerros(perritos);
        
        ArrayList<Persona> personas = new ArrayList();
        
        Persona Pe1 = new Persona("Rafael", null, null, null);
        personas.add(Pe1);
        Persona Pe2 = new Persona("Geor", null, null, null);
        personas.add(Pe2);
        Persona Pe3 = new Persona("Zoe", null, null, null);
        personas.add(Pe3);
        
        adoptar.setPersonas(personas);
        
        return adoptar;

    }
    
    
    /**
     * 
     * @param adoptar objeto que tiene datos de perros y personas.
     * @param P1 persona que va adoptar el perrito.
     */
    public void adopcion(Adopcion adoptar, Persona P1) {
        
        System.out.println("\n*****PERRITOS EN ADOPCION*****\n");
        
        for (int i = 0; i < adoptar.getPerros().size(); i++) {
            
            System.out.println("Nombre : " + adoptar.getPerros().get(i).getNombre());
            
        }
        
        String nombrePerro;
        
        //como todavia no manejo manipulacion de excepciones uso este bloque de codigo
        //para validar la entrada de dato con un bucle y una expresion regular
        while (true) {
            boolean match = false;

            System.out.println("\nHaga su eleccion ingresando por teclado el nombre de uno de los perritos: ");
            nombrePerro = leer.next();
            
            for (int i = 0; i < adoptar.getPerros().size(); i++) {
                if (adoptar.getPerros().get(i).getNombre().equalsIgnoreCase(nombrePerro)) {
                    match = true;
                    break;
                } 
            }

            if (!nombrePerro.matches("^[a-zA-Z]+$") || !match) {

                System.out.println("\nERROR Dato no valido.");

            } else {

                break;
            }

        }
        
        for (int i = 0; i < adoptar.getPerros().size(); i++) {
            
            if (adoptar.getPerros().get(i).getNombre().equalsIgnoreCase(nombrePerro)) {
                
                if (!adoptar.getPerros().get(i).getAdoptado()) {
                    
                    P1.setPerro(adoptar.getPerros().get(i));
                    
                    P1.getPerro().setAdoptado(true);
                    
                    System.out.println("\nEl Perro fue adoptado por: " + P1.getNombre());
                    
                    break;
                    
                } else {
                    
                    System.out.println("\nEL ya fue adoptado por otra persona");
                }
            }
            
        }
        
        
        
    }
    /**
     * metodo que muestra las personas con sus perritos y los perritos que no fueron adoptados.
     * 
     * 
     * @param adoptar contiene los datos a mostrar
     */
    public void mostrar(Adopcion adoptar) {
        
        System.out.println("\n-----DATOS DE ADOPCION-----\n");
        
        for (int i = 0; i < adoptar.getPersonas().size(); i++) {
            
            System.out.println("\nNombre de la persona: " + adoptar.getPersonas().get(i).getNombre() + " Perro: " + adoptar.getPersonas().get(i).getPerro().getNombre());
            
            
        }
        
        System.out.println("\n-----PERRITOS QUE NO FUERON ADOPTADOS-----\n");
        
        for (int i = 0; i < adoptar.getPerros().size(); i++) {
            
            if (!adoptar.getPerros().get(i).getAdoptado()) {
                System.out.println("\nNombre del perrito: " + adoptar.getPerros().get(i).getNombre());
            }
        }
        
        
    }

}
