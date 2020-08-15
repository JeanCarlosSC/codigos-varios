class Main
{
	public static void main(String[] args)//Perdón, lo quería intentar con excepciones :D
	{
		int[][] a = {
			{5,2,3,7},
			{1,5,1,1},
			{8,3,1,2}
		};
		System.out.println(max2Delement(a)); //should be 8
	}
	public static int max2Delement(int[][] nums)
	{
	  int i=0, j=0, highest=nums[0][0];
		while(true){
		  try{
		    if(highest<nums[i][j]){
		      highest=nums[i][j];
		    }
		  }catch(Exception e){
		    i=0;
		    j++;
		    try{
  		    if(highest<nums[i][j]){
  		      highest=nums[i][j];
  		    }
  		  }catch(Exception r){
  		    break;
  		  }
		  }
		  i++;
		}
		return highest;
	}
}