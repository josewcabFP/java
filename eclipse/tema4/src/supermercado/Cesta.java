package supermercado;

public class Cesta {
	
	private Nodo cima;
	
	public Cesta() {
		this.cima = null;
	}
	
	public boolean isEmpty() {
		return this.cima == null ? true : false;
	}
	
	public void push(Productos p) {
		Nodo n = new Nodo(p);
		
		if (this.isEmpty()) {
			
			this.cima = n;
		}
		else {
			this.cima.setSiguiente(n);
			this.cima = n;
		}
	}
	
	public Productos pop() {
		Productos p;
		
		if (isEmpty()) {
			p = null;
		}
		else {
			p = this.cima.getProducto();
			this.cima = this.cima.getSiguiente();
		}
		
		return p;
	}
	
	// Nodo de productos
	
	private class Nodo {
		
		private Productos producto;
		private Nodo siguiente;
		
		public Nodo(Productos _prod) {
			this.producto = _prod;
			this.siguiente = null;
		}
		
		public void setSiguiente(Nodo n) {
			this.siguiente = n;
		}
		
		public Nodo getSiguiente() {
			return this.siguiente;
		}
		
		public Productos getProducto() {
			return this.producto;
		}
		
		
	}

}
