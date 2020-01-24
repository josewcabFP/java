package supermercado;

public class ColaClientes {
	
	private NodoC inicial;
	private NodoC fin;
	
	public ColaClientes() {
		this.inicial = null;
	}
	
	public boolean isEmpty() {
		
		return this.inicial == null ? true : false;
	}
	
	public void push(Cliente c) {
		NodoC n = new NodoC(c);
		
		if (isEmpty()) {
			this.inicial = n;
		}
		else
		{
			this.inicial.setSiguiente(n);
			this.inicial = n;
		}
	}
	
	
	
	//----Nodo Cliente----

	private class NodoC{
		private Cliente cliente;
		private NodoC siguiente;
		
		public NodoC(Cliente _cliente) {
			this.cliente = _cliente;
			this.siguiente = null;
		}
		
		public void setSiguiente(NodoC n) {
			this.siguiente = n;
		}
		
		public NodoC getSiguiente() {
			return this.siguiente;
		}
		
		public Cliente getCliente() {
			return this.cliente;
		}
		
	}
}
