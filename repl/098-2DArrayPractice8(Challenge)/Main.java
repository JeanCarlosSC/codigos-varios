class Main
{
	public static void main(String[] args)
	{
		int[][] a = {
			{-5,-2},
			{1,-5},
			{1,-2}
		};
		int[][] b = {
		    {1,1,0,1},
		    {1,1,1,1}
		};
		int[][] result = sumArray(a,b);
		//prints array, should match example on right
		for(int[] row : result){
			for(int e : row){
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}
	public static int[][] sumArray(int[][] arr1, int[][] arr2)
	{
	  int fila, columna;
	  
	  if(arr1.length>arr2.length)
	    fila = arr1.length;
	  else
	    fila = arr2.length;
	  if(arr1[0].length>arr2[0].length)
	    columna = arr1[0].length;
	  else
	    columna = arr2[0].length;
	  
	  int[][] sum=new int[fila][columna];
	  int a, b;
	  for(int i=0; i<fila; i++){
	    for(int j=0; j<columna; j++){
	      try{
	        a = arr1[i][j];
	      }catch(Exception ae){
	        a = 0;
	      }
	      try{
	        b = arr2[i][j];
	      }catch(Exception be){
	        b = 0;
	      }
	      sum[i][j] = a + b;
	    }
	  }
	  
		return sum;
	}
}