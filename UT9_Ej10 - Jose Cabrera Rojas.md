# UT9 Ej10: Preguntas video 166

**Nombre: Jose Cabrera Rojas**<br>
**Ciclo: 1º DAW**<br><br>

<style>
.verde{
    color:#3cc279;
}
.rojo{
    color:#ff2828;
}
</style>

## Responder a las preguntas.

---

### ¿Un método genérico tiene que estar definido en una clase genérica Verdadero o Falso?

<p class="verde">Falso.</p>

### Como indicaríamos en el siguiente método que es genérico: 

```java
public static void muestra (T valor){...}
```
> Respuesta:

```java
public static <T> void muestra(T valor){...}
```

### ¿Qué tipo de dato devuelve el método compareTo? 

<p class="verde">Devuelve un número entero que puede ser mayor, menor o igual que cero.</p>

### ¿Qué valor devuelve el método compareTo cuando son iguales el objeto al que se aplica y el que le pasamos como parámetro?

<p class="verde">Devuelve un cero.</p>

### Dado el método getMenor, modifica lo necesario para que ahora sea el método getMayor.

```java
public static <T extends Comparable> T getMenor( T [] a) {
  if (a == null || a.length ==0) {
    return null;
  }
  //usar compareTo
  T elementoMenor = a[0];
  for (int i = 1; i < a.length; i++) {
    if (elementoMenor.compareTo(a[i]) > 0) {
    elementoMenor = a[i];
    }
  }
  return elementoMenor;
}
```
> Respuesta:

```java
public static <T extends Comparable> T getMayor( T [] a) {
  if (a == null || a.length ==0) {
    return null;
  }

  //usar compareTo

  T elementoMayor = a[0];

  for (int i = 1; i < a.length; i++) {
    if (elementoMayor.compareTo(a[i]) < 0) {
    elementoMayor = a[i];
    }
  }

  return elementoMayor;
}
```

### Dado el método getPosicionX, modifica lo necesario para que ahora sea genérico y válido para cualquier tipo de dato que sea subclase de Figura. Sabiendo que una figura puede ser un Circulo, Cuadrado o Triángulo.

```java
public static double getPosicionX( Circulo c) {...}
```

> Respuesta:

```java
public static <T extends Figura> double getPosicionX( T figura ) {...}
```


