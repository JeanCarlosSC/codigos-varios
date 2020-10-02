public class Algoritmo {
    public static int calcular(int n, int[] a) {
        int t;
        int c = 0;

        for(int i=0; i < n-1; i++) { // (5x + 5*CASO1) + 4*(n-1) + 2
            c+=2;
            for(int j = i + 1; j < n; j++) { // 5x + 5*CASO1 + 2, para n - 1 repeticiones
                c+=2;
                if(a[i] > a[j]) {// 5x, donde x depende del caso
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

    /*
    - - - - - - - - - - - - Valor de x - - - - - - - - - - - - - -
    CASO 1: (n *(n - 1) / 2)
    CASO 2: 0
    CASO 3: sólo se puede estimar con Random.nextInt(cCASO2, cCASO1)
     */
}
