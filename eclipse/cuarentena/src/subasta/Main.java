package subasta;

/**
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Main {

	public static void main(String[] args) {
		Usuario juan = new Usuario("Juan", 100);
		Usuario pedro = new Usuario("Pedro", 150);
		Usuario enrique = new Usuario("Enrique", 300);
		
		System.out.println("El Crédito de " + juan.getNombre()+ ", es de " + juan.getCredito() + 
		         "\nEl Crédito de " + pedro.getNombre() + ", es de " + pedro.getCredito() + 
		         "\nEl Crédito de " + enrique.getNombre() + ", es de " + enrique.getCredito());
		
		Subasta subasta = new Subasta("Telefono movil", juan);
		
		subasta.pujar(pedro, 100);
		
		subasta.pujar(enrique, 50);
		
		subasta.ejecutar();
		
		subasta.pujar(enrique, 200);
		
		System.out.println("\nEl Crédito de " + juan.getNombre()+ ", es de " + juan.getCredito() + 
				         "\nEl Crédito de " + pedro.getNombre() + ", es de " + pedro.getCredito() + 
				         "\nEl Crédito de " + enrique.getNombre() + ", es de " + enrique.getCredito());
	}

}
