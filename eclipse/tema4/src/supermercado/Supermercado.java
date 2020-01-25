package supermercado;

public class Supermercado {
	
	private Empleado [] empleados;
	private Caja [] cajas;
	private Productos [] productos;
	private ColaClientes [] colas;
	private double total;
	
	public Supermercado() {
		this.iniciaSupermercado();
		this.total = 0;
	}	
	
	public double balance() {
		return this.total;
	}
	
	public void clienteEnCola(Cliente c) {
		int rand = (int)(Math.random() * this.colas.length);
		this.colas[rand].add(c);
	}
	
	public void compra() {
		boolean finalizado = false;
		int colasTerminadas;
		
		while(!finalizado) {
			colasTerminadas = 0;
			for (ColaClientes cola : this.colas) {
				if(cola.isEmpty()) {
					colasTerminadas++;
				}
			}
			if (colasTerminadas == this.colas.length) {
				finalizado = true;
			}
		}
	}
	
	public void despacha() {
		Cliente c;
		
		for (ColaClientes cola : this.colas) {
			if(!cola.isEmpty()) {
				
				c = cola.get();
				this.total += c.getCosteCesta();
				c.vaciaCesta();
				
			}
		}
	}
	
	
	public Productos getProducto(int i) {
		Productos p = this.productos[i];
		
		return p;
	}
	
	public void verColas() {
		for(int i = 0; i < this.colas.length; i++) {
			System.out.println("En la cola " + (i + 1) + ", Atendida por " + colas[i].getEmpleado() + " en la " + colas[i].getCaja() + 
							 "\n_________________________________________________________\n\n" + colas[i].toString());
		}
	}
	
	public void verProductos() {
		
		System.out.println("\n--------->>> Lista de productos en stock <<<---------\n__________________________________________________________\n");
		for(int i = 0; i < this.productos.length; i++) {
			System.out.println(this.productos[i]);
		}
		System.out.println("__________________________________________________________\n");
		
	}
	

		
	private void iniciaSupermercado() {
		this.empleados = new Empleado [] { 
					new Empleado(1, "Jorge"),
					new Empleado(2, "Juan"),
					new Empleado(3, "Alberto")};
	
		
		this.cajas = new Caja [] {
					new Caja(1),
					new Caja(2),
					new Caja(3)};
		
		this.productos = new Productos [] {
					new Productos(1, Categoria.DROGUERIA, 3.10, "Shampoo", "Pantene"),
					new Productos(3, Categoria.DROGUERIA, 1.90, "Jabon", "Heno de Pravia"),
					new Productos(1, Categoria.PANADERIA, 0.40, "Pan", "Barra de pan"),
					new Productos(1, Categoria.GOLOSINAS, 2.90, "Bolsa de caramelos", "Caramelos"),
					new Productos(2, Categoria.PESCADERIA, 1.25, "Pack de Atun", "Atun"),
					new Productos(1, Categoria.FRUTERIA, 0.30, "Manzana", "Manzana")};
		
		this.colas = new ColaClientes [] {
					new ColaClientes(this.empleados[0], this.cajas[0]),
					new ColaClientes(this.empleados[1], this.cajas[1]),
					new ColaClientes(this.empleados[2], this.cajas[2])};
		
		
				
	}
	
	public static void main(String args []) {
		Supermercado s = new Supermercado();
		s.clienteEnCola(new Cliente());
		s.clienteEnCola(new Cliente());
		s.clienteEnCola(new Cliente());
		s.clienteEnCola(new Cliente());
		s.clienteEnCola(new Cliente());
		s.clienteEnCola(new Cliente());
		s.clienteEnCola(new Cliente());
		s.clienteEnCola(new Cliente());
		s.clienteEnCola(new Cliente());
		
		s.verColas();
		s.despacha();
		s.verColas();
		s.despacha();
		s.verColas();
		s.despacha();
		s.verColas();
		
		
	}
}
