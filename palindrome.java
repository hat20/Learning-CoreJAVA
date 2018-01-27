/*
A palindrome number is a number that remains the same when its digits are reversed. 
For eg - 123 isn't a palindrome number as 321 is not same as 123
       - 121 is a palindrome number as its reverse remains the same
*/

import java.util.*;
class palindrome
{

public static void main(String args[])
{
	//creating an object of the class
	palindrome obj = new palindrome();
	//creating Scanner class object
	Scanner fp = new Scanner(System.in);
	System.out.println("Enter the number you want to check");
	int num = fp.nextInt(); //stores the original number
	int rev = obj.reverse(num);//stores the reversed number

	System.out.println("Original number was: "+num);
	System.out.println("Reversed number is: "+rev);

	//checking if the number is palindrome
	if(obj.is_palindrome(num,rev))
		System.out.println("The number is palindrome");
	else
		System.out.println("The number is not palindrome");
}

//function to reverse a digit
int reverse(int num)
{
	//rev will store the reversed number while d stores the extracted digit
	int rev=0,d;
	
	/*initialising i as the original number and having computations on it so that after the
     computation of rev, we can compare it to num in order to find out whether number is
     palindrome or not
	*/
	
	for(int i=num; i>0; i = i/10)
	{
		d = extract_dig(i);
		rev = (rev*10) + d;
	}
	
	return rev;
}

//function for extracting the last digit of the number
int extract_dig(int j)
{
	return j%10;
}

//function to check whether the number is palindrome or not
boolean is_palindrome(int num,int rev)
{
if(num == rev)
	return true;
else
	return false;
}
}
