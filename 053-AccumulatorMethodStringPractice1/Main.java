class Main {
	
	static String spaceOut(String s){
		String resultado="";
		
		for(int i=0; i<s.length(); i++){
		  resultado+=s.charAt(i);
		  resultado+=" ";
		}
		
		return resultado;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(spaceOut("hello")); //"h e l l o "
		System.out.println(spaceOut("technology")); //"t e c h n o l o g y "
	}
}