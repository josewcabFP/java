import java.util.Scanner;

public class Ej3{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la temperatura con su unidad de medida: ");
        
        String temperatura = sc.nextLine();

        double medida = Integer.parseInt(temperatura.split(" ")[0]);

        String unidad = temperatura.split(" ")[1].toUpperCase();

        switch (unidad){
            case "C":
                System.out.println("La temperatura en celcius es: " + medida + " " + "Cº");
                break;
            case "K":
                System.out.println("La temperatura en celcius es: " + (medida - 273.15) + " " + "Cº");
                break;
            case "F":
                System.out.println("La temperatura en celcius es: " + ((medida - 32) * 5/ 9) + " " + "Cº");
                break;
            default:
                System.out.println("El valor introducido no es válido");
        }

        
    }
}