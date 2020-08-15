class Main
{
	public static void main(String[] args) 
	{
		String[] arr = {"hey","yolo","hi","this is long"};
		System.out.println(maxLength(arr));
		//should print "this is long"
	}
	public static String maxLength(String[] words)
	{
	  int max = 0;
	  int index = 0;
		for(int i=0; i<words.length; i++){
		  if(max < words[i].length()){
		    max = words[i].length();
		    index = i;
		  } 
		}
		return words[index];
		
	}
}