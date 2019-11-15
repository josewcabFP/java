package tresEnRaya;

public class Posicion {
	private int x;
	private int y;
	private char valor;
	
	
	public Posicion(int _x, int _y, char _valor) {
		this.x = _x;
		this.y = _y;
		this.valor = _valor;
	}


	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


	public char getValor() {
		return valor;
	}


	public void setX(int x) {
		this.x = x;
	}


	public void setY(int y) {
		this.y = y;
	}


	public void setValor(char valor) {
		this.valor = valor;
	}
	
	
	
	
	
}
