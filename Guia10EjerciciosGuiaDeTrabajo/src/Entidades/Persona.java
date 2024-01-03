/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package Entidades;

/**
 *
 * @author Rafael
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private Dni dni;
    
    public Persona(){
        
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public void setDni(Dni dni){
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Dni getDni() {
        return dni;
    }
    
    
}
