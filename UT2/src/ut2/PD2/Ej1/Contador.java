/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut2.PD2.Ej1;

/**
 *
 * @author MSiccardi
 */
public class Contador {
        public static int contarVocales(String cadena){
            int contador = 0;
            for (int i=0; i<cadena.length();i++){
                for (Vocal letra : Vocal.values() ){
                    if (cadena.toUpperCase().charAt(i) == letra.toString().charAt(0))
                        contador++;
                }
            } 
            return contador;
        }
    
    public static int contarConsonantes(String cadena){
        int contador = 0;
        for (int i=0; i<cadena.length();i++){
            for (Consonante letra : Consonante.values() ){
                if (cadena.toUpperCase().charAt(i) == letra.toString().charAt(0))
                    contador++;
            }
        } 
        return contador;
    }
    
}
