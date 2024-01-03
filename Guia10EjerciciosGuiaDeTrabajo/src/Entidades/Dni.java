/*
clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package Entidades;

/**
 *
 * @author Rafael
 */
public class Dni {
    
    private char serie;
    private Integer numero;

    public Dni() {
    }

    public char getSerie() {
        return serie;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    
}
