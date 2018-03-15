import java.util.Scanner;

class InheritBase extends InheritSuper
{
	int a,b;
	InheritBase()
	{	
		super(0,0);
		a=0;
		b=0;
	}
	InheritBase(int x, int y)
	{
		super(x,y);
		a=x;
		b=y;
	}
	
	void mul(int a,int b)
	{
		super.sum(a,b);
		System.out.println("Product of these numbers is "+(a*b));
	}

	public static void main(String args[])
	{
		Scanner fp = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = fp.nextInt();
		int b = fp.nextInt();
		InheritBase obj = new InheritBase(a,b);
		obj.mul(a,b);
		
	}
}