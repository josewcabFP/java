package intervalo;

public class TestIntervalo {

	public static void main(String[] args) {

		Intervalo inter = new Intervalo(-5, 5);
		Intervalo inter2 = new Intervalo(4, 5);

		System.out.println("inicio: " + inter.inicio + ", final: " + inter.fin);
		System.out.println("longitud: " + inter.longitud());
		inter.desplazamiento(-3);
		System.out.println("inicio: " + inter.inicio + ", final: " + inter.fin);
		System.out.println(inter.buscar(5));
		System.out.println(inter.estaIncluido(inter2));

	}

}
