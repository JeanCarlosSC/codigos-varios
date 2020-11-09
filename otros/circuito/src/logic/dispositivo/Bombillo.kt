package logic.dispositivo

import logic.Componente

class Bombillo: Dispositivo() {
    private var entrada: Componente? = null

    fun establecerEntrada(componente: Componente){
        entrada = componente
    }

    override fun imprimirEstado(){
        estado = entrada!!.obtenerSalida()
        super.imprimirEstado()
    }

    override fun obtenerSalida(): Boolean {
        return false
    }
}