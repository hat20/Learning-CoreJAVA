import java.util.Scanner;

class emp extends employee
{
int salary;
String designation;

emp(int a, String b,int i, String e)
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
System.out.println("Salary is" + salary);
System.out.println("Designation is" + designation);
}
}

public static void main(String args[])
{

emp obj1 = new emp(1,"Harshit",25000,"Doc");

emp obj2 = new emp(2,"Harsh",12121,"Warden");

emp obj3 = new emp(3,"Harshita",55566,"Engg");

emp obj4 = new emp(4,"Harry",11111,"Help");

emp obj5 = new emp(5,"Rohit",66666,"Intern");

emp obj6 = new emp(6,"Rishabh",64545,"Part time");

emp obj7 = new emp(7,"ROhan",74545,"Worker");
obj1.display();
obj2.display();
obj3.display();
obj4.display();
obj5.display();
obj6.display();
obj7.display();

}

}