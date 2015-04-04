/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut2.PD1;

import ut2.PD1.Ej2.Carta;
import ut2.PD1.Ej2.Mazo;
import ut2.PD1.Ej3.Rectangle;
import ut2.PD1.Ej4.NumberHolder;

//java -ea UT2.class;
/**
 *
 * @author MSiccardi
 */
public class Principal {
    
    public static void probarCartas(){
        //Pruebas con assert para verificar que los numeros sean los que deben
        
        assert "Uno".equals(Carta.numeroToString(1));
        assert "Dos".equals(Carta.numeroToString(2));
        assert "Tres".equals(Carta.numeroToString(3));
        assert "Cuatro".equals(Carta.numeroToString(4));
        assert "Cinco".equals(Carta.numeroToString(5));
        assert "Seis".equals(Carta.numeroToString(6));
        assert "Siete".equals(Carta.numeroToString(7));
        assert "Ocho".equals(Carta.numeroToString(8));
        assert "Nueve".equals(Carta.numeroToString(9));
        assert "Sota".equals(Carta.numeroToString(10));
        assert "Caballo".equals(Carta.numeroToString(11));
        assert "Rey".equals(Carta.numeroToString(12));
        
        assert "Oro".equals(Carta.paloToString(Carta.ORO));
        assert "Espada".equals(Carta.paloToString(Carta.ESPADA));
        assert "Copa".equals(Carta.paloToString(Carta.COPA));
        assert "Basto".equals(Carta.paloToString(Carta.BASTO));
    }
    
    public static void main(String[] args) {
        //Ejercicio 2 - Pruebas
        probarCartas();
        Mazo mazo = new Mazo();
        mazo.mostrarMazo();
    
        
        //Ejercicio 3 - Letra dada por la catedra
        /* El error es que myRect no es inicializada con new por lo tanto
            myRect queda apuntando a null por lo que dara una excepcion NullPointerException
        
        Rectangle myRect;
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
        */
        
        //Codigo corregido
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
    
        
        //Ejercicio 4 - Parte 3 , prueba NumberHolder
        NumberHolder nh = new NumberHolder();
        nh.anInt = 1;
        nh.aFloat = 2.6f;
        System.out.println(nh.anInt);
        System.out.println(nh.aFloat);
    
    }
    
}
