package logic.dispositivo

import logic.Componente

class Switch: Dispositivo() {
    private var entrada: Componente? = null

    fun establecerEntrada(componente: Componente){
        entrada = componente
    }

    override fun obtenerSalida(): Boolean{
        return estado && entrada!!.obtenerSalida()
    }
}