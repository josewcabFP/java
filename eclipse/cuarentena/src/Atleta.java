
import javax.management.RuntimeErrorException;

/**
 * 
 * Dado el siguiente código aplica la refactorización.
 * Hay malos olores en: 
 * 
 * 	- propiedades de la clase atleta Atleta
 * 
 * @author Jose Cabrera Rojas
 */
public class Atleta {
	
	/**
	 * Encapsular atributo (tambien podría ser intimidad inadecuada)
	 * 
	 * Se deben tener los atributos en private, ya que las demas clases no deben acceder a ellos directamente.
	 */

	 private String nombre;
	 private String telefono;
	 private double sueldo;
	 private double porcentaje;
	 private String deporte;
	
	
	public Atleta(String nombre, String telefono, double sueldo, double porcentaje, String deporte) throws Exception {
		this.nombre = nombre;
		this.telefono = telefono;
		this.sueldo = sueldo;
		this.deporte = deporte;
		if (porcentaje <= 0 || porcentaje >100) {
			throw new Exception("El porcentaje debe estar entre 0 y 100");
		}else {
			this.porcentaje = porcentaje;
		}
	}
	/**
	 * Calcula lo que gana la agencia por el deportista.
	 * @return
	 */
	public double gananciaAgencia() {
		return sueldo * porcentaje;
	}
	
	
	
	@Override
	public String toString() {
		return " [nombre=" + nombre + ", telefono=" + telefono + ", sueldo=" + sueldo + ", porcentaje="
				+ porcentaje + ", deporte=" + deporte + "]";
	}
	
	/**
	 * Encapsular atributo
	 * 
	 * Se añaden getters para acceder a los atributos.
	 * 
	 */
	public String getNombre() {
		return nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public double getSueldo() {
		return sueldo;
	}
	public double getPorcentaje() {
		return porcentaje;
	}
	public String getDeporte() {
		return deporte;
	}
	
	
}
