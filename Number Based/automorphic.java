import java.util.*;
import java.lang.Math;
class automorphic
{
public static void main(String args[])
{
automorphic obj = new automorphic();
Scanner fp = new Scanner(System.in);
System.out.println("Enter the number you want to check");
int num = fp.nextInt();
int num_dig = obj.count_dig(num);
int p = (int) Math.pow(10,num_dig);
int sq = num*num;
if(sq%p == num)
	System.out.println("It is an automorphic number");
else
	System.out.println("It is not an automorphic number");
}

int count_dig(int num)
{
	int count=0;
	for(int i=num;i>0;i/=10)
	{
		count++;
	}
	return count;
}
}
