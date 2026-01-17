package org.iesra

fun main() {
    /* EJERCICIO 1 */
    val rectangulo1 = Rectangulo(15.0,25.0)
    val rectangulo2 = Rectangulo(45.0,35.0)
    val rectangulo3 = Rectangulo(30.0,20.0)
    val listaRectangulos : List<Rectangulo> = listOf(rectangulo1,rectangulo2,rectangulo3)
    for(rectangulo in listaRectangulos) {
        println(rectangulo)
    }

    /* EJERCICIO 2 */
    val persona1 = Persona(55.0,1.6)
    val persona2 = Persona(90.0,1.82,"Juan")
    val persona3 = Persona(78.5,1.75,"Pedro")
    val listaPersonas : List<Persona> = listOf(persona1,persona2,persona3)
    for(persona in listaPersonas) {
        println(persona)
    }

    println("Ahora introduzca el nombre para la primera persona:")
    var nuevoNombre : String
    do{
        nuevoNombre = readln().trim()
        if (nuevoNombre.isEmpty()) {
            println("El nombre no puede estar vacío. Inténtelo de nuevo:")
        }
    } while (nuevoNombre.isEmpty())
    println("Nombre:${persona1.nombre} Peso:${persona1.peso} Altura:${persona1.altura}")

    println("Datos de la persona 3:")
    println(persona3)
    println("Modificando la altura a 1.80m....")
    persona3.altura = 1.80
    println(persona3)

    println("Datos de la persona 2:")
    persona2.altura = persona3.altura
    println(persona2)
    println(persona3)
    val sonIguales : Boolean = persona2 == persona3
    println("Las personas 2 y 3 son la misma: ${if(sonIguales) "Sí" else "No"} ")
}