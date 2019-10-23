/**
 *Crea una clase Test de prueba para crear objetos de la clase rectángulo y probarlos.
 *  - Crea dos objetos de la clase rectángulo, solicita por teclado el nombre, alto y ancho.
 *  - Compara sus aéreas, e indica cuál de ellos tiene un área mayor, refiriéndote a ellos por
 *    sus nombres.
 *  - Incrementa 10 veces el ancho del primer rectángulo.
 *  - Muestra su área.
 *  - Comprueba si alguno de los dos rectángulos es un cuadrado y dilo por pantalla
 * 
 * @author Jose Cabrera Rojas
 */

 package figuras;

import java.util.Scanner;

public class Test{
     public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String entrada;
        String [] valores;
        
        System.out.print("Introduce los valores (nombre, alto y ancho) separados por espacios para el primer rectangulo: ");
        entrada = sc.nextLine();
        valores = entrada.split(" ");
        Rectangulo rect1 = new Rectangulo(Integer.parseInt(valores[2]), Integer.parseInt(valores[1]), valores[0]);


        System.out.print("Introduce los valores (nombre, alto y ancho) separados por espacios para el segundo rectangulo: ");
        entrada = sc.nextLine();
        valores = entrada.split(" ");
        Rectangulo rect2 = new Rectangulo(Integer.parseInt(valores[2]), Integer.parseInt(valores[1]), valores[0]);

        if (rect1.area() > rect2.area()) {
        	System.out.println("El rectangulo " + rect1.getNombre() + " tiene un área mayor al rectangulo " + rect2.getNombre());
        	
        }
        else {
        	System.out.println("El rectangulo " + rect2.getNombre() + " tiene un área mayor al rectangulo " + rect1.getNombre());
        }
        
        for (int i = 1; i <= 10; i++) {
        	rect1.incrementaAncho();
        }
        
        System.out.println("El área del rectangulo " + rect1.getNombre() + " despues del incremento es: " + rect1.area());
        
        if(rect1.esCuadrado()) {
        	System.out.println("El rectangulo " + rect1.getNombre() + " es en realidad un cuadrado");
        }
        else if (rect2.esCuadrado()) {
        	System.out.println("El rectangulo " + rect2.getNombre() + " es en realidad un cuadrado");
        }
        else {
        	System.out.println("Ninguno de los rectangulos es en realidad un cuadrado.");
        }
        
        
     }
 }