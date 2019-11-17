/**
 * Los Chips son una parte fundamental de la electronica, ya que cualquier aparato electrico este hecho de chips,
 * en este programa, crearemos una clase Chip que tenga los siguientes atributos y métodos:
 * 
 * 		ATRIBUTOS (deben ser privados):
 * 		
 * 		- Modelo del Chip.
 * 		- Número de patillas.
 * 		- ID de fabrica que tenga el chip para identificarlo.
 * 
 * 		MÉTODOS (deben ser públicos):
 * 
 * 		- Método constructor que reciba el modelo y el número de patillas.
 * 		- Solo los respectivos Getters.
 * 
 * 
 * @author Jose Cabrera Rojas
 * 
 */

package Chips;

public class Chip {
	private String Modelo;
	private int patillas;


	public Chip(String _modelo, int _patillas) {
		this.Modelo = _modelo;
		this.patillas = _patillas;

		
	}

	public String getModelo() {
		return Modelo;
	}

	public int getConexiones() {
		return patillas;
	}


	@Override
	public String toString() {
		return "El chip modelo = " + Modelo + " tiene "+ patillas + "patillas.";
	}
	
	

}
