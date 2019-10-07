import java.util.Scanner;

/**
 *  Enunciado: Mostrar un menú de opciones (utilizar println()), recibir un valor 
 *  por teclado (uso de la clase Scanner), en función del cual se muestre el 
 *  mensaje: "Ejecutando la opción x", donde x sea el número de la opción elegida.
 *  (No hemos visto la clase Scanner, podéis investigar, aunque lo veremos próximamente.
 *  Si no os sale utilizar un argumento por línea de comandos).
 * 
 *  El menú de opciones puede ser:
 * 
 *  1. Calcular el área de un cuadrado
 *  2. Calcular el área de un Triangulo
 *  3. Calcular el área de un Círculo
 *  0. finalizar
 * 
 *  @author Jose Cabrera Rojas
 */

public class Ej8_condicionales{
    
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        String ejec = "Ejecutando la opción ";
        
        int opcion;
        double medida;
        System.out.println( "\nBienvenido al calculador de áreas \n" + 
                            "----------------------------------\n" + 
                            "1. Calcular el área de un cuadrado.\n" +
                            "2. Calcular el área de un triangulo.\n" +
                            "3. Calcular el área de un cŕiculo.\n" +
                            "0. Finalizar.\n" + 
                            "----------------------------------\n");

        opcion = sc.nextInt();

        switch (opcion){
            case 0:

                break;
                
            case 1:

                System.out.println("\n--------------------------\n" + 
                                  "| " + ejec + opcion + " |\n" +
                                  "--------------------------\n");
                System.out.println("Ingresa la longitud del lado:\n");
                
                medida = sc.nextDouble();
                
                System.out.println("El área del cuadrado es: " + Math.pow(medida, 2));
                break;

            case 2:
                System.out.println("\n--------------------------\n" + 
                                    "| " + ejec + opcion + " |\n" +
                                    "--------------------------\n");
                System.out.println("Ingresa la longitud de la base:\n ");

                medida = sc.nextDouble();
                
                System.out.println("Ingresa la longitud de la altura:\n ");
                
                double altura = sc.nextDouble();

                System.out.println("El área del triangulo es: " + (medida * altura));
                break;

            case 3:
                System.out.println("\n--------------------------\n" + 
                                     "| " + ejec + opcion + " |\n" +
                                     "--------------------------\n");
                System.out.println("Ingresa la longitud del radio:\n");

                medida = sc.nextDouble();

                System.out.println("El área del circulo es: " + (Math.PI * Math.pow(medida, 2)));
                break;
        
            default:
                System.out.println("Error: La opción elegida no existe!");
                break;
        }
    }
}

