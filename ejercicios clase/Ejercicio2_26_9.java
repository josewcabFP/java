public class Ejercicio2_26_9{
    public static void main(String arg[]){
        int x = 3, y = 5, temp;
        System.out.println("las variables inicialmente son x = " + x + " e y = " + y);
        temp = y;
        y = x;
        x = temp;
        System.out.println("--------------------------------------------------------" + '\n' +
        "ahora las variables son x = " + x + " e y = " + y);
    }
}