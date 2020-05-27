package control_errores;

/**
 * Crea una clase Test, que tenga un main, que reciba dos parámetros, realice la división de esos valores y muestre el resultado.
 * Manejar dos errores con un bloque try/catch:
 * 
 * - que reciba dos parámetros, sino informar al usuario.
 * - que el segundo parámetro sea distinto de cero.
 * - que los parámetros sean números enteros (En realidad son String, pero dentro debe haber un número para poder convertirlo).
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Test {
	
	
	public static void main(String [] args) {
	
		try {
			double d = Integer.parseInt(args[0])/Integer.parseInt(args[1]);
			System.out.println(d);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("No has introducido todos los argumentos en la función");
			
		} catch (ArithmeticException e) {
			System.err.println("No se puede dividir entre cero");
		
		}catch (NumberFormatException e) {
			System.err.println("Los parametros deben ser números");
		}
	}
}
