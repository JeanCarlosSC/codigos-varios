class Main {
	
	static int sumEvenToX(int x){
		int i=0;
		for(int j=0; j<=x; j+=2){
		  i+=j;
		}
		return i;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(sumEvenToX(5)); //6
		System.out.println(sumEvenToX(8)); //20
	}
}