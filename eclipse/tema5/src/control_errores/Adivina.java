package control_errores;

/**
 * Crear un programa para que el usuario adivine un número aleatorio del 1 al 10.
 * 
 *		-Tiene infinitos intentos.
 *		-Si el usuario introduce un valor distinto de número debe tratarlo con una excepción y permitir continuar.
 * 
 * 
 * @author Jose Cabrera Rojas
 */

import java.util.Scanner;

public class Adivina {
	
	public static void adivinar() {
		Scanner sc = new Scanner (System.in);
		int numRandom = (int)(Math.random() * 10) + 1;
		boolean encontrado = false;
		int numero;
		
		while (!encontrado) {
			System.out.print("Introduce un número para comparar: ");
			numero = sc.nextInt();
			
			if (numero == numRandom) {
				encontrado = true;
				System.out.println("Has dado con el número");
			}
			else {
				AdvinaError err = new AdvinaError(numero);
				System.err.println(err.getMessage());
			}
		}
	}
	
	public static void main (String [] args) {
		adivinar();
	}

}
