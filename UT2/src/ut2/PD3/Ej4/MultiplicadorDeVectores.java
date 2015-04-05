/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut2.PD3.Ej4;

/**
 *
 * @author Usuario
 */
public class MultiplicadorDeVectores {
    public static int[] multiplicarVectoresEnteros (int[] a1, int[] a2){
        int [] result;
        if (a1.length != a2.length)
            return null;
        result = new int[a1.length];
        for (int i = 0; i<a1.length; i++)
            result[i] = a1[i]*a2[i];
        return result;
    }
    
    public static void imprimirVectorEntero (int[] a){
        for (int i = 0; i<a.length; i++)
            System.out.println(a[i]);
    }
}

  