package Control;

import java.io.Serializable;

/**
 * Producto
 * Propiedades:
 * - titular: Cliente
 * Métodos: 
 * - Constructor, que recibe el cliente.
 * - get de titular.
 * - getImpuestos(): double //devuelve los impuestos que será el 18% del beneficio
 * - getBeneficio(): double //no implementada.
 * - getTipo(): String //no implementada.
 * - toString: String //redefine el método toString, devuelve la información del titular, el tipo, el beneficio y los impuestos.
 * Determina como debe ser esta clase: normal, abstracta o una interfaz.
 * - Poner un comentario explicando tu decisión.
 * 
 * @author Jose Cabrera Rojas
 *
 */
public abstract class Producto implements Serializable{
	
	//tuve que añadir la interfaz serailizable para poder guardar el archivo
	
	//Esta clase debe ser abstracta ya que hay métodos sin implementar.
	
	private Cliente titular;
	
	public Producto(Cliente c) {
		this.titular = c;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	public double getImpuestos() {
		
		return getBeneficio() * 0.18;
	}
	
	public abstract double getBeneficio();
	
	public abstract String getTipo();

	@Override
	public String toString() {
		return this.titular.toString() + ", beneficio: " + getBeneficio() + ", impuestos: " + getImpuestos();
	}
	
	
	
}
