package bloque16;

/**
 * Enunciado: 	Crea la clase Dado. Con la propiedad privada valor como un entero.
 *				En el constructor se inicializa a 0 el valor.
 *
 *				Métodos get/set de las propiedades, en este caso getValor() y setValor()
 *				Métodos: tirar() asigna un valor aleatorio del 1 al 6 al valor. También devuelve ese
 *				valor.
 * 
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Dado {

	private int valor;
	
	public Dado() {
		this.valor = 0;
		
	}
	
	
	public int tirar(){
		int tiro;
		
		this.valor = (int)Math.floor(Math.random()*6 + 1);
		tiro = this.valor;
		
		return tiro;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}
