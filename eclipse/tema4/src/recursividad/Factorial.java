package recursividad;

/**
 * int factorial(int n)
 * 
 * calcula el factorial de un n�mero. Ten en cuenta que factorial de 0 
 * o menos de 0 es 1. Y factorial de un n�mero es ese n�mero por factorial de ese n�mero menos 1.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Factorial {

	
	public static int calculaFactorial(int n) {
		
		int fact;
		
		if(n <= 0) {
			fact = 1;	
		}
		else {
			fact = n * calculaFactorial(n - 1);
		}
		return fact;
	}
	
	

	public static void main(String[] args) {
		
		System.out.println(Factorial.calculaFactorial(3));
		

	}

}
