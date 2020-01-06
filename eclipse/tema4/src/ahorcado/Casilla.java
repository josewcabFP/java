package ahorcado;

public class Casilla {
	
	/**
	 * La clase "Casilla" representa a una letra de la palabra buscada que sera mostrada en 
	 * una casilla solo si el usuario ha introducido una letra que coinsida con alguna letra de la palabra buscada.
	 * 
	 * @author Jose Cabrera Rojas
	 * */
	
	private char valor;
	private boolean coincide;
	
	public Casilla(char _valor) {
		this.valor =  Character.toUpperCase(_valor);
		this.coincide = false;
	}
	
	public Casilla() {
		this.valor = ' ';
		this.coincide = false;
	}
	
	public String pintaCasilla() {
		
		String pinta;
		if (this.valor == ' ') {
			pinta = " _ |";
		}
		else {
			pinta = " " + this.valor + " |";
		}
		
		return pinta;
	}
	
	public void setValor(char _letra) {
		this.valor = Character.toUpperCase(_letra);
	}
	
	public char getValor() {
		return this.valor;
	}
	
	public void setCoincide(boolean b) {
		this.coincide = b;
	}
	
	public boolean getCoincide() {
		return this.coincide;
	}
}
