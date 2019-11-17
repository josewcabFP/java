package tresEnRaya;

public class Juego {
	private Tablero tableroJuego;
	private String jugador1;
	private String jugador2;
	private int score1;
	private int score2;

	public Juego(String _jug1, String _jug2) {
		this.tableroJuego = new Tablero();
		this.jugador1 = _jug1;
		this.jugador2 = _jug2;
		this.score1 = 0;
		this.score2 = 0;
	}

	public boolean marcarSimbolo(int _x, int _y, String _jug) {

		boolean jugadaEfectuada = false;

		if (_x < this.getTableroJuego().getFilas() && _x >= 0 && _y < this.getTableroJuego().getColumnas() && _y >= 0) {

			if (this.tableroJuego.getElemento(_x, _y) == ' ') {
				if (_jug == this.jugador1) {
					this.tableroJuego.setElemento(_x, _y, 'X');
				} else if (_jug == this.jugador2) {
					this.tableroJuego.setElemento(_x, _y, 'O');
				}
				jugadaEfectuada = true;
			}
		}

		else
			System.out.println("Esa no es una posicion valida");

		return jugadaEfectuada;
	}


	public boolean juegoTerminado() { // determina si el juego ha terminado

		boolean fin = false;

		// Recorre en array y determina si hay un tres en raya,

		for (int i = 0; i < this.getTableroJuego().getFilas(); i++) {

			for (int j = 0; j < this.getTableroJuego().getColumnas(); j++) {

				// horizontales

				if (this.getValor(0, j) == this.getValor(1, j) && this.getValor(1, j) == this.getValor(2, j)
						&& !this.estaVacio(0, j)) {

					fin = true;

					// verticales

				} else if (this.getValor(j, 0) == this.getValor(j, 1) && this.getValor(j, 1) == this.getValor(j, 2)
						&& !this.estaVacio(j, 0)) {

					fin = true;
				}

			}
		}

		// diagonales

		if (this.getValor(0, 0) == this.getValor(1, 1) && this.getValor(1, 1) == this.getValor(2, 2)
				&& !this.estaVacio(0, 0)) {
			fin = true;
		} else if (this.getValor(0, 2) == this.getValor(1, 1) && this.getValor(1, 1) == this.getValor(2, 0)
				&& !this.estaVacio(1, 1)) {
			fin = true;
		}

		return fin;
	}

	public boolean casillasLLenas() {
		boolean lleno = false;
		int contadorCasillas = 0;

		for (int i = 0; i < this.getTableroJuego().getColumnas(); i++) {
			for (int j = 0; j < this.getTableroJuego().getFilas(); j++) {
				if (this.getValor(i, j) != ' ') {
					contadorCasillas++;

				}
			}
		}

		if (contadorCasillas == 9) {
			lleno = true;
		}

		return lleno;
	}

	private boolean estaVacio(int _x, int _y) {
		boolean vacio = false;
		if (this.tableroJuego.getElemento(_x, _y) == ' ') {
			vacio = true;
		}

		return vacio;
	}
	
	public void aumentaScore(String _jugador) {
		if (_jugador == this.jugador1) {
			this.score1++;
		}
		else if (_jugador == this.jugador2) {
			this.score2++;
		}
	}

	private char getValor(int _x, int _y) {
		return this.getTableroJuego().getElemento(_x, _y);
	}

	public String getJugador1() {
		return jugador1;
	}

	public String getJugador2() {
		return jugador2;
	}

	public int getScore1() {
		return score1;
	}

	public int getScore2() {
		return score2;
	}

	public Tablero getTableroJuego() {
		return tableroJuego;
	}

	public void setTableroJuego(Tablero tableroJuego) {
		this.tableroJuego = tableroJuego;
	}

	public void setJugador1(String jugador1) {
		this.jugador1 = jugador1;
	}

	public void setJugador2(String jugador2) {
		this.jugador2 = jugador2;
	}

	
}
