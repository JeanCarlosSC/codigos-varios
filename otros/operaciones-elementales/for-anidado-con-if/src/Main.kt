import kotlin.random.Random

fun main() {
    val n = 100
    var a: IntArray
    val formulaCaso1: Int
    val formulaCaso2: Int

    //caso 1, descendente 100, 99, ..., 2, 1 siempre ejecuta las instrucciones del if
    a = IntArray(n) {n - it}
    formulaCaso1 = 12*((n*n - n )/ 2) + 6*n - 3
    println("---------- Caso 1 ---------- \nPor contador: ${Algoritmo.calcular(n, a)}\nPor fórmula: $formulaCaso1")

    //caso 2, ascendente 0, 1, 2, ..., 98, 99 nunca ejecuta las instrucciones del if
    a = IntArray(n) {it}
    formulaCaso2 = 5*((n*n - n )/ 2) + 6*n - 3
    println("---------- Caso 2 ---------- \nPor contador: ${Algoritmo.calcular(n, a)}\nPor fórmula: $formulaCaso2")

    //caso 3, random 4, 5, 2, 6, 7, 4, 5, 8, 9 las ejecuta la mitad de las veces.
    a = IntArray(n) {Random.nextInt(0, n)}
    println("---------- Caso 3 ---------- \nPor contador: ${Algoritmo.calcular(n, a)}\nEstimación:  ${(formulaCaso2 + formulaCaso1) / 2}")

}