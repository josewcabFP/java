package interfaces;

/**
 * Crear dos clases que implementen la interfaz diseñada, tienen que ser dos clases completamente distintas.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class SistemaRiego implements FuncionalidadTemporizador{
	
	private double litrosTotales;
	private double litrosGastados;
	private boolean encedido;
	
	
	
	public SistemaRiego(double litrosTotales) {
		this.litrosTotales = litrosTotales;
		this.litrosGastados = 0;
		this.encedido = false;
	}

	@Override
	public double calcularRestante() {
		
		for(int i = 0; i < litrosTotales; i++) {
			this.litrosGastados += i;
			 this.litrosTotales = this.litrosTotales - this.litrosGastados;
			System.out.println("Quedan " + this.litrosTotales + " litros");
			apagar();
		}
		return this.litrosTotales;
	}

	@Override
	public void apagar() {
		if (this.litrosTotales <= 0) {
			this.encedido = false;
			System.out.println("El sistema de riego se ha apagado por falta de agua");
		}	
	}

	public double getLitrosTotales() {
		return litrosTotales;
	}

	public double getLitrosGastados() {
		return litrosGastados;
	}

	public boolean isEncedido() {
		return encedido;
	}
	
	

}
