import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    double max = inp.nextDouble();
    //write your code below
    if(max>0){
      for(int i=1; i<=max; i++){
        if(max % i == 0 && max != i && i != 1 || max == 1){
          System.out.println("not prime");
          break;
        }
        if(max % i == 0 && max == i){
          System.out.println("prime");
        }
      }
    }else{
      System.out.println("not prime");
    }
    
  }
}