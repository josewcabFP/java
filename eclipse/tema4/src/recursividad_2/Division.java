package recursividad_2;

/**
 * Calcular una división por restas sucesivas Division (dividendo, divisor).
 * 
 * @author Jose Cabrera Rojas
 */

public class Division {
	
	
	public static double division(double dividendo, double divisor) {
		double resta = dividendo -divisor;
		double result = 1;
		
		if (resta < 0) {
			result = 0;
		}
		
		else {
			result = result + division(dividendo - divisor, divisor);
		}
		
		return result;
	}
	
	
	// Esta forma es una experimentación para devolver cocientes decimales. (Aun queda por corregir algun fallo)
	
	public static double otraDiv(double a, double b) {
		double resta = a - b;
		double result = 1;
		
		if (resta < 0 ) {

			if (resta >= -10 && a != 0 && b < 100) {
				result = 0.1 + otraDiv(resta, b);
			}
			else if (resta >= -100 && resta < -10 && a != 0 && b > 10 && b < 1000) {
				result = 0.01 + otraDiv(resta, b);
			}
			else if(resta >= -1000 && a != 0 && b > 100 && b < 10000) {
				result = 0.001 + otraDiv(resta, b);
			}
			else if(resta >= -10000 && a != 0 && b > 1000) {
				result = 0.0001 + otraDiv(resta,b);
			}
	
			else {
				result = 0;
			}
		}
		
		else {
			result = result + otraDiv(a - b, b);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Division.division(6, 2));
		System.out.println(Division.otraDiv(5, 2));

	}

}
