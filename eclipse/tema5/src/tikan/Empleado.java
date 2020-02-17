package tikan;

/**
 * @author Jose Cabrera Rojas
 */

public abstract class Empleado {
	
	private String nombre;
	private String apellido;
	private String dni;
	private int anyo_ingreso;
	
	public Empleado() {
		this.nombre = "";
		this.apellido = "";
		this.dni = "";
		this.anyo_ingreso = -1;
	}
	
	public Empleado(String nombre, String apellido, String dni, int anyo_ingreso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.anyo_ingreso = anyo_ingreso;
	}

	public void imprimir() {
		System.out.println("\nNombre: " + this.nombre + "\nApellido: " + this.apellido + "\nDNI: " + this.dni + "\nAño de ingreso: " + this.anyo_ingreso);
	}
	
	public abstract double obtenerSalario();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getAnyo_ingreso() {
		return anyo_ingreso;
	}

	public void setAnyo_ingreso(int anyo_ingreso) {
		this.anyo_ingreso = anyo_ingreso;
	}
	
	
	
	
}
