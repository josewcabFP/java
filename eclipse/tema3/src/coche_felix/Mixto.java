package coche_felix;

public class Mixto extends Coche{
	private int capacidad;
	private int carga;
	
	public Mixto() {
		super();
		this.capacidad=350;
		this.carga=0;
	}
	public Mixto(int capacidad,String color) {
		super(color);
		this.capacidad=capacidad;
		this.carga=0;
	}
	public int getCapacidad() {
		return this.capacidad;
	}
	public int getCarga() {
		return this.carga;
	}
	public void aumentaCarga(int carga) {
		if (this.carga<this.capacidad) {
			this.carga+=carga;
		}
	}
	public void vaciaCarga(int carga) {
		if (this.carga>0) {
			this.carga-=carga;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", carga => " + this.getCarga() + ", capacidad => " + this.getCapacidad();
	}
}
