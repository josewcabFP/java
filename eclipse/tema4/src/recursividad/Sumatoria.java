package recursividad;

/**
 * Enunciado: Crea una clase que calcule la sumatoria de un número recursivamente;
 * 
 * 		- static int sumar(int n)
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Sumatoria {
	
	public static int sumar(int _num) {
		int suma;
		
		if (_num <= 0) {
			suma = 0;
		}
		else {
			suma = _num + sumar(_num - 1);
		}
		
		return suma;
	}

	public static void main(String[] args) {
		
		System.out.println(Sumatoria.sumar(4));
	}

}
