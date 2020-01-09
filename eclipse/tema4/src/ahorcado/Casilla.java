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
	
	/**
	 * @param _valor Valor inicial de la casilla.
	 */
	
	public Casilla(char _valor) {
		this.valor =  Character.toUpperCase(_valor);
		this.coincide = false;
	}
	
	/**
	 *  Constructor sin parametros, inicializa el valor de la casilla a un espacio en blanco.
	 */
	
	public Casilla() {
		this.valor = ' ';
		this.coincide = false;
	}
	
	/**
	 * Método que devuelve un <b>String</b> con el valor de la casilla, decorado ademas, 
	 * con una barra lateral. En caso de que la casilla este vacia (espacio en blanco) devolvera un <b>sub guión</b>
	 * tambien decorado con una barra lateral.
	 * 
	 * <u>Nota</u>: Las barras laterales son utilizadas por cuestion de facilitar la representación
	 * del tablero.
	 * 
	 * @return Devuelve un String con el valor de la casilla <b>decorado</b>.
	 */
	
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
