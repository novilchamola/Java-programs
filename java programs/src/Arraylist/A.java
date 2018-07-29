package Arraylist;

import java.util.ArrayList;

public class A {
public static void main(String args[])
{
	ArrayList al= new ArrayList();
		al.add(10);
		al.add(10.25f);
		al.add(10.5678);
		al.add(null);
		al.add("ABC");
		System.out.println(al);
		System.out.println(al.size());
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	
}
}
