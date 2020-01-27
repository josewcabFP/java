package supermercado;

/** 
 * Clase que representa a un cliente del supermercado.
 * 
 * @author Jose Cabrera, Daniel Nevado
 *
 */

public class Cliente {
	
  	private Cesta cesta;
  	private static int Id;
  	private int id;
  	
  	static{
  		Id = 0;
  	}
  	
  	/**
  	 * Constructor: Inicializa la cesta del cliente y asigna la id del cliente que sera única.
  	 */
  	
  	public Cliente() {
  		this.cesta = new Cesta();
  		Cliente.Id += 1;
  		this.id = Cliente.Id;
  	}
  	
  	/**
  	 * Método que añade un producto a la cesta del cliente.
  	 * 
  	 * @param prod Producto a agregar a la cesta.
  	 */
  	
  	public void compra(Productos prod){
  		this.cesta.push(prod);
  	}
  	
  	/**
  	 * Método que devuelve el coste de la cesta del cliente.
  	 * 
  	 * @return Coste de la cesta.
  	 */
  	
  	public double getCosteCesta() {
  		 return this.cesta.costeCesta();
  	}
  	
  	/**
  	 * Método que vacía la cesta del cliente.
  	 * 
  	 * @return Coste total de la cesta.
  	 */
  	
  	public double vaciaCesta(){
  		double total = 0;
  		Productos p = null;
  		while(!this.cesta.isEmpty()) {
  			p = this.cesta.pop();
  			total += p.getCantidad() * p.getCoste();
  		}
  		
  		return total;
  	}
  	
  	/**
  	 *  Muestra en pantalla el contenido de la cesta.
  	 */
  	public void verCesta() {
  		System.out.println(this.cesta);
  	}
  	
  	public int getId() {
  		return this.id;
  	}
  	

	public String toString() {
		return  "El cliente con Id: " + this.getId() + ", tiene en la cesta: \n=========================================\n" + this.cesta.toString();
	}
  	
}
