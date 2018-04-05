import java.util.Scanner;

class EmpObjArr extends EmployeeObjArr
{
	int salary;
	String designation;

	EmpObjArr(int a, String b,int i, String e)
	{
		super(a,b);
		salary = i;
		designation = e;
	}

	void display()
	{
		if(salary>20000)
		{
			super.display();
			System.out.println("Salary is Rs. " + salary);
			System.out.println("Designation is " + designation);
		}
	}

	public static void main(String args[])
	{
		Scanner fp = new Scanner(System.in);
		System.out.println("Enter the number of employees you want to enter");
		int n = fp.nextInt();
		EmpObjArr[] obj = new EmpObjArr[n];

		for(int i=0; i<n; i++)
		{
			System.out.println("Enter id of the employee -> ");
			int s = fp.nextInt();
			fp.nextLine();
			System.out.println("Enter name of the employee -> ");
			String ns = fp.nextLine();
			System.out.println("Enter Salary -> ");
			int sal = fp.nextInt();
			fp.nextLine();
			System.out.println("Enter designation of the employee -> ");
			String des = fp.nextLine();
			obj[i] = new EmpObjArr(s,ns,sal,des);
		}

		for(int i=0;i<n;i++)
		{
			obj[i].display();
		}
	}
}