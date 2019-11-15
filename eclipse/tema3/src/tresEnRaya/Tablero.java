package tresEnRaya;

public class Tablero {

	private final int filas = 3;
	private final int columnas = 3;
	
	private Posicion [][] tablero;
	
	public Tablero() {
		this.tablero = new Posicion [this.filas][this.columnas];
		this.iniciarTablero();
	}
	
	public void iniciarTablero(){ //mejorar posiciones
		
		for (int i = 0; i < this.filas; i++) {
			for (int j = 0; j < this.columnas; j++) {
				this.tablero[i][j] = new Posicion(i, j, ' ');
			}
		}
	}
	
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
	
	public static void main (String [] args) {
		Tablero tab1 = new Tablero();
		tab1.iniciarTablero();
		tab1.pintarTablero();
	}
	
	public char getElemento(int _x, int _y) {
		return this.tablero[_x][_y].getValor();
	}
	
	public void setElemento(int _x, int _y, char _valor) {
		this.tablero[_x][_y].setValor(_valor);
	}
}
