/**
 *  Enunciado: Crear la clase fracción mostrada en la portada de las diapositivas de clases y objetos
 *  
 *  @author Jose Cabrera Rojas
 */


public class Fraccion{
    
//ATRIBUTOS
    
    public int numerador;
    public int denominador;

//MÉTODOS

    public void simplificarse(){
        System.out.println("Se ha simplificado la fracción");
    }

    public void sumar(){
        System.out.println("Se ha sumado con otra fracción");
    }

    public void invertir(){
        int temp;

        temp = this.numerador;
        this.numerador = this.denominador;
        this.denominador = temp;
    }

    //Método main

    public static void main(String [] args){
        Fraccion frac = new Fraccion();

        frac.numerador = 1;
        frac.denominador = 2;

        frac.simplificarse();

        frac.sumar();

        System.out.println("La fracción es: " + frac.numerador + "/" + frac.denominador);
        frac.invertir();
        System.out.println(" y la fracción invertida es: " + frac.numerador + "/" + frac.denominador);
    }
}