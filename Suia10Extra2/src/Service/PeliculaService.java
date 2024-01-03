
package Service;

import Entidades.Cine;
import Entidades.Pelicula;
import Enum.CPE;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class PeliculaService {
    
        private Scanner leer = new Scanner(System.in);
    

        /**
         * crea peliculas con sus atributos ingresados por teclado, se agrega a un arrayList y se agrega a l objeto cine
         * @return  
         */
        public ArrayList<Pelicula> crearPelicula(){
        
        ArrayList<Pelicula>peliculas = new ArrayList();
        
        System.out.println("\n******CARGA DE PELICULAS******\n");
        
        boolean salir = false;
        
        while (!salir) {
            
            Pelicula P1 = new Pelicula();
            
            System.out.println("\nNombre:");
            
            String titulo = validacionString(leer.nextLine());
            P1.setTitulo(titulo);
            
            System.out.println("Director: ");
            
            String director = validacionString(leer.nextLine());
            P1.setDirector(director);
            
            System.out.println("Duracion en minutos: ");
            
            Integer duracion = validarInteger(leer);
            P1.setDuracion(duracion);
            
            System.out.println("\n******INGRESO DE EDAD PARA CONTROL******" + "\n\n"
                    + "Eliga una de las opciones: " + "\n"
                    + "1- Apto para todo publico 'ATP'. " + "\n"
                    + "2- Apto con supervicion de los padres 'PG'. " + "\n"
                    + "3- Apto para mayores de 13 años 'PG13'. " + "\n"
                    + "4- Apto para mayores de 16 años 'NC16'. " + "\n"
                    + "5- Apto para mayores de 18 años 'M18'. " + "\n"
                    + "OPCION: ");
            Integer opcion = null ;
            
            do{
                
                opcion = validarInteger(leer);
                
                if (opcion > 5) {
                    
                    System.out.println("El numero ingresado esta fuera de rango;");
                    
                }
                
            }while (opcion < 1 || opcion > 5);
            
             
            
            switch (opcion) {
                
                case 1:
                    
                    P1.setCpe(CPE.ATP);
                    
                    break;
                    
                case 2:
                    
                    P1.setCpe(CPE.PG);
                    
                    break;
                    
                case 3: 
                    
                    P1.setCpe(CPE.PG13);
                    
                    break;
                    
                case 4:
                    
                    P1.setCpe(CPE.NC16);
                    
                    break;
                    
                case 5:
                    
                    P1.setCpe(CPE.M18);
                    
                    break;
                    
                default:
                    break;
            }
            
            System.out.println(P1.toString());
            
            String respuesta = null;
            
            System.out.println("\nDesea agregar otra pelicula SI o NO?");
            
            do{
                
             respuesta = validacionString(leer.nextLine());
             
             if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")){
                 System.out.println("Ingrese respuesta correcta");
             }
             
            }while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));
            
            if (respuesta.equalsIgnoreCase("no")) {
                
                salir = true;
            }
            
            peliculas.add(P1);
            
        }
          
        return peliculas;
    }
    
    
        /**
     * valida que lo que viene por teclado sea un entero y no termina hasta que asi sea.
     *
     * @param leer
     * @return Integer validado.
     */
        public Integer validarInteger(Scanner leer) {
        
        Integer integer = 0;
        
        while (true) {
           
            if(leer.hasNextInt()) {
                integer = leer.nextInt();
                leer.nextLine();
                 break;
    
            } else {
                
                System.out.println("ERROR dato no valido \n"
                                 + "Intentelo de nuevo: ");
                leer.nextLine();
            }
            
        }
           
        return integer;
    }
    
    /**
     * valida que el dato ingresado sea String, puede contener espacios, mayusculas y minusculas
     * no termina hasta que la comprovacion sea  la deseada retorna un nuevo String
     * @param dato
     * @return 
     */    
    public String validacionString(String dato){
        
       String string = dato;
       
      while (true) {
       if (!string.matches("^[a-zA-Z ]+$")){
           
           System.out.println("ERROR dato no valido!!! \n"
                   + "Intentelo de nuevo: ");
           string = leer.nextLine();
           
       } else {
           break;
       }
       
      }       
           return string;
    }
    
}
