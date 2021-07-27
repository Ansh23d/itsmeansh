import java.util.StringTokenizer;
public class Tokenizer {

	
	public static void main(String[] args) 
	{
		String fruits="Apple,Orange,Banana";
		StringTokenizer stz=new StringTokenizer(fruits,",");
		while(stz.hasMoreTokens())				//checks if there are any tokens present in the string list
		{
			System.out.println(stz.nextToken());		//goes to the next item in the list, and the prev item is removed automatically(otherwise the while loop will be an infinite loop)
		}
		//Or simpler method
		String []frs=fruits.split(",");
		for (String f:frs)
		{
			System.out.println(f);
		}
	}

}