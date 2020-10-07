import kotlin.math.pow

fun main(){
    //Recibo e inicializo valores
    print("Ingrese base del número a convertir: ")
    val base1 = readLine()!!.toDouble()

    print("Ingrese base a la que desea convertir el número: ")
    val base2 = readLine()!!.toDouble()

    print("Ingrese el número: ")
    var numero = readLine()!!

    var numeroConvertido = ""
    var peso = 0.0 //es el valor del número en base decimal

    //calculo el valor del peso
    var i= numero.length;
    while(i>0) {
        i--;
        //numbers in 48 .. 57, upper case in 65 .. 89, down case in 97 .. 122
        peso += when(numero[i].toInt()){
            in 48..57 -> (numero[i].toInt() - 48) * (base1).pow(numero.length - 1 - i)
            in 65..89 -> (numero[i].toInt() - 55) * (base1).pow(numero.length - 1 - i)
            else -> (numero[i].toInt() - 87) * (base1).pow(numero.length - 1 - i)
        }
    }

    //calculo el número convertido
    if(base2 == 10.0)
        numeroConvertido = peso.toInt().toString()
    else if(numero == "0")
        numeroConvertido = "0"
    else{
        var posicion = 50.0 // itera desde 50 posiciones a la izquierda
        var agrega = false //no añade los ceros de la izquierda hasta que se añada algún valor distinto de cero
        var valor = 0.0 //el valor del número que se va a añadir en caso de que sea necesario. por ej: valor=15 significa E
        while(posicion >= 0.0){
            if(peso>=base2.pow(posicion)){
                peso -= base2.pow(posicion)
                if(!agrega)
                    agrega = true
                valor ++
            }else{
                posicion--
                if(agrega){
                    numeroConvertido += when(valor.toInt()){
                        in 0..9 -> "${valor.toInt()}"
                        else -> "${(valor.toInt() + 55).toChar()}"
                    }
                    valor = 0.0
                }
            }
        }
    }

    //imprime el resultado
    println("El número $numero de base ${base1.toInt()} a base ${base2.toInt()} es: $numeroConvertido")

}