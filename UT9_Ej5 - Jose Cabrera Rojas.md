# UT9 Ej5: Preguntas


**Nombre: Jose Cabrera Rojas**<br>
**Ciclo: 1º DAW**<br><br>


1. ¿Qué es Iterator: una clase, un enumerado, una interfaz o un genérico?

    Iterator es una interface

2. ¿Qué tres métodos tiene Iterator? Explica brevemente lo que hace cada uno.

- **hasNext** : Devuelve un booleano que será **true** si el elemento evaluado tiene un elemento a continuación.

- **next** : Devulve el siguente elemento de la sucesión.

- **remove** : Elimina el ultimo elemento evaluado.

3. ¿Con qué método de ArrayList obtenemos un Iterator?.

    Con el método **iterator( )**.

4. ¿Cómo se crea una variable iterador para Coches desde el arrayList de mis_coches? (Escribe la sentencia válida)

    ```java
    Iterator<Coche> it = mis_coches.iterator();
    ```

5. Utilizando el iterador anterior ¿cómo podemos saber si tiene más elementos? (Escribe una sentencia válida).

    ```java
    it.hasNext();
    ```

6. Utilizando el iterador anterior ¿cómo podemos obtener el siguiente elemento? Declara la variable y obtén el valor. (Escribe una o varias instrucciones válidas).

    ```java
    Coche c1;
    Iterator<Coche> it = mis_coches.iterator();
    if(it.hasNext()){
        c1 = it.next();
    }
    ```
