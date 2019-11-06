/**
 * 
 * @author Jose Cabrera Rojas
 */


package coche;

public class Coche {
	
	// ATRIBUTOS
	
	private String color;
	private int velocidad;
	final int MINIMO = 0;
	final int MAXIMO = 120;
	
	// CONSTRUCTORES
	
	public Coche () {
		this.color = "rojo";
		this.velocidad = 0;
	}
	
	public Coche (String _color) {
		this.color = _color;
		this.velocidad = 0;
	}
	
	public Coche (Coche _coche) {
		this.color = _coche.getColor();
		this.velocidad = 0;
	}
	
	// MÉTODOS
	
	public boolean acelerar() {
		boolean flag = false;
		int cont = 0;
		
		// Acelerar basico
		
//		if (this.velocidad <= 110) {
//			this.velocidad += 10;
//			flag = true;
//		}
		
		
		// Acelerar usando el atributo MAXIMO
		
		while (this.velocidad <= this.MAXIMO && cont < 10) {
			this.velocidad++;
			cont++;
			flag = true;
		}
		
		return flag;
	}
	
	public boolean frenar() {
		
		boolean flag = false;
		int cont = 0;
		
		// Frenar básico
		
//		if (this.velocidad >= 10) {
//			this.velocidad -= 10;
//			flag = true;
//		}
		
		// Frenar usarndo atributo MINIMO
		
		while (this.velocidad >= this.MAXIMO &&  cont < 10) {
			this.velocidad--;
			cont++;
			flag = true;
		}
		
		return flag;
	}
	
	// GETTERS Y SETTERS

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getMINIMO() {
		return MINIMO;
	}

	public int getMAXIMO() {
		return MAXIMO;
	}
		
}
