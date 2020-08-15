class Main {
	
	static int countString(String str, String toFind){
		String resultado = "";
		int contador=0;
		
		for(int i=0; i<str.length()-toFind.length()+1; i++){
		  if(str.substring(i, i+toFind.length()).equals(toFind)){
		    resultado+=toFind;
		    i+=toFind.length()-1;
		    contador+=1;
		  }else{
		    resultado+=str.charAt(i);
		  }
		}
		
		return contador;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(countString("crazy crayfish crushing craniums", "cra")); //3
		System.out.println(countString("sometimes solutions dont come on time", "me")); //4
	}
}