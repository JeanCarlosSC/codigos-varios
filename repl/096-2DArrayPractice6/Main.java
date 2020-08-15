class Main
{
	public static void main(String[] args)
	{
		int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2,2},
			{1,-2,3,-4}
		};
		System.out.println(sumEvenIndex(a)); //should print -6
	}
	public static int sumEvenIndex(int[][] array)
	{
	  int sum=0;
		for(int i=0; i<array.length; i++){
		  for(int j=0; j<array[0].length; j++){
		    if(i%2 == 0 || j%2 == 0){
		      sum += array[i][j];
		    }
		  }
		}
		return sum;
	}
}