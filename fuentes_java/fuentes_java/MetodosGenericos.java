package tema9_genericos;

public class MetodosGenericos {
	public static void main(String[] args) {
		String nombres[] = {"Jose", "María", "Pepe"};
		String elementos = MisMatrices.getElementos(nombres);
		// otra forma: String elementos = MisMatrices.<String>getElementos(nombres);
		System.out.println(elementos);
		Empleado listaEmpleados[] = {
				new Empleado("Ana", 45, 2500),
				new Empleado("Pepe", 45, 2500),
				new Empleado("Amparo", 45, 2500),
				new Empleado("Emiliano", 45, 2500),
				new Empleado("Elias", 45, 2500)					
			};
		System.out.println(MisMatrices.getElementos(listaEmpleados));
		
	}
}

class MisMatrices {

	public static <T> String getElementos( T [] a) {
		
		return "El array tiene "+ a.length+ " elementos";
		
	}
}