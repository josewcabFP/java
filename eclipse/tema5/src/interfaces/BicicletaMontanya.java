package interfaces;

public class BicicletaMontanya extends Bicicleta{
	
	private int suspension;
	
	public BicicletaMontanya(int velocidad, int plato, int pinyon) {
		super(velocidad, plato, pinyon);
	}
	
	public void cambiarSuspension(int suspension) {
		this.suspension = suspension;
	}

}
