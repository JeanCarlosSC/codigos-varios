import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String s = inp.nextLine();
   	//write your code below
   	s=s.toLowerCase();
   	String uno="", dos="";
   	for(int i = 0; i<s.length(); i++){
   	  if(s.substring(i, i+1).equals(" ")==false){
   	    uno+=s.substring(i, i+1);
   	  }
   	}
   	for(int i = uno.length(); i>0; i--){
   	  dos+=uno.substring(i-1, i);
   	}
   	if(uno.equals(dos)){
   	  System.out.print("true");
   	}else{
   	  System.out.print("false");
   	}
  }
}