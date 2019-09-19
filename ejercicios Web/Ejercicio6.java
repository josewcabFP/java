/**
 * Programa que utiliza un Scanner para recibir por consola un
 * número, del cual calculará si es par o impar.
 */

import java.util.Scanner;

/**
 * Función de entrada.
 */

public class Ejercicio6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número: ");
        int num = Integer.parseInt(sc.next());

        if (num%2 == 0){
            System.out.println("El número es par");
        }
        else{
            System.out.println("El número es impar");
        }
    }
}