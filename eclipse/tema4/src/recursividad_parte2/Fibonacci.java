package recursividad_parte2;

/**
 * Enunciado: Calculo de Fibonacci. Sabiendo que Fibonacci(0) = 0, Fibonacci(1) = 1, y
 * para todos los demás Fibonacci(n) = Fibonacci(n-1)+Fibonacci(n-2). 5.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Fibonacci {
	
	public static int fibo(int n) {
		int fibonac;
		
		if (n <= 0) {
			fibonac = 0; 
		}
		else {
			fibonac = n + fibo(n - 1); 
		}
		
		return fibonac;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Fibonacci.fibo(2));

	}

}
