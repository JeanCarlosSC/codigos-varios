import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		String[] name = new String[size];
		in.nextLine();
		for(int i=0; i<size; i++){
		  name[i]=in.nextLine();
		}
		for(int i=0; i<size; i++){
		  System.out.print(name[i].charAt(0));
		}
	}
}