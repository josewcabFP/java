package array;

import java.util.GregorianCalendar;

public class MetodosGenericos2 {
	public static void main(String[] args) {
		String nombres[] = {"Jose", "Mar�a", "Pepe", "Ana", "Zoe"};
		String menor = MisMatricesModificado.getMenor(nombres);
		System.out.println(menor);
	
		Empleado ana = 	new Empleado("Ana", 45, 2500);
		Empleado pepe = new Empleado("Pepe", 45, 2500);
		Empleado maria = new Empleado("Maria", 45, 2500);
		Empleado [] misEmpleados = {ana, pepe, maria};
		//da error, porque Empleado no implementa la interfaz Comparable.: 
		//System.out.println(MisMatricesModificado.getMenor(misEmpleados));
		GregorianCalendar fechas[]= {
				new GregorianCalendar(2020,02,25),
				new GregorianCalendar(2020,04,25),
				new GregorianCalendar(2020,00,25),
				
		};
		System.out.println(MisMatricesModificado.getMenor(fechas).getTime());
	}
}

class MisMatricesModificado {

	public static <T extends Comparable> T getMenor( T [] a) {
		if (a == null || a.length ==0) {
			return null;
		}
		//usar compareTo
		T elementoMenor = a[0];
		for (int i = 1; i < a.length; i++) {
			if (elementoMenor.compareTo(a[i]) > 0) {
				elementoMenor = a[i];
			}
		}
		
		
		return elementoMenor;
	}
	
}