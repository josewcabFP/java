/**
 * Clase de prueba del la clase Menu
 * 
 * pintar el menu, y solicitar que ejecute la opción correspondiente
 * hasta que seleccionen 0, que entonces saldrá.
 * 
 * @author jose Cabrera Rojas
 */

package menu;

public class TestMenu {

	public static void main(String[] args) {
		Menu.pintaMenu();
		Menu.ejecutaOpcion(Menu.leeOpcion());

	}

}
