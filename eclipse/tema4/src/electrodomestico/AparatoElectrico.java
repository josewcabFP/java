package electrodomestico;

/**
 *  Enunciado: 
 * 
 * Aparato Eléctrico, con las propiedades: potencia y consumo.
 * 
 * - El aparato puede estar encendido o apagado.
 * - Calcular total de la potencia a contratar.
 * - Establecer el total de la potencia contratada
 * - Calcular el total de la potencia que se está consumiendo ahora.
 * - Cuando se encienda un aparato indicar si saltan los plomos, es decir si la potencia que se está consumiendo ahora supera la potencia contratada.

 * - En el main:
 * 		Establecer la potencia contratada.
 * 		Crear varios aparatos.
 * 		Encender varios de ellos.
 * 		Crearlo de tal forma que salten los plomos.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class AparatoElectrico {
	private static double potencia;
	private final static double POTENCIACONTRATADA;
	private double consumo;
	private boolean encendido;
	
	static {
		potencia = 0;
		
		//Establecemos potencia contratada
		POTENCIACONTRATADA = 1000; 
	}
	
	public AparatoElectrico(double _consumo){
		this.consumo = _consumo;
		
		this.encendido = false;
	}
	
	public boolean saltaPlomos() {
		
		return AparatoElectrico.potencia + this.consumo >= AparatoElectrico.POTENCIACONTRATADA;
	}
	
	public void encender() {
		if (!encendido) {			
			
			if (!saltaPlomos()) {
				System.out.println("Se ha encendido el aparato sin problemas");
				potencia = potencia + this.consumo;
				this.encendido = true;
			}
			
			else
				System.out.println("Han saltado los plomos!!");
		}
	}
	
	public void apagar() {
		if (encendido) {
			System.out.println("Has apagado el aparato");
			this.encendido = false;
			potencia = potencia - this.consumo;
		}
	}
	
	public static double getPotencia() {
		return potencia;
	}
	
	
	public static void main (String [] args) {
		
		// La potencia contratada es de 1000w
		
		// Creamos aparatos
		
		AparatoElectrico ap1 = new AparatoElectrico(300);
		AparatoElectrico ap2 = new AparatoElectrico(300);
		AparatoElectrico ap3 = new AparatoElectrico(300);
		AparatoElectrico ap4 = new AparatoElectrico(300);
		
		// Encendemos varios de ellos
		
		ap1.encender();
		ap2.encender();
		ap3.encender();
		
		// Mostramos la potencia actual (sin saltar plomos)
		
		System.out.println("La potencia actual es de: " + AparatoElectrico.getPotencia());
		
		//con este saltan los plomos
		
		ap4.encender();
		
	}

}
