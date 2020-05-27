
/**
 * Crea la clase Productos.
 * 
 * Propiedades:
 * 
 * codigo, nombre, precio.
 * 
 * Métodos:
 * 
 * constructor
 * toString.
 * 
 * Nota: Tener en cuenta que el código se generará de forma automática y deberá comenzar por 0.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Productos {
	
	private static int cont_cod;
	
	private int codigo;
	private String nombre;
	private double precio;
	
	static {
		cont_cod = 0;
	}

	public Productos(String nombre, double precio) {
		this.codigo = cont_cod;
		this.nombre = nombre;
		this.precio = precio;
		cont_cod++;
	}
	
	
	public String toString() {
		
		return (this.codigo + " | " + this.nombre + " | " + this.precio);
	
	}
	

}
