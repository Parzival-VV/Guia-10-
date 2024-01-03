/*
 * To change this license header, choose License Headers in Project Propert
 */
package AsociacionRecursiva;

import java.util.List;

/**
 *
 * @author Rafael
 */
public class Persona {
    
    //Asoaciacion reflexiva o recursiva.
    //Caracteristicas: En un diagrama uml vamos a encontrar que la clase persona 
    //se conecta a si misma de esta manera establecemos la relacion recursiva.
    
    
    //En este ejemplo la clase persona tiene como atributo una lista de amigos 
    //estos amigos son otros objetos Persona osea que a clase Persona se relaciona a sei misma
    //esto es lo que se conoce como reflexivo o recursivo
    
    private List<Persona> amigos;
    
    //Es aparte una asociacion de agregacion ya que si una clase muero no los objetos dentro de la lista amigos
    
}
