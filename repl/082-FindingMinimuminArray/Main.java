class Main
{
	public static void main(String[] args) 
	{
		int[] arr = {5,12,-3,7,3,22};
		System.out.println(minValue(arr)); //should print -3
	}
	public static int minValue(int[] nums)
	{ 
	  int min = nums[0];
		for(int i=0; i<nums.length; i++){
		  if(min > nums[i]) min = nums[i];
		}
		return min;
	}
}