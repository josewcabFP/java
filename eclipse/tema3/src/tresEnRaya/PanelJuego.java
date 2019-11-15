package tresEnRaya;

import java.util.Scanner;

public class PanelJuego {
	
	
	private Juego juego;
	private Scanner sc;
	private Posicion pos;
	
	public PanelJuego() {
		this.juego = new Juego("jose", "juan");
		this.sc = new Scanner(System.in);
		this.pos = new Posicion(0, 0, ' ');
	}
	
	public void turnoJugada() { // se puede mejorar
		String jugada = "";
		while(true) {
			System.out.print("turno de " + this.juego.getJugador1() + ", introduce coordenadas (separadas por espacios): ");
			jugada = sc.nextLine();
			this.pos.setX(Character.getNumericValue(jugada.charAt(0)) - 1);
			this.pos.setY(Character.getNumericValue(jugada.charAt(2)) - 1);
			
			this.juego.marcarSimbolo(this.pos.getX(), this.pos.getY(), this.juego.getJugador1());
			
			this.juego.getTableroJuego().pintarTablero();
			
			System.out.print("turno de " + this.juego.getJugador2() + ", introduce coordenadas (separadas por espacios): ");
			jugada = sc.nextLine();
			this.pos.setX(Character.getNumericValue(jugada.charAt(0)) - 1);
			this.pos.setY(Character.getNumericValue(jugada.charAt(2)) - 1);
			
			this.juego.marcarSimbolo(this.pos.getX(), this.pos.getY(), this.juego.getJugador2());
			
			this.juego.getTableroJuego().pintarTablero();
		}
	}

	public static void main(String[] args) {
		PanelJuego panel = new PanelJuego();
		panel.turnoJugada();

	}

}
