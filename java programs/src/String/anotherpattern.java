package String;// another way is in pattern1.java

public class anotherpattern {
public static void main(String args[]) {
	String s="qspider";
	for(int i=0;i<=s.length()-1;i++)
	{
		for(int j=0; j<=i;j++)
		{
			System.out.print(s.charAt(j));
		}
	System.out.println();
	}
}
}
