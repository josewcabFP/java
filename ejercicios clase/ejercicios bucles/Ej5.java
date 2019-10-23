public class Ej5{
    public static void main (String [] args){
        int num = Integer.parseInt(args[0]), contF = 1, contC = 1;
    
        if (num >= 1 && num <= 5){
            while (contF <= num){
                
                contC = 1;

                while(contC <= contF){
                    
                    System.out.print("* ");
                    contC++;
                }
                System.out.println('\b');

                contF++;  
            }
        }
        else{
            System.out.println("Debes introducir un valor entre 1 y 5");
        }
    }
}