import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Escritura de fichero con buffer.
 * -> El nombre del fichero de salida, será el nombre de pila del alumno que realiza la tarea, por ejemplo alejandro.txt.
 * -> Crear una clase similar a la del ejercicio anterior.
 * -> Crear un array de String con 5 frases.
 * -> recorrerlo e ir escribiendo el contenido en el fichero de salida usando bufferWriter.
 * -> Añadir en cada línea la escritura del final de línea, "\r\n"
 * -> Cuando termines de escribir en el buffer, deberás usar el método flush(), para que se vuelque el contenido del buffer a fichero, sino el fichero estará vacío al terminar la ejecución.
 * -> poner un mensaje por consola después de flush(), indicando que se ha completado la tarea.
 * 
 * Al final comprobar que el fichero generado es correcto, y contiene todo lo que hemos escrito por programa.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class EscrituraBuff {
	
	String [] lista = {
			"Si yo no hubiese existido, alguna otra persona me habría escrito.",
			"El valor de un acto se juzga por su oportunidad.",
			"Yo sé que la poesía es imprescindible, pero no sé para qué.",
			"Hombre, hombre, no se puede vivir enteramente sin piedad.",
			"Nunca permitas que tus pies vayan por delante de tus zapatos."
	};
	
	public void escribeBuff() {
		try {
			FileWriter fw = new FileWriter("src/jose.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (int i = 0; i < this.lista.length; i++) {
				bw.write(lista[i] + "\r\n");
			}
			
			bw.flush();
			System.out.println("Se ha completado la tarea de escritura.");
			
			bw.close();
			
		} catch (IOException e) {
			System.err.println("No se ha podido generar el archivo.");
		}
	}

	public static void main(String[] args) {
		EscrituraBuff eb = new EscrituraBuff();
		eb.escribeBuff();

	}

}
