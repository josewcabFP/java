/**
 * Programa que calcula área del circulo, pidiendo por popUp
 * el radio.
 */

import javax.swing.JOptionPane;

/**
 * Programa de entrada.
 */
public class Ejercicio5{
    public static void main (String args[]){
        
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio"));

        System.out.println("El radio es: " + Math.pow(Math.PI*radio, 2));
    }
}