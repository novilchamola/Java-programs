package lists;

import java.util.HashSet;
import java.util.Iterator;

public class hasnext {
public static <E> void main(String args[])
{
	HashSet hs=new HashSet();
hs.add(10);
hs.add(10);
hs.add(null);
hs.add(10);
hs.add("ABC");
hs.add("ABC");
System.out.println(hs.size());
Iterator<E> it=hs.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
}
}
