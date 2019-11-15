package tresEnRaya;

public class Juego {
	private Tablero tableroJuego;
	private String jugador1;
	private String jugador2;
	private int score1;
	private int score2;
	
	public Juego (String _jug1, String _jug2) {
		this.tableroJuego = new Tablero();
		this.jugador1 = _jug1;
		this.jugador2 = _jug2;
		this.score1 = 0;
		this.score2 = 0;
	}
	
	public boolean marcarSimbolo(int _x, int _y, String _jug) {
		
		// al llamar a la funcion el programa debe indicar que jugador esta jugando en ese momento!
		boolean jugadaEfectuada = false;
		
		if (this.tableroJuego.getElemento(_x, _y) == ' ') {
			if (_jug == this.jugador1) {
				this.tableroJuego.setElemento(_x, _y, 'X');
			}
			else if (_jug == this.jugador2) {
				this.tableroJuego.setElemento(_x, _y, 'O');
			}
			jugadaEfectuada = true;
		}
		
		else
			System.out.println("Esa no es una posicion valida");
		
		return jugadaEfectuada;
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
	
	
}
