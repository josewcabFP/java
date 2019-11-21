package tresEnRaya;

/**
 * Clase principal que invoca el juego con su método main.
 * 
 * @author Jose Cabrera Rojas
 */

public class Main {
	
	/**
	 * Esta clase crea un objeto de la clase {@link tresEnRaya.PanelJuego PanelJuego} e invoca al método 
	 * {@link tresEnRaya.PanelJuego#iniciaJuego() iniciaJuego()}
	 * 
	 */

	public static void main(String[] args) {
		
		PanelJuego juego = new PanelJuego();
		juego.iniciaJuego();

	}

}
