package Control;


/**
 * Cuenta.
 * 
 * Propiedades: 
 *   saldo //en euros
 * 
 * Métodos:
 *   ingreso(recibe una cantidad): no devuelve nada.	//aumentará el saldo con la cantidad indicada. 
 * 
 *   reintegro(recibe una cantidad): no devuelve nada. //disminuirá el saldo con la cantidad indicada.
												       //Si no se puede realizar deberá lanzar una excepción.
												       //No manejar la excepción sino lanzarla al que llame a este método.
* 
* Y otros métodos que consideres necesarios, sabiendo que una Cuenta no tiene beneficios.
 * 
 * @author Jose Cabrera Rojas
 *
 */
public class Cuenta extends Producto{

	private double saldo;
	
	public Cuenta(Cliente c) {
		super(c);
	}
	
	public void ingreso(double cantidad) {
		this.saldo += cantidad;
	}
	
	public void reintegro(double cantidad) throws Excepcion_saldo_insuficiente {
		
		if (this.saldo < cantidad) {
			throw new Excepcion_saldo_insuficiente(this.saldo, cantidad);
		}
		else {
			this.saldo -= cantidad;			
		}
	}

	@Override
	public double getBeneficio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getTipo() {
		
		return ", tipo: Cuenta";
	}

	@Override
	public String toString() {
		return this.getTitular().toString() + ", saldo: " + this.saldo + getTipo();
	}
	
	
	
}
