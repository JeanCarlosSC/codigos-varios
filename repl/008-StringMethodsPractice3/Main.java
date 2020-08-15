class Main {
  public static void main(String[] args) {
    String str = "abracadabra alakazam";
    String target1 = "dab";
    String target2 = "ABRA";
    
    System.out.printf("%s\n%s\n%s\n%s", str.indexOf("c"), str.indexOf(" "), 
      str.indexOf(target1), str.indexOf(target2));
  }
}