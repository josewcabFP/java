/**
 *  Un obrero necesita calcular su salario semanal, el cual se 
 *  obtiene de la siguiente manera:
 *      - Si trabaja 40 horas o menos se le paga $16 por hora
 *      - Si trabaja más de 40 horas se le paga $16 por cada 
 *        una de las primeras 40 horas y $20 por cada hora extra.

*   Inicializar una variable horas con la cantidad de horas que ha 
*   trabajado (se le puede asignar directamente un valor, o pasarlo 
*   por línea de comandos). Y en función de las horas mostrar el 
*   resultado por pantalla.
*
*   @author Jose Cabrera Rojas
*/

public class Ej1_condicionales{
    public static void main(String [] args){

        int horas = Integer.parseInt(args[0]);
        double salario = 0;

        if (horas <= 40){
            
            salario = horas * 16;

        }
        else if (horas > 40){
            int extra = horas - 40;

            salario = (40 * 16) + (extra * 20);

        }

        System.out.println("Tu salario es de: " + salario);


    }
}