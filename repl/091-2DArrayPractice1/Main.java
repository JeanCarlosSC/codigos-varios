class Main
{
	public static void main(String[] args)
	{
		double[][] a = {
			{1.4,2.0,3.3,2},
			{4,1.5,6.1,1},
			{1.2,3.1,4,1.6}
		};
		doubleArr(a);
		//prints array
		for(double[] row : a){
			for(double e : row){
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}
	public static void doubleArr(double[][] array)
	{
		for(int i=0; i<3; i++){
		  for(int j=0; j<5; j++){
		    array[i][j]*=2;
		  }
		}
	}
}