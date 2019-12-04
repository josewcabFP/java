package entradas;

public class Entrada {
	
	/**
	 * Enunciado: Crear una clase entrada que vaya asignando la localidad conforme se van creando.
	 * 
	 * @author Jose Cabrera Rojas
	 */

	private static int localidadBase;
	private final int localidad;
	private double precio;
	private boolean ocupada;
	
	static {
		localidadBase = 100;
	}
	
	public Entrada(double _precio) {
		localidad = localidadBase + 1;
		localidadBase++;
		this.precio = _precio;
		this.ocupada = false;
	}
	
	public String toString() {
		return ("La localidad es: " + this.localidad + " , y el precio es: " + this.precio + (ocupada?" Esta ocupada":" No esta ocupada"));
	}
	
	public static void main(String [] args) {
		Entrada ent = new Entrada(70.5);
		Entrada ent2 = new Entrada(100);
		Entrada ent3 = new Entrada(45.5);
		Entrada ent4 = new Entrada(70.5);
		
		
		System.out.println(ent);
		System.out.println(ent2);
		System.out.println(ent3);
		System.out.println(ent4);
		
	}
}
