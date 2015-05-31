package ut4;


public interface IArbolBB {
	/**
	 * Inserta un elemento en el arbol. En caso de ya existir un elemento
	 * con la clave indicada en "unElemento", retorna falso.
	 * @param unElemento Elemento a insertar
	 * @return Exito de la operaci�n
	 */
	
	
	public boolean insertar(IElementoAB unElemento);
	
	/**
	 * Inserta un elemento en el arbol. En caso de ya existir un elemento
	 * con la clave indicada en "unElemento", retorna falso.
	 * en el contador devuelve la cantidad de llamadas realizadas
	 * Ejemplo de uso del contador:
	 * 	 *   	Integer[] contador = new Integer[1];
	 * 		contador[0] = new Integer(0);
	 *    IElemento elem = new("123");
	 * 		boolean insertado = arbol.insertar(elem, contador);
	 * 		... System.out.println(contador[0]); // imprime la cantidad de llamadas para insertar el nuevo elemento
	 * @param unElemento Elemento a insertar
	 * @param contador Vector de 1 solo elemento conteniendo el contador de llamadas
	 * @return Exito de la operaci�n
	 */
	public boolean insertar(IElementoAB unElemento, Integer[] contador);
	
	/**
	 * Busca un elemento dentro del �rbol.
	 * 
	 * Ejemplo de uso del contador:
	 * 
	 *   	Integer[] contador = new Integer[1];
	 * 		contador[0] = new Integer(0);
	 * 		IElemento elem = arbol.buscar(10635, contador);
	 * 		System.out.println(contador[0]); // imprime la cantidad de llamadas para buscar a 10635
	 * 
	 * @param unaEtiqueta Etiqueta identificadora del elemento a buscar.
	 * @param Vector de 1 solo elemento conteniendo el contador de llamadas.
	 * @return Elemento encontrado. En caso de no encontrarlo, retorna nulo.
	 */
	public IElementoAB buscar(Comparable unaEtiqueta, Integer[] contador);
	
	/**
	 * Imprime en PreOrden los elementos del �rbol, separados por guiones.
	 * @return String conteniendo el preorden separado por guiones.
	 */
	public String preOrden();
	
	/**
	 * Imprime en InOrden los elementos del �rbol, separados por guiones.
	 * @return String conteniendo el preorden separado por guiones.
	 */
	public String inOrden();
	
	/**
	 * Imprime en PostOrden los elementos del �rbol, separados por guiones.
	 * @return String conteniendo el preorden separado por guiones.
	 */
	public String postOrden();
	
	/**
	 * Retorna la altura del arbol.
	 * @return Altura del arbol.
	 */
	public int obtenerAltura();
	
	/**
	 * Retorna el tama�o del arbol.
	 * @return Tama�o del arbol.
	 */
	public int obtenerTamanio();
	
	/**
	 * Retorna el nivel del arbol a partir de la etiqueta indicada
	 * @param unaEtiqueta
	 * @return Nivel
	 */
	public int obtenerNivel(Comparable unaEtiqueta);
	
	/**
	 * Retorna la cantidad de hojas del arbol.
	 * @return Cantidad de hojas del arbol.
	 */
	public int obtenerCantidadHojas();

	/**
	 * Lista todas las hojas del arbol cada una con su nivel.
	 */
	public void listarHojas();

	/**
	 * Retorna el elemento con la menor clave del �rbol.
	 * @return Menor clave del arbol.
	 */
	public IElementoAB encontrarMinimo();
	
	/**
	 * Retorna el elemento con la mayor clave del �rbol.
	 * @return Mayor clave del arbol.
	 */
	public IElementoAB encontrarMaximo();
	
	/**
	 * Retorna el elemento cuya clave es la inmediata anterior a una clave dada (pasada por par�metro)
	 * @param unaClave 
	 * @return
	 */
	public IElementoAB lexicograficamenteAnterior (Comparable unaClave);

	/**
	 * Retorna la cantidad de nodos de un nivel dado (por par�metro)
	 * @param nivel - nivel requerido
	 * @return Cantidad de nodos.
	 */
	public int obtenerCantNodosNivel (int nivel);
	
	/**
	 * Indica si el arbol es de busqueda o no.
	 * @return Si es de busqueda o no.
	 */
	public boolean esDeBusqueda();
}
