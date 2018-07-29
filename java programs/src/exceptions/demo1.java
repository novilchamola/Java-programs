package exceptions;

public class demo1 {
public static void main(String args[])
{
int a=10;
int b=0;
try
{
	System.out.println(a/b);
}
catch(Exception e)
{
	e.printStackTrace();// to print the exact exception0
	b=2;
	System.out.println(a/b);
}
finally
{
	System.out.println("Mandatory code");
}
}
}
