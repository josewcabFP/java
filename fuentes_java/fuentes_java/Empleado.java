package tema9_genericos;


class Empleado {

	private String nombre;
	private double sueldo;
	private int edad;

	public Empleado(String nombre, int edad, double sueldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public double getSueldo() {
		return this.sueldo;
	}

	
	public void subirSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		this.sueldo += aumento;
	}

	public String toString() {
		return "Nombre=" + this.nombre + ", sueldo: " + this.sueldo + ", edad: " +this.edad;
	}
}

