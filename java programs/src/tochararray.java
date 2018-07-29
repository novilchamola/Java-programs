//program to find out white spaces inside the string
public class tochararray {
public static void main(String args[]) {
String s="I love you";
int count=0;
for(int i=0;i<=s.length()-1;i++)
{
	if(s.charAt(i)==' ')
	{
		count++;
	}
}
	System.out.print(count);
	
}
}
