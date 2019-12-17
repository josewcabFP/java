import java.util.Scanner;

public class Ej_enum {

	//enum Dias {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;}
	
	enum Dias{
		
		LUNES('L', 1), MARTES('M', 2), MIERCOLES('X', 3), JUEVES('J', 4),
		VIERNES('V', 5), SABADO('S', 6), DOMINGO('D', 7);
		
		private char abrev;
		private int num;

		private Dias(char abrev, int num) {
			this.abrev = abrev;
			this.num = num;
		}
		
		public char getAbrev() {
			return this.abrev;
		}
		
		public int getNum() {
			return this.num;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String input_data;
		
		System.out.println("Introduce un dia de la semana: LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO");
		input_data = sc.next().toUpperCase();
		
		Dias semana [] = Dias.values();
		
//		for(Dias d : semana) {
//			System.out.println(d);
//		}
		
		//Dias dia = Dias.valueOf(input_data);
		
		Dias dia = Enum.valueOf(Dias.class, input_data);
		
		System.out.println("El dia es: " + dia + ", la abreviación es: " + dia.getAbrev() + " y su número es: " + dia.getNum());
		
	}

}
