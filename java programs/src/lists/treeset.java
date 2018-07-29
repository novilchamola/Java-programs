package lists;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset {
public static void main(String args[])
{
	TreeSet<String> hs=new TreeSet<String>();
	System.out.println();
	hs.add("abi");
	hs.add("sam");
	hs.add("ram");
	hs.add("Anil");
	hs.add("Manju");
	hs.add("Pinky");
	System.out.println(hs.size());
	System.out.println(hs);
Iterator it=hs.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
}
}