package pilaConNodos;

/**
 * Crea la clase PilaEnteros
 * 
 * propiedades:
 * 	cima: Nodo
 * 
 * Métodos:
 * Constructor que inicialice la cima a null.
 * 	boolean push(Integer i)//devuelve siempre true
 * 	Integer pop(),
 * 	Integer top(),
 * 	boolean isEmpty(),
 * 	boolean isFull() //devuelve siempre false, porque nuestra pila es infinita, no tiene tope.


 * 
 * @author Jose Cabrera Rojas
 *
 */

public class PilaEnteros {
	
	private Nodo cima;
	
	public PilaEnteros() {
		this.cima = null;
	}
	
	public boolean isEmpety() {
		return cima == null;
	}
	
	public void push (Integer i) {
		Nodo elemento = new Nodo(i);
		
		if (this.isEmpety()) {
			this.cima = elemento;
		}
		else {
			elemento.setSigueiente(this.cima);
			this.cima = elemento;
		}
	}
	
	public Integer top() {
		return this.isEmpety() ? null : this.cima.getValor();
	}
	
	public Nodo pop() {
		Nodo n = this.cima;
		
		if (!isEmpety()) {
			this.cima = this.cima.getSiguiente();
		}
		
		return n;
	}
	
	public boolean isFull() {
		return false;
	}
	
	public static void main (String [] args) {
		
		PilaEnteros pila = new PilaEnteros();
		
		pila.push(1);
		pila.push(2);
		pila.push(3);
		
		System.out.println(pila.top());
		
		pila.pop();
		
		System.out.println(pila.top());
	}
	
}
