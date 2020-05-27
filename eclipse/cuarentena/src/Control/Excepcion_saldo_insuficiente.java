package Control;

/**
 * Exception_Saldo_insuficiente
 * Crear una excepción de saldo insuficiente.
 * Que recibe la cantidad de dinero que queda en la cuenta y el reintegro.
 * Y lo utiliza para el mensaje de error.
 * Debe ser una excepción que estemos obligados a manejar
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Excepcion_saldo_insuficiente extends Exception{
	

	public Excepcion_saldo_insuficiente(double _saldo, double _reintegro) {
		super("Saldo insuficiente (" + _saldo + ") para retirar " + _reintegro);

	}


}
