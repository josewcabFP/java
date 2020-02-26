package interfaces;
/**
 * Crea la clase Coche, con los atributos matrícula y velocidad, que implemente esta interfaz.
 * 
 * @author Jose Cabrera Rojas
 *
 */
public class Coche implements Movimiento{
	
	private String matricula;
	private int velocidad;

	
	
	public Coche(String matricula, int velocidad) {
		super();
		this.matricula = matricula;
		this.velocidad = velocidad;
	}

	@Override
	public void acelerar() {
		this.velocidad *= 2;
	}

	@Override
	public void frenar() {
		this.velocidad = 0;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	

}
