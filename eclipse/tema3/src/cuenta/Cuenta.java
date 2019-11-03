/** 
 * Crea una clase Cuenta con los métodos ingreso, reintegro y transferencia. La clase contendrá un
 * constructor por defecto, un constructor con parámetros, un constructor copia y los métodos getters y setters.
 * 
 * @author Jose Cabrera Rojas
 * 
 * */

package cuenta;

public class Cuenta {

	// ATRIBUTOS

	private double saldo;
	private String numCuenta;
	private String titular;

	// >>>CONSTRUCTORES<<<

	// --- Constructor por defecto ---

	public Cuenta() {
		this.saldo = 0;
		this.numCuenta = "123456789123";
		this.titular = "Jose Cabrera Rojas";
	}

	// --- Constructor con parámetros (sobrecarga)

	public Cuenta(double _saldo, String _numCuenta, String _titular) {
		this.saldo = _saldo;
		this.numCuenta = _numCuenta;
		this.titular = _titular;
	}

	// --- Constructor mediante copia de otro objeto (sobrecarga)

	public Cuenta(Cuenta _cuentaOrigen) {
		this.saldo = _cuentaOrigen.getSaldo();
		this.numCuenta = _cuentaOrigen.getNumCuenta();
		this.titular = _cuentaOrigen.getTitular();
	}

	// >>>MÉTODOS<<<
	
	/* --- Método ingreso --- 
	 * 		-Utilizo un boolean para que devuelva "true" si se ha podido realizar la operación.
	 * 		-Compruebo si la cantidad del ingreso es positiva para evitar errores.
	 * */
	
	public boolean ingreso(double _cantidad) {
		boolean flag = false;
		
		if (_cantidad > 0) {
			this.setSaldo(this.getSaldo() + _cantidad);
			flag = true;
		}
		
		return flag;
	}
	
	/* --- Método reintegro ---
	 * 		- Devuelve el dinero que se a retirado, para operaciones posteriores (si es necesario).
	 * 		- Comprueba si la cantidad a reitrar no exede el saldo, de ser asi el monto que devuelve es cero,
	 * 		  ademas de mostrar un mensaje de error. 
	 * 		* Tengo comentado el mensaje de error ya que no es pedido explicitamente por el enunciado. 
	 * */

	public double reintegro(double _cantidad) {
		double monto = 0;
		
		if (_cantidad > 0) {
			if (this.getSaldo() >= _cantidad) {

			this.setSaldo(this.getSaldo() - _cantidad);
			monto = _cantidad;
			}

			/*else 
			 * 	System.out.println("No tienes saldo suficiente para esta operación");*/
			}
		return monto;
	}
	
	/* --- Método transferencia ---
	 * 		- Realiza una transferencia de nuestro saldo al saldo de otra cuenta.
	 * 		- Utiliza una varibale boolean para confirmar que se realizó con éxito la operación.
	 * 		- Recicla los métodos "ingreso" y "reintegro".
	 * */
	
	public boolean transferencia(Cuenta _cuentaBeneficiaria, double _cantidad) {
		boolean flag = false;
		double monto;
		
		monto = this.reintegro(_cantidad);
		
		if (monto > 0) {
			flag = _cuentaBeneficiaria.ingreso(monto);

		}
		
		return flag;
	}

	// --- Getters y Setters ---

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

}
