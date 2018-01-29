/*
This program aims to focus on the working of an array and therefore I have calculated :
-Minimum and Maximum element
-Sum of squares of each element
-Average of the elements in the array
*/
import java.util.*;
class array
{
public static void main(String args[])
{
//declaring an array of 10 elements
int a[] = new int[10];
int sumSq=0;//stores sum of square of each element
int sum = 0;//stores sum of each element
Scanner fp = new Scanner(System.in);
for(int i=0;i<10;i++)
{
System.out.println("Enter an element for the array");
a[i] = fp.nextInt();
}
//Assuming a[0] to be the max and min element
int max = a[0];
int min = a[0];

for(int i=0;i<10;i++)
{
//if any value is greater than that of max then it will become max
if(a[i]>max)
max = a[i];
//if any value is lesser than that of min then it will become min
else if(a[i]<min)
min = a[i];

sumSq += Math.pow(a[i],2);
sum += a[i];
}
float avg =(float) sum/10;

System.out.println("Maximum Integer is :"+max+" Minimum Integer is :"+min);
System.out.println("Sum of Square is:" +sumSq);
System.out.println("Average of numbers is:" +avg);
												
}
}
