package interfaces;

public class Test {

	public static void main(String[] args) {
		Television tele = new Television();
		tele.encender();
		tele.establecerSleep(5);
		tele.calcularRestante();
		
		System.out.println("\n---------------------------\n");
		
		SistemaRiego sis = new SistemaRiego(10);
		sis.calcularRestante();
		
	}

}
