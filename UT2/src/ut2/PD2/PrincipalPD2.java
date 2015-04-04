/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut2.PD2;

import ut2.PD2.Ej1.Planet;
import ut2.PD2.Ej1.Vocal;
import ut2.PD2.Ej1.Consonante;
import ut2.PD2.Ej1.Contador;
import ut2.PD2.Ej2.MazoPD2;
import ut2.PD2.Ej2.CartaPD2;

/**
 *
 * @author MSiccardi
 */
public class PrincipalPD2 {  
    public static void main(String[] args) {
        //Ejercicio 1 - Parte 1
        for (Planet p : Planet.values()){
            System.out.println(p);
        }
    
        //Ejercicio 1 - Parte 2
        System.out.println(Contador.contarVocales("Buenas como esta?"));
        System.out.println(Contador.contarConsonantes("Buenas como esta?"));
        
        //Ejercicio 2
        MazoPD2 mazo = new MazoPD2();
        mazo.mostrarMazo();
        
        //Ejercicio 4
        //Cambiado el length de 3 a 2
        if (args.length == 2) {
            // convert strings to numbers
            //Codigo modificado
            /*float a = (Float.valueOf(args[0])).floatValue(); 
            float b = (Float.valueOf(args[1])).floatValue();*/
            int a = (Integer.valueOf(args[0])).intValue(); 
            int b = (Integer.valueOf(args[1])).intValue();
            // do some arithmetic
            System.out.println("a + b = " +
            (a + b));
            System.out.println("a - b = " +
            (a - b));
            System.out.println("a * b = " +
            (a * b));
            System.out.println("a / b = " +
            (a / b));
            System.out.println("a % b = " +
            (a % b));
        } else {
            System.out.println("This program requires two command-line arguments.");
        } 
        
        //Ejercicio 5
         double d = 888.51;
         String s = Double.toString(d);

         int dot = s.indexOf('.');

         System.out.println(dot + " digits " +
         "before decimal point.");
         System.out.println( (s.length() - dot - 1) +
         " digits after decimal point."); 
         
         //Ejemplos - Ejercicio 6
         System.out.println("Universidad Católica del Uruguay".substring(12,20));
         
         for (String str : "Universidad Católica del Uruguay".split(" ")){
             System.out.println(str);
         }
         
         System.out.println("Universidad Católica del Uruguay".lastIndexOf("a"));
         System.out.println("Universidad Católica del Uruguay".contains("Uru"));
         System.out.println("Universidad Católica del Uruguay".replace('a','J'));
         System.out.println("Universidad Católica del Uruguay, verdad".replaceAll("dad","MOM"));
         
         StringBuilder sb = new StringBuilder();
         sb.append("Hi there!");
         System.out.println(sb.reverse());
         
         //Pruebas ejercicio 9
         String hannah = "Did Hannah see bees? Hannah did."; 
         System.out.println(hannah.charAt(15));
         
         //Pruebas ejercicio 10
         System.out.println("Was it a car or a cat I saw?".substring(9, 12));
         
         //Pruebas ejercicio 11
         String original = "este es el curso de Programación 2";
         StringBuilder result = new StringBuilder("hola");
            int index = original.indexOf('a');
           /*1*/ result.setCharAt(0, original.charAt(0));
           /*2*/ result.setCharAt(1, original.charAt(original.length()-1));
           /*3*/ result.insert(1, original.charAt(4));
           /*4*/ result.append(original.substring(1,4));
           /*5*/ result.insert(3, (original.substring(index, index+2) + " "));
            System.out.println(result); 
         
         
    }
}
