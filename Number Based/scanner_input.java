//Program to show how to use scanner class for inputting data
//importing the java utility library which has scanner class
import java.util.*;
class scanner_input
{

void display(int i, float j,char c, String s)
{
	System.out.println("You entered the following");
	System.out.println("Integer -> "+i+"\nFloating point integer -> "+j+"\nCharacter -> "+c+"\nString -> "+s);
}

public static void main(String args[])
{
//creating a class object
	scanner_input obj = new scanner_input();
//creating a Scanner class object
	Scanner fp = new Scanner(System.in);
//Taking Integer as an input
	System.out.println("Enter any integer");
	int i = fp.nextInt();
//Taking Floating point integer as an input
	System.out.println("Enter any floating point integer");
	float j = fp.nextFloat();
//Taking character as an input
	System.out.println("Enter any character");
	char c = fp.next().charAt(0);
//Taking string as an input
	System.out.println("Enter any string");
	String s = fp.next();
//calling a function to display the values
	obj.display(i,j,c,s);
}


}
