import java.util.*;
class rev_num
{

public static void main(String args[])
{
Scanner fp = new Scanner(System.in);
System.out.println("Enter the number you want reversed");
int num = fp.nextInt();

int rev=0,d;

for(int i=num; i>0; i = i/10)
{
d = i%10;
rev = (rev*10) + d;
}

System.out.println("Original number was: "+num);
System.out.println("Reversed number is: "+rev);
}
}
