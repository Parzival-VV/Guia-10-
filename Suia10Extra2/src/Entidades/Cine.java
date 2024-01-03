
package Entidades;

import java.util.List;

/**
 *
 * @author Rafael
 */
public class Cine {
    
    private List<Pelicula> peliculas;
    private Double precioEntrada = 600.00;
    private List<Sala> sala;

    public Cine() {
    }

    public Cine(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public void setPrecioEntrada(Double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public void setSala(List<Sala> sala) {
        this.sala = sala;
    }


    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public Double getPrecioEntrada() {
        return precioEntrada;
    }

    public List<Sala> getSala() {
        return sala;
    }


    @Override
    public String toString() {
        return "Cine{" + "peliculas=" + peliculas + ", precioEntrada=" + precioEntrada + ", sala=" + sala + '}';
    }
    
    
    
    
}
