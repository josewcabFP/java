/**
 * Programa que solicita por ventana popUp el nombre
 * del usuario, para luego utilizarlo en un mensaje de bienvenida.
 * 
 * @author Jose Cabrera
 */

import javax.swing.JOptionPane;

/**
 * Inicio de la aplicación.
 */

public class Ejercicio4{
    public static void main(String args[]){
        String entrada = JOptionPane.showInputDialog("Introduce tu nombre");

        System.out.println("Bienvenido " + entrada);
    
    }
}