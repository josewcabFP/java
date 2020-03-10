package adivina;
/**
 * Crear un programa para que el usuario adivine un número aleatorio del 1 al 10.
 * Tiene infinitos intentos.
 * Si el usuario introduce un valor distinto de número debe tratarlo con una excepción y permitir continuar.
 * 
 * @author Jose Cabrera Rojas
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Adivina {
	
	public static void adivinar() {
		Scanner sc = new Scanner (System.in);
		int numRandom = (int)(Math.random() * 10) + 1;
		boolean encontrado = false;
		int numero;
		
			
			while (!encontrado) {
				try {
					System.out.print("Introduce un numero: ");
					numero = sc.nextInt();
					if(numero == numRandom) {
						System.out.println("Has encontrado el número");
						encontrado = true;
					}
					else {
						System.out.println("Ese no es el numero...");
					}
					
				}catch (InputMismatchException e) {				
					System.err.println("No has introducido un número.");
					
					if(sc.hasNext()) {
						sc.next();
					}
				}
			}
			
			sc.close();
	}
	

	public static void main(String[] args) {
		 adivinar();

	}
	

}
