
package Entidades;

import Enum.CPE;

/**
 *Clase pelicula que se carga en objeto Cine
 * @author Rafael
 */
public class Pelicula {
    
    private String titulo;
    private String director;
    private Integer duracion;
    private CPE cpe;
    
    public Pelicula(){
        
    }
    
    public Pelicula(String titulo, String director, Integer duracion, CPE cpe) {
        this.cpe = cpe;
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        
    }

    public void setCpe(CPE cpe) {
        this.cpe = cpe;
    }
    
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }


    public CPE getCpe() {
        return cpe;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Integer getDuracion() {
        return duracion;
    }


    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + ", cpe=" + cpe + '}';
    }


    
    
    
}
