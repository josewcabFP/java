package persona;

import java.util.Scanner;

/**
* Crea una clase TestPersona, con un main, en el que se creen un array de 3 personas.
*	Crea las tres personas, el usuario tiene que introducir los datos por teclado.
*	Recorre el array e imprime las personas que son menores de Edad.
*
* 
* @author Jose Cabrera Rojas
* */

public class TestPersona {

	public static void main(String[] args) {
		
		Persona [] lista = new Persona[3];
		
		Scanner sc = new Scanner(System.in);
		
		String nombre = "";
		String apellido = "";
		char sexo;
		int edad;
		
		
		for (int i = 0; i < lista.length; i++) {
			System.out.print("Introduce el nombre: ");
			nombre = sc.nextLine();
			
			System.out.print("Introduce el apellido: ");
			apellido = sc.nextLine();
			
			System.out.print("Introduce sexo (M, F): ");
			sexo =  sc.nextLine().toUpperCase().charAt(0);
			
			System.out.print("Introduce edad: ");
			edad = Integer.parseInt(sc.nextLine());
			
			lista[i] = new Persona(nombre, apellido, sexo, edad);
		}
		
		sc.close();
		
		System.out.println("\nLos menores de edad son:\n"
						+ "-------------------------\n");
		
		for (int j = 0; j < lista.length; j++) {
			if (!(lista[j].esMayorEdad())) {
				lista[j].imprime();
			}
		}

	}

}
