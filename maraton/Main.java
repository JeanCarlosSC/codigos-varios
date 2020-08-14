import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Jean Carlos Santoya Cabrera jeancarlosodi@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int times = Integer.parseInt(in.nextLine());
        
        while(times > 0){
            times --;

            String input = in.nextLine();
            StringTokenizer st = new StringTokenizer(input);


            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());

            a = invertir(a);
            b = invertir(b);

            int resultado = invertir(a + b);

            System.out.println(resultado); 
        }
    }
    
    public static int invertir(int a){
        StringBuilder numero = new StringBuilder(String.format("%d", a));
        numero.reverse();
        return Integer.parseInt(numero.toString());
    }
}
