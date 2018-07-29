package polymorphism;

public class father {
	void mrg()
	{
		System.out.println("arrange marriage");
	}
	void dowry()
	{
		System.out.println("2 crores");
	}
    void property()
    {
    	System.out.println("all the property");
    }
}
class son extends father
{
	void mrg()
	{
		System.out.println("love marriage");
	}
	void dowry()
	{
		System.out.println("No dowry");
	}
	void girl()
	{
		System.out.println("priya");
	}
}
class run
{
	public static void main(String args[])
	{
		son s=new son();
		s.mrg();
		s.dowry();
		s.girl();
		System.out.println("*******");
		father f=new son();
		f.mrg();
		f.dowry();
		f.property();
}
}
