package logic.dispositivo

class Bateria: Dispositivo() {
    override fun obtenerSalida(): Boolean{
        return estado
    }
}