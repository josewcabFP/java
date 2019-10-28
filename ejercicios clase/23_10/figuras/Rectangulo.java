/**
*  Enunciado: Rectángulo
*   Propiedades:
*   int ancho
*   int alto
*   String nombre
*   Métodos:
*   constructor (ancho, alto, nombre)
*   constructor() //crea por defecto un rectángulo de tamaño 5,7 y nombre RECTÁNGULO
*   int getAncho()
*   int getAlto()
*   int perimetro()
*   int area()
*   int incrementaAncho() //Incrementa en una unidad el ancho del rectángulo y me
*   devuelve el ancho actual.
*   int incrementaAlto() //Incrementa en una unidad el alto del rectángulo y me devuelve
*   el alto actual
*   String getNombre() //Me devuelve el nombre del rectángulo.
*   boolean esCuadrado() //devuelve verdadero o falso si se trata de un cuadrado.
* 
* 
*  @author Jose Cabrera Rojas
*/

package figuras;

public class Rectangulo{
    //ATRIBUTOS

    public int ancho;
    public int alto;
    String nombre;

    //METODOS

    //Constructor

    public Rectangulo(int _ancho, int _alto, String _nombre){
        this.ancho = _ancho;
        this.alto = _alto;
        this.nombre = _nombre;
    }

    public Rectangulo(){
       new Rectangulo(5,7, "RECTANGULO");
    }

    public int getAncho(){
        return this.ancho;
    }

    public int getAlto(){
        return this.alto;
    }

    public int perimetro(){
        return ((this.alto * 2) + (this.ancho * 2));
    }

    public int area(){
        return (this.alto * this.ancho);
    }

    public int incrementaAncho(){
        this.ancho += 1;
        return this.ancho;
    }

    public int incrementaAlto(){
        this.alto += 1;
        return this.alto;
    }

    public String getNombre(){
        return this.nombre;
    }

    public boolean esCuadrado(){
        return (this.ancho == this.alto);
    }

    public void pintaPerimetro(char c){
        for (int fil = 0; fil < this.getAlto(); fil++){
            for(int col = 0; col < this.getAncho(); col++){
                if (col == 0 || col == this.getAncho() - 1 || fil == 0 || fil == this.getAlto() - 1){
                    System.out.print(" " + c + " ");
                }
                else{

                    System.out.print("   ");
                }
            }
            System.out.println("\b");
        }
        System.out.println("\n");
    }
    public void pintaRelleno(char c){
        for (int fil = 0; fil < this.getAlto(); fil++){
            for(int col = 0; col < this.getAncho(); col++){
                System.out.print(" " + c + " ");
            }
            System.out.println("\b");
        }
        System.out.println("\n");
    }
}
