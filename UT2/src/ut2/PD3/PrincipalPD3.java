/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut2.PD3;
import ut2.PD3.Ej1.Tablero;
import ut2.PD3.Ej2.Ejercicio2;
import java.io.IOException;
import java.io.FileNotFoundException;
import ut2.PD3.Ej3.Ejercicio3;
 
/**
 *
 * @author MSiccardi
 */

public class PrincipalPD3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Ejercicio 1 - Prueba
        Tablero.imprimirTablero('#');
        
        //Ejercicio 2 - Parte a
        Ejercicio2.partea();
        
        //Ejercicio 2 - Parte b
        //Ejercicio2.parteb();
        
        //Ejercicio 3
        System.out.println(Ejercicio3.codificar("Universiad Uruguay."));
        ManejadorDeDatos.escribirArchivo(Ejercicio3.codificar("Universiad Uruguay."), "C:/Datos/salida.txt");
    }
}
