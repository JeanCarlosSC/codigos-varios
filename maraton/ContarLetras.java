import java.util.Scanner;

public class ContarLetras {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        
        String input = in.nextLine().trim().replaceAll(" ", "");
        
        do{
            System.out.print(input.length() + " ");
            
            int contador = 0;
            String letra = "";
            
            for(int i=0; i<input.length(); i++){
                int temp = 1;
                char cTemp = input.charAt(i);
                
                for(int j=0; j<input.length(); j++){
                    if(j!=i && cTemp == input.charAt(j)){
                        temp++;
                    }
                }
                if(temp > contador){
                    contador = temp;
                }
            }
            
            System.out.println(contador);
                
            input = in.nextLine().trim().replaceAll(" ", "");
        }while(!input.equals("none"));
        
    }
    
}