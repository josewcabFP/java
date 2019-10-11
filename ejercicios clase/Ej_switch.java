import javax.swing.JOptionPane;

/**
 *  Enunciado:  Crear un programa que contenga la estructura switch para
 *              que evalue la nota en los siguientes casos:
 *  
 *                  - Sobresaliente: 10 o 9
 *                  - Notable: 8 o 7
 *                  - Bien: 6
 *                  - Suspenso: El resto de notas
 *     
 *  @author Jose Cabrera Rojas
 */

 public class Ej_switch{
     public static void main (String [] args){
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu nota (debe ser un entero)"));

        switch (nota){
            case 10:
            
            case 9:
                System.out.println("Tienes un sobresaliente!");
                break;

            case 8:
            
            case 7:
                System.out.println("Tienes un notable!");
                break;

            case 6:
                System.out.println("Tienes un bien");
                break;

            default:
                System.out.println("Tienes un suspenso");
        }
     }
 }
