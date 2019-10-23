package poo;

public class Coche{
    public int ruedas;
    public double largo;
    public double ancho;
    public String motor;    
    public double peso;

    public Coche(){
        this.ruedas = 4;
        this.largo = 3.5;
        this.ancho = 2.3;
        this.motor = "V8";
        this.peso = 4500;
    }

    public void arrancar(){
        System.out.println("El coche ha arrancado");
    }
}
