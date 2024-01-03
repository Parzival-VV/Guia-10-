/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package Entidades;

/**
 *clase que contiene la informacion de los perritos en adopcion.
 * @author Rafael
 */
public class Perro {
    private String nombre;
    private String raza;
    private Integer edad;
    private String tamanio;
    private Boolean adoptado;

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, String tamanio, Boolean adoptado) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.adoptado = adoptado;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getTamanio() {
        return tamanio;
    }
    
    public Boolean getAdoptado(){
        return adoptado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    
    public void setAdoptado(Boolean adoptado) {
        this.adoptado = adoptado;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + ", adoptado=" + adoptado + '}';
    }
    
    
    
    
}

