package Arraylist;

import java.util.ArrayList;

public class c {
public static void main(String args[])
{
	int arr[]= {10,20,30};
	ArrayList<Integer> al=new ArrayList<Integer>();
	for(int i=0;i<arr.length;i++)
	{
			al.add(arr[i]);
	}
System.out.println(al);
System.out.println(al.size());
}
}
