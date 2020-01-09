package ahorcado;

/**
 * 
 * 
 * @author Jose Cabrera Rojas
 * 
 * */

public class Juego {
	
	private Panel panel; //palabra mostrada en el panel
	private Dictionary dictionary;
	private Panel panelPalabra;  //palabra buscada, sacada del diccionario al azar (ver constructor del diccionario)
	private int intentos;
	private String grafica;
	private boolean finalizado;
	
	public Juego() {
		
		this.dictionary = new Dictionary();
		this.panelPalabra = new Panel(this.dictionary.getPalabra());
		this.panel = new Panel(this.panelPalabra.getSize());
		this.intentos = 0;  //!!!
		this.grafica = "";
		this.finalizado = false;
	}
	
	/**
	 * El método <b>pintarLetra</b> pintará una letra en el panel de juego solo si esta
	 * coincide con alguna letra de la palabra buscada, pintará la letra las veces que coincida y en
	 * la misma posición igual que en la palabra buscada.
	 * 
	 * @param _letra Caracter que evalua la función para buscar coincidencias.
	 * @return Devolverá <b>true</b> si se ha efectuado el cambio.
	 */
	
	public boolean pintaLetra(char _letra) { // Debe recibir mayusculas (hacer el casteo en el scanner)
		boolean pintada = false;
		
		if (this.panelPalabra.vecesLetra(_letra) > 0) {
			this.panelPalabra.copiaLetra(panel, _letra);
			pintada = true;
		}
		
		
		return pintada;
	}
	
	public void pintaAleatoria() {
		
		int cantidad = (int)(panel.getSize()/3); // Quiero solo la tercera parte de las letras como pista (Este valor seria la dificultad)
		int cont = 0;
		int rand;
		
		while (cont < cantidad) {
			rand = (int)(Math.random() * panel.getSize()); //valor aleatorio para escoger una letra al azar
			
			if (panel.getCasillas()[rand].getValor() == ' ') { //comprueba si esta vacía
				this.pintaLetra(this.panelPalabra.getCasillas()[rand].getValor()); //pinta la letra que hayamos cogido al azar.
				cont++;
			}
		}
	}
	
	public void jugada(char _letra) {
		
		this.haFinalizado(); //Comprueba antes que nada si el juego a finalizado.
		
		if (!this.finalizado) {

			if (this.repetida(_letra)) {
				// this.intentos += 1; DESCOMENTAR SOLO SI: se quiere que se considere como
									// intento el repetir una letra. 
				// this.pintaJuego();
				System.out.println("\nYa has buscado esa letra.\n");
			}

			else {
				
				this.intentos += 1;

				if (pintaLetra(_letra)) {

					this.pintaJuego();

					System.out.println(
							"\nBien!, has obtenido " + this.panelPalabra.vecesLetra(_letra) + " coincidencia(s).\n");
					
				}

				else {
					
					this.pintaJuego();
					
					System.out.println("\nNo ha habido ninguna coincidencia.\n");
				}
			}
		}
	}
	
	
	public void pintaJuego() {
		
		switch(this.intentos) {
		
			case 0 : this.grafica = Grafica.INTENTO0.getGraf();
				break;
				
			case 1 : this.grafica = Grafica.INTENTO1.getGraf();
				break;
		
			case 2 : this.grafica = Grafica.INTENTO2.getGraf();
				break;
		
			case 3 : this.grafica = Grafica.INTENTO3.getGraf();
				break;
		
			case 4 : this.grafica = Grafica.INTENTO4.getGraf();
				break;
				
			default : this.grafica = " ";
				break;
		}
		
		System.out.println(this.grafica);
		
		System.out.println(panel.pintarPanel());
	}
	
	public void haFinalizado() {
		if (this.intentos >= 5 || this.panel.compruebaPanel()) {
			this.finalizado = true;
		}
	}
	
	public void haGanado() {
		if(this.finalizado && (this.intentos < 5)) {
			System.out.println("Enhorabuena has ganado!");
		}
		else {
			this.grafica = Grafica.INTENTO5.getGraf();
			System.out.println(this.grafica);
		}
	}
	
	
	private boolean repetida(char _letra) {
		
		return (this.panel.vecesLetra(_letra) > 0);
	}
	
	public boolean getFinalizado() {
		return this.finalizado;
	}
	
	public void iniciaJuego() {
		this.pintaAleatoria();
		this.pintaJuego();
	}
	
	
	//****MAIN****
	
	
	public static void main (String [] args) {
		Juego jue = new Juego();
		jue.pintaAleatoria();
	
		jue.jugada('A');
		jue.jugada('A');
		jue.jugada('A');
		jue.jugada('A');
		jue.jugada('A');
		jue.jugada('A');
	
		
		
	}
}
