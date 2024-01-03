/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import MascotaEnumeraciones.SexoHumano;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class Usuario {
    
    private String nombre;
    private String apellido;
    private Integer dni;
    private Date nacimiento;
    private String pais;
    private SexoHumano sexo;
    private List<Mascota> mascotas;
    private Mascota mascotaFavorita;
    //DE ESTA SENCILLA MANERA VINCULAMOS LA CLASE USUARIO CON LA CLASE MASCOTA
    //DECLARANDO COMO ATRIBUTO DE LA CLASE USUARIO UN OBJETO DE TIPO MASCOTA.
    //private Mascota mascota;

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public Mascota getMascotaFavorita() {
        return mascotaFavorita;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void setMascotaFavorita(Mascota mascotaFavorita) {
        this.mascotaFavorita = mascotaFavorita;
    }
    
    
    
    public Usuario () {
        
    }

    public Usuario(String nombre, String apellido, Integer dni, Date nacimiento, String pais, SexoHumano sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
        this.sexo = sexo;
    }
    
    public void setSexo(SexoHumano sexo) {
        this.sexo = sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public SexoHumano getSexo(){
        return sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", nacimiento=" + nacimiento + ", pais=" + pais + ", sexo=" + sexo + ", mascotas=" + mascotas + ", mascotaFavorita=" + mascotaFavorita + '}';
    }
    
    
    
}
