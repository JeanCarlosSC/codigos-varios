class Main
{
	public static String[] combineNames(String[] first_names, String[] last_names)
	{
		return new String[]{
	    String.format("%s %s",first_names[0], last_names[0]),
		  String.format("%s %s",first_names[1], last_names[1])
		};
	}
	
	public static void main(String[] args)
	{
		//feel free to test code here
	}
}