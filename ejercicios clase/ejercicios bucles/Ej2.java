public class Ej2{
    public static void main (String [] args){
        int edad = Integer.parseInt(args[0]);

        if (edad >= 0 && edad <= 120){

            if (edad <= 14){
                System.out.println("Debe ir al pediatra.");
            }
            else {
                System.out.println("Debe ir al médico de cabecera.");

            }
        }
        else{
            System.out.println("Error, la edad introducida no es válida");
        }
    }
}
