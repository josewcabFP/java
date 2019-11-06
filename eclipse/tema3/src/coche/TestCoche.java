package coche;

public class TestCoche {

	public static void main(String[] args) {
		Coche coche1 = new Coche("azul");
		Coche coche2 = new Coche();
		
		Mixto mixto1 = new Mixto(200, "verde");
		
		
		System.out.println("Coche1 => Velocidad: " + coche1.getVelocidad() + ", color: " + coche1.getColor());
		System.out.println("Coche2 => Velocidad: " + coche2.getVelocidad() + ", color: " + coche2.getColor());
		System.out.println("mixto1 => Velocidad: " + mixto1.getVelocidad() + ", color: " + mixto1.getColor() + ", carga: " + mixto1.getCarga() + ", capacidad: " + mixto1.getCapacidad());
		
		coche1.acelerar();
		coche2.acelerar();
		mixto1.acelerar();

		System.out.println("Coche1 => Velocidad: " + coche1.getVelocidad());
		System.out.println("Coche2 => Velocidad: " + coche2.getVelocidad());
		System.out.println("mixto1 => Velocidad: " + mixto1.getVelocidad());
		
		System.out.println("mixto1 => carga: " + mixto1.getCarga() + ", capacidad: " + mixto1.getCapacidad());
		
		mixto1.aumentaCarga(35);
		
		System.out.println("mixto1 => carga: " + mixto1.getCarga() + ", capacidad: " + mixto1.getCapacidad());
		
		
	}

}
