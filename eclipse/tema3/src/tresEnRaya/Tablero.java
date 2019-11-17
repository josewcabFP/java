package tresEnRaya;

/**
 * Esta clase representa un tablero de juego con las dimensiones especificadas,
 * contiene como parametros el número de filas y columnas.
 * 
 * Cada posción en el tablero es un objeto de la clase "Posicion" lo cual facilita la manipulación de
 * de los elementos del tablero.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Tablero {

	private final int filas = 3;
	private final int columnas = 3;
	
	private Posicion [][] tablero;
	
	/**
	 *No recibe parametros. Reserva espacio en la memoria para acontinuación inicializar el tablero.
	 */
	
	public Tablero() {
		this.tablero = new Posicion [this.filas][this.columnas];
		this.iniciarTablero();
	}
	
	/**
	 * Recorre el tablero y va creando en objetos de la clase {@link tresEnRaya.Posicion Posicion} para 
	 * colocarlos en cada casilla. 
	 */
	
	public void iniciarTablero(){ //mejorar posiciones
		
		for (int i = 0; i < this.filas; i++) {
			for (int j = 0; j < this.columnas; j++) {
				this.tablero[i][j] = new Posicion(i, j, ' ');
			}
		}
	}
	
	/**
	 * Imprime en pantalla el tablero de juego. Recorre cada elemento del tablero y lo muestra 
	 * ordenadamente en pantalla.
	 */
	
	public void pintarTablero() {
		System.out.println("(_1_|_2_|_3_)");
		for (int i = 0; i < this.filas; i++) {
			
			System.out.println("-------------");
			System.out.print("| ");
			for (int j = 0; j < this.columnas; j++) {
				System.out.print(this.tablero[i][j].getValor() + " | ");
			}
			System.out.print("");
			System.out.println("(_"+ (i + 1)  +"_)");
		}
		System.out.println("-------------");
	}
	
	public char getElemento(int _x, int _y) {
		return this.tablero[_x][_y].getValor();
	}
	
	public void setElemento(int _x, int _y, char _valor) {
		this.tablero[_x][_y].setValor(_valor);
	}

	public int getFilas() {
		return filas;
	}

	public int getColumnas() {
		return columnas;
	}
	
	
}
