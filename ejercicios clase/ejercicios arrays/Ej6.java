/**
 *  Crea un array bidimensional 3x3 de números enteros con los primeros números primos.
    Muestra todos los elementos del tercer array.
 *  
 *  @author Jose Cabrera Rojas
 */

 public class Ej6{
     public static void main (String [] args){
         int [][] biArray = new int [3][3];

         biArray[0][0] = 1;
         biArray[0][1] = 2;
         biArray[0][2] = 3;

         biArray[1][0] = 5;
         biArray[1][1] = 7;
         biArray[1][2] = 11;
         
         biArray[2][0] = 13;
         biArray[2][1] = 17;
         biArray[2][2] = 19;

         System.out.println(biArray[0][0] + "  | " + biArray[0][1] + "  | " + biArray[0][2] + "\n" +
                            biArray[1][0] + "  | " + biArray[1][1] + "  | " + biArray[1][2] + "\n" +
                            biArray[2][0] + " | " + biArray[2][1] + " | " + biArray[2][2]);

     }
 }