package ahorcado;

public class Menu {
	
	private int opcion;
	
	public Menu() {
		this.opcion = 0;
	}
	
	public void mostrarMenu() {
		System.out.println("Elige una opción:\n"
				+ 		   "-----------------");
		System.out.println("1. Jugar al ahorcado.\n"
				+ 		   "2. Salir.\n\n");
	}
	
	public static void main (String [] args) {
		Menu me = new  Menu();
		
		me.mostrarMenu();
	}

}
