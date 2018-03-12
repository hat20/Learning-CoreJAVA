/*
This program aims to calculate the number of days there are in between the date you enter
and Jan 1st of the same year. Also, using the concept of Inheritance I have inherited the 
properties of isLeapYear class which can be seen on line 23 where I have called checkLeapYear
function which is a part of isLeapYear class. 
*/
import java.util.*;
class date_to_days extends isLeapYear
//extends keyword is used to inherit the properties of another class
{
public static void main(String args[])
{	
	Scanner fp = new Scanner(System.in);
	System.out.println("Enter a date in dd-mm-yyyy format");
	String date = fp.next();
//converting the String formatted date into integer values
	int dd = Integer.parseInt(date.substring(0,2));
	int mm = Integer.parseInt(date.substring(3,5));
	int yy = Integer.parseInt(date.substring(6));
//variable for storing number of days
	int num_days = 0;
	date_to_days obj = new date_to_days();
	int k = obj.checkLeapYear(yy);
//value of k would be 1 for leap year and 0 for non leap year
	int days_in_month[] = {0,31,28+k,31,30,31,30,31,31,30,31,30,31};
//running this iteration to add the days of the month that have already passed
	for(int i = 1;i<mm;i++)
	{
		num_days += days_in_month[i];
	}
//adding the number of days which have passed of the current month
	num_days += dd;
	System.out.println("The date you entered was: "+ dd+"-"+mm+"-"+yy);
	System.out.println("Total no. of days from 1st Jan of this year is: "+num_days);
}
} 
