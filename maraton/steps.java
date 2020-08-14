import java.util.Scanner;
import java.util.StringTokenizer;

public class steps {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        int times = Integer.parseInt(in.nextLine());
        int contador = 2;
        
        while(times > 0){
            times --;
            
            String input = in.nextLine();
            StringTokenizer st = new StringTokenizer(input);
            
            
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            
            int delta = b-a;
            
            if(delta<4)
                System.out.println(delta);
            else{
                delta -= 2;
                int step=1;
                while(delta>0){
                    if(delta <= step){
                        delta-=step;
                        contador++;
                        step++;
                    }else{
                        step--;
                    }
                }
                System.out.println(contador);
            }
        }
    }
    
}