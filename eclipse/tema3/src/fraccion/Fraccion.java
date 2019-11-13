/**
 * Enunciado:
 * 	Crea una clase Fraccion con métodos para sumar, restar, multiplicar y dividir.
 * 
 * @author Jose Cabrera Rojas
 */

package fraccion;

public class Fraccion {
	
	//ATRIBUTOS
	
	private int numerador;
	private int denominador;
	
	// CONSTRUCTORES
	
	public Fraccion() {
		this.numerador = 3;
		this.denominador = 4;
	}
	
	public Fraccion(int _numerador, int _denominador) {
		this.numerador = _numerador;
		this.denominador = _denominador;
	}
	
	//MéTODOS
	
	public void sumar(Fraccion _frac) {
		
		this.numerador = ((this.numerador * _frac.getDenominador()) + (this.denominador * _frac.getNumerador()));
		this.denominador = ((this.denominador * _frac.getDenominador()));
		
		this.simplifica();
	}
	
	public void restar(Fraccion _frac) {
		this.numerador = ((this.numerador * _frac.getDenominador()) - (this.denominador * _frac.getNumerador()));
		this.denominador = ((this.denominador * _frac.getDenominador()));
		
		this.simplifica();
	}
	
	public void multiplicar(Fraccion _frac) {
		this.numerador = this.numerador * _frac.getNumerador();
		this.denominador = this.denominador * _frac.getDenominador();
	}
	
	public void dividir(Fraccion _frac) {
		_frac.invertir();
		this.numerador = this.numerador * _frac.getNumerador();
		this.denominador = this.denominador * _frac.getDenominador();
	}
	
	public void simplifica() {
		
		for(int i = 2; i <= 9; i++) { // números de divisibilidad.
			while(this.numerador % i == 0 && this.denominador % i == 0) { // seguira hasta que ya no sean divisibles (caso 8/8)
				this.numerador = this.numerador / i;
				this.denominador = this.denominador / i;
			}
		}
		
		// Faltaria simplificar cuando son primos pero es unj algoritmo dificil de implementar (ejem: 22/33)
		
		
		
	}
	
	public void invertir() {
		int temp;
		
		temp = this.numerador;
		this.numerador = this.denominador;
		this.denominador = temp;
	}

	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	@Override
	public String toString() {
		
		return this.numerador + " / " + this.denominador;
	}
	
	
	
	
}
