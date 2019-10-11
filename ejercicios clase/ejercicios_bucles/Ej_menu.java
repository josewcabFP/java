import java.util.Scanner;

public class Ej_menu {
    public static void main(String [] args){
        
        boolean encontrado = false;
        
        int opc;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println ("1. Saludo\n" + 
                                "2. Suma\n" +
                                "0. Salir");
            opc = sc.nextInt();

            if (!encontrado){
                if (opc == 1){
                    System.out.println("HOLA!");
                }
                else if (opc == 2){
                    System.out.println("Has sumado!");
                }
                else{
                    System.out.println("Opción no valida!");
                }
            }
            
        }while (!encontrado);
    }
}