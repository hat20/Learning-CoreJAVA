
import java.util.Scanner;

class InheritSuper
{
	int a,b;
	
	InheritSuper(int x, int y)
	{
		a=x;
		b=y;
	}
	
	void sum(int a,int b)
	{
		System.out.println("Sum of these numbers is "+ (a+b));
	}

	public static void main(String args[])
	{
		Scanner fp = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = fp.nextInt();
		int b = fp.nextInt();
		InheritSuper obj = new InheritSuper(a,b);
		obj.sum(a,b);

	}
}