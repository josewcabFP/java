package interfaces;

/**
 * Crea la clase JugueteAutomatico, con los atributos nombre, batería, que implementa 
 * la interfaz Movimiento.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class JugueteAutomatico implements Movimiento{
	
	private String nombre;
	private double bateria;

	
	
	public JugueteAutomatico(String nombre, double bateria) {
		this.nombre = nombre;
		this.bateria = bateria;
	}

	@Override
	public void acelerar() {
		System.out.println("El juguete acelera!");
		
	}

	@Override
	public void frenar() {
		System.out.println("El juguete se a detenido!");
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getBateria() {
		return bateria;
	}

	public void setBateria(double bateria) {
		this.bateria = bateria;
	}
	
	

}
