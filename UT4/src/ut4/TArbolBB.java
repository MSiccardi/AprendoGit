/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut4;

import com.sun.org.apache.xerces.internal.impl.Constants;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Equipo 4
 */
public class TArbolBB implements IArbolBB {

    private TElementoArbolBB raiz;

    /**
     * Metodo que devuelve la raiz del arbol
     *
     * @return Raiz del arbol
     */
    public TElementoArbolBB getRaiz() {
        return this.raiz;
    }

    /**
     * Constructor del arbol binario de busqueda
     */
    public TArbolBB() {
        this.raiz = null;
    }

    /**
     * Metodo para insertar elementos en el arbol binario de busqueda
     *
     * @param elemento Elemento a insertar
     * @return Booleano que determina si se inserto o no
     */
    @Override
    public boolean insertar(IElementoAB unElemento) {
        if (raiz != null) {
            return raiz.insertar(unElemento);
        } else {
            raiz = (TElementoArbolBB) unElemento;
        }
        return true;
    }

    /**
     * Metodo para insertar elementos en el arbol binario de busqueda con un
     * contador
     *
     * @param elemento Elemento a insertar
     * @param contador Contador de cuantas veces se ha llamado la funcion
     * insertar
     * @return Booleano que determina si se inserto o no
     */
    @Override
    public boolean insertar(IElementoAB unElemento, Integer[] contador) {
        Boolean flag = false;
        contador[0]++;
        if (raiz != null) {
            flag = raiz.insertar(unElemento, contador);
        } else {
            raiz = (TElementoArbolBB) unElemento;
            flag = true;
        }
        return flag;
    }

    @Override
    public IElementoAB buscar(Comparable unaEtiqueta, Integer[] contador) {
        if (raiz != null) {
            return raiz.buscar(unaEtiqueta, contador);
        } else {
            return null;
        }
    }

    /**
     * Metodo que devuelve un string con las claves de los nodos del recorrido
     * del arbol en preorden
     *
     * @return String de las claves del recorrido
     */
    @Override
    public String preOrden() {
        if (raiz != null) {
            return raiz.preOrden();
        } else {
            return "No hay elementos";
        }
    }

    @Override
    public String inOrden() {
        if (raiz != null) {
            return raiz.inOrden();
        } else {
            return "No hay elementos";
        }
    }

    @Override
    public String postOrden() {
        if (raiz != null) {
            return raiz.postOrden();
        } else {
            return "No hay elementos";
        }
    }

    @Override
    public int obtenerAltura() {
        if (raiz != null) {
            return raiz.obtenerAltura();
        }
        else
            return -1;
    }

    @Override
    public int obtenerTamanio() {
        if (raiz != null) {
            return raiz.obtenerTamanio();
        }
        return 0;
    }

    @Override
    public int obtenerNivel(Comparable unaEtiqueta) {
        Integer[] contador = new Integer[1];
        contador[0] = 0;
        if (this.buscar(unaEtiqueta, contador) == null) {
            return -1;
        } else {
            return raiz.obtenerNivel(unaEtiqueta);
        }
    }

    @Override
    public int obtenerCantidadHojas() {
        if (raiz != null) {
            return raiz.obtenerCantidadHojas();
        }
        return 0;
    }

    @Override
    public void listarHojas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IElementoAB encontrarMinimo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IElementoAB encontrarMaximo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IElementoAB lexicograficamenteAnterior(Comparable unaClave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int obtenerCantNodosNivel(int nivel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean esDeBusqueda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
