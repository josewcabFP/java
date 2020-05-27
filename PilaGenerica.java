package Genericos;

/**
 * 
 * Convertir a genérico.
 * 
 * @author Jose Cabrera Rojas
 */

public class PilaGenerica <T> {

	private NodoGenerico<T> cima;
	
	public PilaGenerica() {
		
		this.cima = null;
	}
	
	public boolean isEmpty() {
		return this.cima == null;
	}
	
	public void push(T valor) {
		NodoGenerico<T> elemento = new NodoGenerico<T>(valor);
		
		if (this.isEmpty()) {
			this.cima = elemento;
		}
		else {
			elemento.setSigueiente(this.cima);
			this.cima = elemento;
		}
	}
	
	public T top() {
		return this.isEmpty() ? null : this.cima.getValor();
	}
	

	public NodoGenerico<T> pop() {
		NodoGenerico<T> n = this.cima;
		
		if (!isEmpty()) {
			this.cima = this.cima.getSiguiente();
		}
		
		return n;
	}
	
	public boolean isFull() {
		return false;
	}
	
	
	
	public static void main(String [] args) {
		PilaGenerica<Integer> p = new PilaGenerica<Integer>();
		
		p.push(1);
		p.push(2);
		
		System.out.println(p.pop().getValor());
		System.out.println(p.pop().getValor());

	}
}
