package coche_felix;

public class TestCoche {

	public static void main(String[] args) {
		Coche [] arrayCoches = new Coche[3];
		
		arrayCoches[0] = new Coche ();
		arrayCoches[1] = new Coche ("verde");
		arrayCoches[2] = new Mixto ();
		
		for (int i = 0; i < arrayCoches.length; i++) {
			for (int j = 0; j < 4; j++) {
				arrayCoches[i].acelerar();
			}
		}
		
		((Mixto) arrayCoches[2]).aumentaCarga(10);
		
		System.out.println("La velocidad del mixto es: " + arrayCoches[2].getVelocidad() + " y la carga es: " + ((Mixto)arrayCoches[2]).getCarga());
		
	}

}
