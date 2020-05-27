import java.io.FileInputStream;
import java.io.IOException;

/**
 * Ejercicio: Modifica el ejemplo 3 anterior (del vídeo 155) para:
 * 
 * - No utilizar los condicionales if (byte_entrada !=-1) dentro del bucle while.
 * - Evitar que registre el carácter no válido: -1. Hay un error en el algoritmo, debéis solucionarlo para que no guarde este carácter -1.
 * - Mostrar solo los últimos 5 bytes.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class LecturaImagen {
	
	public static void main(String [] args) {
		try {
			FileInputStream archivo_lectura = new FileInputStream("src/flor.jpg");
			
			int contador = 0;
			
			int byte_lectura = archivo_lectura.read();
			
			int [] array = new int [100000];
			
			while(byte_lectura != -1) {
				array[contador] = byte_lectura;
				contador++;
				byte_lectura = archivo_lectura.read();
				
			}		
			
			System.out.println(array[contador - 4]);
			System.out.println(array[contador - 3]);
			System.out.println(array[contador - 2]);
			System.out.println(array[contador - 1]);
			System.out.println(array[contador]);
			
			
			System.out.println("\nLa imagen tiene " + contador + " bytes");
			
		} 
		catch (IOException e) {
			System.err.println("No se encontro el archivo");
		}
	}
}
