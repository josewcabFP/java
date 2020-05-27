import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Copia/pega imagen
 * --------------------------------
 * 
 * Crea la clase CopiaPega().- que va a leer un fichero y va a realizar una copia.
 * Con la siguiente funcionalidad en el main:
 * 
 * - Utilizar rutas relativas.
 * - Dada una imagen llamada foto.png dentro de la carpeta "img" de nuestro proyecto.
 * - Leerla byte a byte y copiarla en otro fichero foto2.png, que colocaremos en la carpeta "img_backup".
 * - Crear una constante de clase para cada una de esas carpetas de origen y destino.
 * 
 * Al final comprobar que nos ha creado el archivo y que se puede ver correctamente.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class CopiaPega {
	
	private final static String DIRECTORIO;
	private final static String DIR_RESPALDO;
	
	static {
		DIRECTORIO = "src/img/";
		DIR_RESPALDO = "src/img_backup/";
	}
	
	public static void main(String [] args) {
		
		try {
			FileInputStream readFile = new FileInputStream(DIRECTORIO + "foto.png");
			FileOutputStream writeFile = new FileOutputStream(DIR_RESPALDO + "foto2.png");
			
			int byte_read = readFile.read();
			
			while(byte_read != -1) {
				writeFile.write(byte_read);
				
				byte_read = readFile.read();
			}
			
			readFile.close();
			writeFile.close();
			
		}
		catch (IOException e) {
			System.err.println("No se encontró el archivo.");
			
		}
	}
	
	
	
}
