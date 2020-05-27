import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * - Crear un programa para guardar en un fichero un objeto de esta clase.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Guardar_Cargar_Objeto {

	
	/**
	 * Método que recibe un objeto y lo serializa en un archivo externo
	 * 
	 * @param obj Objeto recibido que se guardará
	 */

	public static void guardaObjeto(Object obj) {
		try {
			ObjectOutputStream escribe_objeto = new ObjectOutputStream(new FileOutputStream("src/Altavoz.dat"));
			escribe_objeto.writeObject(obj);
			escribe_objeto.close();
		}
		catch(IOException e){
			System.err.println("No se pudo guardar el objeto.");
		}
	}
	
	/**
	 * Método que carga el objeto previamente guardado y lo devuelve.
	 * 
	 * @return Devuelve el objeto guardado.
	 */
	
	public static Object cargaObjeto() {
		
		Object obj = null;
		
		try {
			
			ObjectInputStream lee_objeto = new ObjectInputStream(new FileInputStream("src/Altavoz.dat"));
			obj = lee_objeto.readObject();
			lee_objeto.close();
		}
		catch(IOException e) {
			System.err.println("No se pudo abrir el archivo.");
		}
		catch(ClassNotFoundException e) {
			System.err.println("El archivo no es una clase.");
		}
		return obj;
	}
	

}
