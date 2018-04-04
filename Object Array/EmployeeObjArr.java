import java.util.Scanner;

class EmployeeObjArr
{
	int employee_id;
	String employee_name;

	EmployeeObjArr(int i, String e)
	{
		employee_id = i;
		employee_name = e;
	}

	void display()
	{
		System.out.println("Id no. is" + employee_id);
		System.out.println("Name is" + employee_name);
	}

	public static void main(String args[])
	{
		Scanner fp = new Scanner(System.in);
		System.out.println("Enter the number of employees you want to enter");
		int n = fp.nextInt();
		EmployeeObjArr[] obj = new EmployeeObjArr[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter id of the employee -> ");
			int s = fp.nextInt();
			System.out.println("Enter name of the employee -> ");
			String ns = fp.next();
			obj[i] = new EmployeeObjArr(s,ns);
		}

		for(int i=0;i<n;i++)
		{
			obj[i].display();
		}
	}

}