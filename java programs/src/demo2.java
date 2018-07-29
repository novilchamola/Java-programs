// to find white space inside a string
public class demo2 {
public static void main(String args[]) {
	String s="I love you";
	int count=0;
	char[] ch=s.toCharArray();
	for(int i=0;i<=ch.length-1;i++)
	{
		if(ch[i]==' ')
		{
			count++;
		}
	}
	System.out.print(count);
}
}
