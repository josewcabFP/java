package array;
import java.io.File;
import java.util.ArrayList;
public class UsoJavaArrayList {

	public static void main(String[] args) {
		ArrayList<Empleado> listaEmpleados= new ArrayList<Empleado>();
		
		listaEmpleados.add(new Empleado("Alicia",45,2500));
		listaEmpleados.add(new Empleado("Pepe",45,2500));
		listaEmpleados.add(new Empleado("Jimena",45,2500));
		listaEmpleados.add(new Empleado("Alfonso",45,2500));
		
		//Marca un error en tiempo de compilaci�n:
		//listaEmpleados.add("Ana");

		System.out.println("Fin del programa");
		
	}
}
