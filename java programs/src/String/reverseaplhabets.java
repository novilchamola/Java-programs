package String;// to set string in accending order

import java.util.Arrays;
import java.util.Scanner;

public class reverseaplhabets {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String d=s.nextLine();
	char c[]=d.toCharArray();
	Arrays.sort(c);;
	String f =String.valueOf(c);
	System.out.println("sorted string is " + f);
}
}
