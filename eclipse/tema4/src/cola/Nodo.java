package cola;

public class Nodo {
	
	private Integer valor;
	private Nodo siguiente;
	
	public Nodo(Integer _valor) {
		this.valor = _valor;
		this.siguiente = null;
	}
	
	public void setSigueiente(Nodo n) {
		this.siguiente = n;
	}
	
	public Nodo getSiguiente() {
		
		return this.siguiente; 
	}

}
