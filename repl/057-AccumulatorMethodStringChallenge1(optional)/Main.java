class Main {
	
	static String surroundStr(String s, String search_term){
    String resultado = "";

    for(int i=0; i<s.length(); i++){
      if(i<=s.length()-search_term.length() && s.substring(i, i+search_term.length()).equals(search_term)){
        resultado+="("+search_term+")";
        i+=search_term.length()-1;
      }else{
        resultado+=s.charAt(i);
      }
    }
    
    return resultado;
  }
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(surroundStr("abcabcabc","abc")); //"(abc)(abc)(abc)"
		System.out.println(surroundStr("there, on planeth hoth","th")); //"(th)ere, on plane(th) ho(th)"
	}
}