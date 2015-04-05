/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut2.PD3.Ej2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;
import java.math.*;
import ut2.PD3.ManejadorDeDatos;
/**
 *
 * @author MSiccardi
 */
public class Ejercicio2 {
    public static void partea() throws FileNotFoundException, IOException{
        String[] miEntrada = ManejadorDeDatos.leerArchivo("C:/entrada.txt", 4);
        //Cambiar a int
        float a = Float.parseFloat(miEntrada[0]);
        float b = Float.parseFloat(miEntrada[1]);
        String c = miEntrada[3];
        System.out.printf("El entero leido es: %f%n",a);
        System.out.printf("El numero de punto flotante es: %f%n",b);
        System.out.printf("La cadena leida es: %s%n",c);
        System.out.printf("Hola %s ! La suma de %f y %f es %f%n",c,a,b,a+b);
        //Buscar division entera
        System.out.printf("La division entera de %f y %f es %f y su resto es %f%n",b,a,b/a,b%a);
    }
    
    public static void parteb() throws IOException {
        InputStreamReader lector = new InputStreamReader(System.in);
        BufferedReader entrada = new BufferedReader(lector);
        System.out.println("Ingrese radio de la CFA");
        float r = Float.parseFloat(entrada.readLine());
        System.out.printf("El area de su CFA es: %f%nEl perimetro de su CFA es: %f",r*r*3.141592,2*r*3.141592);
    }
}
