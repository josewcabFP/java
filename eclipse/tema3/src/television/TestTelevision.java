package television;

/**
* Crea un objeto de tipo Televisión.
*	Enciende la televisión.
*	Cambia de canal hasta encontrar el canal 34.
*	Muestra el estado y canal en el que se encuentra.
*	Apaga la televisión.
*
*	Según la eficiencia energética de la televisión, indicar si es EXCELENTE, MUY BUENA, BUENA,
*	NORMAL, REGULAR. (utilizar un switch).
*
* @author Jose Cabrera Rojas
* */

public class TestTelevision {

	public static void main(String[] args) {
		Television tele = new Television(17, "led", 'B');
		
		tele.encender();
		
		while (tele.getCanal() != 34) {
			System.out.println("Cambiando canal... ahora el canal es: " + tele.cambiaCanal());
		}
		
		if (tele.estado) {
			System.out.println("La televisión esta encendida! y el canal es el " + tele.getCanal());
		}
		else
			System.out.println("La televisión esta apagada!");
		
		tele.apagar();
		
		switch(tele.getEficienciaEnergetica()) {
		case 'A':
			System.out.println("La eficiencia energética es: EXELENTE");
			break;
			
		case 'B':
			System.out.println("La eficiencia energética es: MUY BUENA");
			break;
		
		case 'C':
			System.out.println("La eficiencia energética es: BUENA");
			break;
			
		case 'D':
			System.out.println("La eficiencia energética es: NORMAL");
			break;
		
		case 'E':
			System.out.println("La eficiencia energética es: REGULAR");
			break;
		
		default: 
			System.out.println("La eficiencia energética es: DESCONOCIDA");
			break;
		}
	}

}
