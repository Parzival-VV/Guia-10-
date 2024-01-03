
package Entidades;

/**
 *Clase Asiento, se cra para cargar el objeto Sala que contiene una matriz de objetos Asiento
 * @author Rafael
 */
public class Asiento {
    
    private String nombreAsiento;
    private Boolean ocupado;
    private Espectador espectardor;

   public Asiento(){
       
   }
   //constructor del objeto Asiento que pide por parametro el nombre del asiento donde se le asignara
   //la identificacion del lugar en la sala por ejemplo ubicacion: fila: 1 columna: A, el tributo ocupado 
   //nos va a indicar en la asignacion del atributo espectador si el asiento esta ocupado o no. si el objeto espectador 
   //dentro del objeto asiento es diferente de null se asignara el espectador y el valor de ocupado pasara a true.
   public Asiento(String nombreAsiento) {
       this.nombreAsiento = nombreAsiento;
       this.ocupado = false;
       this.espectardor = null;
   }

    public void setNombreAsiento(String nombreAsiento) {
        this.nombreAsiento = nombreAsiento;
    }

    public void setOcupado(Boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void setEspectardor(Espectador espectardor) {
        this.espectardor = espectardor;
    }

    public String getNombreAsiento() {
        return nombreAsiento;
    }

    public Boolean getOcupado() {
        return ocupado;
    }

    public Espectador getEspectardor() {
        return espectardor;
    }

//    @Override
//    public String toString() {
//        return "Asiento{" + "nombreAsiento=" + nombreAsiento + ", ocupado=" + ocupado + ", espectardor=" + espectardor +
//                '}';
//    }
   
    @Override
    public String toString() {
        if (ocupado) {
            return "X"; // Si el asiento está ocupado
        } else {
            return " "; // Si el asiento no está ocupado
        }
    }
    
    
}
