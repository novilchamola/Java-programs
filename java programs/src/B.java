
public class B {
private int a=100;
private void m1()
{
	System.out.println("private method");
}
public static class run{
	public static void main(String args[])
	{
		B b=new B();
		System.out.println(b.a);
		b.m1();
}
}
}
