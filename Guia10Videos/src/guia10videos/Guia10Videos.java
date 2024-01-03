/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10videos;

import Entidades.Mascota;
import Entidades.Usuario;
import MascotaEnumeraciones.RazaGatuna;
import MascotaEnumeraciones.RazaPerruna;
import MascotaEnumeraciones.SexoHumano;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class Guia10Videos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // COMO RECORRER LOS ENUM:
        //CON FOREACH:
        
        /*Lo que hacemos es decirle que recorra enum RazaPerruna en la variable aux
        RazaPerruna.values nos trae toda la numeracion del enum raza en forma de array  asi nos queda a disposicion para manipularlo
        El metodo valueof() seria RazaPerruna.valueof() le psamos por parametro escrito correctament uno de los atributos estaticos y si lo 
        encuentra evuelve true.*/
        
//        String razaInput = "BEAGLE";
        
//        for (RazaPerruna aux : RazaPerruna.values()) {
//            
//            //Ejemplo de logica dentro del foreach:
//            //simulo una entrada por teclado para ver si una raza es igual a la otro.
//            /*Lo siguiente seria comprobar el String declarado fuera del bucle con la variable aux de tipo RazaPerruna(enum),
//            para eso usamos un condicional if y el metodo toStrnig() para convertir la variable aux en el dato indicado para la comparacion*/
//            
//            if(aux.toString().equals(razaInput)) {
//                
//                System.out.println("\nRaza input es igua al enum: " + aux);
//                
//            }
//            //colocamos un sout de la variable aux y nos va a mostrar  los valores que posee el enum RazaPerruna
//            
//            //System.out.println(aux);
//            
//            //otro metodo ordinal(); por ejemplo si hacemosun saout de la variable aux.ordinal,
//            //nos va a traer por pantalla las posiciones de cada elemento de enum
//            
//            System.out.println(aux.ordinal());
//            
//            //A tener en cuenta siempre que trabajamos con enum que no siempre son el mismos
//            //tipo de dato y abra que convertirlo a nuestra necesidad
//            
//            
//        }

        //NUEVO USUARIO, modificar sexo (enum)
        
        Usuario U1 = new Usuario();
        
        //Seteamos el sexo:
        
        //U1.setSexo(SexoHumano.HOMBRE);
        
        //Listo nuestro objeto ya tiene el enum sexoHumano definido, para verlo lo siguiente:
        
        //System.out.println(U1.getSexo());
        
        //A continuacion mostramos como acceder a los atributos del enum con un sout para ejemplificar.
        
        System.out.println(RazaPerruna.BEAGLE.getValor());
        
        //Genericos
        /*Lo que vemos en las listas <> entre esos simbolos sinavegamos a la clase
        nos encontramos por ej, que tiene una t eso quiere decir que la lista va a se del tipo de dato que este entre esos simbolos*/
        
        
        /*En las siguientes luneas vemos como operar los atributos genericos creados
        
        Para especificar el generico se coloca el tipo de dato entre <>
        antes de los parentesis del constructor, en este cazo le vamos a colocar un enum*/
        Mascota M1 = new Mascota<RazaPerruna>("Fer", "Chiquito", "Perro");
        //El set del atributo generico nos pide por parametro un objeto al cual vamos acceder para lograr
        //setear el objeto para obtener el dato deseado 
        M1.setRaza(RazaPerruna.BEAGLE);
        
        System.out.println(M1.toString());
        
        Mascota M2 = new Mascota<RazaGatuna>("Pepa", "Filomena", "Gato");
        
        M2.setRaza(RazaGatuna.NARAMJOSO);
        
        System.out.println("");
        System.out.println(M2.toString());
        System.out.println("");
        
        
        /*UML: es un diagrama que nos permite ver como inetractuan las clases entre si y de que forma
        */
        
        List<Mascota> mascotas = new ArrayList();
        mascotas.add(M1);
        mascotas.add(M2);
        
        
        U1.setApellido("Barresi");
        U1.setSexo(SexoHumano.HOMBRE);
        U1.setNacimiento(new Date("05/13/1985"));
        
        U1.setMascotaFavorita(M1); // aca estableci la relacion entre objetos osea al usuario U1 lo Vincule a travez
        //del atributo mascotaFavorita con un objeto mascota
        
        //En la siguiente linea estamos creando la relacion entre la lista mascotas y el atributo del usuario Mascotas que recibe un lista
        //porque las mascotas 1 y 2 tienen que ser parte de las mascotas del usuario
        U1.setMascotas(mascotas);
        System.out.println("");
        System.out.println(U1.toString());
    }
    
}
