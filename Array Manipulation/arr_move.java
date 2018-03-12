/*
This program moves the elements of the array.
For eg. - 2nd element moves to 4th
	- 4th element moves to 6th
	  ...
	-10th element moves to 0th..
*/

import java.util.*;
class arr_move
{
public static void main(String args[])
{
int a[] =  new int[11];
Scanner fp = new Scanner(System.in);
for(int i=0;i<=10;i++)
{
System.out.println("Enter an element for the array");
a[i] = fp.nextInt();
}

int temp =a[10];
for(int i=10;i>=2;i=i-2)
{
a[i] = a[i-2];
}
a[0]=temp;
System.out.println("Updated array is:");
for(int i =0;i<=10;i++)
{
System.out.println(a[i]);
}
}
}
