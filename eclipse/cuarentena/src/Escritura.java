import java.io.FileWriter;
import java.io.IOException;

/**
 * Ejercicio (UT8_EJ2):
 * Realiza la práctica del vídeo, modificando los siguientes puntos:
 * 
 * -> utilizar un fichero con ruta relativa. Lo colocará en la raíz del proyecto.
 * -> Tener en cuenta que en todas las operaciones de escritura debemos realizar tres pasos imprescindibles: abrir, procesar, y cerrar el fichero.
 * -> Crea el fichero para añadir, y que vayamos viendo como cada vez que se ejecute el programa lo rellena.
 * -> Añade la hora en la que se realiza la escritura.
 * -> Añade un salto de línea al final de la escritura.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Escritura {

	public void escribe() {
		
		try {
			FileWriter fw = new FileWriter("src/writeTest.txt", true); //estan en src para tener cierto orden
			String s = new java.util.Date() + "\n";
			
			for(int i = 0; i < s.length(); i++) {
				fw.write(s.charAt(i));
			}
			
			//fw.write(new java.util.Date() + "\n");
			
			
			fw.close();
			
		} catch (IOException e) {
			
			System.err.println("No se pudo abrir el archivo");
		}
	}
	
	public static void main(String [] args) {
		Escritura esc = new Escritura();
		
		esc.escribe();
	}
}
