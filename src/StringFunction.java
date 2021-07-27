
public class StringFunction
{
	public static void main(String[] args) 
	{
		String s1="Hello World";
		System.out.println(s1);
		
		String s2="Ant";
		String s3="ant";
		
		System.out.println(s2.compareTo(s3));
		System.out.println(s2.compareToIgnoreCase(s3));
		
		System.out.println(s1.indexOf('o'));		//first occurrence
		System.out.println(s1.lastIndexOf('o'));	//last occurrence
		
		System.out.println(s1.length());
		
		System.out.println(s2.concat("Man"));
		
		System.out.println(s1.replace('o', 'a'));
		
		System.out.println(s1.substring(4)); 		//no end index mentioned, so printed till last
		System.out.println(s1.substring(0, 5));
		
		System.out.println(s1.trim());			//removes spaces at the start and end
		
		//NOTE: strings are immutable
	}

}
