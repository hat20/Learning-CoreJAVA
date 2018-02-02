import java.util.*;
class bubblesort
{
public static void main(String args[])
{
bubblesort obj = new bubblesort();
Scanner fp = new Scanner(System.in);
System.out.println("Enter the number of elements you want for the array");
int n = fp.nextInt();
int a[] = new int[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter an element for the array");
a[i] = fp.nextInt();
}

System.out.println("Original array :");
obj.display(a);
a = obj.sort(a);
System.out.println("Sorted array :");
obj.display(a);
}

void display(int a[])
{
for(int i=0; i< a.length;i++)
{
System.out.print(a[i]+ " ");
}
System.out.println(" ");
}

int[] sort(int a[])
{
int temp = 0;
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length -1-i;j++)
{
if(a[j]>a[j+1])
{
temp = a[j];
a[j]= a[j+1];
a[j+1] = temp;
}
}
}
return a;
}

}
