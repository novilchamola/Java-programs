package exceptions;

public class trycatch {
public static void main(String args[]) {
	{
		int a=10;
		try {
			System.out.println(a/0);
			}
		catch(ArithmeticException ac)
		{
			System.out.println("Change input from zero");
		}
		System.out.println("Hi");
	}
}
}
