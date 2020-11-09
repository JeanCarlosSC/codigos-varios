package logic.compuerta

import logic.Componente

abstract class Compuerta: Componente {
    protected var entrada1: Componente? = null
    protected var entrada2: Componente? = null

    fun establecerEntrada1(componente: Componente){
        entrada1 = componente
    }

    fun establecerEntrada2(componente: Componente){
        entrada2 = componente
    }
}