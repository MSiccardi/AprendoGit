/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut2.PD3.Ej1;

/**
 *
 * @author MSiccardi
 */
public class Tablero {
    public static int largo = 7;
    public static int ancho = 7;
    
    public static void imprimirTablero(char ch){
        for (int i=0; i<ancho; i++){
            for (int j=0; j<ancho; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
