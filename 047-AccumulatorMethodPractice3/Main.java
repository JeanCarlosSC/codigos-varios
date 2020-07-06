class Main {
	
	static int sumFivesRange(int a, int b){
		int incremento=1;
		int entero=0;
		for(int i=a; i<=b; i+=incremento){
		  if(i%5==0){
		    entero+=i;
		    incremento=5;
		  }
		}
		return entero;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(sumFivesRange(5,15)); //30
		System.out.println(sumFivesRange(11,28)); //60
	}
}