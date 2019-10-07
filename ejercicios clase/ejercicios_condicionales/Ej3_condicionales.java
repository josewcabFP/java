/**
 *  Enunciado: Dada una calificación (número real), determinar 
 *  si es Apto o no Apto.
 * 
 *  @author Jose Cabrera Rojas
 */

public class Ej3_condicionales{
    public static void main (String [] args){
        
        double nota = Double.parseDouble(args[0]);

        if (nota <= 10){        // La nota debe tener un rango válido.

            if (nota >= 5){     //  La nota debe ser mayor o igual a 5 para el aprovado.

                System.out.println("Estas aprobado");
            }
            else{               //  Resto de casos.
                
                System.out.println("Estas suspenso");
            }

        }
        else{
            System.out.println("La nota no tiene un rango válido de evaluación");
        }
    }
}