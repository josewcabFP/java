/**
 * Programa que devulve el caracter introducido en ACSII.
 */

import java.util.Scanner;

/**
 * Entrada de programa.
 */

public class Ejercicio7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el caracte en ACSII: ");

        String caracter = sc.next();
        int numCaracter = Integer.parseInt(caracter);

        System.out.println("El caracter introducido es: " + (char)numCaracter);
    }
}