package cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		
		Cuenta cuenta1 = new Cuenta();
		Cuenta cuenta2 = new Cuenta(100, "987654321", "Juan Perez");
		Cuenta cuenta3 = new Cuenta(cuenta2);
		
		System.out.println("Saldo cuenta1: " + cuenta1.getSaldo() + ", saldo cuenta2: " + cuenta2.getSaldo() + ", saldo cuenta3: " + cuenta3.getSaldo());
		
		cuenta1.ingreso(150);
		
		cuenta2.reintegro(50);
		
		cuenta3.transferencia(cuenta2, 25);
		
		System.out.println("Saldo cuenta1: " + cuenta1.getSaldo() + ", saldo cuenta2: " + cuenta2.getSaldo() + ", saldo cuenta3: " + cuenta3.getSaldo());
	}

}
