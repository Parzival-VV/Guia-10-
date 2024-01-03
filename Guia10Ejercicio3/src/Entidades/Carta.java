/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
 */
package Entidades;

/**
 *
 * @author Rafael
 */
public class Carta {
    
    private Integer numero;
    private String palo;
    
    public Carta(){
        
    }
    
    public Carta(Integer numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }
    
    public void setNumero(Integer numero){
        this.numero = numero;
    }
    
    public void setPalo(String palo) {
        this.palo  = palo;
        
    }
    
    public String getPalo(){
        return palo;
        
    }
    
    public Integer getNumero(){
        return numero;
    }

    @Override
    public String toString() {
        return "Carta{" +  numero + " de " + palo + '}';
    }
    

    
}
