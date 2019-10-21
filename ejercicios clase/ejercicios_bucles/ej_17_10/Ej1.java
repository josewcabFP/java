public class Ej1{
    public static void main (String [] args){
        
        int [] nums = new int [100];
        int suma = 0;

        for (int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random()*100 + 1);
            suma += nums[i];
        }

        System.out.println("La suma de los componentes del array es: " + suma + " y la media es: " + (suma/nums.length));

        
    }
}