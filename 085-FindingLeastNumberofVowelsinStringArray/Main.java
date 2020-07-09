class Mainclass Main
{
	public static void main(String[] args) 
	{
		String[] arr = {"hey","yolo","hi","this is long"};
		System.out.println(minVowels(arr));
		//should print "hi"
	}
	public static String minVowels(String[] words)
	{
		int min = countVowels(words[0]);
	  int index = 0;
		for(int i=0; i<words.length; i++){
		  if(min >= countVowels(words[i])){
		    if(words[i].length() < words[index].length() 
          || min > countVowels(words[i])){
		      min = countVowels(words[i]);
		      index = i;
		    }
		  } 
		}
		return words[index];
	}
	public static int countVowels(String s)
	{
	  int quantity = 0;
		String vowels = "aeiou";
		for(int i=0; i<s.length(); i++){
		  if(isVowel(s.charAt(i))){
		    quantity += 1;
		  }
		}
		return quantity;
	}
	public static boolean isVowel(char ch)
	{
		return ch == 'a' || ch == 'e' || ch == 'i'
	      || ch == 'o' || ch == 'u' || ch == 'A'
	      || ch == 'E' || ch == 'I' || ch == 'O' 
	      || ch == 'U';
	}
}