class Main
{
	public static void main(String[] args)
	{
		int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2,2},
			{1,-2,3,-4}
		};
		System.out.println(countNegativeOdd(a)); //should print 3
	}
	public static int countNegativeOdd(int[][] array)
	{
	  int num=0;
		for(int i=0; i<array.length; i++){
		  for(int j=0; j<array[0].length; j++){
		    if(array[i][j]<0 && array[i][j]%2 != 0){
		      num++;
		    }
		  }
		}
		return num;
	}
}