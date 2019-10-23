/**
 * 
 * 
 * @author Jose Cabrera Rojas
 */

package banca;


public class Cuenta{
    //ATRIBUTOS

    public double saldo;

    //MÉTODOS

    public Cuenta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public void ingreso(double cantidad){
        this.saldo += cantidad;
    }

    public void gasto(double cantidad){
        this.saldo -= cantidad;
    }

    public double getSaldo(){
        return this.saldo;
    }
}