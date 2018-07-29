package lists;


import java.util.LinkedList;

class linkedlist {
public static void main(String args[])
{
	LinkedList l=new LinkedList();
 l.add(10);
 l.add(null);
 l.add(10);
 l.add(10);
 l.add("ABC");
 l.add("X");
 System.out.println(l);
 l.addFirst("Qwerty");
 l.addLast("XYZ");
 System.out.println(l);
 for(Object obj:l)
 {
	 System.out.println(obj);
 }
}
}