package array;

import java.util.Scanner;

public class runtimearray {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array");
int size=sc.nextInt();
int arr[]=new int[size];
for(int i=0;i<size;i++)
{
	System.out.println("Enter the value for"+" "+i+" "+"Index");
	arr[i]=sc.nextInt();
}
for(int x:arr)
{
	System.out.println(x);
}
}
}
