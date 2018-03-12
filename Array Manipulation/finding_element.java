import java.util.*;
class finding_element
{
public static void main(String args[])
{
int j=0,i;
finding_element obj = new finding_element();
Scanner fp = new Scanner(System.in);
System.out.println("Enter the number you want to find");
int k = fp.nextInt();
System.out.println("Enter the number of elements in the array");
int n = fp.nextInt();
int arr[] = new int[n];
for(i=0;i<n;i++)
{
System.out.println("Enter an element for the array");
arr[i] = fp.nextInt();
}

for(i=0;i<n;i++)
{
if(arr[i] == k)
{
j=1;
break;
}
}

if(j==1)
System.out.println("Number found at "+(i+1)+" position");
else
System.out.println("Number not found");
}
}
