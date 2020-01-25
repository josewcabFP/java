package supermercado;

public class Caja {
	
	private int caja;
	private String nombre;
	
	public Caja(int idCaja) {
		this.caja = idCaja;
		this.nombre = "Caja " + this.caja;
	}
	
	public String  getNombre() {
		return this.nombre;
	}
	
	// Siendo Nombre un String, ¿haria falta un toString?
	
	public String toString() {
		
		return this.nombre;
	}
	
}
