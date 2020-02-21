package interfaces;

public class BicicletaTandem extends Bicicleta{

	private int numAsientos;
	
	public BicicletaTandem(int velocidad, int plato, int pinyon, int numAsientos) {
		super(velocidad, plato, pinyon);
		this.numAsientos = numAsientos;
	}
	
	public void acelerar() {
		this.setVelocidadActual(this.getVelocidadActual() * 3);
	}
}
