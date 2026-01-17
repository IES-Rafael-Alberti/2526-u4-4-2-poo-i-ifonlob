package org.iesra

class Persona(var peso : Double,var altura : Double){
    constructor(peso : Double, altura : Double, nombre: String) :this(peso,altura){
        this.nombre = nombre
    }
    var nombre : String = ""
    val imc = this.peso / (this.altura * this.altura)
    override fun toString(): String {
        return "Persona con peso ${this.peso} kg, altura ${this.altura}m e IMC de ${String.format("%.2f", this.imc)}"
    }
}