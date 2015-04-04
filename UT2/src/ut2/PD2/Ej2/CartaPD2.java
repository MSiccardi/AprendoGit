/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut2.PD2.Ej2;
import ut2.PD2.Ej2.Numero;
import ut2.PD2.Ej2.Palo;

/**
 *
 * @author MSiccardi
 */
public class CartaPD2 {
    public Numero numero;
    public Palo palo;

    public CartaPD2(Palo palo, Numero numero){
       this.palo = palo;
       this.numero = numero;
    }
    
    public String datoCarta(){
        return this.numero.toString() + " de " + this.palo.toString();
    }
}
