/**
 *  Enunciado: Realizar un programa tal que dados dos números decimales 
 *  y la operación que queremos realizar (suma +, resta -, multiplicación *,
 *  división / o resto %), la calcule y la muestre por pantalla. Utilizar
 *  un switch, mostrar un mensaje de error si la operación no es ninguna de
 *  las indicadas.
 *  
 *  Por ejemplo si las variables valen 5 y 2 y la operación es una resta, nos mostraría 3.
 * 
 *  @author Jose Cabrera Rojas
 */

public class Ej7_condicionales{

    public static void main (String [] args){

        // Los argunamentos son tomados de args[]
        
        double op1 = Double.parseDouble(args[0]);
        char simbolo = (args[1].charAt(0));
        double op2 = Double.parseDouble(args[2]);

        switch(simbolo){

            case 'x':
                System.out.println("El resultado de la multiplicación es: " + (op1 * op2));
                break;
            
            case '/':
                System.out.println("El resultado de la división es: " + (op1 / op2));
                break;

            case '+':
                System.out.println("El resultado de la suma es: " + (op1 + op2));
                break;

            case '-':
                System.out.println("El resultado de la resta es: " + (op1 - op2));
                break;
            
            case '%':
                System.out.println("El resto de la división es: " + (op1 % op2));
                break;

            default:
                System.out.println("Error: No se reconoce la operación");
                break;
        }


    }
}