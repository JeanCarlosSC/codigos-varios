package logic.compuerta

class Xor: Compuerta() {
    override fun obtenerSalida(): Boolean {
        return entrada1!!.obtenerSalida() xor entrada2!!.obtenerSalida()
    }
}