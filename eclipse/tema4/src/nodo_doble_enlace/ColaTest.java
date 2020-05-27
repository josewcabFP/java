package nodo_doble_enlace;

/**
 * Clase para probar la cola
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class ColaTest {

	public static void main(String[] args) {
		Cola cola = new Cola();

		cola.add(23);
		cola.add(53);
		cola.add(76);
			
		System.out.println(cola.toString());
		System.out.println(cola.toStringReverse());
		
		cola.get();
		cola.get();
		
		
		
	}

}
