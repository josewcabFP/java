/**
 *  Enunciado: Crear una variable con el día de la semana (L, M, X, J, V, S, D),
 *  utilizar un tipo de dato adecuado. Y que nos muestre si es laborable (será 
 *  de lunes a viernes), o festivo (sábado y domingo). Realizar el ejercicio 
 *  utilizando un if/else.
 * 
 *  @author Jose Cabrera Rojas
 */

 public class Ej5_condicionales{
    public static void main (String [] args){
        
        char dia = Character.toUpperCase(args[0].charAt(0));


        if (dia == 'L' || dia == 'M' || dia == 'X' || dia == 'J' || dia == 'V'){
            
            System.out.println("El día es laborable.");
        }
        else if ( dia == 'S' || dia == 'D'){

            System.out.println("El dia es festivo.");

        }
        else{

            System.out.println("No es una entrada válida");

        }
    }
 }