package array;

import java.util.ArrayList;

/**
 * 
 * Dada la clase Coche. (Ver en fuentes_java.zip del tema)
 * Modifícala y crea un main donde:
 * 		
 * 		• Crea un arrayList de Coches.
 * 		• Añade 5 coches.
 * 		• Muestra los Coches por pantalla.
 * 		• Crea un arrayList de Caracteres.
 * 		• Añade las vocales.
 * 		• Muéstralas por pantalla.
 * 
 * @author Jose Cabrera Rojas
 *
 */

class Coche {

	private String color;
	private int velocidad;

	public Coche(String color) {
		this.color = color;
		this.velocidad = 0;
	}

	public String getColor() {
		return this.color;
	}

	public int getVelocidad() {
		return this.velocidad;
	}

	public void acelera() {
		this.velocidad += 10;
	}

	
	public void frena() {
		this.velocidad	-= 10;
	}

	public String toString() {
		return "Coche, color: " + this.color + ", velocidad: " + this.velocidad;
	}
	
	public static void main(String [] args) {
		
		ArrayList<Coche> arrayCoches = new ArrayList<Coche>();
		
		arrayCoches.add(new Coche("verde"));
		arrayCoches.add(new Coche("amarillo"));
		arrayCoches.add(new Coche("rojo"));
		arrayCoches.add(new Coche("azul"));
		arrayCoches.add(new Coche("gris"));
		
		for(Coche c : arrayCoches) {
			System.out.println(c.toString());
		}
		
		ArrayList<Character> arrayVocales = new ArrayList<Character>();
		arrayVocales.add('a');
		arrayVocales.add('e');
		arrayVocales.add('i');
		arrayVocales.add('o');
		arrayVocales.add('u');
		
		for (Character l : arrayVocales) {
			System.out.println(l);
		}
		
	}
}

