package Estatico;

public class A {
	
	int a;
	static int b;
	final static int CONSTANTE_STATIC; // Esta constante hace que todas los objetos de la clase hagan una referencia a una unica posicion de memoria (la que contiene esta variable)
	final int CONSTANTE_INSTANCIA; // Si bien es cierto que esta constante la tendran todos los objetos, cada uno hara referencia a diferentes zonas de memoria (la suya propia)
	
	static { // podemos usar este campo para declarar las variables static;
		b = 0;
		CONSTANTE_STATIC = 4; 
	}
	
	public A(int valor) {
		this.CONSTANTE_INSTANCIA = valor + 100; //incluso podemos hacer que cada objeto tenga una constante diferente.
	}
}
