
public class Ej_for_1al100{
    public static void main (String [] args){
        int [] numeros = new int [100];

        int numceros = 0, numdiez = 0;
        

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = (int)(Math.random()*11);
            if (numeros[i] == 10){
                numdiez++;
            }
            else if (numeros[i] == 0){
                numceros++;
            }
        }

        System.out.println("El numero de dieces que aparecen es: " +  numdiez + " y el numero de ceros que aparecen es: " + numceros);

       
    }
}