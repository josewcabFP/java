package contador;

public class TestContador {

	public static void main(String[] args) {
		
		Contador contador1 = new Contador();
		Contador contador2 = new Contador(5);
		Contador contador3 = new Contador(contador2);
		
		System.out.println("valor de contador1: " + contador1.getValor() + " | valor de contador2: " + contador2.getValor() + " | valor de contador3: " + contador3.getValor());
		
		contador1.decrementar();
		contador2.decrementar();
		contador3.incrementar();
		
		System.out.println("valor de contador1: " + contador1.getValor() + " | valor de contador2: " + contador2.getValor() + " | valor de contador3: " + contador3.getValor());

		
	}

}
