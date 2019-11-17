package tresEnRaya;

import java.util.Scanner;

public class PanelJuego {

	private Juego juego;
	private Scanner sc;
	private Posicion posJugada;

	public PanelJuego() {
		this.juego = new Juego();
		this.sc = new Scanner(System.in);
		this.posJugada = new Posicion(0, 0, ' ');
	}

	public void jugar() { 

		boolean terminado = false;
		int jugadas = 1;

		while (!terminado) {

			System.out.println("\n>>> " + this.juego.getJugador1() + " VS " + this.juego.getJugador2() + " <<<\n"
								+ "---------------------\n");

			if (jugadas % 2 != 0) {
				this.solicitaCoord(this.juego.getJugador1());
				System.out.println();
				this.juego.marcarSimbolo(this.posJugada.getX(), this.posJugada.getY(), this.juego.getJugador1());
				this.pintarJuego();

				if (this.juego.juegoTerminado() && !this.juego.casillasLLenas()) {
					terminado = true;
					this.juego.aumentaScore(this.juego.getJugador1());
					System.out.println("\nHa ganado el jugador " + this.juego.getJugador1() + "!");
				}
			}
			else if(jugadas % 2 == 0) {
				this.solicitaCoord(this.juego.getJugador2());
				System.out.println();
				this.juego.marcarSimbolo(this.posJugada.getX(), this.posJugada.getY(), this.juego.getJugador2());
				this.pintarJuego();
				
				System.out.println("jugador 2");

				if (this.juego.juegoTerminado() && !this.juego.casillasLLenas()) {
					terminado = true;
					this.juego.aumentaScore(this.juego.getJugador2());
					System.out.println("\nHa ganado el jugador " + this.juego.getJugador2() + "!");
				}
			
			}
			
			if (this.juego.casillasLLenas()) {
		
			terminado = true;
			System.out.println("\nHa habido un empate!");
			}
			jugadas++;

		}

		//this.sc.close();

	}

	private void solicitaNombres() {
		String[] nombre = new String[2];
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce el nombre del jugador 1: ");

		nombre[0] = scan.nextLine();
		this.juego.setJugador1(nombre[0]);

		System.out.print("Introduce el nombre del jugador 2: ");

		nombre[1] = scan.nextLine();
		this.juego.setJugador2(nombre[1]);

		// si cierro el scanner me da problemas con los demas scanners no se por que
		
	}

	private void pintarJuego() {
		this.juego.getTableroJuego().pintarTablero();
	}
	
	public int menuJuego() {
		int opc = 0;
		System.out.println("----------------------\n"
						 + ">--- Tres en raya ---<\n"
						 + "----------------------\n");
		System.out.println("Elige una opcion:\n\n"
						 + "1. Jugar\n"
						 + "2. Salir");
		opc = sc.nextInt();
		
		
		return opc;
	}

	public void solicitaCoord(String _jugador) {
		
		Scanner scaner = new Scanner(System.in);

		String jugada = "";
		System.out.print("Turno de " + _jugador + ", introduce coordenadas (separadas por espacios): ");
		jugada = scaner.nextLine();
		this.posJugada.setX(Character.getNumericValue(jugada.charAt(0)) - 1);
		this.posJugada.setY(Character.getNumericValue(jugada.charAt(2)) - 1);

	}

	
	public void iniciaJuego() {
		int opc = 0;
		while (opc != 2) {
			opc = this.menuJuego();
			if (opc == 1) {
				this.solicitaNombres();
				this.jugar();
			}
		}
	}

}
