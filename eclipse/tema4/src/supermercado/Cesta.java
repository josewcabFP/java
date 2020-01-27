package supermercado;

public class Cesta {
	
	private NodoP cima;
	
	public Cesta() {
		this.cima = null;
	}
	
	public boolean isEmpty() {
		return this.cima == null ? true : false;
	}
	
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
	
	// NodoP de productos
	
	private class NodoP {
		
		private Productos producto;
		private NodoP siguiente;
		
		public NodoP(Productos _prod) {
			this.producto = _prod;
			this.siguiente = null;
		}
		
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
