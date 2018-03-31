import java.util.Scanner;

class employee
{
int employee_id;
String employee_name;

employee(int i, String e)
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

employee obj1 = new employee(1,"Harshit");
employee obj2 = new employee(2,"Harsh");
employee obj3 = new employee(3,"Harshita");
employee obj4 = new employee(4,"Harry");
employee obj5 = new employee(5,"Rohit");
employee obj6 = new employee(6,"Rishabh");
employee obj7 = new employee(7,"ROhan");
obj1.display();
obj2.display();
obj3.display();
obj4.display();
obj5.display();
obj6.display();
obj7.display();

}

}