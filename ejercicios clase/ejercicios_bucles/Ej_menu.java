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

            if (opc == 0){
                encontrado = true;
            }

            else {
              if (!encontrado){
                if (opc == 1){
                    System.out.println("HOLA!\n");
                }
                else if (opc == 2){
                    System.out.println("Has sumado!\n");
                }
                else{
                    System.out.println("Opción no valida!\n");
                }
                }  
            }

            
            
        }while (!encontrado);
    }
}