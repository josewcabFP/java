# UT9 Ej1: Cuestiones ArrayList


**Nombre: Jose Cabrera Rojas**<br>
**Ciclo: 1º DAW**<br><br>

### 1. ¿Cuántos elementos podemos agregar en un array de enteros?

Eso dependera del tamaño inicial que hayamos dado al array.

### 2. ¿Podemos crear un array de enteros de un tamaño y después redimensionar el array para hacer que admita más elementos?¿por qué?

No, ya que los arrays no son dinámicos y para realizar esta acción tenemos que crear un array mas grande y pasar los elementos uno a uno.

### 3. ¿Cómo sabemos el tamaño de un array, que lo hemos declarado como int notas[] = new int[5]? (escribe una instrucción válida)

```Java
notas.lenght;
```

### 4. ¿Cuántos elementos podemos agregar a un ArrayList?

Podemos agregar tantos elementos como queramos.

### 5. ¿Cómo declaramos e inicializamos un ArrayList de Coches llamado mis_coches?

```Java
ArrayList<Coches> mis_coches = new ArrayList<Coches>();
```

### 6. ¿Con qué método agregamos un elemento a un ArrayList: mis_coches? (escribe una instrucción válida, sabiendo que es un ArrayList de Coches y que tiene un constructor por defecto)

```Java
ArrayList<Coches> mis_coches = new ArrayList<Coches>();
mis_coches.add(new Coches());
```


### 7. ¿por qué se consumen muchos recursos al crear el elemento 11 de un ArrayList?

Normalmente cuando se crea un ArrayList con el constructor por defecto, se crea con 10 elementos por defecto, por lo que añadir un elemento mas hace que se tenga que redimensionar.

### 8. ¿Cómo podemos saber el tamaño del ArrayList: mis_coches? (escribe una instrucción válida)

```Java
mis_coches.size();
```

### 9. Internamente, ¿Qué tamaño tiene un ArrayList cuando lo creas?

Tienen un tamaño de 10 elementos, a menos que se indique otra cosa.

### 10. ¿Cómo creamos el ArrayList mis_coches para que tenga inicialmente 14 elementos? (escribe las instrucciones que consideres oportuno)

```Java
ArrayList<Coches> mis_coches = new ArrayList<Coches>(14);
```

### 11. ¿cómo se cierra el arraylist, para que el recolector de basura borre el exceso de memoria?

```Java
mis_coches.clear();
```

### 12. ¿Después de cerrar el arrayList y ajustar su tamaño se pueden añadir más elementos a ese array?

Si, ya que este método solo vacia los elementos del array.