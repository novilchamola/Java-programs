import java.util.Scanner;

//to get a character within the string
public class practicejava {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String str=sc.nextLine();
	System.out.println(str.charAt(2));
}
}