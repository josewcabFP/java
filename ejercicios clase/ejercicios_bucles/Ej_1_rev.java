/**
 *  Enunciado: Crea un array de números enteros aleatorios de 100 posiciones,
 *  que contendrá los números del 1 al 100. Obtén la suma de todos ellos y la media.
 * 
 *  @author Jose Cabrera Rojas
 */

public class Ej_1_rev{
    public static void main(String [] args){
        
        int [] aleatorios = new int [100];

        int i = 0; 
        double suma = 0;

        while (i < aleatorios.length){
            aleatorios[i] = (int)(Math.random()*100 + 1);
            suma += aleatorios[i];
            i++;
        }

        System.out.println("La suma de los aleatorios es: " + suma + " y la media es: " + (double)(suma/aleatorios.length));
    }
}