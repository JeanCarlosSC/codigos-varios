import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String word = inp.nextLine();
    //write your code below
    for(int i=1; i <= word.length(); i+=2){
      System.out.print(word.substring(i-1,i));
    }
    
  }
}