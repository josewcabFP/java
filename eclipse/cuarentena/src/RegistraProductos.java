import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Crea la clase RegistraProductos como se indica a continuación.
 * 
 * Propiedades estáticas:
 * 
 * array de productos, y contador (Con el valor inicial que consideres oportuno).
 * 
 * Métodos estáticos:
 * 
 * registra_productos()
 * muestra_productos()
 * compra_productos()
 * main()
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class RegistraProductos {
	
	private static Productos [] arrayProductos;
	private static int contador;
	
	static {
		contador = 0;
		arrayProductos = new Productos[10];
	}
	
	public static void registra_productos() {
		String s;
		double p;
		
		try {
			FileReader fr = new FileReader("src/productos.txt");
			BufferedReader br = new BufferedReader(fr);
			
			s = br.readLine();
			
			while (s!= null) {
				
				p = Double.parseDouble(br.readLine());
				arrayProductos[contador] = new Productos(s, p);
				s = br.readLine();
				contador++;
			}
			
			br.close();
			
		}
		catch (IOException e) {
			System.err.println("No se ha encontado el archivo de productos");
		}
	}
	
	public static void muestra_productos() {
		for (int i = 0; i < contador; i++) {
			System.out.println(arrayProductos[i]);
		}
	}
	
	public static void compra_productos(){
		registra_productos();
		Scanner sc = new Scanner(System.in);
		int opc;
		
		try {
			FileWriter fw = new FileWriter("src/compra.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			do {
				menu();
				opc = sc.nextInt();
				
				if(opc >= 0) {
					try {
						bw.write(arrayProductos[opc].toString() + '\n');
					}
					
					catch(NullPointerException e) {
						System.err.println("El articulo seleccionado no existe\n");
					}
				}
				
			}while(opc != -1);
			
			bw.flush();
			sc.close();
			bw.close();
		}
		
		catch (IOException e) {
			System.err.println("No se pudo escribir el archivo");
		}
		
		
	}
	
	public static void menu() {
		System.out.println("\nProductos disponibles:\n"
						 + "----------------------\n"
						 + "ID | NOMBRE | PRECIO ");
		muestra_productos();
		System.out.println("-----------------------------\n"
						 + "Selecciona el ID del producto (pulsa '-1' para salir)\n");
	}
	
	
	
	public static void main(String [] args) {
		compra_productos();
	}

}
