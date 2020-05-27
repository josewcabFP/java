package subasta;

/**
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Puja {

	private Usuario pujador;
	private double cantidad;
	private Subasta subasta;
	
	public Puja(Usuario u, double c, Subasta s) {

		this.pujador = u;
		this.cantidad = c;
		this.subasta = s;
	}

	public Usuario getUsuario() {
		return pujador;
	}

	public double getCantidad() {
		return cantidad;
	}

	public Subasta getSubasta() {
		return subasta;
	}
	
	
	
	
}
