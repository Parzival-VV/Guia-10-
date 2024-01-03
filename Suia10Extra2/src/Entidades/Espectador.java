
package Entidades;

import java.util.Objects;

/**
 *Calse Espectador se carga en el objeto Sala para su operacion y respectivas comparaciones.
 * @author Rafael
 */
public class Espectador {
    
    private String nombre;
    private Integer edad;
    private Double dineroDisponible;
    
    public Espectador(){
        
    }
    
    public Espectador(String nombre, Integer edad, Double dineroDisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisponible = dineroDisponible;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setDineroDisponible(Double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public Double getDineroDisponible() {
        return dineroDisponible;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.edad);
        hash = 53 * hash + Objects.hashCode(this.dineroDisponible);
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
        final Espectador other = (Espectador) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        if (!Objects.equals(this.dineroDisponible, other.dineroDisponible)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dineroDisponible=" + dineroDisponible + '}';
    }
    
    
    
    
}
