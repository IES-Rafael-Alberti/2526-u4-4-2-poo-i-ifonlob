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

    /* EJERCICIO 3 +*/
    val personaA = Persona(60.0, 1.70, "Ana")
    val personaB = Persona(80.0, 1.80, "Luis")
    val personaC = Persona(50.0, 1.60, "María")
    val personaD = Persona(95.0, 1.75, "Juan")
    val personaE = Persona(72.0, 1.68, "Lucía")

    val personas : List<Persona> = listOf(personaA,personaB,personaC,personaD,personaE)

    for (persona in personas) {
        println(persona.saludar())
        println(persona.obtenerDesc())
        println()
    }

    /* EJERCICIO 4 */

    try {
        val coche1 = Coche("", "Ibiza", 90, 5, "1234ABC")
    } catch (e: IllegalArgumentException) {
        println("Error. La marca no puede estar vacía.")
    }

    try {
        val coche2 = Coche("Seat", "Ibiza", 60, 5, "1234ABC")
    } catch (e: IllegalArgumentException) {
        println("Error. Los caballos tienen que estar comprendidos entre 70 y 700.")
    }

    try {
        val coche3 = Coche("Seat", "Ibiza", 90, 2, "1234ABC")
    } catch (e: IllegalArgumentException) {
        println("Error. El número de puertas tiene que estar comprendido entre 3 y 5.")
    }

    try {
        val coche4 = Coche("Seat", "Ibiza", 90, 5, "123ABC")
    } catch (e: IllegalArgumentException) {
        println("Error. La matrícula tiene que tener 7 caracteres.")
    }
    try{
        val coche5 = Coche("Seat", "Málaga", 90, 5, "4577MKG")
        coche5.color = ""
    }
    catch (e : IllegalArgumentException) {
        println("Error. El color no puede ser nulo.")
    }

    /* EJERCICIO 5 */
    var horaStr : String = ""
    var tiempo1 : Tiempo = Tiempo(0,0,0,)
    do {
        println("Introduzca una hora:")
        horaStr = readln().trim()
        if(horaStr.isBlank()) {
            println("La hora no puede estar vacía. Intente de nuevo:")
        }
    } while (horaStr.isBlank())
    val hora : Int = horaStr.toInt()
    println("Introduzca los minutos:")
    val minutos = readln().trim()
    println("Introduzca los segundos:")
    val segundos = readln().trim()
    if(minutos.isBlank() && segundos.isBlank()) {
        val tiempo1 = Tiempo(hora)
        println(tiempo1)
    }
    else if(segundos.isBlank()) {
        tiempo1 = Tiempo(hora,minutos.toInt())
        println(tiempo1)
    }
    else{
        tiempo1 = Tiempo(hora,minutos.toInt(),segundos.toInt())
        println(tiempo1)
    }

    println("Introduzca ahora otra hora:")
    val h = readln().trim().toInt()
    println("Introduzca ahora otros minutos:")
    val m = readln().trim().toInt()
    println("Introduzca ahora otros segundos:")
    val s = readln().trim().toInt()

    val t = Tiempo(h,m,s)

    if (tiempo1.incrementar(t)) {
        println("Tiempo incrementado: $tiempo1")
    }
    else {
        println("Error: al incrementar se superan las 23:59:59")
    }
    if (tiempo1.decrementar(t)) {
        println("Tiempo decrementado: $tiempo1")
    }
    else {
        println("Error: al decrementar se superan las 00:00:00")
    }
    if(tiempo1.comparar(t) == -1){
        println("El primer tiempo es menor que el segundo.")
    }
    else if(tiempo1.comparar(t) == 1){
        println("El primer tiempo es mayor que el segundo.")
    }
    else{
        println("Los dos tiempos son iguales.")
    }


}