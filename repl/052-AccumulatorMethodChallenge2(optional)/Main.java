class Main {
	
	static String alphabetical(String str){
		char a='.', b;
		String resultado ="";
		
		for(int i=0; i<str.length(); i++){
		  b=str.charAt(i);
		  if(a=='.' || a < b){
		    resultado+=b;
		    a=b;
		  }
		}
		
		return resultado;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(alphabetical("adatplqzh")); //"adtz"
	}
}