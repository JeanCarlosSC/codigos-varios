import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    int end = inp.nextInt();
    //write your code below
    if(end > 0){
      end*=2;
      for(int i=0; i<end; i++){
        System.out.print(i +" ");
      }
    }
    
  }
}