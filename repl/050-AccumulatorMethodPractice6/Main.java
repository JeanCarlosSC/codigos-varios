class Main {
	
	static String keepVowels(String s){
		String word="";
	  String vowels="aeiou";
		for(int i=0; i<s.length(); i++){
		  for(int j=0; j<vowels.length(); j++){
		    if(vowels.substring(j, j+1).equals(s.substring(i, i+1).toLowerCase())){
		      word+=vowels.substring(j, j+1);
		    }
		  }
		}
		return word;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(keepVowels("hello")); //eo
		System.out.println(keepVowels("how do i internets")); //ooiiee
	}
}