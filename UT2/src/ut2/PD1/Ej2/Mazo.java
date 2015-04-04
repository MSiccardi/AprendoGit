/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut2.PD1.Ej2;

/**
 *
 * @author MSiccardi
 */
public class Mazo {
    public Carta[][] cartas;
    public static int hola;
    public Mazo(){
        cartas = new Carta[4][12];
        for (int i=Carta.ORO; i<=Carta.BASTO; i++){
            for (int j=1; j<=12; j++){
                cartas[i-1][j-1] = new Carta(i,j);
            }
        }
    }
    
    public Carta sacarCarta(int palo, int numero) {
        return cartas[palo][numero];
    }
    
    public void mostrarMazo(){
        for (int i = 0; i<4; i++){
            for (int j = 0; j<12; j++){
                System.out.println((this.sacarCarta(i, j)).datoCarta());
            }
        }
    }
}
