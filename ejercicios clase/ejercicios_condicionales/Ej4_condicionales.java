/**
 *  Dada una categoría energética(A, B, C, D, ó E), indicar si 
 *  es Eficiente (A), Moderado (B), Alto consumo (C, D, E), para
 *  cualquier otra categoría mostrar un mensaje de error.
 * 
 *  @author Jose Cabrera Rojas
 */

public class Ej4_condicionales{
    public static void main (String [] args){

        char letra = args[0].charAt(0);
        String categoria = "La categoría es: ";

        switch (Character.toUpperCase(letra)){  //  Convertimos la constante a mayusculas para hacer mas comprensible el switch.

            case 'A':
                System.out.println(categoria + " Eficiente.");
                break;
            
            case 'B':
                System.out.println(categoria + "Moderado.");
                break;
            
            case 'C':
            case 'D':
            case 'E':
                System.out.println(categoria +  "Alto consumo");
                break;

            default :
                System.out.println("La categoria introducida no es válida");
                break;
        }
    }
}