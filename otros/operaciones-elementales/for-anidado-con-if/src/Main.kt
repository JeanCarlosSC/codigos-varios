import kotlin.random.Random

fun main() {
    val n = 100
    var a: IntArray

    //caso 1, descendente 100, 99, ..., 2, 1 siempre ejecuta las instrucciones del if
    a = IntArray(n) {100 - it}
    println("---------- Caso 1 ---------- \nPor contador: ${Algoritmo.calcular(n, a)}")
    val caso1 = 10*((n*n - n )/ 2) + 4*n - 2
    println("por fórmula: $caso1")

    //caso 2, ascendente 0, 1, 2, ..., 98, 99 nunca ejecuta las instrucciones del if
    a = IntArray(n) {it}
    println("---------- Caso 2 ---------- \nPor contador: ${Algoritmo.calcular(n, a)}")
    val caso2 = 5*((n*n - n )/ 2) + 4*n - 2
    println("por fórmula: $caso2")

    //caso 3, random 4, 5, 2, 6, 7, 4, 5, 8, 9 las ejecuta la mitad de las veces.
    a = IntArray(n) {Random.nextInt(0, 100)}
    println("---------- Caso 3 ---------- \nPor contador: ${Algoritmo.calcular(n, a)}")
    println("Estimación:  ${(caso2 + caso1) / 2}")

}