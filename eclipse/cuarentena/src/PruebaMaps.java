
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author Jose Cabrera Rojas
 *
 */
public class PruebaMaps {

	public static void main(String[] args) {
		// HashMap<K, V>
		HashMap<String, Empleado> personal = new HashMap<String, Empleado>();

		personal.put("145", new Empleado("Juan"));
		personal.put("146", new Empleado("Ana"));
		personal.put("147", new Empleado("Antonio"));
		personal.put("148", new Empleado("Sandra"));

		System.out.println(personal);


		// Mostrar la cantidad de elementos del HashMap
		
		System.out.println(personal.size());

		// Comprueba si existe el elemento 147
		
		System.out.println((personal.containsKey("147")?"Existe el elemento con key 147":"No existe ningun elemento con key 147"));

		// Comprueba si existe el Empleado Ana.
		
		System.out.println((personal.containsValue("Ana")?"Existe la empleada Ana":"No esxiste la empleada Ana"));
		
		// Tendrás que modificar Empleado para añadir.- hashCode() equals()

		// Se ha modificado su código respectivo.
		
		// Obtner las claves keySet, y mostrarlas.
		
		System.out.println(personal.keySet());

		// Obtener el elemento de clave "148", y mostrarlo.
		
		System.out.println(personal.get("148"));

		// Obtener el elemento de clave "150" o sino el empleado "Pepe".
		// uso de getOrDefault
		
		System.out.println(personal.getOrDefault("150", new Empleado("Pepe")));

		// Borra todos los elementos.
		
		personal.clear();

		// comprueba si está vacía y muestra un mensaje.
		
		System.out.println((personal.isEmpty()?"El mapa está vacío":"El mapa no está vacío"));
	}
}

class Empleado {
	private String nombre;
	private double sueldo;

	public Empleado(String nombre) {
		this.nombre = nombre;
		this.sueldo = 2000;
	}

	public String toString() {
		return "[Nombre=" + nombre + " sueldo=" + sueldo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		long temp;
		temp = Double.doubleToLongBits(sueldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (Double.doubleToLongBits(sueldo) != Double.doubleToLongBits(other.sueldo))
			return false;
		return true;
	}

	
	//Añade los método hashCode e equals()
}