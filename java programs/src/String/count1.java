package String;

public class count1 {
public static void main(String args[]) {
	String s="I love java";
int count=0;
char[] ch=s.toCharArray();
for(int i=0;i<=ch.length;i++)
{
	if(ch[i]== ' ')
	{
		count++;
	}
}
}
}