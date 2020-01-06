package ahorcado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		
		do {
			System.out.println("\n-----------------\nElige una opción:\n"
					+ 		   "-----------------");
			System.out.println("1. Jugar al ahorcado.\n"
					+ 		   "2. Salir.\n");
			
			opc = sc.nextInt();
			
			if (opc == 1) {
				
				Juego juego = new Juego();
				juego.iniciaJuego();
				
				char letra;
				
				while(!juego.getFinalizado()) {
					
					System.out.print("Por favor, introduce una letra: ");
					letra = Character.toUpperCase(sc.next().charAt(0));
					juego.jugada(letra);
					juego.haFinalizado();
					
				}
				
				juego.haGanado();
				
			}
		}while(opc != 2);

	}

}
