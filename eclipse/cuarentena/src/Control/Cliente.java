package Control;

import java.io.Serializable;

/**
 * Cliente
 * Propiedades: 
 * 	nombre
 *  apellidos
 *  fecha_nacimiento
 * Métodos: 
 *  constructor //que recibe todos los datos.
 *  getters de las propiedades.
 *  toString //redefine toString debe devolver el nombre y el año de nacimiento.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Cliente implements Serializable{
	//tuve que añadir la interfaz serailizable para poder guardar el archivo
	
	 private String nombre;
	 private String apellidos;
	 private String fecha_nacimiento; //(dd/mm/yyyy)
	 
	 public  Cliente(String _nombre, String _apellidos, String _fecha_nacimiento) {
		 this.nombre = _nombre;
		 this.apellidos = _apellidos;
		 this.fecha_nacimiento = _fecha_nacimiento;
	 }

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	@Override
	public String toString() {
		return "Nombre : " + nombre + ", apellidos : " + apellidos + ", fecha de nacimiento : " + fecha_nacimiento;
	}
	 
	
	

}
