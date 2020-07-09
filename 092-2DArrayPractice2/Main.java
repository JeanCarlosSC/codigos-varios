class Main
{
	public static void main(String[] args)
	{
		int[][] a = {
			{5,2,3,7},
			{1,5,2,2},
			{1,2,3,4}
		};
		System.out.println(sumRow(a,2)); //should print 10
		System.out.println(sumRow(a,0)); //should print 17
	}
	public static int sumRow(int[][] array, int row)
	{
	  int sum=0;
	  for(int j=0; j<array[0].length; j++){
	    sum+=array[row][j];
	  }
		return sum;
	}
}