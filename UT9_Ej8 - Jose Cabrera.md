# UT9 Ej8: Preguntas video 165

**Nombre: Jose Cabrera Rojas**<br>
**Ciclo: 1º DAW**<br><br>

## Responder a las preguntas.

### Convierte la siguiente clase normal en una clase genérica: public class Pila {...}

Para convertir esta clase solo hay que agregar la sintaxis <T> siendo T el valor genérico.

```java
public class Pila <T>{...}
```

En los archivos adjuntos estan las dos clases necesarias modificadas (NodoGenerico y PilaGenerica).

### Declara e inicializa un objeto Pareja con tipo de dato String.

```java
Pareja <String> p = new Pareja <String> ();

p.setPrimero("Jose");
```

### Dada la clase MiGenerica<T>, ¿Cómo declaro e inicializo un objeto para esa clase, si quiero que use el tipo de dato String, y sabiendo que el constructor de la clase no recibe parámetros?

```java
//Implementamos la clase

public class MiGenerica<T>{
    private T contenido;

    public MiGenerica(){
        this.contenido = null;
    }

    public setContenido(T c){
        this.contenido = c;
    }

    public T getContenido(){
        return this.contenido;
    }
}



//Declaramos e inicializamos objeto de esa clase con tipo String

MiGenerica <String> mg = new MiGenerica <String>();

mg.setContenido("hola mundo!");
```

> Necesitamos declarar getters y setters en la clase para mutar y acceder a los datos.


### ¿Cuál es la magia que se produce con las clases genéricas?

Podemos **reutilizar** el código para diferentes tipos de datos sin tener que crear nuevamente el script para un tipo de datos específico.