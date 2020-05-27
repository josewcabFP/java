package recursividad_2;

/**
 * Dado un número, muestra por pantalla el número invertido
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Invertido {

	public static int invert(int x) {
		int ceros = 0;
		int temp = x;
		int invertido;
		
		
		if (x == 0) {
			invertido = 0;
		}
		else {

		while (temp > 0) {
			ceros++;
			temp = (int) temp / 10;
		}
		
		invertido = (x % 10) * (int)Math.pow(10, ceros - 1);

		x = (int) x / 10;

			invertido += invert(x);
		}

		return invertido;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Invertido.invert(1234));


	}

}
