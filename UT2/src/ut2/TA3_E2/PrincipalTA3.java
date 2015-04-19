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
public class PrincipalTA3 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        ContadorPalabras.cantPalabras(ContadorPalabras.obtenerLineas("C:/Users/Usuario/Desktop/entrada.txt"));
    }
}
