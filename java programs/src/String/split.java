package String;

public class split {
public static void main(String args[]) {
	String s="Java is very easy";
	String[] str=s.split("");
	for(int i=str.length-1;i>=0;i--)
	{
		System.out.print(str[i]+"");
	}
}
}
