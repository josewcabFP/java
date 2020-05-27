package supermercado;

/**
 * Clase que representa la cesta del cliente. Utiliza un orden LIFO (Last In First Out) 
 * para ordenar los objetos dentro.
 * 
 * @author Jose Cabrera, Daniel Nevado
 *
 */

public class Cesta {
	
	private NodoP cima;
	
	/**
	 * Constructor: Inicializa el nodo cima de la cesta a null
	 */
	
	public Cesta() {
		this.cima = null;
	}
	
	/**
	 * Método que comprueba si la cesta esta vacia.
	 * 
	 * @return devuelve true si esta vacía y false en caso contrario.
	 */
	
	public boolean isEmpty() {
		return this.cima == null ? true : false;
	}
	
	/**
	 * Método para agregar un producto en la cesta
	 * 
	 * @param p producto a agregar
	 */
	
	public void push(Productos p) {
		NodoP n = new NodoP(p);
		
		if (this.isEmpty()) {
			
			this.cima = n;
		}
		else {
			n.setSiguiente(this.cima);
			this.cima = n;
		}
	}
	
	/**
	 * Método para calcular el importe de la totalidad de la cesta hasta el momento en que es invocado.
	 * 
	 * @return Importe de la cesta hasta el momento.
	 */
	
	public double costeCesta() {
		double suma = 0;
		
		if (!isEmpty()) {
			NodoP n = this.cima;
			
			while(n != null) {
				suma += n.getProducto().getCoste() * n.getProducto().getCantidad();
				n = n.getSiguiente();
			}
		}
		
		return suma;
		
	}
	
	/**
	 * Método para extraer un producto de la cesta, utilizando el principo LIFO.
	 * 
	 * @return Devuelve el ultimo producto introducido.
	 */
	
	public Productos pop() {
		Productos p;
		
		if (isEmpty()) {
			p = null;
		}
		else {
			p = this.cima.getProducto();
			this.cima = this.cima.getSiguiente();  // OJO
		}
		
		return p;
	}
	
	public String toString() {
		String s = "";
		
		if (!isEmpty()) {
			NodoP n = this.cima;
			
			while(n != null) {
				s += n.getProducto().toString() + '\n';
				n = n.getSiguiente();
			}
		}
		else {
			s += "No hay nada en la cesta\n";
		}
		
		return s;
	}
	
	/**
	 * Clase privada que representa un nodo producto.
	 * 
	 * @author Jose Cabrera, Daniel Nevado
	 *
	 */
	
	private class NodoP {
		
		private Productos producto;
		private NodoP siguiente;
		
		/**
		 * Constructor: Inicializa el nodo, cargandolo con el producto y estableciendo el nodo siguiente a null.
		 * 
		 * @param _prod Producto que contendra el nodo.
		 */
		
		public NodoP(Productos _prod) {
			this.producto = _prod;
			this.siguiente = null;
		}
		
		/**
		 * Método para establecer el nodo contiguo.
		 * 
		 * @param n Nodo que se posicionará a continuacion. 
		 */
		
		public void setSiguiente(NodoP n) {
			this.siguiente = n;
		}
		
		
		public NodoP getSiguiente() {
			return this.siguiente;
		}
		
		public Productos getProducto() {
			return this.producto;
		}
		
		
	}
	
	

}
