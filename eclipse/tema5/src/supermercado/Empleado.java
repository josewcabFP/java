package supermercado;

/**
 * Clase que representa a un empleado del supermercado.
 * 
 * @author Jose Cabrera, Daniel Nevado
 *
 */

public class Empleado {
	
	private int id;
	private String nombre;
	
	/**
	 * Constructor: Inicializa el empleado asignando su nombre e id.
	 * 
	 * @param _id Id que recibirá el empleado.
	 * @param _nombre Nombre del empleado.
	 */
	
	public Empleado(int _id, String _nombre) {
		this.id = _id;
		this.nombre = _nombre;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String toString() {
		return this.nombre + " con Id: " + this.id;
	}

}
