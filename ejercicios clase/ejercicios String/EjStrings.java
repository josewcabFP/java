/**
 *  Enunciado: Prueba los siguientes métodos de la clase String:
 * 
 *      - length()
 *      - charAt()
 *      - indexOf()
 *      - subString()
 *      - replace()
 * 
 *  @author Jose cabrera Rojas
 */

public class EjStrings{
    public static void main(String [] args){
        
        String frase = "Hola como estas?"; //Creamos el String.

        int tamanio = frase.length(); // Función que muestra el tamaño del String, contado caracter a caracter.

        char caracter = frase.charAt(3); // Función que muestra el caracter de la posición dada.

        int posicion = frase.indexOf("o"); // Función que muestra la posición numérica del caracter dado.

        String subfrase = frase.substring(5); // Función que muestra el sub string a partir de la posición dada.

        String fraseNueva = frase.replace("a", "o"); // Función que reemplaza un caracter por otro, en todas las posiciones
                                                     // donde aparece el caracter a cambiar.



        System.out.println(tamanio + " | " + caracter + " | " + posicion + " | " + subfrase + " | " +  fraseNueva);

    }
}   