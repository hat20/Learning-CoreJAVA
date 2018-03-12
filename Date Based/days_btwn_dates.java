/*
This program aims to calculate the number of days there are in between the two dates you enter. Also, using the concept of Inheritance I have inherited the 
properties of isLeapYear class which is repeatedly being called to check if the year is leap or not 
*/
import java.util.*;
class days_btwn_dates extends isLeapYear
//extends keyword is used to inherit the properties of another class
{
public static void main(String args[])
{	
	Scanner fp = new Scanner(System.in);
	System.out.println("Enter the first date in dd-mm-yyyy format");
	String date1 = fp.next();
	System.out.println("Enter the second date in dd-mm-yyyy format");
	String date2 = fp.next();
//converting the String formatted date into integer values
	int dd1 = Integer.parseInt(date1.substring(0,2));
	int mm1 = Integer.parseInt(date1.substring(3,5));
	int yy1 = Integer.parseInt(date1.substring(6));
	int dd2 = Integer.parseInt(date2.substring(0,2));
	int mm2 = Integer.parseInt(date2.substring(3,5));
	int yy2 = Integer.parseInt(date2.substring(6));
//num_days is the variable for storing the number of days
	int num_days = 0;
	days_btwn_dates obj = new days_btwn_dates();

if(yy1 != yy2)//if the dates are of different years
{
//calculating the days between the first date and the end of that year

	int j = obj.checkLeapYear(yy1);
//value of j would be 1 for leap year and 0 for non leap year
	int days_in_month1[] = {0,31,28+j,31,30,31,30,31,31,30,31,30,31};
	
	num_days = days_in_month1[mm1] - dd1;
	for(int a = mm1+1; a<=12;a++)
		num_days += days_in_month1[a];

//calculating number of days between the two years
	for(int i=yy1+1;i<yy2;i++)
	{
		if(obj.checkLeapYear(i) == 1)
			num_days += 366;
		else
			num_days += 365;
	}

//calculating the days between the second date and 1st Jan of that year	
	int k = obj.checkLeapYear(yy2);
//value of k would be 1 for leap year and 0 for non leap year
	int days_in_month2[] = {0,31,28+k,31,30,31,30,31,31,30,31,30,31};
//running this iteration to add the days of the month that have already passed
	for(int b = 1;b < mm2;b++)
	{
		num_days += days_in_month2[b];
	}
//adding the number of days which have passed of the current month
	num_days += dd2;
	
}
else if(mm1==mm2) //if both dates are of same month and year
{
	num_days = dd2-dd1;

}
else //if both dates are in the same year but different months
{
	int k = obj.checkLeapYear(yy1);
//value of k would be 1 for leap year and 0 for non leap year
	int days_in_month[] = {0,31,28+k,31,30,31,30,31,31,30,31,30,31};
//running this iteration to add the days of the month that have already passed
	for(int i = mm1+1;i<mm2;i++)
	{
		num_days += days_in_month[i];
	}
//adding the number of days which have passed of the current month
	num_days += days_in_month[mm1]-dd1+dd2;
	
}
System.out.println("The date you entered was: "+ dd1+"-"+mm1+"-"+yy1+" and "+ dd2+"-"+mm2+"-"+yy2);
System.out.println("Total no. of days between both the days are: "+num_days);
} 
}
