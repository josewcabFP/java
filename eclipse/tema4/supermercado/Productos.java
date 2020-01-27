package supermercado;

/**
 * Clase que representa a los productos del supermercado.
 * 
 * @author Jose Cabrera, Daniel Nevado
 *
 */

public class Productos {
	private int cantidad;
	private Categoria categoria;
	private double coste;
	private String descripcion;
	private String nombre;
	
	/**
	 * Constructor; Inicializa los datos del producto.
	 * 
	 * @param _can Cantidad de productos que pueden venir en un pack (si solo es 1 no se considera un pack).
	 * @param _cat	Categoría del producto, depende del enumerado de Categoria.
	 * @param _cost	Precio por unidad del producto.
	 * @param _desc Breve descripción del producto.
	 * @param _nom Nombre del producto.
	 */
	
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
