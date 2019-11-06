/**
 * 
 * @author Jose Cabrera Rojas
 */

package coche;

public class Mixto extends Coche {
	
	// ATRIBUTOS
	
	private int capacidad;
	private int carga;
	
	// CONSTRUCTORES
	
	public Mixto() {
		super("rojo");
		this.capacidad = 100;
		this.carga = 0;
	}

	public Mixto(int _capacidad, String _color) {
		super(_color);
		this.capacidad = _capacidad;
		this.carga = 0;
	}
	
	// MÉTODOS
	
	public boolean aumentaCarga(int _carga) {
		boolean flag = false;
		int espacio = this.capacidad - this.carga;
		
		if (espacio >= _carga) {
			this.carga += _carga;
			flag = true;
		}
		
		return flag;
	}
	
	public boolean vaciaCarga(int _carga) {
		boolean flag = false;
		
		if (this.carga >= _carga) {
			this.carga -= _carga;
			flag = true;
		}
		
		return flag;
	}
	
	// GETTERS Y SETTERS

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	
}
