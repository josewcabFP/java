package array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Escribe un programa que lea números enteros y los guarde en un ArrayList hasta que se lea un 0.
 * 
 * Muestra los números leídos, su suma y su media.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class ArraySumAvg {
	
	Scanner sc;
	ArrayList<Integer> listaNumeros;
	
	public ArraySumAvg() {
		this.listaNumeros = new ArrayList<Integer>();
		this.sc = new Scanner(System.in);
		this.addElementos();
	}
	
	private void addElementos() {
		System.out.println("Introduce el array numero a numero (introduce 0 para terminar):");
		
		Integer num = sc.nextInt();
		
		while (num != 0) {
			this.listaNumeros.add(num);
			num = sc.nextInt();
		}
	}
	
	public void mostrarSumAvg() {
		Iterator<Integer> it = this.listaNumeros.iterator(); // Iterador
		
		int sum = 0, cont = 0;
		double media = 0;
		Integer temp;
		System.out.print("\nLos elementos del array son: [");
		
		while (it.hasNext()) {	//Comprobamos si hay una secuencia de elementos con el iterador
			temp = it.next();
			sum += temp;
			System.out.print(temp + " ");
			cont++;
		}
		
		this.sc.close();
		
		media = sum/cont;
		
		System.out.println("]\nLa suma es: " + sum + "\nLa media es: " + media);
	}

	public static void main(String[] args) {
		ArraySumAvg lista = new ArraySumAvg();
		lista.mostrarSumAvg();

	}

}
