package nodo_doble_enlace;

/**
 * Nodo modificado con anterior y siguiente 
 * 
 * @author Jose Cabrera Rojas
 *
 *
 */

public class Nodo {
	
	private Integer valor;
	private Nodo siguiente;
	private Nodo anterior;
	
	public Nodo(Integer valor) {
		this.valor = valor;
		this.siguiente =  null;
		this.anterior = null;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public Nodo getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}

	public Integer getValor() {
		// TODO Auto-generated method stub
		return this.valor;
	}
	
	@Override
	public String toString() {
		return "[" + valor + "]";
	}
	
	
	
	
	
}
