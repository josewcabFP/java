import java.io.Serializable;

/**
 * - Crear una clase sencilla, la que queráis, pero que sea una original vuestra,
 * 	 es decir no recicléis de las que hemos visto en clase, que no sea un Coche, o una Bicicleta, etc.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Altavoz implements Serializable{
	
	private String modelo;
	private double voltaje;
	private boolean encendido;
	
	public Altavoz(String modelo, double voltaje) {
		this.modelo = modelo;
		this.voltaje = voltaje;
		this.encendido = false;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void encender() {
		System.out.println("Has encendido el altavoz modelo " + this.modelo);
		this.encendido = true;
	}
	
	public void apagar() {
		System.out.println("Has apagado el altavoz.");
		this.encendido = false;
	}

	public String getModelo() {
		return modelo;
	}

	public double getVoltaje() {
		return voltaje;
	}
	
	
	
	
	
	

	

}
