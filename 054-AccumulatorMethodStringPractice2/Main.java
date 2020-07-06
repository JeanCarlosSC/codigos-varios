class Main {
	
	static String thirdLetter(String s){
		String resultado="";
		
		for(int i=0; i<s.length(); i+=3){
		  resultado+=s.charAt(i);
		}
		
		return resultado;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(thirdLetter("hello there")); //"hltr"
		System.out.println(thirdLetter("technology")); //"thly"
	}
}