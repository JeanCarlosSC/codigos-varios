class Main {
	public static void main(String[] args)
	{
		int[][] a = {
			{1,1,1},
			{1,1,1},
			{1,1,1}
		};
		System.out.println(isSquare(a)); //true
		
		int[][] b = {
			{1,1,1,1},
			{1,1,1,1},
			{1,1,1,1}
		};
		System.out.println(isSquare(b)); //false
	}
	public static boolean isSquare(int[][] array)
	{
		if(array.length == array[0].length)
		  return true;
		return false;
	}
}