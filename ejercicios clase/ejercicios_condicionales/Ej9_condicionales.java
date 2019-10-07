import java.util.Scanner;

/**
 * Enunciado: Dada una temperatura con valor real, de una persona, indicar si
 * tiene fiebre, está por debajo de lo normal o es normal. Se considera por
 * debajo de lo normal si es menor de 35º, y con fiebre a partir de 37.5º el
 * resto es normal.
 * 
 * Mostrar el mensaje que corresponda por pantalla.
 * 
 * @author Jose Cabrera Rojas
 */

public class Ej9_condicionales{

    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\nIntroduce la temperatura del paciente\n");

        double temp = sc.nextDouble();

        if (temp >= 37.5){
            System.out.println("\nEl paciente tiene fiebre.");
        }
        else if (temp > 35){
            System.out.println("\nEl paciente tiene una temperatura normal.");
        }
        else{
            System.out.println("\nEl paciente tiene una temperatura debajo de lo normal.");
        }

    }
}
