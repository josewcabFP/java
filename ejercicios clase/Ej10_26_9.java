/**
 * Enunciado: Reescribe el ejercicio 8 para recibir como parámetros los valores a, b y c desde línea
    de comandos.
 * 
 * @author Jose Cabrera Rojas
 */

public class Ej10_26_9 {

	public static void main(String[] args) {

        //los argumentos introducidos para la funcion los toma el String "args"
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		
		double resultado;
		
		resultado = (Math.pow(b, 2) - 4* a * c)/Math.pow(2, a);
		
		System.out.println(resultado);

	}

}
