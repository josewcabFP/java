package tresEnRaya;

import java.util.Scanner;

public class PanelJuego {

	private Juego juego;
	private Scanner sc;
	private Posicion posJugada;

	public PanelJuego() {
		String[] nombres = this.solicitaNombres();
		this.juego = new Juego(nombres[0], nombres[1]);
		this.sc = new Scanner(System.in);
		this.posJugada = new Posicion(0, 0, ' ');
	}

	public void jugar() { // se puede mejorar

		boolean terminado = false;
		int jugadas = 1;

		while (!terminado) {

			
			System.out.println(">>> " + this.juego.getJugador1() + " VS " + this.juego.getJugador2() + " <<<\n"
								+ "---------------------\n");

			if (jugadas % 2 != 0) {
				this.solicitaCoord(this.juego.getJugador1());
				System.out.println();
				this.juego.marcarSimbolo(this.posJugada.getX(), this.posJugada.getY(), this.juego.getJugador1());
				this.pintarJuego();

				if (this.juego.juegoTerminado()) {
					terminado = true;
					this.juego.aumentaScore(this.juego.getJugador1());
					System.out.println("Ha ganado el jugador " + this.juego.getJugador1() + "!");
				}
			}
			else if(jugadas % 2 == 0) {
				this.solicitaCoord(this.juego.getJugador2());
				System.out.println();
				this.juego.marcarSimbolo(this.posJugada.getX(), this.posJugada.getY(), this.juego.getJugador2() + "!");
				this.pintarJuego();

				if (this.juego.juegoTerminado()) {
					terminado = true;
					this.juego.aumentaScore(this.juego.getJugador2());
					System.out.println("Ha ganado el jugador " + this.juego.getJugador2());
				}
			
			}
			
			else if(this.juego.casillasLLenas()) {
				terminado = true;
			}
			
			jugadas++;

		}

		this.sc.close();

	}

	private String[] solicitaNombres() {
		String[] nombre = new String[2];
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce el nombre del jugador 1: ");

		nombre[0] = scan.nextLine();

		System.out.print("Introduce el nombre del jugador 2: ");

		nombre[1] = scan.nextLine();

		// si cierro el scanner me da problemas con los demas scanners no se por que

		return nombre;
	}

	private void pintarJuego() {
		this.juego.getTableroJuego().pintarTablero();
	}

	public void solicitaCoord(String _jugador) {

		String jugada = "";
		System.out.print("Turno de " + _jugador + ", introduce coordenadas (separadas por espacios): ");
		jugada = sc.nextLine();
		this.posJugada.setX(Character.getNumericValue(jugada.charAt(0)) - 1);
		this.posJugada.setY(Character.getNumericValue(jugada.charAt(2)) - 1);

	}

	public static void main(String[] args) {
		PanelJuego panel = new PanelJuego();
		panel.jugar();

	}

}
