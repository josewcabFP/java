package electrodomestico;

public class AparatoElectrico {
	private static double potencia;
	private final static double POTENCIACONTRATADA;
	private double consumo;
	private boolean encendido;
	
	static {
		potencia = 0;
		POTENCIACONTRATADA = 1000;
	}
	
	public AparatoElectrico(double _consumo){
		this.consumo = _consumo;
		potencia = potencia + this.consumo;
		this.conectar();
	}
	
	public boolean saltaPlomos() {
		
		return AparatoElectrico.potencia >= AparatoElectrico.POTENCIACONTRATADA;
	}
	
	public void conectar() {
		if (!saltaPlomos()) {
			System.out.println("Se ha conectado el aparato sin problemas");
		}
		else
			System.out.println("Han saltado los plomos!!");
	}
	
	public static void main (String [] args) {
		
		AparatoElectrico ap1 = new AparatoElectrico(300);
		AparatoElectrico ap2 = new AparatoElectrico(300);
		AparatoElectrico ap3 = new AparatoElectrico(300);
		AparatoElectrico ap4 = new AparatoElectrico(300);
	}

}
