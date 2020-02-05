package Fracciones_nodos;

public class Fraccion {

	private int numerador;
	private int denominador;
	
	public Fraccion(int a, int b) {
		this.numerador = a;
		this.denominador = b;	
	}
	
	public String mostar() {
		return (this.numerador + " / " + this.denominador);
	}
}
