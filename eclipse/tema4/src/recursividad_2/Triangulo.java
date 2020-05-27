package recursividad_2;
/**
 *  Mostrar el triángulo, Triangulo(5)
 *  
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Triangulo {
	
	public static String triangulo(int t) {
		String s = "";
		
		if (t <= 0) {
			s = "";
		}
		else {
			for (int i = 0; i < t; i++) {
				s = s + "*";
			}
			s = triangulo(t - 1) + s + '\n';	
			
		}
		
		return s;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(triangulo(5));
	}

}
