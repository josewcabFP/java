package Fracciones_nodos;

public class NodoFraccion {
	
	private Fraccion valor;
	private NodoFraccion siguiente;
	
	public NodoFraccion(Fraccion f) {
		this.valor = f;
		this.siguiente = null;
	}

	public NodoFraccion getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoFraccion siguiente) {
		this.siguiente = siguiente;
	}

	public Fraccion getValor() {
		return valor;
	}
	
	
}
