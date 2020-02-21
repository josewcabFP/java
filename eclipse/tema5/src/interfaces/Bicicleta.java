package interfaces;

public class Bicicleta {
	private int velocidadActual;
	private int platoActual;
	private int pinyonActual;
	
	public Bicicleta(int velocidad, int plato, int pinyon) {
		this.velocidadActual = velocidad;
		this.platoActual = plato;
		this.pinyonActual = pinyon;
	}
	
	public void acelerar() {
		this.velocidadActual *= 2;
	}
	
	public void frenar() {
		this.velocidadActual = 0;
	}
	
	public void cambiarPlato(int plato) {
		this.platoActual = plato;
	}
	
	public void cambiarPlato() {
		this.platoActual = 1;
	}
	
	public void cambiarPinyon(int pinyon) {
		this.pinyonActual = pinyon;
	}
	
	public void cambiarPinyon() {
		this.pinyonActual = 1;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public int getPlatoActual() {
		return platoActual;
	}

	public int getPinyonActual() {
		return pinyonActual;
	}
	
	
}
