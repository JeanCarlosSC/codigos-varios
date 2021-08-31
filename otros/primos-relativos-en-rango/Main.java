public class Main {
    public static void main(String[] args) {
        int c=0;
        for(int i=1; i<8400; i++) {
            if(mcd(i, 4200) == 1)
                c++;
        }

        System.out.println(c);
        System.out.println(mcd(16, 15));
    }

    public static int mcd(int x, int y) {
        int temporal;//Para no perder b
        while (y != 0) {
            temporal = y;
            y = x % y;
            x = temporal;
        }
        return x;
    }
}