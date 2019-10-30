package television;

/**
*	Crea la clase Televisión. Elige el tipo de datos necesarios para cada propiedad de la clase.
*	Propiedades:
*
*	estado (puede tener dos estados encendido o apagado)
*	pulgadas (tamaño en diagonal de la televisión en pulgadas)
*	pantalla(que puede ser plasma, lcd o led).
*	eficienciaEnergetica (que puede ser A,B,C,óD).
*	canal (que es el canal está seleccionado en este momento)
*	
*	Métodos:
*		Constructor, //en el que recibe: pulgadas, pantalla, y eficiencia. Pondrá por defecto estado
*		apagado, y canal 1.
*		
*		encender() //cambia el estado de la televisión a encendido.
*		
*		<tipo> cambiaCanal() // Primero debe comprobar que está encendido. Después incrementa el
*		canal hasta que llegue al 100, en ese caso vuelve al canal 1. Devuelve el canal en el que se
*		encuentra, salvo cuando esté apagado que devolverá un 0
*		
*		apagar() //cambia el estado a apagado.
*		
*		<tipo> getEficienciaEnergetica() //obtiene la eficienciaEnergetica de la televisión.
*		
*		<tipo> getCanal() //me informa del canal
*		
*		<tipo> getEstado() //me informa del estado
*
*	@author Jose Cabrera Rojas
* 
*/ 

public class Television {
	
	//ATRIBUTOS
	
	public boolean estado;
	public int pulgadas;
	public String pantalla;
	public char eficienciaEnergetica;
	public int canal;
	
	// CONSTRUCTOR
	
	public Television(int _pulg, String _pant, char _efic) {
		
		this.canal = 1;
		this.estado = false;
		this.pulgadas = _pulg;
		this.pantalla = _pant;
		this.eficienciaEnergetica = _efic;
	}
	
	//MÉTODOS
	
	// Método encender
	
	public void encender() {
		this.estado = true;
	}
	
	//Método cambiaCanal
	
	public int cambiaCanal() {
		
		int _var = 0;
		
		if (this.estado) {
			
			if(this.canal == 100) {
				this.canal = 1;
			}
			
			else {
				this.canal++;
			}
			
			_var = this.canal;
		}
		
		return _var;
	}
	
	//Método apagar
	
	public void apagar() {
		this.estado = false;
	}
	
	//Getters

	public boolean getEstado() {
		return estado;
	}

	public char getEficienciaEnergetica() {
		return eficienciaEnergetica;
	}

	public int getCanal() {
		return canal;
	}
	
	
}
