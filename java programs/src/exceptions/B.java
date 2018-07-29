package exceptions;

public class B {
public static void main(String args[])
{
	String a=null;
	try
	{
		System.out.println(a.length());
		int arr[]=new int [-90];
	}
	catch(NegativeArraySizeException na)
	{
		int[] arr=new int[90];
	}
	catch(ArithmeticException a1)
	{
		System.out.println("Arithmetic Exception");
	}
	catch(NullPointerException ne)
	{
		System.out.println("Pointing to null value");
	}
	catch(Exception ac)
	{
		System.out.println("Exception class");
	}
}
}
