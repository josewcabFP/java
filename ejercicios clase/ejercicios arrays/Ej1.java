/**
 *  Crear una constante TAMANIO con el valor de 3.
 *  Crear un array de tamaño 3 de tipo entero.
 *  Asigna valores a cada posición del array.
 *  Muestra el contenido del array por pantalla.
 * 
 * @author Jose Cabrera Rojas
 */

public class Ej1{
    public static void main(String [] args){
        final int TAMANIO = 3;
        
        int [] array = new int[TAMANIO];
        
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        System.out.println("Los valores son: " + array[0] + ", " + array[1] + ", " + array[2]);

    }
}