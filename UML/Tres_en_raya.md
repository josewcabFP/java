# Tres en raya

Tres en raya es un juego muy sencillo e intuitivo, en el que cada jugador solo debe colocar su símbolo una vez por turno y no debe ser sobre una casilla ya jugada. Se debe conseguir realizar una línea recta o diagonal por símbolo.

## Implementación

La implementación en **Java** de este juego intenta asemejarse lo mas posible a la versión original, ademas de tener ciertas características extra como pueden ser el nombre de los jugadores, etc.

Cada jugador podra saber cual es su turno mediante un aviso, ademas de poder visualizar el tablero en todo momento, dicho tablero se actualizará despues de cada jugada.

El juego terminará si alguno de los jugadores ha conseguido hacer un tres en raya o si el tablero esta lleno y no se pueden realizar mas jugadas.

## Clases implementadas
---
### <b>Clase Posicion</b>

Esta clase define una posición en el tablero, consta de unas coordenadas y un valor.

### <b>Clase Tablero</b>

Esta clase define el tablero de juego y esta constituido por un _array bidimensional_ de elementos de tipo **posicion**.

### <b>Clase Juego</b>

Esta clase representa al juego en si mismo,
contiene un objeto de la clase **tablero** y almacena los nombres de los jugadores y el score de cada uno (funcionalidad no implementada). 

Ademas cuenta con todas las funcionalidaes necesarias para realizar jugadas y comprobar el estado del tablero por si el juego ha finalizado.

### <b>Clase PanelJuego</b>

Esta clase representa la **interfaz** del juego, esta clase recibe la entrada de datos y posee métodos para la solicutud de los mismos. Ademas gestiona la jugadas utilizando los datos introducidos.

Tambien tiene los métodos para representación del tablero en pantalla.

### <b>Clase Main</b>

Esta clase fue creada para lanzar la aplicación desde ella. Crea un objeto PanelJuego y lanza el método para iniciar el juego.

 >Nota para mas información acerca de los métodos implementados consulta el Javadoc.