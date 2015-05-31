/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut4;

/**
 *
 * @author Equipo 4
 */
public class TElementoArbolBB implements IElementoAB {

    private Comparable etiqueta;
    private TElementoArbolBB hijoIzq;
    private TElementoArbolBB hijoDer;

    /**
     * Constructor de elementos de arbol binario de busqueda
     *
     * @param etiqueta
     */
    public TElementoArbolBB(Comparable etiqueta) {
        this.etiqueta = etiqueta;
        this.hijoDer = null;
        this.hijoIzq = null;
    }

    /**
     * Metodo que devuelve la etiquieta del nodo
     *
     * @return Etiquieta del nodo
     */
    @Override
    public Comparable getEtiqueta() {
        return etiqueta;
    }

    /**
     * Metodo que devuelve el hijo izquierdo del nodo
     *
     * @return Hijo izquierdo del nodo
     */
    @Override
    public IElementoAB getHijoIzq() {
        return hijoIzq;
    }

    /**
     * Método que devuelve el hijo derecho del nodo
     *
     * @return Hijo derecho del nodo
     */
    @Override
    public IElementoAB getHijoDer() {
        return hijoDer;
    }

    /**
     * Metodo que setea el hijo izquierdo del nodo
     *
     * @param elemento Nodo a setear como hijo izquierdo
     */
    @Override
    public void setHijoIzq(IElementoAB elemento) {
        hijoIzq = (TElementoArbolBB) elemento;
    }

    /**
     * Metodo que setea el hijo derecho del nodo
     *
     * @param elemento Nodo a setear como hijo derecho
     */
    @Override
    public void setHijoDer(IElementoAB elemento) {
        hijoDer = (TElementoArbolBB) elemento;
    }

    @Override
    public IElementoAB buscar(Comparable unaEtiqueta, Integer[] contador) {
        contador[0] += 1;
        if (this.getEtiqueta().equals(unaEtiqueta)) {
            return this;
        }
        if (this.getEtiqueta().compareTo(unaEtiqueta) > 0) {
            if (this.getHijoIzq() != null) {
                return this.getHijoIzq().buscar(unaEtiqueta, contador);
            }
        }
        if (this.getEtiqueta().compareTo(unaEtiqueta) < 0) {
            if (this.getHijoDer() != null) {
                return this.getHijoDer().buscar(unaEtiqueta, contador);
            }
        }
        return null;
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
    public boolean insertar(IElementoAB elemento, Integer[] contador) {
        contador[0]++;
        if (elemento == null) {
            return false;
        }
        if (elemento.getEtiqueta().compareTo(this.getEtiqueta()) < 0) {
            if (this.hijoIzq == null) {
                this.hijoIzq = (TElementoArbolBB) elemento;
                return true;
            } else {
                return this.hijoIzq.insertar(elemento, contador);
            }
        }
        if (elemento.getEtiqueta().compareTo(this.getEtiqueta()) > 0) {
            if (this.hijoDer == null) {
                this.hijoDer = (TElementoArbolBB) elemento;
                return true;
            } else {
                return this.hijoDer.insertar(elemento, contador);
            }
        }
        return false;
    }

    /**
     * Metodo para insertar elementos en el arbol binario de busqueda
     *
     * @param elemento Elemento a insertar
     * @return Booleano que determina si se inserto o no
     */
    @Override
    public boolean insertar(IElementoAB elemento) {
        if (elemento == null) {
            return false;
        }
        if (elemento.getEtiqueta().compareTo(this.getEtiqueta()) < 0) {
            if (this.hijoIzq == null) {
                this.hijoIzq = (TElementoArbolBB) elemento;
                return true;
            } else {
                return this.hijoIzq.insertar(elemento);
            }
        }
        if (elemento.getEtiqueta().compareTo(this.getEtiqueta()) > 0) {
            if (this.hijoDer == null) {
                this.hijoDer = (TElementoArbolBB) elemento;
                return true;
            } else {
                return this.hijoDer.insertar(elemento);
            }
        }
        return false;
    }

    /**
     * Metodo que devuelve un string con las claves de los nodos del recorrido
     * del arbol en preorden
     *
     * @return String de las claves del recorrido
     */
    @Override
    public String preOrden() {
        String cad = "";
        cad += this.getEtiqueta();
        if (this.hijoIzq != null) {
            cad += "-" + this.hijoIzq.preOrden();
        }
        if (this.hijoDer != null) {
            cad += "-" + this.hijoDer.preOrden();
        }
        return cad;
    }

    @Override
    public String inOrden() {
        String cad = "";
        if (this.hijoIzq != null) {
            cad += this.hijoIzq.inOrden();
        }
        cad += this.getEtiqueta() + "-";
        if (this.hijoDer != null) {
            cad += this.hijoDer.inOrden();
        }
        return cad;
    }

    @Override
    public String postOrden() {
        String cad = "";
        if (this.hijoIzq != null) {
            cad += this.hijoIzq.postOrden();
        }
        if (this.hijoDer != null) {
            cad += this.hijoDer.postOrden();
        }
        cad += this.getEtiqueta() + "-";
        return cad;
    }

    /**
     * Metodo que obtiene la altura del arbol
     *
     * @return Altura del arbol
     */
    @Override
    public int obtenerAltura() {
        int a = -1;
        int b = -1;
        if (this.getHijoIzq() != null) {
            a = this.getHijoIzq().obtenerAltura();
        }
        if (this.getHijoDer() != null) {
            b = this.getHijoDer().obtenerAltura();
        }
        return Integer.max(a, b) + 1;
    }

    @Override
    public int obtenerTamanio() {
        int tamanioIzq = 0;
        int tamanioDer = 0;
        if (hijoIzq != null) {
            tamanioIzq = hijoIzq.obtenerTamanio();
        }
        if (hijoDer != null) {
            tamanioDer = hijoDer.obtenerTamanio();
        }
        return tamanioIzq + tamanioDer + 1;
    }

    @Override
    public int obtenerNivel(Comparable unaEtiqueta) {
        int cont = -1;
        if ((unaEtiqueta.compareTo(this.etiqueta) < 0) && (this.hijoIzq != null)) {
            cont = this.hijoIzq.obtenerNivel(unaEtiqueta);
        }
        if ((unaEtiqueta.compareTo(this.etiqueta) > 0) && (this.hijoDer != null)) {
            cont = this.hijoDer.obtenerNivel(unaEtiqueta);
        }
        return cont + 1;
    }

    @Override
    public int obtenerCantidadHojas() {
        int contador = 0;
        if (hijoIzq == null && hijoDer == null) {
            contador += 1;
        }
        if (hijoIzq != null) {
            contador += hijoIzq.obtenerCantidadHojas();
        }
        if (hijoDer != null) {
            contador += hijoDer.obtenerCantidadHojas();
        }
        return contador;
    }

    @Override
    public int listarHojas() {
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
    public IElementoAB lexicograficamenteAnterior() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
