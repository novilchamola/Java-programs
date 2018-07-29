package String;// to reverse the words of string  

public class reverse {
public static void main(String args[])
{
	String str="Java Developer";
	String revstr=" ";
	String[] s=str.split(" ");
	for(int i=0;i<=s.length-1;i++)
	{
		String str1=s[i];
		for(int j=str1.length()-1;j>=0;j--)
		{
			revstr= revstr + str1.charAt(j);
		}
		revstr= revstr + " ";
	}
	System.out.println(revstr + " ");
}
}
