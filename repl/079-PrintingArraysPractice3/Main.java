import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i=0;i<5;i++)
		{
			arr[i] = input.nextInt();
		}
		//leave above alone!  write your code below
		System.out.print("{");
		for (int i=0;i<5;i++)
		{
		  String n = "";
		  if(i<4) n =",";
			System.out.print(arr[i]+n);
		}
		System.out.print("}");
		
	}
}