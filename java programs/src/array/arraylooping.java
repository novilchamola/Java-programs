package array;

public class arraylooping {
public static void main(String args[])
{
	int arr[]= {10,20,30,40,50};
	System.out.println("size="+arr.length);
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	System.out.println("Reverse");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}
}
}