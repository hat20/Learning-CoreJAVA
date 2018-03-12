//Program to find the reverse of a number
import java.util.*;
class rev_num
{

public static void main(String args[])
{
	Scanner fp = new Scanner(System.in);
	System.out.println("Enter the number you want reversed");
	int num = fp.nextInt();
//rev to store the reversed number and d to stored the extracted digit
	int rev=0,d;
//computing reverse of the number
	for(int i=num; i>0; i = i/10)
	{
	d = i%10;
	rev = (rev*10) + d;
	}

System.out.println("Original number was: "+num);
System.out.println("Reversed number is: "+rev);
}
}
