/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut2.PD2.Ej2;

/**
 *
 * @author MSiccardi
 */
public class MazoPD2 {
    private CartaPD2[][] cartas;
    
    public MazoPD2(){
        cartas = new CartaPD2[4][12];
        for (Palo p : Palo.values()){
            for (Numero n : Numero.values()){
                cartas[p.paloToInt()-1][n.numeroToInt()-1] = new CartaPD2(p,n);
            }
        }
    }
    
    public void mostrarMazo(){
        for (int i=0; i<Palo.BASTO.paloToInt(); i++){
            for (int j=0; j<Numero.REY.numeroToInt(); j++){
                System.out.println(cartas[i][j].datoCarta());
            }
        }
    }
}
