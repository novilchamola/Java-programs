package String;

public class count {
public static void main(String args[]) {
	int count=0;
	String s="I love java";
	for(int i=0;i<=s.length()-1;i++)
	{
		if(s.charAt(i)==' ')
		{
			count++;
		}
		System.out.print(count);
	}
}
}