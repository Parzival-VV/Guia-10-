/*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package Entidades;

/**
 *
 * @author Rafael
 */
public class Revolver {
    
    Integer posActual;
    Integer posAgua;

    public Revolver() {
    }

    public Integer getPosActual() {
        return posActual;
    }

    public Integer getPosAgua() {
        return posAgua;
    }

    public void setPosActual(Integer posActual) {
        this.posActual = posActual;
    }

    public void setPosAgua(Integer posAgua) {
        this.posAgua = posAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }
    
    
    
}
