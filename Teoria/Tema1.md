## Compilar java por consola

Para compilar un archivo con extensión _.java. necesitamos utilizar el siguiente comando:

```bash
javac miarchivo.java
```
Con este comando generaremos un archivo compilado _.class_ que podremos ejecutar en java sin necesidad de tener que especificar la extensión _.java_.

```bash
java miarchivo
```




## JavaDoc

Para generar un java doc se utiliza el siguiente comando:

``` bash
javadoc miarchivo.java
```

Hay que recordar que debemos usar comentarios con la sintanxis:

```java
/**
 * Mis datos 
 * /
 ```
 El archivo generado sera un **html**.
> Cuando hacemos el comando javadoc, este genera una catidad grande de archivos por lo que sería buena idea meter el archivo a una carpeta antes. 