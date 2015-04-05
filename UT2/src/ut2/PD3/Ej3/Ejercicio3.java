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
        String[] lista = cadena.split(" ");
        for (String s : lista){
            switch (s){
                case "2": cad+="A"; break;
                case "22": cad+="B"; break;
                case "222": cad+="C"; break;
                case "3": cad+="D"; break;
                case "33": cad+="E"; break;
                case "333": cad+="F"; break;
                case "4": cad+="G"; break;
                case "44": cad+="H"; break;
                case "444": cad+="I"; break;
                case "5": cad+="J"; break;
                case "55": cad+="K"; break;
                case "555": cad+="L"; break;
                case "6": cad+="M"; break;
                case "66": cad+="N"; break;
                case "666": cad+="O"; break;
                case "7": cad+="P"; break;
                case "77": cad+="Q"; break;
                case "777": cad+="R"; break;
                case "7777": cad+="S"; break;
                case "8": cad+="T"; break;
                case "88": cad+="U"; break;
                case "888": cad+="V"; break;
                case "9": cad+="W"; break;
                case "99": cad+="X"; break;
                case "999": cad+="Y"; break;
                case "9999": cad+="Z"; break;
                case "0": cad+=" "; break;
                case "1": cad+="."; break;
            }                
        }
        return cad;
    }
}
