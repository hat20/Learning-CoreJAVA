/*
Problem Statement :
Create a class Company with two inner classes Employee and Department inside it.
Both inner classes have instance variable ‘name’ of String type and their respective constructors to 
initialize employee and department names, respectively. 
Create a method public String getName() in both inner classes that returns the employee and department name respectively. 
Create methods public Employee employed() and public Department department() 
inside Company class to return objects of new employees and department names added. 
In main method, call a starter method with prototype starter(String empname, String depname) 
which calls the employed and department methods and print the newly added employee and department names 
using getName() inside this starter function. 

*/


import java.util.Scanner;

class Company
{	
	Scanner fp = new Scanner(System.in);
	class Employee
	{
		String name;
		Employee()
		{
			name = "";
		}
		public String getName(String s)
		{
			return s;
		}
	}
	
	class Department
	{
		String name;
		Department()
		{
			name = "";
		}
		public String getName(String s)
		{
			return s;
		}
	}
	
	public Employee employed(String s)
	{	
		Company ob = new Company();
		Company.Employee empOb = ob.new Employee();
		empOb.name = empOb.getName(s);
		return empOb;
	}

	public Department department(String s)
	{	
		Company ob = new Company();
		Company.Department depOb = ob.new Department();
		depOb.name = depOb.getName(s);
		return depOb;
	}
	
	public void starter(String empname, String depname)
	{
		Company ob = new Company();
		Company.Employee empOb = ob.new Employee();
		Company.Department depOb = ob.new Department();
		empOb = employed(empname);
		depOb = department(depname);		
		System.out.println("Name of the employee -> "+empOb.name);	
		System.out.println("Name of the department -> "+depOb.name);
	}
	
	public static void main(String args[])
	{
		Company ob = new Company();
		System.out.println("Enter name of employee");
		String s1 = ob.fp.nextLine();
		System.out.println("Enter name of department");
		String s2 = ob.fp.nextLine();
		ob.starter(s1,s2);
		
	}
	
}