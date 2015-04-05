/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut2.PD3.Ej3;

/**
 *
 * @author MSiccardi
 */
public class Ejercicio3 {
    public static String codificar(String cadena){
        String cad = "";
        for (int i=0; i<cadena.length(); i++){
            switch (cadena.toUpperCase().charAt(i)){
                case 'A': cad+="2 "; break;
                case 'B': cad+="22 "; break;
                case 'C': cad+="222 "; break;
                case 'D': cad+="3 "; break;
                case 'E': cad+="33 "; break;
                case 'F': cad+="333 "; break;
                case 'G': cad+="4 "; break;
                case 'H': cad+="44 "; break;
                case 'I': cad+="444 "; break;
                case 'J': cad+="5 "; break;
                case 'K': cad+="55 "; break;
                case 'L': cad+="555 "; break;
                case 'M': cad+="6 "; break;
                case 'N': cad+="66 "; break;
                case 'O': cad+="666 "; break;
                case 'P': cad+="7 "; break;
                case 'Q': cad+="77 "; break;
                case 'R': cad+="777 "; break;
                case 'S': cad+="7777 "; break;
                case 'T': cad+="8 "; break;
                case 'U': cad+="88 "; break;
                case 'V': cad+="888 "; break;
                case 'W': cad+="9 "; break;
                case 'X': cad+="99 "; break;
                case 'Y': cad+="999 "; break;
                case 'Z': cad+="9999 "; break;
                case ' ': cad+="0 "; break;
                case '.': cad+="1 "; break;
            }
        }
        return cad;
    }
    
    public static String decodificar(String cadena){
        String cad = "";
        String[] lista = cadena.split('0');
        for (int i=0; i<lista.length(); i++){
            for (String s : lista[i])
                
        }
        return cad;
    }
}
