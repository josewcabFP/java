package bloque16;

/**
 * Enunciado:
 * 
 * 			Constructor: crea los dados.
 * 
 *			Métodos:
 *
 *			juego() que tirará los datos y devuelve true/false en función de si tiene que
 *			volver a tirar o no. Si los dados suman 7 u 11 gana, si obtiene 2,3, o 12 pierde, y si
 *			obtiene cualquier otro valor tiene que volver a tirar. Mostrar por pantalla el mensaje
 *			correspondiente al resultado.
 *			
 *			gana() devuelve true o false, true si la suma de los dados es 7 u 11, y false en
 *			caso contrario.
 *			
 *			pierde () devuelve true o false, true si la suma de los dados es 2,3 o 12, y false
*			en caso contrario.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Craps {
	
	private Dado dado1;
	private Dado dado2;
	
	public Craps () {
		this.dado1 = new Dado();
		this.dado2 = new Dado();
	}
	
	public boolean juego() {
		boolean again = false;
		this.dado1.tirar();
		this.dado2.tirar();
		
		System.out.print("\nDado1: " + this.dado1.getValor() + ", Dado2: " + this.dado2.getValor() + " || ");
		
		if (this.gana()) {
			System.out.println("Has ganado!");
		}
		else if(this.pierde()) {
			System.out.println("Has perdido...");

		}
		else {
			System.out.println("vuelve a lanzar");
			again = true;
		}
		
		
		
		return again;
	}
	
	public boolean gana() {
		boolean win = false;
		int sum = this.sumaDados();
		if (sum == 7 || sum == 11) {
			win = true;
		}
		
		return win;
	}
	
	public boolean pierde() {
		boolean lose = false;
		int sum = this.sumaDados();
		
		if (sum == 2 ||sum  == 3 || sum == 12) {
			lose = true;
		}
		 
		return lose;
	}
	
	
	public int sumaDados() {
		return this.dado1.getValor() + this.dado2.getValor();
	}

}
