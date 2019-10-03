/**
 *  Enunciado: Escriba el código necesario para evaluar la expresión:
 * 
            b^2-4ac
            -------
              2^a    
              
    , para valores de a=l, b=5 y c=2.
 * 
 * @author Jose Cabrera Rojas
 */

public class Ej8_26_9 {

	public static void main(String[] args) {
        
        double a = 1, b = 5, c = 2, resultado;
		
		resultado = (Math.pow(b, 2) - 4* a * c)/Math.pow(2, a);
		
		System.out.println(resultado);
	}

}
