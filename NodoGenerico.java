package Genericos;

/**
 * 
 * Convertir a genérico.
 * 
 * @author Jose Cabrera Rojas
 */

public class NodoGenerico <T> {
	private T valor;
	private NodoGenerico<T> siguiente;
	
	public NodoGenerico(T _valor) {
		this.valor = _valor;
		this.siguiente = null;
	}
	
	public void setSigueiente(NodoGenerico<T> n) {
		this.siguiente = n;
	}
	
	public NodoGenerico<T> getSiguiente() {
		
		return this.siguiente; 
	}

	public T getValor() {
		return this.valor;
	}
}
