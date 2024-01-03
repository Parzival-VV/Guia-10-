
package Service;

import Entidades.Espectador;
import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author Rafael
 */
public class EspectadorService {
    
        /**
     * Este metodo crea un set de Espectadores de tamaño aleatorio, y la carga de atributos con datos aleatorios.
     * @return 
     */
    public HashSet<Espectador> espectadores() {
        
        String[] nombres = {"Rafael", "Agustina", "Gabriel", "Matias", "Roxana", "Luz", "Javier", "Paula",
                            "Tomas", "Maria", "Juan", "Pedro", "Victoria", "Georgina", "Luisana", "Pablo",
                            "Martin", "Hernan", "Natalia", "Susana", "Naruto", "Luffy", "Usop", "Nami",
                            "Lorena", "Diego", "Mateo", "Geremias", "Isabela", "Tiziano", "Zoe", "Angelina",
                            "Saulo", "Manuel", "Barbara", "Florencia", "Liliana", "Eduardo", "Cristian",
                            "Oriana", "Elena", "Adrian", "Fernando", "Marta", "Hector", "Lucia", "Leonardo",};
        
        Random random = new Random();
        
        int cantEspectadores = random.nextInt(48) + 1;
        
        HashSet<Espectador> espectadores = new HashSet();
        
        while (espectadores.size() < cantEspectadores) {
            
            String nombreAleatorio = nombres[random.nextInt(nombres.length)];

            int edadAleatoria = random.nextInt(60) + 6;

            double dineroDisponibleAleatorio = random.nextDouble() * (1200 - 300) + 300;
            dineroDisponibleAleatorio = Math.round(dineroDisponibleAleatorio * 100.0) / 100.0;
            
            espectadores.add(new Espectador(nombreAleatorio, edadAleatoria, dineroDisponibleAleatorio));
            

        }
        
        return espectadores;
    }
    
}
