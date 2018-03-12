/*
EMIRP is a prime number whose reverse is also a prime number.
Note - Prime palindrome numbers such as 3,5,7,11,131,etc are not EMIRP numbers
*/

import java.util.*;
class emirp
{
public static void main(String args[])
{
int num,rev,i=0;
emirp obj = new emirp();
Scanner fp = new Scanner(System.in);
System.out.println("Enter a number :");
num = fp.nextInt();
rev = obj.reverse(num);
if(num == rev || obj.prime(rev)==false)
System.out.println("Number is not an EMIRP number");
else
System.out.println("Number is an EMIRP number");


}


int reverse(int n)
{
int i,rev = 0;
for(i=n;i>0;i=i/10)
{
rev = (rev*10) + (i%10);
}
return rev;
}

boolean prime(int n)
{
int i,c =0;
for(i=2;i<n;i++)
{
if(n%i==0)
{
c=1;
break;
}
}
if(c==1)
return false;
else
return true;
}
}
