package bloque16;

import java.util.Scanner;

/**
 * Se deben jugar tantas partidas como decida el jugador. Una partida dura hasta
 * que hay un resultado de ganar o perder. Suma o resta puntos y cuando termine
 * da el resultado, con un mensaje como el siguiente. Se han jugado 3 partidas y
 * ha obtenido 2 puntos.
 *
 * @author Jose Cabrera Rojas
 *
 */

public class TestCraps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Craps craps = new Craps();
		Scanner sc = new Scanner(System.in);

		System.out.print("¿Cuántas partidas quieres jugar: ");

		int contJug = sc.nextInt();
		sc.close();
		int score = 0, i = 0;
		while (i < contJug) {
			if (!craps.juego()) {
				if (craps.gana()) {
					score++;
				} else if (craps.pierde()) {
					if (score > 0) {
						score--;
					}
				}
				i++;
			}

		}

		System.out.println("\n======= Juego terminado =======\n\nSe han jugado " + i + " partidas, y ha obtenido: "
				+ score + " puntos.");

	}

}
