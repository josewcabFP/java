/**
 *  Crea dos arrays que apunten a la misma zona de memoria.
    Asigna a uno de ellos null.
    Comprueba cual es la situación del segundo.
 * 
 * @author Jose Cabrera Rojas
 */

public class Ej5{
    public static void main(String [] args){
        int [] array = new int [3];
        int [] array2 = array;

        array = null;

        System.out.println(array2[0] + ", " + array2[1] + ", " + array2[2]);
    }
}