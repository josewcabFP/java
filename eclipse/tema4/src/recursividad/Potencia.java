package recursividad;

/**
 * Enunciado: Crea una clase que calcule la potencia de una número recursivamente.
 * 
 * 		- static int power (int base, int exponente)
 * 
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Potencia {
	
	public static int power(int base, int exp) {
		int pot;
		
		if (exp <= 0) {
			pot = 1;
		}
		else {
			pot = (base) * power(base, exp - 1);
		}
		
		return pot;
	}

	public static void main(String[] args) {
		
		System.out.println(Potencia.power(2, 3));

	}

}
