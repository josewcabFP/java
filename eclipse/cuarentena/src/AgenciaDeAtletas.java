import java.util.ArrayList;

/**
 * Dado el siguiente código aplica la refactorización.
 * Hay malos olores en:
 * 
 * - realizaVariosCalculos
 * - getMaximaGanancia
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class AgenciaDeAtletas {
	// Crear la lista.
	private ArrayList<Atleta> listaAtletas;
	private double maximaGanancia;
	
	public AgenciaDeAtletas() {
		listaAtletas = new ArrayList<Atleta>();
	}

	public void add(Atleta d) {
		this.listaAtletas.add(d);
	}

	public void calculoGanancias() {
		/**
		 * Consolidar metodos duplicados:
		 * 
		 * No es necesario recorrer dos veces el bucle cuando podemos aprovechar el primer recorrido
		 */
		
		//Total de ganancias
		double ganancias = 0;
		double gananciasxJugador = 0;
		double gananciaxJugadorMax = 0;
		for (Atleta atleta : listaAtletas) {
			ganancias += atleta.gananciaAgencia();
			gananciasxJugador += atleta.gananciaAgencia();
			if (gananciaxJugadorMax < atleta.gananciaAgencia()) {
				gananciaxJugadorMax = atleta.gananciaAgencia();
			}
			
		}
		System.out.println("Total de las ganancias: "+ ganancias);
		gananciasxJugador = gananciasxJugador/listaAtletas.size();
		System.out.println("\nTotal de las ganancias: "+ gananciasxJugador);
		
		/**
		 * De esta forma tambien podemos aprovechar el bucle para el calculo de la ganacia máxima.
		 */
		
		this.maximaGanancia = gananciasxJugador;
		
	}
	
	/*
	 * public double getMaximaGanancia() {
	 * 
	 * //Total de ganancias double ganancia = 0; for (Atleta atleta : listaAtletas)
	 * { if (ganancia < atleta.gananciaAgencia()) { ganancia =
	 * atleta.gananciaAgencia(); } } this.maximaGanancia = ganancia; return
	 * this.maximaGanancia; }
	 */
	public static void main(String[] args) {
		AgenciaDeAtletas agencia = new AgenciaDeAtletas();
		try {
			Atleta a = new Atleta("Pepe Sánchez", "654987123", 21000000, 5, "ciclismo");
			
			// Cargar los deportistas
			agencia.add(new Atleta("Pepe Sánchez", "654987123", 21000000, 5, "ciclismo"));
			agencia.add(new Atleta("Ana Silva", "654132456", 25000000, 10, "ciclismo"));
			agencia.add(new Atleta("Aitana García", "636987123", 28000000, 10, "lucha"));
			agencia.add(new Atleta("Raúl Sousa", "654159723", 21000000, 4, "lucha"));

		} catch (Exception e) {
			System.err.println("Se ha producio un error al dar de alta los deportistas.");
			e.printStackTrace();
		}

		
		System.out.println("---------------------------------");
		agencia.calculoGanancias();
	}

}