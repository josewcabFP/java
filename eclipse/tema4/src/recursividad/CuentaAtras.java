package recursividad;

/**
 * void cuenta_atras(int n)
 * 
 * Debe mostrar por pantalla los números del n al 1. Si por ejemplo es cuenta_atras(3) muestra 3 2 1.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class CuentaAtras {
	
	public static void cuenta_atras(int _num) {
	
		if (_num <= 0) {
			;
		}
		else {
			System.out.println(_num);
			 cuenta_atras(_num - 1);		
		}
	
	
	}

	public static void main(String[] args) {
		CuentaAtras.cuenta_atras(10);
	}

}
