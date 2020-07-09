class Main
{
	public static void main(String[] args)
	{
		int[] a = {2,7,3,8,4};
		System.out.println(avgElements(a)); //should print 4.8
	}
	
	public static double avgElements(int[] array)	{
		double avg = 0;
		for(int i=0; i<array.length; i++){
		  avg += array[i];
		}
		return avg/=array.length;
	}
}