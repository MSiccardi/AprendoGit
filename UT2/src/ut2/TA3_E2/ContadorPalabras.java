/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut2.TA3_E2;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class ContadorPalabras {

    /** Método para contar palabras de una frase
     * @param lineasArchivo texto a contar palabras
     * @return Cantidad de palabras en el texto "frase"
     */
    public static int cantPalabras (String[] lineasArchivo){
       int cantidadPalabras = 0;
       for(int i=0; i<lineasArchivo.length; i++){
           System.out.println(lineasArchivo[i]);
           cantidadPalabras+=contarPalabras(lineasArchivo[i]);
       }
       return cantidadPalabras;
    }
    
    /**
     * Método que cuenta palabras en una cadena
     * @param frase Frase a contar palabras
     * @return Cantidad de palabras en frase
     */
    public static int contarPalabras(String frase)
    {
        int cont = 0;
        boolean flag = false;
        for (int i = 0; i < frase.length(); i++){
            if ((Character.isLetter(frase.charAt(i)) && (flag == false))){
                cont++;
                flag = true;
            }
            else if (frase.charAt(i) == ' ')
                flag = false;
        }
        return cont;
    }
    
    /**
     * Método que determina si un caracter es vocal
     * @param c Letra a evaluar
     * @return Booleano de si la letra es vocal o no
     */
    public  static boolean esVocal(char c) {
        if (c == 'a' || c == 'e' || c == 'i' ||c == 'o' || c == 'u' || c == 'A' || c == 'E'
                || c == 'I' || c == 'O' || c == 'U'){
            return true;
        }
        return false;
    }
    
    /**
     * Método para contar caracteres en una cadena
     * @param cadena Cadena a contar caracteres
     * @return Cantidad de caracteres en cadena
     */
    public static int[] ContadorCaracteres(String cadena) {
        int[] retorno;
        retorno = new int[]{0,0};        
        for (int i=0; i<cadena.length(); i++){
            if(Character.isLetter(cadena.charAt(i))){
                if(esVocal(cadena.charAt(i))){
                    retorno[0]++;
                } else {
                    retorno[1]++;
                }
            }
        }
        return retorno;
    }
    
    /**
     * Método que devuelve un array con las lineas del archivo e imprime la cantidad de lineas
     * @param nombreArchivo Nombre del archivo a manejar
     * @return Arreglo con lineas del archivo
     * @throws IOException Excepción por la lectura del archivo
     * @throws FileNotFoundException Excepción que toma en cuenta la no existencia del archivo
     */
    public static String[] obtenerLineas(String nombreArchivo) throws IOException, FileNotFoundException{
        int i = 0;
        
        java.io.FileReader archivo = new java.io.FileReader(nombreArchivo);
        java.io.BufferedReader lector = new java.io.BufferedReader(archivo);
        int contador = 0;
        
        while (true){
            String myLine = lector.readLine();
            if (myLine == null ){
                break;
            }
            contador++;
        }
        
        archivo.close();
        archivo = null;
        
        java.io.FileReader archivo2 = new java.io.FileReader(nombreArchivo);
        java.io.BufferedReader lector2 = new java.io.BufferedReader(archivo2);
        
        String [] arreglo = new String[contador];
        
        while (true){
            String myLine = lector2.readLine();
            if (myLine == null ){
                break;
            }
            arreglo[i] = myLine;
            //System.out.println(myLine);
            i++;    
        }
        //System.out.print(i);
        return arreglo;
    }    
}
