package Fracciones_nodos;

/**
 * Enunciado: Crea la función reduce(), que modifique la fracción para que quede la irreeducible.
 * 	- Se puede hacer con recursividad (entonces probablemente necesites dos métodos), o con bucles.
 * 	- Tener en cuenta que si numerador o denominador es 0 o 1 no se puede reducir.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Fraccion {

	private int numerador;
	private int denominador;

	public Fraccion(int a, int b) {
		this.numerador = a;
		this.denominador = b;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	public String mostar() {
		return (this.numerador + " / " + this.denominador);
	}

	public static Fraccion reduce(int num, int den) {
		
			Fraccion result = new Fraccion(num, den);
			int comunDiv = Fraccion.divisibleEn(num, den);

			if (comunDiv > 1) {
				result = reduce(num / comunDiv, den / comunDiv);
			}
		

		return result;
	}

	public static int divisibleEn(int num, int den) {
		int i = 2;
		boolean encontrado = false;
		while (i <= num && !encontrado) {
			if (num % i == 0 && den % i == 0) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if (!encontrado) {
			i = -1;
		}
		return i;
	}

	public static void main(String[] args) {

		

	}

}
