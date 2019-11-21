/**
 * Enunciado: Crear un menú estático utilizando los siguientes atributos y métodos estáticos:
 * 
 *  -	pintaMenu()
 *  -	ejecutaOpcion()
 *  -	leeOpcion()
 *  
 *  Ademas su pueden crear métodos estaticos extra segun nuestra conveniencia.
 *  
 *  @author Jose Cabrera Rojas
 *  
 */

package menu;

import java.util.Scanner;

public class Menu {
	
	private static Scanner sc;
	
	static {
		sc = new Scanner(System.in);
	}
	
	public static int mayor() {
		int [] nums = new int [2];
		nums = Menu.solicitaNums();
		int mayor = nums[0];
		
		if (nums[1] > nums[0]) {
			mayor = nums[1];
		}
		
		return mayor;
	}
	
	public static void pintaMenu() {
		System.out.println("----------------\n"
						+ "Elige una opción\n"
						+ "----------------\n\n"
						+ "1. Calcular el mayor.\n"
						+ "2. Calcular suma.\n"
						+ "3. Calcular multiplicación.\n"
						+ "0. Salir.\n\n");
	}
	
	public static void ejecutaOpcion(int _opc) {
		switch(_opc) {
		
		case 1 : System.out.print("\n------------------\n"
								+ "Calulando el mayor: \n"
								+ "------------------\n\n"
								+ "El mayor es: " + Menu.mayor());
				break;
		case 2 : System.out.print("\n-----------------\n"
								+ "Calulando la suma: \n"
								+ "-----------------\n\n"
								+ "El mayor es: " + Menu.multiplica());
				break;
		case 3: System.out.print("\n-------------------------\n"
								+ "Calulando multiplicación: \n"
								+ "-------------------------\n\n"
								+ "El mayor es: " + Menu.mayor());
				break; 
		case 0:
			break;
			
		}
	}

	public static int[] solicitaNums() {
		int [] nums = new int [2];
		
		System.out.print("Introduce el primer número: ");
		nums[0] = sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		nums[1] = sc.nextInt();
		
		return nums;
	}
	
	public static int leeOpcion() {
		int opc = 4;
		opc = sc.nextInt();
		return opc;
	}
	
	public static int suma() {
		
		int [] suma = new int [2];
		
		suma = Menu.solicitaNums();
		
		return suma[0] + suma[1];
	}
	
	public static int multiplica() {
		int [] multi = new int [2];
		
		multi = Menu.solicitaNums();
		
		return multi[0] * multi[1];
	}
}
