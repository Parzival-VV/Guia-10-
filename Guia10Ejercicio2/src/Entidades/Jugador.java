/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). 
 */
package Entidades;

import java.util.Objects;

/**
 *
 * @author Rafael
 */
public class Jugador {
    
    private Integer id;
    private String nombre = "Jugador " ;
    private Boolean mojado;
    
    public Jugador() {
        
    }
    
    public Jugador(Integer id) {
        this.id = id;
        this.nombre = "Jugador" + id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }
    
    public Integer getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }    
    
    public Boolean getMojado() {
        return mojado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.mojado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.mojado, other.mojado)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
}
