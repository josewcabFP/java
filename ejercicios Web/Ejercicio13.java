import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ejercicio13{
    public static void main(String arg[]){
        int numPedidos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de pedidos"));
        int total = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= numPedidos; i++){
            System.err.println("Introduce precio del pedido nº " + i + ": ");
            total += Integer.parseInt(sc.nextLine());
        }

        System.out.println("El total es: " + total);
    }
}