public class Ej2_2 {
    public static void main(String [] args){
        char [] letras = new char [100];
        int cont = 0, i = 0;
        while(i < letras.length){
            letras[i] = (char) ((int)(Math.random()*25 + 97)); //multiplicamos por la diferencia, asi el valor minimo es (0 + 97) y el maximo (27 + 97)
            if (letras[i] == 'a'){
                cont++;
            }
            i++;
        }

        System.out.println("Las veces que aparece la letra 'a' en el array son: " + cont);

    
    }
}