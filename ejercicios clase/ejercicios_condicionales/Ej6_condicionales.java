/**
 *  Enunciado: Realizar otra versión del ejercicio anterior, 
 *  pero utilizando un switch.
 *  
 *  @author Jose Cabrera Rojas
 */

public class Ej6_condicionales{
    
    public static void main (String [] args){

        char dia = Character.toUpperCase(args[0].charAt(0));

        switch (dia){

            case 'L':
            case 'M':
            case 'X':
            case 'J':
            case 'V':
                System.out.println("Es día laborable.");
                break;
            
            case 'S':
            case 'D':
                System.out.println("El día es festivo.");
                break;

            default:
                System.out.println("El introducido no es válido.");
        }
    }
}