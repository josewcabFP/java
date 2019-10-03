/**
 *  Enunciado: ¿Qué resultados se obtienen al realizar las operaciones siguientes? Si hay errores en la
    compilación, corríjalos y dé una explicación de por qué suceden.
 * 
 * @author Jose Cabrera Rojas
 */

public class Ej4_26_9{
    public static void main(String arg[]){
        int a = 10, b = 3, c = 1, d, e; 
        //se debe encadenar la asignación de variables utilizando ','.
        float x, y;
        x = a / b;
        y = (float) a / b;
        //cada vez que se termina una sentencia se debe acabar utilazando el caracter ';'.
        System.out.println(x + " ||" + y);
        // x = 3 ya que al ser la division de 2 enteros devolvera un entero.
        // y = 3.333333 ya que se hace un cast a tipo float.
    }
}