import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Realiza la práctica del vídeo, modificando los siguientes puntos:
 * 
 * -> utilizar un fichero con ruta relativa. Lo colocará en la raíz del proyecto.
 * -> Cambiar el algoritmo de lectura, leer primero la línea, después en el while comprobar si no es null,
 * y en la última línea del while, antes de volver, poner la siguiente lectura de línea.
 * 
 * En ningún caso utilizar el if que ha metido dentro del while, para comprobar que no sea null (esto es un apaño).
 * -> Mostrar cada línea con el número de línea al principio.
 * -> Al final indicar cuántas líneas se han escrito.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class lecturaBuffer {

	public static void leerBuff() {
	
		try {		
			FileReader fr = new FileReader("src/textoBuff.txt");
			BufferedReader br = new BufferedReader(fr);
			
			int cont = 0;
			String s = br.readLine();
			
			while (s != null) {
				cont++;
				System.out.println(cont + ". " + s);
				s = br.readLine();
			}
			System.out.println("se han leído: " + cont + " lineas");
			
			br.close();
			
		} catch (IOException e) {
			System.err.println("No se ha encontrado el archivo.");
		}
		
	}	
	
	public static void main(String[] args) {
		leerBuff();

	}

}
