/* This program is to determine whether the entered year is leap or not 
To check for this - we first need to check whether the year is a century year or not:
For a century year to be a leap year it should be divisible by 400
For a non-century year to be a leap year it should be divisible by 4 
*/

import java.util.*;
class isLeapYear
{
public static void main(String args[])
{
	isLeapYear obj = new isLeapYear();
	Scanner fp = new Scanner(System.in);
	System.out.println("Enter the year you want to check");
	int year = fp.nextInt();
	if(obj.checkLeapYear(year)==1)
		System.out.println("It is a leap year");
	else
		System.out.println("It is not a leap year");
}

int checkLeapYear(int year)
{
//Checking for the century year
	if(year%100 == 0)
	{
		if(year%400 == 0)
			return 1;
		else
		    return 0;
	}
//checking for non-century year
	else if(year%4 == 0)
		return 1;
	else
		return 0;
}
}				    	
