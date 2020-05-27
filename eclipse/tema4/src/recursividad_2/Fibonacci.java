package recursividad_2;

/**
 * Calculo de Fibonacci. Sabiendo que Fibonacci(0) = 0, Fibonacci(1) = 1, y
 * para todos los demás Fibonacci(n) = Fibonacci(n-1)+Fibonacci(n-2). 5.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Fibonacci {

	public static int fibonacci(int n) {
		int suma;
		
		if (n <= 0) {
			suma = 0;
		}
		else {
			suma = n + fibonacci(n - 1);
		}
		
		return suma;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Fibonacci.fibonacci(4));
	}

}
