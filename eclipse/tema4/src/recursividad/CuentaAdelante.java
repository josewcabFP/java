package recursividad;

/**
 * void cuenta_delante(int n)
 * Debe mostrar por pantalla los números del 1 al n. Si por ejemplo es cuenta_delante(3) muestra 1 2 3.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class CuentaAdelante {
	public static void cuenta_adelante(int x) {
		if (x <= 0) {
			;
		}
		else {
			cuenta_adelante(x - 1);
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		CuentaAdelante.cuenta_adelante(5);

	}

}
