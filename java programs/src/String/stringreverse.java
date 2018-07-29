package String;
//Reverse words in a String
public class stringreverse {
	public static void main(String args[]) {
		String s="Java developer";
		String a[]= s.split(" ");
for(int i=a.length-1;i>=0;i--)
{
System.out.print(a[i]+ " ");
}
}
}