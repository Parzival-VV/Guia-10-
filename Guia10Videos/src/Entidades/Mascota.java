/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import MascotaEnumeraciones.RazaPerruna;
import MascotaEnumeraciones.SexoAnimal;
import java.util.Objects;

/**
 *
 * @author Rafael
 */
public class Mascota <T> implements Comparable<Mascota>{
    /*Lo que hago con <T> es indicarle a la clase mascota que tiene un atributo generico
    que tipo de dato va a ser raza? en este ejemplo usamos el atributo raza como el generico
    no sabemos aun hasta que sea declarado*/
    private String nombre;
    private String apodo;
    private String tipo;
    private String color;
    private Integer edad;
    private T raza;
    private SexoAnimal sexo;
    
    private int energia;
    
    public Mascota(){
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        
        if (tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro") || tipo.equals("Conejo") || tipo.equals("Carpincho")) {
            this.tipo = tipo;
        }
        
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo, String color, Integer edad, RazaPerruna T, SexoAnimal sexo, int energia) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.raza = raza;
        this.sexo = sexo;
        this.energia = energia;
    }
    
    public void setNombre(String nombre){
        if (nombre.length() > 0) {
            this.nombre = nombre;
        }
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setRaza(T raza) {
        this.raza = raza;
    }

    public void setSexo(SexoAnimal sexo) {
        this.sexo = sexo;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public Integer getEdad() {
        return edad;
    }

    public T getRaza() {
        return raza;
    }

    public SexoAnimal getSexo() {
        return sexo;
    }

    public int getEnergia() {
        return energia;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        hash = 17 * hash + Objects.hashCode(this.apodo);
        hash = 17 * hash + Objects.hashCode(this.tipo);
        hash = 17 * hash + Objects.hashCode(this.color);
        hash = 17 * hash + Objects.hashCode(this.edad);
        hash = 17 * hash + Objects.hashCode(this.raza);
        hash = 17 * hash + Objects.hashCode(this.sexo);
        hash = 17 * hash + this.energia;
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
        final Mascota other = (Mascota) obj;
        if (this.energia != other.energia) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apodo, other.apodo)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        if (this.raza != other.raza) {
            return false;
        }
        if (this.sexo != other.sexo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", raza=" + raza + ", sexo=" + sexo + ", energia=" + energia + '}';
    }
    
    @Override
    public int compareTo(Mascota o) {
        return o.getNombre().compareTo(this.nombre);
    }
    
    
    
    
}
