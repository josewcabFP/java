package fraccion;

public class TestFraccion {

	public static void main(String[] args) {
		Fraccion frac1 = new Fraccion(3, 2);
		Fraccion frac2 = new Fraccion(5, 8);
		
		frac1.sumar(frac2);
		System.out.println(frac1);
		
		frac1.multiplicar(frac2);
		System.out.println(frac1);

	}

}
