package tresEnRaya;

import java.util.Scanner;

/**
 * Clase que representa una interfaz para el juego. Esta clase sera la que recibirá los datos
 * que introduzca el usuario y mostrara por pantalla el juego en curso.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class PanelJuego {

	private Juego juego;
	private Scanner sc;
	private Posicion posJugada;
	
	/**
	 * No recibe parametros. Inicializa los objetos de la clase {@link tresEnRaya.Juego Juego} y Scanner.
	 */
	//Ademas tambien posee un objeto de la clase Posicion para almacenar las coordenadas de la jugada actual.

	public PanelJuego() {
		this.juego = new Juego();
		this.sc = new Scanner(System.in);
		this.posJugada = new Posicion(0, 0, ' ');
	}
	
	/**
	 * Método que ejecuta distribuye los turnos y ejecuta el marcado del tablero para cada jugador.</br></br>
	 * Además determina si algun jugador ha ganado, en ese caso terminará su ejecución. Por otro lado
	 * tambien comprueba si el tablero se llenado y no admite mas marcados, en ese caso tambien
	 * detendra la ejecución. 
	 */

	public void jugar() { 

		boolean terminado = false;
		int jugadas = 1;
		
		//Debido a que los turno de cada jugador son cosecutivos, calculamos el turno de cada jugador 
		//con un contador el cual será evaluado para saber si es multiplo de 2 o no.

		while (!terminado) {

			System.out.println("\n>>> " + this.juego.getJugador1() + " VS " + this.juego.getJugador2() + " <<<\n"
								+ "---------------------\n");

			if (jugadas % 2 != 0) {
				this.solicitaCoord(this.juego.getJugador1());
				System.out.println();
				this.juego.marcarSimbolo(this.posJugada.getX(), this.posJugada.getY(), this.juego.getJugador1());
				this.pintarJuego();

				if (this.juego.juegoTerminado() && !this.juego.casillasLLenas()) {
					terminado = true;
					this.juego.aumentaScore(this.juego.getJugador1());
					System.out.println("\nHa ganado el jugador " + this.juego.getJugador1() + "!");
				}
			}
			else if(jugadas % 2 == 0) {
				this.solicitaCoord(this.juego.getJugador2());
				System.out.println();
				this.juego.marcarSimbolo(this.posJugada.getX(), this.posJugada.getY(), this.juego.getJugador2());
				this.pintarJuego();
				
				System.out.println("jugador 2");

				if (this.juego.juegoTerminado() && !this.juego.casillasLLenas()) {
					terminado = true;
					this.juego.aumentaScore(this.juego.getJugador2());
					System.out.println("\nHa ganado el jugador " + this.juego.getJugador2() + "!");
				}
			
			}
			
			if (this.juego.casillasLLenas()) {
		
			terminado = true;
			System.out.println("\nHa habido un empate!");
			}
			jugadas++;
		}
	}
	
	/**
	 * Método que muestra en pantalla la solicitud de los nombres de jugador y los asigna al juego.
	 */

	private void solicitaNombres() {
		String[] nombre = new String[2];
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce el nombre del jugador 1: ");

		nombre[0] = scan.nextLine();
		this.juego.setJugador1(nombre[0]);

		System.out.print("Introduce el nombre del jugador 2: ");

		nombre[1] = scan.nextLine();
		this.juego.setJugador2(nombre[1]);
		System.out.println(" ");
		

		// si cierro el scanner me da problemas con los demas scanners no se por que
		
	}
	
	/**
	 * Método que imprime por pantalla el juego en curso.
	 */

	private void pintarJuego() {
		this.juego.getTableroJuego().pintarTablero();
	}
	
	/**
	 * Metodo que imprime en pantalla un menu de inicio del juego. El menú esta
	 * compuesto por opciones numéricas.
	 * <ol>
	 * 	<li> Jugar.</li>
	 * 	<li> Salir.</li>
	 * </ol>
	 * 
	 * @return Devuelve el valor número de opción introducido por teclado.
	 * 
	 */
	
	public int menuJuego() {
		int opc = 0;
		System.out.println("----------------------\n"
						 + ">--- Tres en raya ---<\n"
						 + "----------------------\n");
		System.out.println("Elige una opcion:\n\n"
						 + "1. Jugar\n"
						 + "2. Salir");
		opc = sc.nextInt();
		
		
		return opc;
	}
	
	/**
	 * Método que solicita la coordenada para hacer la marca en el tablero.
	 * @param _jugador Nombre del jugador para ser mostrado en pantalla a modo de identificacón del turno.
	 */

	public void solicitaCoord(String _jugador) {
		
		Scanner scaner = new Scanner(System.in);

		String jugada = "";
		System.out.print("Turno de " + _jugador + ", introduce coordenadas (separadas por espacios): ");
		jugada = scaner.nextLine();
		this.posJugada.setX(Character.getNumericValue(jugada.charAt(0)) - 1);
		this.posJugada.setY(Character.getNumericValue(jugada.charAt(2)) - 1);

	}
	
	/**
	 * Método que inicia el juego <strong>Tres en raya</strong>.</br>
	 * 
	 */

	
	public void iniciaJuego() {
		int opc = 0;
		while (opc != 2) {
			opc = this.menuJuego();
			if (opc == 1) {
				this.solicitaNombres();
				this.pintarJuego();
				this.jugar();
			}
		}
	}

}
