package interfaces;

/**
 * Crear dos clases que implementen la interfaz diseñada, tienen que ser dos clases completamente distintas.
 * 
 * @author Jose Cabrera Rojas
 *
 */


public class Television implements FuncionalidadTemporizador{
	
	private int sleep;
	private int minTrans;
	private boolean encendido;
	
	
	
	public Television() {
		this.sleep = -1;
		this.encendido = false;
		this.minTrans = 0;
	}

	public void establecerSleep(int valor) {
		this.sleep = valor;
	}
	
	public void encender() {
		this.encendido = true;
		this.minTrans = 0;
	}

	@Override
	public void apagar() {
		
		this.encendido = false;
	}

	@Override
	public double calcularRestante() {
		double restante = 0;
		if (sleep > 0) {
			for (int i = 0; i <= sleep; i++) {				
				this.minTrans = i;
				restante = sleep - minTrans;
				System.out.println("Quedan: " + restante + " min para el apagado");
			}
			if (sleep == 0) {
				apagar();
			}
		}
		return restante;
	}

	public boolean isEncendido() {
		return encendido;
	}

	
	
	

}
