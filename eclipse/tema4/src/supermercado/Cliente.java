package supermercado;

public class Cliente {
	
  	private Cesta cesta;
  	private static int Id;
  	private int id;
  	
  	static{
  		Id = 0;
  	}
  	
  	public Cliente() {
  		this.cesta = new Cesta();
  		Cliente.Id += 1;
  		this.id = Cliente.Id;
  	}
  	
  	public void compra(Productos prod){
  		this.cesta.push(prod);
  	}
  	
  	public double getCosteCesta() {
  		 return this.cesta.costeCesta();
  	}
  	
  	public double vaciaCesta(){
  		while(!this.cesta.isEmpty()) {
  			this.cesta.pop();
  		}
  		
  		return this.getCosteCesta();
  	}
  	
  	public void verCesta() {
  		System.out.println(this.cesta);
  	}
  	
  	public int getId() {
  		return this.id;
  	}
  	

	public String toString() {
		return  "El cliente con Id: " + this.getId() + ", tiene en la cesta: \n" + this.cesta.toString();
	}
  	
  	public static void main(String [] args) {
  		Cliente c1 = new Cliente();
  		Cliente c2 = new Cliente();
  		Cliente c3 = new Cliente();
  		c1.compra(new Productos(1, Categoria.DROGUERIA,	3.75, "shampoo", "Pantene"));
  		c2.compra(new Productos(3, Categoria.CARNICERIA, 1.47, "Carne", "Chuletón"));
  		System.out.println(c1);
  		System.out.println(c2 + " " + c2.getCosteCesta());
  		
  		
  	}
}
