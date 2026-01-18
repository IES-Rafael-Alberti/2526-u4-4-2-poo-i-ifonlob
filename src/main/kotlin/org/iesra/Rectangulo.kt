package org.iesra

class Rectangulo(val base : Double, val altura : Double) {
    init{
        if(base <= 0){
            throw IllegalArgumentException("La base no puede ser negativa")
        }
        if (altura <= 0){
            throw IllegalArgumentException("La altura no puede ser negativa")
        }
    }
    fun calcularArea() : Double{
        return this.base * this.altura
    }

    fun calcularPerimetro() : Double{
        return (2 * this.base + 2 * this.altura)
    }

    override fun toString(): String {
        return "Rectángulo con base ${this.base} y altura ${this.altura} tiene de área ${calcularArea()} y de perímetro ${calcularPerimetro()}"
    }
}