package array;

import java.util.ArrayList;


public class UsoEmpleado3 {
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
		
		//agrega un elemento en una posici�n determinada
		listaEmpleado.set(2,new Empleado("Olga",36,2000));
		
		//mostrar el array completo
		for (Empleado empleado : listaEmpleado) {
			System.out.println(empleado);
		}
		//obtener un elemento de una posici�n determinada.
		Empleado emple = listaEmpleado.get(0);
		System.out.println("El elemento 0 es: "+ emple);
		
		//mostrar el array completo
		System.out.println("\nListado de empleados");
		Empleado e;
		for (int i = 0; i < listaEmpleado.size(); i++) {
			e = listaEmpleado.get(i);
			System.out.println(i + " - "+ e);
		}
		
		//Crear un array de empleados a partir del ArrayList
		Empleado arrayEmpleados[] = new Empleado[listaEmpleado.size()];
		listaEmpleado.toArray(arrayEmpleados);
		//mostrar el array completo
		System.out.println("Array de empleados: ");
		for (int i = 0; i < arrayEmpleados.length; i++) {
			e = arrayEmpleados[i];
			System.out.println(i + " : "+ e);
		}
	}
}
