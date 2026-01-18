package org.iesra

class Persona(var peso : Double,var altura : Double){
    constructor(peso : Double, altura : Double, nombre: String) :this(peso,altura){
        this.nombre = nombre
    }
    var nombre : String = ""
    val imc : Double
        get() = this.peso / (this.altura * this.altura)

    fun saludar() : String{
        return "Hola, me llamo ${this.nombre}."
    }

    fun alturaEncimaMedia() : Boolean{
        return if(this.altura >= 1.75){
            true
        }
        else false
    }
    fun pesoEncimaMedia() : Boolean{
        return if(this.peso >= 70){
            true
        }
        else false
    }
    private fun obtenerDescImc(): String {
        val valor = imc
        return when {
            valor < 18.5 -> "peso insuficiente"
            valor < 25.0 -> "peso saludable"
            valor < 30.0 -> "sobrepeso"
            else -> "obesidad"
        }
    }
    fun obtenerDesc(): String {
        return "La persona $nombre tiene un IMC de $imc, que corresponde a ${obtenerDescImc()}."
    }

    override fun toString(): String {
        return "Persona con peso ${this.peso} kg, altura ${this.altura}m e IMC de ${String.format("%.2f", this.imc)}"
    }
}