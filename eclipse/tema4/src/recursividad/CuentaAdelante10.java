package recursividad;

/**
 * void cuenta_hasta10(int n)
 * Muestra por pantalla los números desde el número dado hasta 10, si nos dan un número mayor que 10 mostrará 10.
 * Si nos pasan por ejemplo 5, muestra: 5 6 7 8 9 10

 * @author Jose Cabrera Rojas
 *
 */

public class CuentaAdelante10 {
	
	public static int contar_hasta10(int _num) {
		int cuenta;
		
		if (_num >= 10) {
			cuenta = 10;
		}
		else {
			System.out.println(_num);
			cuenta = contar_hasta10(_num +1);
		}
		
		return cuenta;
		
	}
	public static void main(String[] args) {
		System.out.println(CuentaAdelante10.contar_hasta10(1));

	}

}
