package persona;

/**
 * Crea una clase llamada Persona, con los atributos nombre, apellidos, sexo, edad.
*	Debe tener un constructor en el que se indiquen todos estos datos.
*	Un método imprime(), que muestre los datos de la persona.
*	Un método esMayorEdad(), que devuelva verdadero o falso, según sea o no mayor de edad.
*
* @author Jose Cabrera Rojas
* */

public class Persona {
	
	//ATRIBUTOS
	
	public String nombre;
	public String apellidos;
	public char sexo;
	public int edad;
	
	//CONSTRUCTOR
	
	public Persona(String _nombre, String _apellido, char _sex, int _edad) {
		this.nombre = _nombre;
		this.apellidos = _apellido;
		this.sexo = _sex;
		this.edad = _edad;
	}
	
	//MÉTODOS
	
	public void imprime() {
		System.out.println("Nombre: " + this.nombre + '\n' +
						   "Apellidos: " + this.apellidos + '\n'+
						   "Sexo: " + this.sexo + '\n' + 
						   "Edad: " + this.edad + '\n');
	}
	
	public boolean esMayorEdad() {
		if (this.edad >= 18) {
			return true;
		}
		else 
			return false;
	}
	
}
