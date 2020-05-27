package Control;

public class TestBanco {
	
/**
 * Crea un main().
 * - Crear un banco. 
 * - Dar de alta al menos una cuenta y un deposito.
 * - La cuenta y el depósito ambos deben estar a tu nombre.
 * - Haz un ingreso en cuenta de 500 euros.
 * - Haz un reintegro en cuenta de 600 euros.
 * - mostrar la información por pantalla. 
 * - registrar las cuentas en un fichero con tu nombre de pila, por ejemplo pepe.dat.
 * 
 * @author Jose Cabrera Rojas
 */

	public static void main(String[] args) {
		Cliente cli1 = new Cliente("Jose", "Cabrera", "30/04/1989");
		Cliente cli2 = new Cliente("Jose", "Cabrera", "30/04/1989");
		Cuenta c = new Cuenta(cli1);
		Deposito d = new Deposito(cli2);
		
		Banco bank = new Banco();
		
		bank.altaCuenta(c);
		bank.altaDeposito(d);
		
		c.ingreso(500);
		
		
		/**
		 * Aqui tenia dos opciones, o agregar en la cabecera del método main un throwable o hacer un try catch, en la primera opción 
		 * lanza y el error y no completa ejecución (no guarda el fichero), con la segunda no se por que no me muestra el mensaje de error a pesar
		 * de que hago un getMessage().
		 */
		
		try {
			c.reintegro(600);
		} catch (Excepcion_saldo_insuficiente e) {
			e.getMessage();
		}
		
		bank.mostrarProductos();
		bank.registraProductos("jose.dat");
		

	}

}
