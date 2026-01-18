package org.iesra

class Coche(marca: String, modelo: String, val numeroCaballos: Int, val numeroPuertas: Int, val matricula: String){

    var color : String = ""
        set(value){
            require(value.isNotBlank()){"El color no puede ser nulo o estar vacío."}
            field = value
        }
    val marca : String
    val modelo: String
    init{
        require(marca.isNotBlank()) { "La marca no puede estar vacía." }
        require(modelo.isNotBlank()) { "El modelo no puede estar vacío." }
        require(matricula.length == 7){"La matrícula tiene que tener 7 caracteres."}
        require(numeroCaballos in 70..700){"El número de caballos tiene que estar comprendido entre 70 y 700."}
        require(numeroPuertas in 3..5){"El número de puertas tiene que estar comprendido entre 3 y 5."}
        this.marca = marca[0].uppercase() + marca.substring(1).lowercase()
        this.modelo = modelo[0].uppercase() + modelo.substring(1).lowercase()
    }

    override fun toString(): String {
        return "Coche(marca=$marca, modelo=$modelo, color=$color, cv=$numeroCaballos, puertas=$numeroPuertas, matricula=$matricula)"
    }
}