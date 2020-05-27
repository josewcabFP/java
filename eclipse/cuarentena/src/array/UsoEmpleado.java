package array;

public class UsoEmpleado {
	public static void main(String[] args) {
		Empleado listaEmpleado[]= new Empleado[3];
		
		listaEmpleado[0]= new Empleado("Ana", 45, 2500);
		listaEmpleado[1]= new Empleado("Pepe", 55, 2000);
		listaEmpleado[2]= new Empleado("Juan", 21, 1800);
		
		for (Empleado empleado : listaEmpleado) {
			System.out.println(empleado);
		}
	}
}
