/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class Baraja {

    private List<Carta> baraja;

    public Baraja() {

        ArrayList<Carta> cartas = new ArrayList();

        for (int i = 0; i < 4; i++) {
            
            for (int j = 1; j <= 12; j++) {
                
                if (j != 8 && j != 9) {
                    String palo = null;
                    
                    switch (i) {
                        case 0:
                            palo = "Basto";
                            break;
                        case 1:
                            palo = "Copa";
                            break;
                        case 2:
                            palo = "Espada";
                            break;
                        case 3:
                            palo = "Oro";
                            break;
                        default:
                            break;
                    }
                    Carta C1 = new Carta(j, palo);
                    cartas.add(C1);

                }
            }

        }  
        baraja = cartas;

    }
    
    public Baraja(List<Carta> baraja) {
        this.baraja = baraja;
    }
    
    public List<Carta> getBaraja(){
        return baraja;
    }
    
    public void setBaraja(List<Carta> baraja){
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Baraja{" + "baraja=" + baraja + '}';
    }
    
    
}
