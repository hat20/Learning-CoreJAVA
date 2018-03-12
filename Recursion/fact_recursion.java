/*
This program aims to find the factorial of a number using recursion.
*/


import java.util.*;
class fact_recursion
{
    public static void main(String args[])
    {
	fact_recursion obj = new fact_recursion();
	Scanner fp = new Scanner(System.in);
	System.out.println("Enter the number you want to find the factorial of :");
	int n = fp.nextInt();
	if(n>=0)
	{
	    int fac = obj.factorial(n);
	    System.out.println("Factorial of the number is : "+fac);
	}
	else
	{
	    System.out.println("Program not applicable for negative numbers.");
	}
	
    }

    int factorial(int n)
    {
	if(n <= 1)
	    return n;
	else
	    return n*factorial(n-1);
    }

}