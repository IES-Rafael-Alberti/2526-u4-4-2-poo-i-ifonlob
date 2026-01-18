# Práctica 4.2: Programación orientada a objetos I

# Título de la Actividad

## Identificación de la Actividad

- **Módulo:** PROG
- **Unidad de Trabajo:** U4 - POO I
- **Fecha de Creación:** 17/01/2026
- **Fecha de Entrega:** 18/01/2026
- **Alumno(s):**
  - **Nombre y Apellidos:** Irene Foncubierta Lobatón
  - **Correo electrónico:** ifonlob1108@g.educaand.es
  - **Iniciales del Alumno/Grupo:** IFL

## Descripción de la Actividad

En esta actividad se desarrollan varias clases sencillas en Kotlin para practicar los fundamentos de la programación orientada a objetos como la definición de clases, constructores primarios y secundarios, encapsulación, validación con `require`, propiedades calculadas y métodos de instancia.

Los ejercicios consisten en implementar las clases `Rectangulo`, `Persona`, `Coche` y `Tiempo` con sus atributos y comportamientos específicos (cálculo de área y perímetro, IMC, validaciones de coche, operaciones con tiempo, etc.), y en un `main.kt` que crea objetos de estas clases, solicita datos por consola y prueba sus métodos.

## Instrucciones de Compilación y Ejecución

1. **Requisitos Previos:**
    - Lenguaje: Kotlin (versión 1.9.x o compatible)
    - JDK 17 o superior instalado
    - Opcional: IntelliJ IDEA / Kotlin plugin para facilitar la ejecución
2. **Pasos para Compilar el Código (desde terminal, proyecto simple):**

```bash
kotlinc -include-runtime -d practica4_2.jar src/main/kotlin/org/iesra/*.kt
```

3. **Pasos para Ejecutar el Código:**

```bash
java -jar practica4_2.jar
```

Si usas IntelliJ, basta con ejecutar la función `main()` de `Main.kt` desde el IDE.
4. **Ejecución de Pruebas:**
    - Las comprobaciones se han realizado de forma manual ejecutando el programa y probando los distintos casos de entrada (valores válidos e inválidos).

## Desarrollo de la Actividad

### Descripción del Desarrollo

El desarrollo se ha dividido en cinco ejercicios, cada uno centrado en una clase distinta y en un conjunto de requisitos:

- **Ejercicio 1 – Rectangulo:** Clase con `base` y `altura` en el constructor, validación para que sean mayores que 0, métodos `area()` y `perimetro()`, y un `toString()` que muestra todos estos datos.
- **Ejercicios 2 y 3 – Persona:** Clase `Persona` con constructores primarios (peso y altura) y secundario (peso, altura y nombre), propiedad calculada `imc`, métodos `saludar`, `alturaEncimaMedia`, `pesoEncimaMedia`, `obtenerDescImc` y `obtenerDesc`, además del uso de `equals` para comparar personas.
- **Ejercicio 4 – Coche:** Clase `Coche` con validaciones en el `init` y en el setter de `color`, uso de propiedades no modificables (`val`) para marca, modelo, caballos, puertas y matrícula, y formato capitalizado para marca y modelo.
- **Ejercicio 5 – Tiempo:** Clase `Tiempo` que representa horas del día entre 00:00:00 y 23:59:59 con varios constructores, normalización de minutos y segundos, y métodos para incrementar, decrementar, comparar, copiar, sumar y restar tiempos, además de comprobaciones de límites.

### Código Fuente

- `src/main/kotlin/org/iesra/Main.kt` – [Programa principal con la ejecución de los 5 ejercicios](https://github.com/IES-Rafael-Alberti/2526-u4-4-2-poo-i-ifonlob/blob/ad09b715b9a20e9eedd5201102d3010c13a0449a/src/main/kotlin/org/iesra/Main.kt)
- `src/main/kotlin/org/iesra/Rectangulo.kt` – [Implementación de la clase `Rectangulo`](https://github.com/IES-Rafael-Alberti/2526-u4-4-2-poo-i-ifonlob/blob/ad09b715b9a20e9eedd5201102d3010c13a0449a/src/main/kotlin/org/iesra/Rectangulo.kt)
- `src/main/kotlin/org/iesra/Persona.kt` – [Implementación de la clase `Persona`](https://github.com/IES-Rafael-Alberti/2526-u4-4-2-poo-i-ifonlob/blob/ad09b715b9a20e9eedd5201102d3010c13a0449a/src/main/kotlin/org/iesra/Persona.kt)
- `src/main/kotlin/org/iesra/Coche.kt` – [Implementación de la clase `Coche`](https://github.com/IES-Rafael-Alberti/2526-u4-4-2-poo-i-ifonlob/blob/ad09b715b9a20e9eedd5201102d3010c13a0449a/src/main/kotlin/org/iesra/Coche.kt)
- `src/main/kotlin/org/iesra/Tiempo.kt` – [Implementación de la clase `Tiempo`](https://github.com/IES-Rafael-Alberti/2526-u4-4-2-poo-i-ifonlob/blob/ad09b715b9a20e9eedd5201102d3010c13a0449a/src/main/kotlin/org/iesra/Tiempo.kt)


### Ejemplos de Ejecución

- **Ejercicio 1 – Rectángulo:**
    - Entrada:
        - Se crean tres rectángulos con las dimensiones:
            - `Rectangulo(15.0, 25.0)`
            - `Rectangulo(45.0, 35.0)`
            - `Rectangulo(30.0, 20.0)`
    - Salida esperada (resumen):
        - Se muestran por pantalla los tres rectángulos con su base, altura, área y perímetro, por ejemplo:  
          `Rectángulo con base 15.0 y altura 25.0 tiene de área 375.0 y de perímetro 80.0`.

- **Ejercicio 2 – Persona (cambio de nombre):**
    - Entrada:
        - Nombre para la persona 1: `Ana`
    - Salida esperada (resumen):
        - Se muestra `persona1` con el nuevo nombre, su peso y altura.
        - Se muestran los datos de `persona3` antes y después de cambiar la altura a 1.80 m y su IMC actualizado.
        - Se iguala la altura de `persona2` a la de `persona3` y se comprueba si son iguales con `equals`.

- **Ejercicio 4 – Coche (validaciones):**
    - Entrada:
        - Intento de crear coches con marca vacía, caballos fuera de rango, puertas fuera de rango, matrícula de longitud incorrecta y color inválido.
    - Salida esperada:
        - Mensajes de error indicando por qué no se pueden crear/modificar esos objetos (por ejemplo, “La marca no puede estar vacía.”, “La matrícula tiene que tener 7 caracteres.”, etc.).

- **Ejercicio 5 – Tiempo:**
    - Entrada:
        - Hora inicial: `10`
        - Minutos: `30`
        - Segundos: `15`
        - Segundo tiempo: `1` hora, `40` minutos, `50` segundos
    - Salida esperada (resumen):
        - Se muestra el primer tiempo creado en formato `XXh XXm XXs`.
        - Resultado de incrementar y decrementar con el segundo tiempo, o mensajes de error si se superan los límites.
        - Comparación entre ambos tiempos, copia, suma y resta con los mensajes correspondientes.

### Resultados de Pruebas

La funcionalidad se ha verificado manualmente probando:

- Creación de objetos con valores válidos y visualización mediante `toString()`.
- Introducción de valores inválidos para `Coche` (marca vacía, caballos fuera de rango, puertas incorrectas, matrícula incorrecta y color vacío) comprobando que se lanzan `IllegalArgumentException` y se muestran los mensajes.
- Cambios de peso y altura en `Persona` para comprobar que la propiedad calculada `imc` se actualiza correctamente.
- Diferentes valores de tiempo para comprobar el comportamiento de `incrementar`, `decrementar`, `sumar` y `restar` dentro y fuera de los límites 00:00:00 y 23:59:59.

## Conclusiones

La práctica me ha permitido afianzar los conceptos básicos de POO en Kotlin, entre ellos el uso de constructores primarios y secundarios, encapsulación, validaciones con `require`, propiedades calculadas y diseño de métodos específicos para cada clase.

