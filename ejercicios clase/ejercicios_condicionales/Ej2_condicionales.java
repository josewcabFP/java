/**
 *  Enunciado: Dado un número, realizar un programa que determine si 
 *  un número es cero, par o impar.
 * 
 *  @author Jose Cabrera Rojas
 */

public class Ej2_condicionales{
    public static void main(String [] args){
        
        int numero = Integer.parseInt(args[0]);

        if (numero == 0){               //  Empezamos descartando el cero, debido a que tambien es divisible entre 2.

            System.out.println("El numero es cero.");

        }
        else if (numero % 2 == 0){      //  Comprobamos la divisibilidad entre 2.

            System.out.println("El número es par.");

        }
        else{                           //  Resto de casos.
            
            System.out.println("El número es impar.");
        }
    }
}