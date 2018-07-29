package String;

public class palindrome {
public static void main(String args[])
{
	String s="Novil";
	String temp="";
	for (int i=s.length()-1;i>=0;i--)
	{
		System.out.println(s.charAt(i));
	}
System.out.print(s.equals(temp));
}
}