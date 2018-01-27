//Program for calculating sum of the first 30 natural numbers excluding 10,20,30
class sum30
{
public static void main(String[] args)
{
	int x = 30,sum=0;
	for(int i = 1;i<=30;i++)
	{
	if(i == 10 || i ==20 || i ==30)
	continue;//continue causes the loop to immediately jump to the next iteration of the loop
	else
	sum = sum + i;
	}
	System.out.println("Sum of the integers " + sum);
} 
}
