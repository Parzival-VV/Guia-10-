/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.List;

/**
 *Esta clase maneja el proceso de adopcion.
 * @author Rafael
 */
public class Adopcion {
    
    private List<Persona> personas;
    private List<Perro> perros;
    
    public Adopcion(){
        
    }
    
    public Adopcion(List<Persona> personas, List<Perro> perros) {
        this.personas = personas;
        this.perros = perros;
        
    }
    
    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
        
    }
    
    public void setPerros(List<Perro> perros) {
        this.perros = perros;
        
    }
    
    public List<Persona> getPersonas() {
        return personas;
        
    }
    
    public List<Perro> getPerros() {
        return perros;
        
    }
}
