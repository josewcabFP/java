
public class Ej4{
    public static void main (String [] args){
        
        int [] star = new int [args.length];

        for (int i = 0; i < star.length; i++){
            star[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < star.length; i++){
            for (int j = 0; j < star[i]; j++){
                System.out.print("* ");
            }
            System.out.print('\n');
        }


        
    }
}