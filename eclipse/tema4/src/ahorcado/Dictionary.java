package ahorcado;

/**
 * Clase que representa un diccionario que hará de base de datos con las palabras que
 * usaremos en el juego. 
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Dictionary {
	private String [] dict;
	private String palabra; 
	
	/**
	 * Constructor de la clase, no recibe parametros y cargara los datos desde un array 
	 * predefinido. Ademas inicializa la palabra que usaremos en el juego, sacada
	 * aleatoriamente del array con los datos.
	 * 
	 */
	
	// Nota: En realidad esta clase esta pensada para cargar los elementos del array
	// desde un archivo de texto y no desde un array predefinido. 
	
	public Dictionary() {
		
		this.dict = new String [] {"martes", "abril", "pedro", "mama", "gato", "coche"}; // Contenido del diccionario.
		
		this.palabra = dict[(int)(Math.random() * dict.length)]; // Carga en una palabra al azar del diccionario.
	}
	
	
	
	public String[] getDict() {
		return dict;
	}
	
	public String getPalabra(){
		return this.palabra;
	}
	
}
