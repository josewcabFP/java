/**
 * 
 * @author Jose Cabrera Rojas
 */

package banca;

public class TestCuenta{
    public static void main(String [] args){
        
        Cuenta cuenta1 = new Cuenta(100.00);

        System.out.println("El saldo en la cuenta es: " + cuenta1.getSaldo());

        cuenta1.ingreso(25.0);

        System.out.println("El saldo en la cuenta es: " + cuenta1.getSaldo());

        cuenta1.gasto(50.0);

        System.out.println("El saldo en la cuenta es: " + cuenta1.getSaldo());
    }
}