public class Matriz {
    public static int[][] calcularProducto(int[][] matrizA, int[][] matrizB) {

        int filas = matrizA.length;
        int columnas = matrizB[0].length;
        int[][] result = new int[filas][columnas];

        //------------------------------------------------------------
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                for (int n = 0; n < matrizB.length; n++) {
                    result[i][j] += matrizA[i][n] * matrizB[n][j];
                }
            }
        }
        return result;
        //------------------------------------------------------------
    }

    public static int calcularOperacionesElementalesDelProducto(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasB = matrizB[0].length;
        int columnasA = matrizB.length; //por propiedad del producto matricial
        int[][] result = new int[filasA][columnasB];
        int contador = 0;

        //------------------------------------------------------------
        for (int i = 0; i < filasA; i++) {//(11columnasAcolumnasB + 4columnasB + 2)filasA + 2filasA + 2
            contador += 2;
            for (int j = 0; j < columnasB; j++) {//(11columnasA + 2)columnasB + 2 columnasB + 2
                contador += 2;
                for (int n = 0; n < columnasA; n++) {//9columnasA + 2columnasA + 2
                    contador += 2;
                    result[i][j] += matrizA[i][n] * matrizB[n][j];//9
                    contador += 9;
                }
                contador += 2;
            }
            contador += 2;
        }
        contador += 2;
        //------------------------------------------------------------

        return contador;
    }
}
