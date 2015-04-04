/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut2.PD2.Ej2;

/**
 *
 * @author MSiccardi
 */
public enum Palo {
    ORO,
    ESPADA,
    COPA,
    BASTO;

    public int paloToInt(){
        switch (this) {
            case ORO: return 1;
            case ESPADA: return 2;
            case COPA: return 3;
            case BASTO: return 4;
            default: return 0;
        }
    }
}
