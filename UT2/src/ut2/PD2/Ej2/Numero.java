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
public enum Numero {
    UNO,
    DOS,
    TRES,
    CUATRO,
    CINCO,
    SEIS,
    SIETE,
    OCHO,
    NUEVE,
    SOTA,
    CABALLO,
    REY;

    public int numeroToInt(){
        switch (this) {
            case UNO: return 1;
            case DOS: return 2;
            case TRES: return 3;
            case CUATRO: return 4;
            case CINCO: return 5;
            case SEIS: return 6;
            case SIETE: return 7;
            case OCHO: return 8;
            case NUEVE: return 9;
            case SOTA: return 10;
            case CABALLO: return 11;
            case REY: return 12;
            default: return 0;
        }
    }
}
