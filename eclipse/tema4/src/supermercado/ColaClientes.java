package supermercado;

/**
 * Clase que representa una cola de supermercado, siguiendo la realidad esta cola es de tipo
 * FIFO (First In First Out), esta clase esta implementada con los metodos necesarios para
 * introducir y devolver clientes de la cola.
 * 
 * @author Jose Cabrera, Daniel Nevado
 *
 */

public class ColaClientes {
	
	private Caja caja;
	private Empleado empleado;
	private NodoC inicial;
	private NodoC fin;
	
	/**
	 * Constructor: Inicializa los nodos inicial y final a null.
	 * @param e Empleado que recibe la cola.
	 * @param c Caja donde el empleado cobra a cada cliente de la cola.
	 */
	
	public ColaClientes(Empleado e, Caja c) {
		this.empleado = e;
		this.caja = c;
		this.inicial = null;
		this.fin = null;
	}
	
	/**
	 * 
	 * @return Devuelve true si la cola esta vacia, y false en caso contrario.
	 */
	
	public boolean isEmpty() {
		
		return this.inicial == null ? true : false;
	}
	
	/**
	 * Método que añade un cliente al final de cola.
	 * @param c Cliente a añadir.
	 */
	
	public void add(Cliente c) {
		NodoC n = new NodoC(c);
		
		if (isEmpty()) {
			this.inicial = n;
			this.fin = n;
		}
		else
		{
			this.fin.setSiguiente(n);
			this.fin = n;
		}

	}
	
	/**
	 * Método que devuelve el primer cliente de la cola (la cola tiene una estructura de tipo FIFO)
	 * @return Primer cliente en la cola.
	 */
	
	public Cliente get() {
		Cliente c = null;
		if (!this.isEmpty()) {
			c = this.inicial.getCliente();
			this.inicial = this.inicial.getSiguiente();
		}
		return c;
	}
	
	
	public String toString() {
		String s = "";
		NodoC n = this.inicial;
		
			while (n != null) {
				s += n.getCliente().toString() + '\n';
				n = n.getSiguiente();
			}
		
		return s;
	}
	
	
	public Caja getCaja() {
		return caja;
	}

	public Empleado getEmpleado() {
		return empleado;
	}


	/**
	 * Clase que contiene los nodos de tipo cliente, con sus metodos mutadores y de acceso.
	 * 
	 * @author Jose cabrera, Daniel Nevado
	 *
	 */

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
	
	public static void main(String [] args) {
		
		ColaClientes cola = new ColaClientes(new Empleado(1, "juan"), new Caja(1));
		Cliente c1 = new Cliente();
  		Cliente c2 = new Cliente();
  		Cliente c3 = new Cliente();
  		
  		c1.compra(new Productos(1, Categoria.DROGUERIA,	3.75, "shampoo", "Pantene"));
  		c1.compra(new Productos(3, Categoria.CARNICERIA, 1.47, "Carne", "Chulet�n"));
  		
  		cola.add(c1);
  		cola.add(c2);
  		cola.add(c3);
  		
  		System.out.println(cola);
		
	}
}
