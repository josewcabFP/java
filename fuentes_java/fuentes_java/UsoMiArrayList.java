package tema9_genericos;
import java.io.File;
public class UsoMiArrayList {

	public static void main(String[] args) {
		MiArrayList archivos = new MiArrayList(5);
		
		archivos.add("Alicia");
		archivos.add("Pepe");
		archivos.add("Jimena");
		archivos.add("Juan");
		
		String nombrePersona = (String)archivos.get(2);
		System.out.println(nombrePersona);
		
		
		archivos.add(new File("foto.png"));
		File nombrePersona2 = (File)archivos.get(4);
		System.out.println(nombrePersona2);
		
		
		//Error en tiempo de ejecución: ClassCastException
		String nombrePersona3 = (String)archivos.get(4);
		System.out.println(nombrePersona);
		
		
	}
}
