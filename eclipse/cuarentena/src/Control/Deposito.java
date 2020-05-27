package Control;

/**
 * Deposito
 * Propiedades:
 *   capital		//euros
 *   plazodias	//cantidad de días
 *   tipointeres //tanto por ciento, son decimales
 * Métodos:
 *   liquidar(): double //devuelve la suma del capital más los intereses, utilizar las funciones correspondientes.
 *   getIntereses: double //aplica la fórmula: plazodias x tipoIntereses x capital /365
 *   getters de las propiedades.
 *
 *Y otros métodos que consideres necesarios, ten en cuenta que los beneficios de un Deposito son el 15% de su capital.
 *
 * @author Jose Cabrera Rojas
 *
 */

public class Deposito extends Producto{
	
	private double capital;
	private int plazodias;
	private double tipointeres;

	public Deposito(Cliente c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public double liquidar() {
		return this.capital + getIntereses();
	}
	
	public double getIntereses() {
		return this.plazodias * this.tipointeres * (this.capital/365);
	}
	
	
	
	public double getCapital() {
		return capital;
	}

	public int getPlazodias() {
		return plazodias;
	}

	public double getTipointeres() {
		return tipointeres;
	}

	@Override
	public double getBeneficio() {
		
		return this.capital * 0.15;
	}

	@Override
	public String getTipo() {
		return ", tipo : Deposito";
	}

	@Override
	public String toString() {
		return super.toString() + getTipo();
	}
	
	
	
	

}
