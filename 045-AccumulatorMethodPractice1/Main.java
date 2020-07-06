class Main {
	
	static int sumToX(int x){
	  int i= (x-x%2+1)*(x-x%2)/2+x*(x%2);
		return i;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(sumToX(5)); //15
		System.out.println(sumToX(7)); //28
	}
}