package Arraylist;
import java.util.ArrayList;

public class conversion 
{
public static void main(String args[])
{
	ArrayList<Integer> al=new ArrayList<Integer>();//making an ArrayList
al.add(10);// adding elements to ArrayList
al.add(30);
al.add(20);
int[] arr=new int[al.size()];
for(int i=0;i<al.size();i++)
{
	arr[i]=al.get(i);
	System.out.println(arr[i]);
}
}
}
