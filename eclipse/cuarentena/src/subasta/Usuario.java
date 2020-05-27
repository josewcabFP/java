package subasta;

/**
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Usuario {
	
	private String nombre;
	private double credito;
	private final double CREDITO_MINIMO = 50;
	
	public Usuario(String _nombre, double _credito) {
		this.nombre = _nombre;
		this.credito = _credito;
	}
	
	public Usuario(String _nombre) {
		this.nombre = _nombre;
		this.credito = CREDITO_MINIMO;
	}
	
	public void addCredito(double cantidad) {
		this.credito += cantidad;
	}
	
	public void subCredito(double cantidad) {
		
		if (!creditoInsuficiente(cantidad)) {
			this.credito -= cantidad;
		}
	}
	
	public boolean creditoInsuficiente(double cantidad) {
		return this.credito < cantidad; 
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public double getCredito() {
		return this.credito;
	}
	
	

}
