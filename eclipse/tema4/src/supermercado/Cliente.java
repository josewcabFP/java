package supermercado;

public class Cliente {
	
  	private Cesta cesta;
  	private static int id;
  	
  	static{
  		id = 0;
  	}
  	
  	public Cliente(String _id) {
  		this.cesta = new Cesta();
  		this.id += 1;
  	}
  	
  	public void compra(Productos prod){
  		this.cesta.push(prod);
  	}
  	
  	public double getCosteCesta() {
  		Productos p = null;
  		double suma = 0;
  		
  		while(!this.cesta.isEmpty()) {
  			p = this.cesta.pop();
  			suma = suma + (p.getCantidad() * p.getCoste());
  		}
  	}
  	
  	public double vaciaCesta{
  		
  	}
  	
  	public void verCesta() {
  		
  	}
  	
  	public String toString() {
  		
  	}

}
