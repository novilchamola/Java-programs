package String;

public class insert {
public static void main(String args[])
{
	StringBuffer sb=new StringBuffer("Hi");
	System.out.println(sb);
	sb.append("Hello");
	System.out.println(sb);
	sb.insert(2,"Bye");
	System.out.println(sb);
}
}
