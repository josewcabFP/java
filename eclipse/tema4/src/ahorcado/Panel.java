package ahorcado;

public class Panel {
	
	private Casilla [] panel;
	
	public Panel(int _tam){  // Constructor para panel vacio
		this.panel = new Casilla[_tam];
		for (int i = 0; i < panel.length; i++) {
			panel[i] = new Casilla();
		}
	}
	
	public Panel(int _tam, String _palabra) { //Constructor para panel de palabra buscada
		this.panel = new Casilla[_tam];
		for (int i = 0; i < panel.length; i++) {
			panel[i] = new Casilla(_palabra.charAt(i));
		}
	}
	
	public String pintarPanel() {
		String palabra = "=";
		for (int i = 0; i < panel.length; i++) {
			palabra += "====";
		}
		
		palabra += "\n|";
		for (Casilla p : panel) {
			palabra += p.pintaCasilla();
		}
		
		palabra += "\n=";
		for (int i = 0; i < panel.length; i++) {
			palabra += "====";
		}
		
		return palabra;
		
	}
	
	public int vecesLetra(char _letra) {
		int cont = 0;
		
		for (Casilla l : panel) {
			if (l.getValor() == _letra) {
				cont++;
			}
		}
		
		return cont;
	}
	
	public void copiaLetra(Panel _panel, char _letra) { // Este método permite colocar la letra en la posición adecuada, ya que es una copia directa.

		for (int i = 0; i < panel.length; i++) {
			if (panel[i].getValor() == _letra) {
				_panel.getCasillas()[i].setValor(_letra);
				_panel.getCasillas()[i].setCoincide(true);;
			}
		}
	}
	
	
	public boolean compruebaPanel() { //comprueba si todas las casillas del panel estan a true.
		boolean todoTrue = true;
		
			for (Casilla c : this.panel) {
				if (c.getCoincide() == false) {
					todoTrue = false;
				}
			}
			
		return todoTrue;
	}
	
	public int getSize() {
		return this.panel.length;
	}
	
	public Casilla[] getCasillas() {
		return this.panel;
	}
	
	public static void main(String [] args) {
		Panel pan = new Panel(4, "casa");
		
		System.out.println(pan.pintarPanel());
	}
	
}
