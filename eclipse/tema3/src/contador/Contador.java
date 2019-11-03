/**
 * Crea una clase Contador con los métodos para incrementar y decrementar el contador. La clase contendrá 
 * un constructor por defecto, un constructor con parámetros, un constructor copia y los métodos getters y setters.
 * 
 * @author Jose Cabrera Rojas
 * */

package contador;

public class Contador {
	
	// ATRIBUTOS
	
	private int valor;
	
	
	
	// CONSTRUCTORES
	
	// --- Constructor por defecto ---
	
	public Contador() {
		this.valor = 0;
	}
	
	// --- Constructor con parámetros (sobrecarga)
	
	// Compruebo si el valor inicial es mayor o  igual que cero	
	
	public Contador(int _valor) {
		if (_valor >= 0) {			
			this.valor = _valor;
		}
		else
			this.valor = 0;
	}
	
	// --- Constructor mediante copia de otro objeto (sobrecarga)
	
	public Contador(Contador _cont) {
		this.valor = _cont.getValor();
	}
	
	
	// >>>MÉTODOS<<<
	
	/* --- Método incrementar ---
	 * 		- Incrementa el valor en 1, el enunciado no especifica limite superior.
	 */
	
	public void incrementar() {
		this.valor++;
	}
	
	/* --- Método decrementar ---
	 * 		- Decrementa el valor en 1.
	 * 		- Si el valor es cero, no lo decrementa mas ya que un contador debería contar solo positivos.
	 */
	
	public void decrementar() {
		
		if (this.getValor() > 0) {			
			this.valor--;
		}
		
	}
	
	

	// --- Getters y Setters ---
	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}
