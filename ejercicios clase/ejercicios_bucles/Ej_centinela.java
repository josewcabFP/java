import java.util.Scanner;

public class Ej_centinela {
    public static void main(String [] args){
        
        boolean centinela = false;
        
        int opc;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println ("1. Saludo\n" + 
                                "2. Obtener un número aleatorio del 1 al 100.\n" +
                                "0. Salir\n");
            opc = sc.nextInt();

            if (opc == 0){
                centinela = true;
            }

            else {
              
                
                    if (opc == 1){
                        System.out.println("HOLA!\n");
                    }
                    else if (opc == 2){
                        System.out.println("El numero aleatorio es: " + Math.floor(Math.random()*100 + 1)  + "\n");
                    }
                    else{
                        System.out.println("Opción no valida!\n");
                    }
            }
   
        }while (!centinela);
    }
}