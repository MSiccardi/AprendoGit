/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut4;

/**
 *
 * @author Usuario
 */
public class UT4 {


    /**
     * Método que dado un nombre de archivo con claves, lo lee y escribe un archivo nuevo con las claves encontradas 
     * en el archivo y el contador de la inserción en un arbol binario.
     * @param archivo Nombre de archivo con las claves
     * 
     * Equpo 4
     */
    public static TArbolBB cargar(String archivo, String archivoSalida) {
        TArbolBB arbol = new TArbolBB();
        Integer [] contador = new Integer [1];
        String [] contenido = ManejadorArchivosGenerico.leerArchivo(archivo);
        String [] lineas = new String [contenido.length];
        for (int i = 0; i < contenido.length; i++) {
            contador [0] = 0;
            if (!arbol.insertar(new TElementoArbolBB(Integer.parseInt(contenido[i])),contador))
                contador [0] = 0;
            lineas [i] = contenido [i] + " " + Integer.toString(contador[0]);
        }
        ManejadorArchivosGenerico.escribirArchivo(archivoSalida, lineas);
        return arbol;
    }
    
    /**
     * Main
     * @param args 
     * 
     * Equipo 4
     */
    public static void main(String[] args){
        TArbolBB arbol = cargar("src/Archivos/clavesPrueba.txt","src/Archivos/miArchivo.txt");
        
        System.out.println(arbol.preOrden());
        System.out.println(arbol.inOrden());
        System.out.println(arbol.postOrden());
        System.out.println(arbol.obtenerAltura());
        System.out.println(arbol.obtenerTamanio());
        System.out.println(arbol.obtenerNivel(104));
        System.out.println(arbol.obtenerCantidadHojas());
        
        Integer [] contador = new Integer [1];
        contador [0] = 0;
        System.out.println(arbol.buscar(1342, contador).getEtiqueta());
    }
}


