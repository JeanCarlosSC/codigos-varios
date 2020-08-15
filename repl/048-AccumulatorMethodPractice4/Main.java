class Main {
	
	static int countA(String s){
		int times=0;
		for(int i=0;i< s.length(); i++){
		  if(s.substring(i, i+1).toLowerCase().equals("a")){
		    times+=1;
		  }
		}
		return times;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(countA("aaA")); //3
		System.out.println(countA("aaBBdf8k3AAadnklA")); //6
	}
}