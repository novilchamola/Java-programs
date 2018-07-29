package String;

public class concate {
	public static void main(String args[])
	{
		String s="Viraat";
		String s1="Anushka";
				System.out.println(s.hashCode());
		s=s.concat(s1); // main logic
		System.out.println(s);
		System.out.println(s1);
		String s2="Viraat";
		System.out.println(s2.hashCode());
		System.out.println(s2);
		s2=s2.concat(s);
		System.out.println(s2);
	}

}
    