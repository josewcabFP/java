/**
 *  Enunciado: Escriba las sentencias necesarias para evaluar la siguiente ecuación para valores de
    a=5, b=-1.7, c=2 y x= 10.5

    ax^3+bx^2-cx+3

    @author Jose Cabrera Rojas
 */

 public class Ej5_26_9{
     public static void main(String arg[]){
        int a = 5, c = 2;
        float b = -1.7F;
        double x = 10.5F, result;

        //Usamos la libreria Math del API de Java.

          result = a * Math.pow(x, 3) + b * Math.pow(x, 2) + c * x + 3;

        //result = a * (x * x * x) + b * (x * x) + c * x + 3;

        System.out.println("El resultado de la ecuación es: " + result);
     }
 }