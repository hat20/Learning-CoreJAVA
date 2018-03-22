import java.util.Scanner;
class rev_recursion
{
	public static void main(String args[])
	{
		rev_recursion obj = new rev_recursion();
		Scanner fp = new Scanner(System.in);
		System.out.println("Enter the number you want to reverse");
		int n = fp.nextInt();
		System.out.println("Reversed number is "+ obj.rev(n,0));
	}

	int rev(int n,int r)
	{
		if(n > 0)
		{
			r = (r*10)+(n%10);
			r = rev(n/10,r);
		}
		return r;
	}
}