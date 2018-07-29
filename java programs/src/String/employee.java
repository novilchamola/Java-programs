package String;

public class employee
{
	int EmpId;
	String EmpName;
	public employee(int EmpId,String EmpName)
	{
		Super();
		this.EmpId=EmpId;
		this.EmpName=EmpName;
	}
	private void Super() {
	}
		public static void main(String args[])
		{
			employee e=new employee(10,"Ram");
			System.out.println(e.toString());
			String s= new String("Hello");
			System.out.println(s.toString());
		}
}
