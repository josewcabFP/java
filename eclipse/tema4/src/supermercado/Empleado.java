package supermercado;

public class Empleado {
	
	private int id;
	private String nombre;
	
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
