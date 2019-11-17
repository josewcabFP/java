package Chips;

public class TestChip {

	public static void main(String[] args) {
		
		Circuito circuito1 = new Circuito("x789", 3, 5);
		Circuito circuito2 = new Circuito("z342", 6, 5);
		
		circuito1.conectarOtro(circuito2);
		
		System.out.println(circuito1);

	}

}
