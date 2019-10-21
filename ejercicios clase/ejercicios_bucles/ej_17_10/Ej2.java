public class Ej2{
    public static void main(String [] args){
        char [] letras = new char [100];
        int cont = 0;
        for (int i = 0; i < letras.length; i++){
            letras[i] = (char) ((int)(Math.random()*25 + 97)); //multiplicamos por la diferencia, asi el valor minimo es (0 + 97) y el maximo (27 + 97)
            if (letras[i] == 'a'){
                cont++;
            }
        }

        System.out.println("Las veces que aparece la letra 'a' en el array son: " + cont);

    
    }
}