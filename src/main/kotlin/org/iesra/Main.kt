package org.iesra

fun main() {
    val rectangulo1 = Rectangulo(15.0,25.0)
    val rectangulo2 = Rectangulo(45.0,35.0)
    val rectangulo3 = Rectangulo(30.0,20.0)
    val listaRectangulos : List<Rectangulo> = listOf(rectangulo1,rectangulo2,rectangulo3)
    for(rectangulo in listaRectangulos) {
        println(rectangulo)
    }

}