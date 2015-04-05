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
import ut2.PD3.Ej4.MultiplicadorDeVectores;

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
        ManejadorDeDatos.escribirArchivo(Ejercicio3.codificar("C:/entrada2.txt"), "C:/Datos/salida.txt");
        ManejadorDeDatos.escribirArchivo(Ejercicio3.decodificar(Ejercicio3.codificar(ManejadorDeDatos.leerArchivo2("C:/entrada2.txt"))),"C:/Datos/salida2.txt");
    
        //Ejercicio 4
        /* Primero se debe evaluar que ambos vectores tengan la misma cantidad de elementos
           Luego se debe verificar que ambos vectores contengan elementos de tipo int (error de compilación)
           Finalmente se realiza la multiplicacion de ambos vectores y se coloca el resultado
           en un vector resultado
        */ 
        int [] a1 = {1,2,3,4};
        int [] a2 = {3,2,1,4};
        MultiplicadorDeVectores.imprimirVectorEntero(MultiplicadorDeVectores.multiplicarVectoresEnteros(a1, a2));
    
    }
}
