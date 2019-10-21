import java.util.Scanner;

public class Ej3 {
    public static void main(String [] args){
        final double MAX = 3.4;
        
        double [] array = new double [5];
        boolean alta = false;
        Scanner sc = new Scanner(System.in);

        

        for (int i = 0; i < array.length; i++){
            
            System.out.println("Introduce la temperatura nº " + (i + 1));
            System.out.print("> ");

            array[i] = sc.nextDouble();

            if (array[i] > MAX){
                alta = true;
            }   
        }

        if (alta){
            System.out.println("\nERROR! Una de las lecturas exede la temperatura maxima");
        }
        else{
            System.out.println("\nTodas las temperaturas son correctas");
        }

        
    }
}