class Main
{
	public static void main(String[] args)
	{
		int[][] a = {
			{1,2,3,4},
			{4,5,6,7},
			{1,3,5,7}
		};
		reduce10(a);
		//print the Array
		for(int[] row : a){
			for(int e : row){
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}
	
	public static void reduce10(int[][] nums)
	{
		for(int i=0; i<3; i++){
		  for(int j=0; j<4; j++){
		    nums[i][j] -= 10;
		  }
		}
	}
}