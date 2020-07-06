import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String word = inp.nextLine();
    //write your code below
    String vocales="aeiou";
    for(int i=1; i<=word.length(); i++){
      if(vocales.contains(word.substring(i-1,i))){
        System.out.print(word.substring(i-1,i));
      }
    }
    
  }
}