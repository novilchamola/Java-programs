package Arraylist;

import java.util.ArrayList;
import java.util.HashSet;

public class B {
public static void main(String args[]) {
	ArrayList al=new ArrayList();
	al.add(10);
	al.add(10);
	al.add("Abc");
	al.add("Abc");
	al.add("Xyz");
	System.out.println(al);
	HashSet hs=new HashSet();
	hs.addAll(al);
	System.out.println(hs);
	al.clear();
	al.addAll(hs);
	System.out.println(al);
}
}
