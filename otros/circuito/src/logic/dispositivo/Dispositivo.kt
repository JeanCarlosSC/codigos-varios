package logic.dispositivo

import logic.Componente

abstract class Dispositivo: Componente{
    protected var estado = true

    fun establecerEstado(estado: Boolean) {
        this.estado = estado
    }

    open fun imprimirEstado() {
        println("El estado del componente es ${if(estado) "Encendido" else "apagado"}")
    }
}