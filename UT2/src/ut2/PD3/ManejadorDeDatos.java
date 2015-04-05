/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut2.PD3;

import java.io.*;

/**
 *
 * @author MSiccardi
 */
public class ManejadorDeDatos {
    public static String[] leerArchivo (String nomArchivo, int largoLista) throws 
            FileNotFoundException, IOException {
        String[] myLectura = new String[largoLista];
        FileReader lector = new FileReader(nomArchivo);
        BufferedReader entrada = new BufferedReader(lector);
        for (int i=0; i<largoLista; i++){
            String s = entrada.readLine();
            if (s == null)
                break;
            else
                myLectura[i] = s;
        }
        return myLectura;
    }
    
    public static String leerArchivo2 (String nomArchivo) throws 
            FileNotFoundException, IOException {
        String myLectura = "";
        FileReader lector = new FileReader(nomArchivo);
        BufferedReader entrada = new BufferedReader(lector);
        while (true) {
            String s = entrada.readLine();
            if ( s == null)
                break;
            else
                myLectura+=s+" ";
        }
        return myLectura;
    }
    
    public static void escribirArchivo (String aEscribir, String nomArchivo) throws
            IOException {
        FileWriter lector = new FileWriter(nomArchivo);
        BufferedWriter bw = new BufferedWriter(lector);
        PrintWriter salida = new PrintWriter(bw);
        salida.println(aEscribir);
        salida.close();
    }
}
