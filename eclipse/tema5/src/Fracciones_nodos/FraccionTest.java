package Fracciones_nodos;

/**
 * Enunciado: Crea un main que muestre las fracciones originales y las reducidas para los siguientes casos:
 * 0/0
 * 0/1
 * 1/0
 * 1/1
 * 4/10
 * 5/10
 * 2/3
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class FraccionTest {
	
	public static void main (String [] args) {
		System.out.println(Fraccion.reduce(0, 0).mostar());
		System.out.println(Fraccion.reduce(0, 1).mostar());
		System.out.println(Fraccion.reduce(1, 0).mostar());
		System.out.println(Fraccion.reduce(1, 1).mostar());
		System.out.println(Fraccion.reduce(4, 10).mostar());
		System.out.println(Fraccion.reduce(5, 10).mostar());
		System.out.println(Fraccion.reduce(2, 3).mostar());
	}

}
