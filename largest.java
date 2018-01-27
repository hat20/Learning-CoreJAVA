//Program to compute the largest number amongst 3 predefined numbers
class largest
{
public static void main(String[] args)
{
	int x=137,y=114,z=258;
	largest obj = new largest();
//computing the larger number between x and y
	int l1 = obj.larger(x,y);
//computing the largest number
 	int l = obj.larger(l1,z);
    System.out.println("Greatest number is "+l);
}
//function to determine the larger number between the two
int larger(int x,int y)
{
	if(x>y)
		return x;
    else
   		return y;
}

}
