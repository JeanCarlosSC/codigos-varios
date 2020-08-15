import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    for(int cj=0; cj<100; ++cj){
      int minimo, maximo, resultado;
      
      int a = in.nextInt();
      System.out.print(a + " ");
      
      int b = in.nextInt();
      System.out.print(b + " ");
      
      minimo = a>b?b:a;
      maximo = a>b?a:b;
      
      resultado = 0;
      int n, contador;
      
      for(int i=minimo; i<=maximo; i++){
        n = i;
        contador=1;
        while(n!=1){
          if(n%2==0){
            n/=2;
            contador+=1;
          }else{
            n=3*n+1;
            contador+=1;
          }
        }
        if(contador>resultado)
          resultado=contador;
      }
      System.out.println(resultado);
    }
  }
}