import java.util.*;
class SelectionSort
{
	public static void main(String args[])
	{
		SelectionSort obj = new SelectionSort();
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
		int min,temp = 0;
		for(int i=0;i<a.length - 1;i++)
		{	
			min = i;
			for(int j= i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{	
					min = j;
				}
			}
			temp = a[min];
			a[min]= a[i];
			a[i] = temp;
		}
		return a;
	}
}
