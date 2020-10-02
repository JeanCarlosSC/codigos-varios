fun main() {
    val matrizA = getMatrizA()
    val matrizB = getMatrizB()
    val matrizFinal = Matriz.calcularProducto( matrizA, matrizB )

    val contador = Matriz.calcularOperacionesElementalesDelProducto( matrizA, matrizB )
    val formula = ((13*matrizB.size + 4)*matrizB[0].size + 4)*matrizA.size + 2

    matrizFinal.print()
    println("Operaciones elementales con fórmula: $formula\nOperaciones elementales por contador: $contador")
}

fun getMatrizA() : Array<IntArray> {
    return arrayOf(
        intArrayOf(1, 2, 5),
        intArrayOf(4, -9, 8),
        intArrayOf(3, 5, 3),
        intArrayOf(7, 1, 2)
    )
}

fun getMatrizB() : Array<IntArray> {
    return arrayOf(
        intArrayOf(5, 4),
        intArrayOf(8, 7),
        intArrayOf(1, 3)
    )
}

fun Array<IntArray>.print(){
    for (i in this.indices) {
        for (j in this[0].indices) {
            print("%3d".format(this[i][j]))
        }
        println()
    }
}