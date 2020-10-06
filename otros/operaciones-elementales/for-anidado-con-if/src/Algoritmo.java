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

         resultado final: ((n^2 - n) / 2)*12 + 6*(n-1) + 3
            = (n^2 - n)*6 + 6*n - 3
            = 6n^2 -6n + 6n - 3
            = 6n^2 - 3

         evaluado en n=100: 60000 - 3 = 59997
*/
/*      f = (n^2 - n) / 2
            CASO 1 ->  10*f + 4*n - 2
            CASO 2 ->  5*f + 4*n - 2
            CASO 3 -> (caso1 - caso2) / 2

        RESULTADO GENERALIZADO: (7x + 5)*f + 6*n - 3

        x = when(CASO){
            1 -> 1
            2 -> 0
        }
 */
        c++;
        for(int i=0; i < n-1; i++) { // (7x + 5)*f + 6*n - 3
            c+=5;
            for(int j = i + 1; j < n; j++) { // (7x + 5)*f + 3 //x es 1 en el caso 1, en el peor es 0
                c+=5;
                if(a[i] > a[j]) {// 7x
                    t    = a[i]; //2
                    a[i] = a[j]; //3
                    a[j] = t;    //2
                    c+=7;
                }
            }
            c++;
        }
        c+=2;

        return c;
    }
}
