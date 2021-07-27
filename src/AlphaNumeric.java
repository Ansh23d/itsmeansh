import java.util.Scanner;

public class AlphaNumeric
{
	
	StringBuffer mirror(String input)		
	{
		StringBuffer sb=new StringBuffer("");		//using string buffer
		int len=input.length()-1;
		sb.append(input);
		sb.append("|");
		for(int i=len;i>-1;i--)
		{
			char ch=input.charAt(i);
			sb.append(ch);
		}		
		return sb;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String in=sc.next();
		sc.close();
		AlphaNumeric an=new AlphaNumeric();
		System.out.println(an.mirror(in));
	}

}
