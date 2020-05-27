package supermercado;

/**
 * Clase que representa la caja del supermercado
 * 
 * 
 * @author Jose Cabrera, Daniel Nevado
 *
 */

public class Caja {
	
	private int caja;
	private String nombre;
	
	/**
	 * Constructor: inicializa la Caja
	 * @param idCaja, representa la ID para la caja.
	 */
	
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
