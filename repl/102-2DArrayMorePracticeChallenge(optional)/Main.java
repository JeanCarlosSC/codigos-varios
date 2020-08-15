class Main
{
	public static void main(String[] args)
	{
		int[][] a = {
			{1,1,1},
			{1,1,1},
			{1,1,1}
		};
		System.out.println(isMagic(a)); //true
		int[][] b = {
			{1,1,2},
			{3,2,3},
			{1,4,1}
		};
		System.out.println(isMagic(b)); //false
		int[][] c = {
			{1,1,1},
			{2,2,2}
		};
		System.out.println(isMagic(c)); //false
		int[][] d = {
			{8,1,6},
			{3,5,7},
			{4,9,2}
		};
		System.out.println(isMagic(d)); //true
	}
	public static boolean isMagic(int[][] array)
	{
		if(array.length != array[0].length)
		  return false;
		  
		int[][][] values = new int[array.length+1][array.length+1][3];
		for(int i=0; i<array.length; i++){
		  for(int j=0; j<array.length; j++){
		    values[i+1][0][0]+=array[i][j];
		    values[0][j+1][0]+=array[i][j];
		    if(i==j){
		      values[0][0][1]+=array[i][j];
		    }
		    if((i+j)==(array.length-1)){
		      values[0][0][2]+=array[i][j];
		    }
		  }
		}
		
		int suma=values[0][0][2];
		
		for(int i=1; i<values.length; i++){
		  if(values[i][0][0] != suma)
		    return false;
		  if(values[0][i][0] != suma)
		    return false;
		}
		
		if(values[0][0][1] != suma)
		    return false;
		    
		return true;
	}
}