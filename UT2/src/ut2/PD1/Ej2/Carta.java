/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut2.PD1.Ej2;

/**
 *
 * @author MSiccardi
 */
public class Carta {
    public int numero;
    public int palo;
    
    public final static int ORO = 1;
    public final static int ESPADA = 2;
    public final static int COPA = 3;
    public final static int BASTO = 4;
    
    public boolean paloValido() {
        return ORO<=this.palo && this.palo<=BASTO;
    }
    
    public boolean numeroValido() {
        return 1<=this.palo && this.palo<=12;
    }
    
    //Ejemplo de utilizacion de assert tomado de http://docs.oracle.com/javase/tutorial/java/javaOO/examples/Card.java
    /**
     * Metodo para pasar a string los diferentes palos de la carta seleccionada
     * @return Valor en String del palo seleccionado
     */
    public static String paloToString(int palo) {
        switch (palo) {
            case ORO: return "Oro";
            case ESPADA: return "Espada";
            case COPA: return "Copa";
            case BASTO: return "Basto";
            default: return "Palo no reconocido";
        }
    }
    
    /**
     * Metodo para pasar a string los diferentes numeros de la carta seleccionada
     * @return Valor en String del numero seleccionado
     */
    public static String numeroToString(int num) {
        switch (num) {
            case 1: return "Uno";
            case 2: return "Dos";
            case 3: return "Tres";
            case 4: return "Cuatro";
            case 5: return "Cinco";
            case 6: return "Seis";
            case 7: return "Siete";
            case 8: return "Ocho";
            case 9: return "Nueve";
            case 10: return "Sota";
            case 11: return "Caballo";
            case 12: return "Rey";
            default: return "Numero no reconocido";
        }
    }
    
    public Carta (int palo, int numero){
        this.palo = palo;
        this.numero = numero;
    }
    
    public String datoCarta(){
        return numeroToString(this.numero) + " de " + paloToString(this.palo);
    }
        
}
