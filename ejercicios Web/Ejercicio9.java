import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio sin IVA: ");
        String costo = sc.nextLine();
        double pvp = Double.parseDouble(costo)*1.21;

        System.out.println("El precio con IVA es: " + pvp);
    }
}