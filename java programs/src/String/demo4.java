package String;

public class demo4 {
public static void main(String args[]) {
	StringBuffer sb=new StringBuffer("Hi");
	System.out.println(sb);
	sb.append("Hello");
	System.out.println(sb);
	StringBuffer sb1=new StringBuffer("Hi");
	System.out.println(sb.equals(sb1));
	StringBuffer sb2=sb1;
	System.out.println(sb2.equals(sb1));
}
}
