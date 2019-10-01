/**
 *  Enunciado: Decida qué tipos de datos necesita para escribir un programa que calcule la suma y la
    media de cuatro números de tipo int.

    @author Jose Cabrera Rojas
 */

 public class Ej7_26_9{
     public static void main(String arg[]){
         int a = 3, b = 5, c = 7, d = 11;
         double media = 0;
         
         media = (double)(a + b + c + d)/4;

         System.out.println("La media de los 4 números (3, 5, 7, 11) es: " + media);
     }
 }