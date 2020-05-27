import java.io.FileInputStream;
import java.io.FileOutputStream;
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

public class EscribeImagen {
	
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
			
			
			
			System.out.println("\nLa imagen tiene " + contador + " bytes");
			
			escribirImg(array);
			
		} 
		catch (IOException e) {
			System.err.println("No se encontro el archivo");
		}
	}
	
	public static void escribirImg(int [] array) {
		try {
			FileOutputStream archivo_escritura = new FileOutputStream("src/flor_copia.jpg");
			
			for (int i = 0; i < array.length; i++) {
				archivo_escritura.write(array[i]);
			}
			
			archivo_escritura.close();
		}
		catch (IOException e) {
			System.err.println("No se pudo escribir el archivo");
		}
	}
}
