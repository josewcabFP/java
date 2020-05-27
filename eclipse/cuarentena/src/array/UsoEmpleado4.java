package array;

import java.util.ArrayList;
import java.util.Iterator;

public class UsoEmpleado4 {
	public static void main(String[] args) {
		ArrayList<Empleado> listaEmpleado= new ArrayList<Empleado>();
		
		listaEmpleado.add( new Empleado("Ana", 45, 2500));
		listaEmpleado.add( new Empleado("Pepe", 55, 2000));
		listaEmpleado.add( new Empleado("Juan", 21, 1800));
		listaEmpleado.add( new Empleado("Sa�l", 35, 2000));
		listaEmpleado.add( new Empleado("Jimena", 31, 1800));
		listaEmpleado.add( new Empleado("Paloma", 35, 2000));
		listaEmpleado.add( new Empleado("Julia", 28, 1800));
		listaEmpleado.add( new Empleado("Pilar", 53, 2000));
		listaEmpleado.add( new Empleado("Jes�s", 29, 1800));
		listaEmpleado.add( new Empleado("Paula", 51, 2000));
		listaEmpleado.add( new Empleado("Jos�", 31, 1800));
		
		/*mostrar el array completo
		for (Empleado empleado : listaEmpleado) {
			System.out.println(empleado);
		}*/
		//otra forma de recorrer el arrayList: iterator.
		
		Iterator<Empleado> mi_iterador = listaEmpleado.iterator();
		
		while (mi_iterador.hasNext()) {
			System.out.println(mi_iterador.next().toString());
		}
		
	}
}
