package pilaConNodos;

/**
 * Enunciado: Crea la clase Nodo 
 * 	
 * Propiedades:valor: Integer 
 * 		siguiente :Nodo
 * 
 * Métodos
 * 	Constructor, que recibe el valor.
 * 	get/set de siguiente
 * 	get de valor.
 * 
 * @author Jose Cabrera Rojas
 *
 */

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

	public Integer getValor() {
		return this.valor;
	}
}
