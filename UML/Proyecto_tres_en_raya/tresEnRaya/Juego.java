package tresEnRaya;

/**
 * Clase que representa el juego tres en raya. Contiene como atributo principal un 
 * objeto de la clase {@link tresEnRaya.Tablero Tablero} de 3 x 3, ademas de los nombres y los puntajes de cada jugador.</br>
 * 
 * Esta clase posee tambien métodos para el manejo de cada interación con el tablero.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Juego {
	private Tablero tableroJuego;
	private String jugador1;
	private String jugador2;
	private int score1;
	private int score2;

	/**
	 * Inicializa el atributo {@link tresEnRaya.Tablero tablero} creando un nuevo
	 * objeto de esa clase y además inicializa los demas atributos para su posterior uso. 
	 */
	
	public Juego() {
		this.tableroJuego = new Tablero();
		this.jugador1 = "";
		this.jugador2 = "";
		this.score1 = 0;
		this.score2 = 0;
	}
	
	/**
	 * Método que introduce en una casilla del tablero una marca (X / O) en la coordenada dada, que 
	 * depenederá, del jugador que este jugando en ese momento. Solo se podrá introducir una marca 
	 * si la casilla esta vacia y si la coordenada no exede el tamaño del tablero.
	 * 
	 * @param _x Número de fila.
	 * @param _y Número de columna
	 * @param _jug Nombre del jugador
	 * @return Devuelve true si se ha conseguido introducir el valor para dicha casilla.
	 */

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
	
	/**
	 * Método que determina si se ha conseguido un <em>tres en raya</em>. Este método comprueba si
	 * el tablero posee <strong>tres caracteres iguales en linea</strong> lo que significa que
	 * hay un ganador y que el juego ha terminado.
	 * @return Devuelve <strong>true</strong> si el juego ha terminado.
	 */


	public boolean juegoTerminado() { 

		boolean fin = false;

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
	
	/**
	 * Método que determina si <em>todas</em> las casillas estan ocupadas.
	 * @return Devolvera <strong>true</strong> si todas las casillas estan ocupadas.
	 */

	public boolean casillasLLenas() {
		boolean lleno = false;
		int contadorCasillas = 0;
		
		// Contaremos casillas ocupadas y si la suma da 9 es por que todas estan llenas.

		for (int i = 0; i < this.getTableroJuego().getColumnas(); i++) {
			for (int j = 0; j < this.getTableroJuego().getFilas(); j++) {
				if (!this.estaVacio(i, j)) {
					contadorCasillas++;

				}
			}
		}

		if (contadorCasillas == 9) {
			lleno = true;
		}

		return lleno;
	}
	
	/**
	 * Método que determina si la posición dada por coordenadas esta vacia.
	 * @param _x Número de fila.
	 * @param _y Número de columna.
	 * 
	 * @return Devolvera <strong>true</strong> si la casilla esta vacia.
	 */

	private boolean estaVacio(int _x, int _y) {
		boolean vacio = false;
		if (this.tableroJuego.getElemento(_x, _y) == ' ') {
			vacio = true;
		}

		return vacio;
	}
	
	/**
	 * Método que aumenta el puntaje del jugador introducido.
	 * @param _jugador Nombre de jugador al cual se aumentara su puntaje.
	 */
	
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
