import java.util.Scanner;

public class Practice 
{
	static String changestr(String a)
	{
		String str="";
		int len=a.length();
		for (int i=0;i<len;i++)
		{
			char ch=a.charAt(i);
			if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U')
			{
				ch=(char)(ch+1);
			}
			
			else if(ch=='z')
				ch=(char)'a';
			else if(ch=='Z')
				ch=(char)'A';
			
			str=str+ch;
		}
		
		return str;
	}
	
	
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String a=sc.next();
		sc.close();
		System.out.println("Updates string"+" "+changestr(a));
		
	}

}
