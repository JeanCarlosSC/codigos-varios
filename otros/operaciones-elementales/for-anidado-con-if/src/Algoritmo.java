public class Algoritmo {
    public static int calcular(int n, int[] a) {
        int t;
        int c = 0;
/* PROCEDIMIENTO: Observar y determinar comportamiento para un n particular (n=100) y generalizar
        i        | j        | intervalo    | se  repite
        -----------------------------------------------
        0         1          [1, 100)        99 veces
        1         2          [2, 100)        98 veces
        2         3          [3, 100)        97 veces
        n - 3     n - 2      [n - 1, n)      2  veces
        n - 2     n - 1      [n - 1, n)      1  vez
        n - 1     n          [n, n)          0  veces

        fórmula: (n - 1) - (i + 1) + 1

        fórmula simplificada: n - 1 - i
            prueba de la fórmula:
            i = 0    :      n - 1 - (0)     = 99
            i = n - 2:      n - 1 - (n - 2) = 1
            i = n - 1:      n - 1 - (n - 1) = 0
*/
/*      sumatoria desde i = 0 hasta n - 2 de n - 1 - i
            = n(n - 1) - (n - 1) - (n - 1)(n - 2)/2
            = n^2 - 2n + 1 - (n - 1)(n - 2)/2
            = (n^2 - n) / 2


         resultado final: ((n^2 - n) / 2)*10 + 4*(n-1) + 2
            = ((n^2 - n) / 2)*10 + 4*n - 2

         evaluado en n=100: ((10000 - 100) / 2)*10 + 400 - 2 = 49898
*/
/*      f = (n^2 - n) / 2
            CASO 1 ->  10*f + 4*n - 2
            CASO 2 ->  5*f + 4*n - 2
            CASO 3 -> (caso1 - caso2) / 2

        RESULTADO GENERALIZADO: (5x + 5)*f + 4*n - 2

        x = when(CASO){
            1 -> 1
            2 -> 0
        }
 */
        for(int i=0; i < n-1; i++) { // (5x + 5)*f + 4*n - 2
            c+=2;
            for(int j = i + 1; j < n; j++) { // (5x + 5)*f + 2
                c+=2;
                if(a[i] > a[j]) {// 5x
                    t    = a[i]; //2
                    a[i] = a[j]; //3
                    a[j] = t;    //2
                    c+=5;
                }
                c+=3;
            }
            c+=2;
        }
        c+=2;

        return c;
    }
}
