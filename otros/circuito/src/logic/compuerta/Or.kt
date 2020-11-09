package logic.compuerta

class Or: Compuerta() {
    override fun obtenerSalida(): Boolean {
        return entrada1!!.obtenerSalida() || entrada2!!.obtenerSalida()
    }
}