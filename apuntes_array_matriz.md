# Arrays y matrices en Java

## Índice

- [Arrays](#arrays)
- [Matrices](#matrices)
- [Resumen rápido](#resumen-rápido)
- [Ejercicio propuesto](#ejercicio-propuesto)

---

## Arrays

Un **array** es una "fila de cajitas" numeradas donde se guardan varios valores **del mismo tipo**. En vez de crear varias variables (`nota1`, `nota2`...), se crea una sola con varios huecos.

> Las posiciones empiezan en **0**, no en 1.

### Crear un array

```java
int[] notas = new int[5];   // 5 posiciones, todas valen 0 al principio

notas[0] = 7;   // primera posición
notas[1] = 5;
notas[4] = 9;   // última posición (la 5ª, pero índice 4)
```

También se puede crear con valores directamente:

```java
int[] notas = {7, 5, 8, 6, 9};
```

### Operaciones básicas

```java
System.out.println(notas[2]);       // 8 (accede a la posición 2)
System.out.println(notas.length);   // 5 (tamaño; sin paréntesis)
```

}

### Errores típicos

- **`ArrayIndexOutOfBoundsException`**: acceder a una posición que no existe. Si el array tiene 5 elementos, la última posición es la 4, así que `notas[5]` da error.
- El tamaño **no se puede cambiar** una vez creado. Si necesitas algo que crezca, se usa `ArrayList`.
- En un array de `String`, las posiciones empiezan en `null`, no vacías.

---

## Matrices

Una **matriz** es un array con **filas y columnas** (un array de arrays), como una hoja de Excel. Para acceder a un valor se usan dos índices: `[fila][columna]`.

### Crear una matriz

```java
int[][] tabla = new int[3][4];   // 3 filas, 4 columnas
```

Con valores directos:

```java
int[][] tabla = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

Representación visual:

|        | col 0 | col 1 | col 2 |
|--------|:-----:|:-----:|:-----:|
| fila 0 |   1   |   2   |   3   |
| fila 1 |   4   |   5   |   6   |
| fila 2 |   7   |   8   |   9   |

### Acceder y modificar

```java
System.out.println(tabla[1][2]);   // 6 (fila 1, columna 2)
tabla[0][0] = 10;                  // cambia el 1 por un 10
```

### Recorrer una matriz

Se usan **dos `for` anidados**: el de fuera recorre las filas y el de dentro las columnas.

```java
for (int i = 0; i < tabla.length; i++) {          // filas
    for (int j = 0; j < tabla[i].length; j++) {   // columnas
        System.out.print(tabla[i][j] + " ");
    }
    System.out.println();   // salto de línea al acabar cada fila
}
```

Salida:

```
10 2 3
4 5 6
7 8 9
```

> `tabla.length` = número de filas.
> `tabla[i].length` = número de columnas de la fila `i`.

---

## Resumen rápido

| Qué                | Cómo                      |
|--------------------|---------------------------|
| Crear array        | `int[] a = new int[5];`   |
| Primera posición   | `a[0]`                    |
| Última posición    | `a[a.length - 1]`         |
| Tamaño             | `a.length`                |
| Crear matriz       | `int[][] m = new int[3][4];` |
| Acceder a matriz   | `m[fila][columna]`        |

---
