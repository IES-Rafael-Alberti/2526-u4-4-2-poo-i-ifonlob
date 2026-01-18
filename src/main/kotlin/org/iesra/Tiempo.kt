package org.iesra

class Tiempo (var hora : Int, var minuto : Int , var segundo : Int){
    constructor(hora : Int) : this(hora,0,0)
    constructor(hora : Int, minuto : Int) : this(hora,minuto,0)

    init{
        if(segundo >= 60){
            minuto += segundo / 60
            segundo %=  60
        }
        if(minuto >= 60){
            hora += minuto / 60
            minuto %=  60
        }
        require(hora in 0..23){"La hora tiene que estar comprendida entre 0 y 23 "}
    }
    fun incrementar(t : Tiempo) : Boolean{
        var horaNueva = this.hora + t.hora
        var minutosNuevo = this.minuto + t.minuto
        var segundosNuevos = this.segundo + t.segundo

        if(segundosNuevos >= 60){
            minutosNuevo += segundosNuevos / 60
            segundosNuevos %=  60
        }
        if(minutosNuevo >= 60){
            horaNueva += minutosNuevo / 60
            minutosNuevo %=  60
        }
        if (horaNueva > 23) {
            return false
        }
        this.hora = horaNueva
        this.minuto = minutosNuevo
        this.segundo = segundosNuevos
        return true
    }

    fun decrementar(t : Tiempo) : Boolean{
        var horaNueva = this.hora - t.hora
        var minutosNuevo = this.minuto - t.minuto
        var segundosNuevos = this.segundo - t.segundo

        if(segundosNuevos < 0){
            segundosNuevos += 60
            minutosNuevo -= 1
        }
        if(minutosNuevo < 0){
            minutosNuevo += 60
            horaNueva -= 1
        }
        if (horaNueva < 0) {
            return false
        }
        this.hora = horaNueva
        this.minuto = minutosNuevo
        this.segundo = segundosNuevos
        return true
    }

    fun comparar(t : Tiempo) : Int{
        val thisSegundos = this.hora * 3600 + this.minuto * 60 + this.segundo
        val tSegundos = t.hora * 3600 + t.minuto * 60 + t.segundo
        return when{
            thisSegundos < tSegundos -> -1
            thisSegundos > tSegundos -> 1
            else -> 0
        }
    }

    fun copiar() : Tiempo{
        val tiempoCopia = Tiempo(this.hora, this.minuto,this.segundo)
        return tiempoCopia
    }

    fun copiar(t : Tiempo){
        this.hora = t.hora
        this.minuto = t.minuto
        this.segundo = t.segundo
    }

    fun sumar(t : Tiempo) : Tiempo?{
        var nuevaHora = this.hora + t.hora
        var nuevosMinutos = this.minuto + t.minuto
        var nuevosSegundos = this.segundo + t.segundo

        if(nuevosSegundos >= 60){
            nuevosMinutos += nuevosSegundos / 60
            nuevosSegundos %=  60
        }
        if(nuevosMinutos >= 60){
            nuevaHora += nuevosMinutos / 60
            nuevosMinutos %=  60
        }

        return if(nuevaHora > 23){
            null
        }
        else{
            Tiempo(nuevaHora, nuevosMinutos,nuevosSegundos)
        }
    }
    fun restar(t : Tiempo) : Tiempo?{
        val nuevaHora = this.hora - t.hora
        var nuevosMinutos = this.minuto - t.minuto
        var nuevosSegundos = this.segundo - t.segundo

        if(nuevosSegundos < 0){
            nuevosSegundos += 60
            nuevosMinutos -= 1
        }
        if(nuevosMinutos < 0){
            nuevosMinutos += 60
            nuevosSegundos -= 1
        }

        return if(nuevaHora > 23){
            null
        }
        else{
            Tiempo(nuevaHora, nuevosMinutos,nuevosSegundos)
        }
    }



    fun esMayorQue(t : Tiempo) : Boolean{
        val thisSegundos = this.hora * 3600 + this.minuto * 60 + this.segundo
        val tSegundos = t.hora * 3600 + t.minuto * 60 + t.segundo
        return thisSegundos > tSegundos
    }
    fun esMenorQue(t : Tiempo) : Boolean{
        val thisSegundos = this.hora * 3600 + this.minuto * 60 + this.segundo
        val tSegundos = t.hora * 3600 + t.minuto * 60 + t.segundo
        return thisSegundos < tSegundos
    }

    override fun toString(): String {
        return "%02dh %02dm %02ds".format(hora, minuto, segundo)
    }
}