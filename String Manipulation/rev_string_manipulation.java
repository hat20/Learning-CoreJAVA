/*
This program aims to reverse a String without affecting the special characters.
For eg -:
Input - hjk;'43
Output - 34k;'jh
*/

import java.util.*;
class rev_string_manipulation
{
    public static void main(String args[])
    {
	rev_string_manipulation obj = new rev_string_manipulation();
	Scanner fp = new Scanner(System.in);
	String str = fp.nextLine();
	String rev = obj.rev_str(str);
	System.out.println("Old String was :"+str);
	System.out.println("New String is :"+rev);

    }

    String rev_str(String str)
    {
	int i,l = str.length();
	char ch;
	String temp = "",rev = "";
//Storing the alphabetic characters and numbers in a temporary string	
	for(i=0;i<l;i++)
	{
	ch = str.charAt(i);
	if(cond(ch))
	    temp = ch +temp;
	}
	
	int j=0;
//Wherever there was alphabetic character in the array is being replaced by the alphabet in the temp string
	
	for(i=0;i<l;i++)
	{
	    int c = (int)str.charAt(i);
 	    if(cond(c))
		rev = rev + temp.charAt(j++);
	    else
		rev = rev + (char)c;
	}
        return rev;
    }

    boolean cond(int ch)
    {
	if(ch>=65 && ch<=90 || ch>=97 && ch<=122 || ch>=48 && ch<=57)
	    return true;
	else 
	    return false;
    }
}