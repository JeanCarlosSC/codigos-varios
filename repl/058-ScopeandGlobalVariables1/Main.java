class Main
{
  public static void main(String[] args)
  {
    String text = "hello";
    String output;
    
    if (text.indexOf(" ") == -1) //if a space doesn't exist
    {
    	output = "one word";
    }
    else
    {
    	output = "more than one word";
    }
    System.out.println(output);
  }
}