import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    int x = inp.nextInt();
   	//write your code below
   	int a = 0, b = 1, c = 1;
   	for(int i = 1; i<x; i++){
   	  if(i==1){
   	    System.out.print(a+" ");
   	  }else if(i==2){
   	    System.out.print(b+" ");
   	    System.out.print(b+" ");
   	  }else{
   	    a=b;b=c;c=a+b;
   	    System.out.print(c+" ");
   	  }
   	  
   	}
   	
  }
}