class Main {
  public static void main(String[] args) {
    String asterisco="*";
    String numeral="#";
    
    for(int i=1;i<4;i++){
      System.out.println(asterisco);
      asterisco+="*";
    }
    for(int i=2;i>0;i--){
      if(i>1){
        System.out.print(numeral);
      }
      if(i>0){
        System.out.println(numeral);
      }
    }
  }
}