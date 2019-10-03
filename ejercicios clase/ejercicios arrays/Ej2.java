/**
 *  Crea un array de String de 5 elementos con los días de la semana laborables.
 *  Muestra uno de los días de forma aleatoria (usa Math.random())
 * 
 * @author Jose Cabrera Rojas
 */

 public class Ej2{
     public static void main (String [] args){
        
        String [] dias = new String [5];
        
        dias[0] = "Lunes";
        dias[1] = "Martes";
        dias[2] = "Miercoles";
        dias[3] = "Jueves";
        dias[4] = "Viernes";

        System.out.println("Un dia aleatorio de la semana puede ser: " + dias[(int)Math.floor(Math.random()*5)]);
     }
 }