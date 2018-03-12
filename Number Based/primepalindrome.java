/*
Prime palindrome is a number that is simultaneously palindromic and prime 
*/

import java.util.*;
class primepalindrome
{
public static void main(String args[])
{
int num,i=0;
primepalindrome obj = new primepalindrome();
Scanner fp = new Scanner(System.in);
System.out.println("Enter a number :");
num = fp.nextInt();
if(obj.reverse(num) == true)
{
if(obj.prime(num)==true)
i=1;
}
if(i==1)
System.out.println("Number is a prime palindrome number");
else
System.out.println("Number is not a prime palindrome number");
}

boolean reverse(int n)
{
int i,rev = 0;
for(i=n;i>0;i=i/10)
{
rev = (rev*10) + (i%10);
}
if(n == rev)
return true;
else
return false;
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
