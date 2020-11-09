package logic.compuerta

class And: Compuerta() {
    override fun obtenerSalida(): Boolean {
        return entrada1!!.obtenerSalida() && entrada2!!.obtenerSalida()
    }
}