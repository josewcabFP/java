package cola;

public class Pila {
	
	private Nodo cima;
	
	public Pila() {
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
	
	public static void main (String [] args) {
		
		Pila pila = new Pila();
		
		pila.push(1);
		pila.push(2);
		pila.push(3);
		
		System.out.println(pila.top());
		
		pila.pop();
		
		System.out.println(pila.top());
	}
	
}
