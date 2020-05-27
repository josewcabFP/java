package tema9_genericos;

public class MiArrayList {

	private Object [] datosElemento;
	private int contador=0;
	
	public MiArrayList(int cantidad) {
		this.datosElemento = new Object[cantidad];
	}
	
	public Object get(int i) {
		return this.datosElemento[i];
	}
	public void add(Object obj) {
		this.datosElemento[this.contador]= obj;
		this.contador++;
	}
}
