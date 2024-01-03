
package Service;

import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import Entidades.Sala;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Rafael
 */
public class SalaService {

    /**
     * Este metodo crea una sala llama al metodo espectadores que devuelve set de espectadores
     * completo con todos los datos cargados de manera aleatoria incluida la cantidad de espectadores
     * hace las verificaciones correspondientes, se llena la sala con espectadores validos, se agrega la pelicula 
     * a la sala  y por ultimo se agrega la sala ya completa al objeto cine que viene por parametro
     *
     * @param cine donde se va a agregar la sala
     * @param pelicula datos que se van a comparar contra los espectadores.
     * @return 
     */
    public Sala llenarSala(Cine cine, Pelicula pelicula) {

        ArrayList<Espectador> rechazados = new ArrayList();
        ArrayList<Espectador> prueba = new ArrayList();



        EspectadorService Es = new EspectadorService();
        HashSet<Espectador> espectadores = (Es.espectadores());
        
        Sala sala = new Sala();
        
        sala.setEspectadores(espectadores);
       
        sala.setPelicula(pelicula);

        Iterator<Espectador> iter = sala.getEspectadores().iterator();
        
        while (iter.hasNext()) {
            
            Espectador esp = iter.next();
            prueba.add(esp);
        }
            
        for (int i = 0; i < sala.getAsientos().length; i++) {

            for (int j = 0; j < sala.getAsientos()[i].length; j++) {

                if (sala.getPelicula().getCpe().getCodigo() < prueba.get(i).getEdad() && cine.getPrecioEntrada() < prueba.get(i).getDineroDisponible()) {
                    if (!sala.getAsientos()[i][j].getOcupado()) {
                        sala.getAsientos()[i][j].setEspectardor(prueba.get(i));
                        sala.getAsientos()[i][j].setOcupado(true);

                    }

                } else {

                    rechazados.add(prueba.get(i));
                }

            }

        }
        
        System.out.println("Espectadores que no cumplen la condicion de edad o no tienen suficiente dinero: \n");

        for (int i = 0; i < rechazados.size(); i++) {

            System.out.println("Nombre: " + rechazados.get(i).getNombre() + ", Edad: " + rechazados.get(i).getEdad() + ", Diner disponible: " + rechazados.get(i).getDineroDisponible());

        }
        System.out.println(Arrays.deepToString(sala.getAsientos()));
        return sala;
    }
    /**
     * Muestra por pantalla la sala con los asiento y marca con un X si esta ocupado u un espacio si esta libre.
     * 
     * @param sala 
     */
    public void imprimirSala(Sala sala){
        
        for (int i = 0; i < sala.getAsientos().length; i++) {
            for (int j = 0; j < sala.getAsientos()[i].length; j++) {
                
                String ocupado;
                if (sala.getAsientos()[i][j].getOcupado()) {
                    ocupado = "X";
                } else {
                    ocupado = " ";
                }
                
                System.out.print(sala.getAsientos()[i][j].getNombreAsiento() + ocupado + " | ");
                
                if (i == 5) {
                    
                    System.out.println("");
                }
                
                
            }
            
        }
        
        
    }
    
}
