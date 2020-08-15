class Main {
	
	static String surround(String s, char search_term){
		String resultado="";
		
		for(int i=0; i<s.length(); i++){
		  if(search_term==s.charAt(i)){
		    resultado+="("+s.charAt(i)+")";
		  }else{
		    resultado+=s.charAt(i);
		  }
		}
		
		return resultado;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(surround("abcabcabc",'c')); //"ab(c)ab(c)ab(c)"
		System.out.println(surround("technology",'o')); //"techn(o)l(o)gy"
	}
}