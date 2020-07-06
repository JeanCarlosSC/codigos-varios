class Main {
	
	static String censorLetter(String s, char ch){
		String resultado="";
		
		for(int i=0; i<s.length(); i++){
		  if(ch==s.charAt(i)){
		    resultado+="*";
		  }else{
		    resultado+=s.charAt(i);
		  }
		}
		
		return resultado;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(censorLetter("computer science",'e')); //"comput*r sci*nc*"
		System.out.println(censorLetter("trick or treat",'t')); //"*rick or *rea*"
	}
}