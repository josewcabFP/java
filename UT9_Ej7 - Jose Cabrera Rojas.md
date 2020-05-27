# UT9 Ej7: Preguntas video 164

**Nombre: Jose Cabrera Rojas**<br>
**Ciclo: 1º DAW**<br><br>

## Responder a las preguntas.
1. ¿Qué es la programación genérica?

    Es una forma de especificar un algoritmo que nos sirva como su nombre indica para aplicarse de forma genérica a cualquier estructura de datos.

2. ¿Qué podemos usar para simular la programación genérica?, es decir realizar programación genérica, sin usar la programación genérica que trae java.

    Podriamos declarar el tipo admitido por el algoritmo como **Object**, de esta forma a ser todas las clases desendientes de esta, podríamos emular un comportamiento genérico.

3. Enumera los tres inconvenientes de hacerlo de esta forma.

    - **Uso continuo del casting:** Al ser cualquier clase la que se puede usar, tendríamos que estar transformandola en un tipo de datos manupulable por el algoritmo.

    - **Complicación del códgio:** Llenar el script con castings y transformaciones dificulta la lectura del mismo.

    - **Imposibilidad de comprobación de errores:** Los errores aparecen en tiempo de ejecución y no de compilación. 

4. Enumera las tres ventajas de usar la programación genérica.

    - **Mayor sencillez del código:** Ya no necesitamos los casting.

    - **Reutilización del código:** Ahora el código si es **genérico** por lo que es 100% reutilizable.

    - **Comprobación de errores:** Los errores ahora aparecen el tiempo de compilación.

5. ¿En qué versión de java surge la programación genérica?

    Surge a partir de la version 5.0 .

