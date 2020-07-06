class Main {
	
	static int countVowels(String s){
	  int contador=0;
	  String vowels="aeiou";
		for(int i=0; i<s.length(); i++){
		  for(int j=0; j<vowels.length(); j++){
		    if(vowels.substring(j, j+1).equals(s.substring(i, i+1).toLowerCase())){
		      contador+=1;
		    }
		  }
		}
		return contador;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(countVowels("obama")); //3
		System.out.println(countVowels("happy friday! i love weekends")); //9
	}
}