/**
 *  Crea un array de enteros con los valores 3, 5, 10.
    Crea un array de tres enteros.
    Copia el contenido del primer array en el segundo.
    Elimina el primer array (asígnale null)
    Muestra por pantalla el contenido del segundo array.
 * @author Jose Cabrera Rojas
 */

 public class Ej4{
     public static void main(String [] args){
         int [] array = new int [] {3, 5, 10};
         int [] array2 = new int [3];

         array2 = array.clone(); //funcion para clonar arrays.

         array = null;

         System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);
     }
 }