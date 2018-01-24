
class sum30
{
public static void main(String[] args)
{
 int x = 30,sum=0;
for(int i = 1;i<=30;i++)
{
if(i == 10 || i ==20 || i ==30)
continue;
else
sum = sum + i;
}
System.out.println("Sum of the integers " + sum);
} 
}