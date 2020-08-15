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
            
            
            int numa=Integer.parseInt(st.nextToken());
            int numb=Integer.parseInt(st.nextToken());
            
            int delta = numb-numa;
            
            if(delta<4)
                System.out.println(delta);
            else{
                int a=3;
                int b=4;
                int n=2;
                int anteriorN = 1;
                int m=1;
                while(delta>0){
                    if(delta>= a && delta <=b){
                        System.out.println(b-m);
                        break;
                    }else{
                    	m += anteriorN;
                    	if(anteriorN == n)
                    		n+=1;
                    	else
                    		anteriorN = n;
                    	a += anteriorN;
                    	b += n;
                    }
                }
            }
        }
    }
    
}