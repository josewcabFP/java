package tikan;

/**
 * @author Jose Cabrera Rojas
 */


public class Gestora {
	
	public static void mostrarTodos(Empleado [] array) {
		System.out.println("\nLista de empleados\n------------------------");
		for (Empleado e : array) {
			e.imprimir();
		}
	}
	
	public static void sueldoMayor(Empleado [] array) {
		Empleado mayor = null;
		double salarioMayor = 0;
		double salarioEmp;
		
		for(Empleado e : array) {
			salarioEmp = e.obtenerSalario();
			if(salarioEmp > salarioMayor) {
				salarioMayor = salarioEmp;
				mayor = e;
			}
		}
		
		System.out.println("\nEmpleado con mayor sueldo\n----------------------------");
		
		mayor.imprimir();
		
	}
	
	public static void main(String [] args) {
		
		Empleado [] emps = new Empleado[4];
		
		emps[0] = new EAsalariado("Javier", "Gomez", "569587A", 2008, 1225);
		emps[1] = new EComision("Eva", "Nieto", "695235B", 2010, 179, 8.1);
		emps[2] = new EComision("Jose", "Ruiz", "741258C", 2012, 81, 7.9);
		emps[3] = new EAsalariado("Maria", "Nuñez", "896325D", 2013, 1155);
		
		mostrarTodos(emps);
		sueldoMayor(emps);
	}

}
