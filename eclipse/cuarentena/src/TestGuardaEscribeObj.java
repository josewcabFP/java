
/**
 * - Crear otro programa para leer este objeto y usarlo para probar los métodos de la clase de este objeto.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class TestGuardaEscribeObj {

	
	
	public static void main(String[] args) {

		Altavoz alt = new Altavoz("TXZ-12", 12);
		
		Guardar_Cargar_Objeto.guardaObjeto(alt);
		
		Altavoz alt2 = (Altavoz)Guardar_Cargar_Objeto.cargaObjeto();
		
		alt2.encender();

	}

}
