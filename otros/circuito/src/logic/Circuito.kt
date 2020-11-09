package logic

import logic.compuerta.Compuerta
import logic.dispositivo.Bateria
import logic.dispositivo.Dispositivo

class Circuito {
    private val componentes= mutableListOf<Componente>()

    fun establecerEstado(posicionComponente: Int, estado: Boolean){
        if(componentes[posicionComponente] is Dispositivo) {
            (componentes[posicionComponente] as Dispositivo).establecerEstado(estado)
        }
    }

    fun agregarComponente(componente: Componente){
        componentes.add(componente)
    }

    fun eliminarComponente(posicionComponente: Int){
        componentes.removeAt(posicionComponente)
    }

    fun mostrarResultado(){
        var resultado = false //el circuito no tiene energia de entrada, se debe dar a traves de una bateria

        if(componentes.size==0)
            println("No hay componentes")
        else{
            for(i in 0 until componentes.size){
                //alimentacion principal
                if(i==0){
                    if(componentes[i] is Bateria)
                        resultado = (componentes[i] as Bateria).obtenerSalida()
                    else{
                        resultado=false
                        break
                    }
                } else {
                    resultado = when(componentes[i]){
                        is Compuerta -> (componentes[i] as Compuerta).obtenerSalida()
                        is Dispositivo -> (componentes[i] as Dispositivo).obtenerSalida()
                        else -> false
                    }
                }
            }
        }
        println("Resultado: ${
                if(resultado) "Un flujo de electricidad proveniente del circuito"
                else "No sale electricidad del circuito"
            }"
        )
    }
}