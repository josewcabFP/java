package supermercado;

public class Productos {
	private int cantidad;
	private Categoria categoria;
	private double coste;
	private String descripcion;
	private String nombre;
	
	public Productos(int _can, Categoria _cat, double _cost, String _desc, String _nom ) {
		this.cantidad = _can;
		this.categoria = _cat;
		this.coste = _cost;
		this.descripcion = _desc;
		this.nombre = _nom;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getCoste() {
		return coste;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}
	
	public double precioVenta() { // Implementar
		double pv = 0;
		
		return pv;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String toString() {
		return this.getNombre() + " | Precio: " + this.getCoste() + "€ | Cantidad (pack): " + this.getCantidad();
	}
	
	
	

}
