package exceptions;//exception is a super class exception. 
//If we are not sure about exception try using exception 
//class in catch block.
public class A {
public static void main(String args[]) {
String a=null;
try
{
	System.out.println(a.length());
}
catch(ArithmeticException ac)
{
	System.out.println("Arithmetic exception");
}
catch(Exception ac) 
{
	System.out.println("Exception can handle any exception");
}
}
}