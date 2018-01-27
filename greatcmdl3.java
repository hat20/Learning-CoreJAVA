/*
Finding the greatest of three numbers where the user will have to input the numbers on command line while running the class.
For implementing this class type - javac greatcmdl3.java
				 - java greatcmdl3 num1 num2 num3
num1,num2,num3 are the numbers among which you want to calculate the greatest.
*/
class greatcmdl3
{
public static void main(String[] args)
{
	System.out.println("X is "+ args[0]);
	System.out.println("Y is "+ args[1]);
	System.out.println("Z is "+ args[2]);
//converting the String type input to int in order to compute
	int x= Integer.parseInt(args[0]),y=Integer.parseInt(args[1]),z=Integer.parseInt(args[2]);
//creating an object of the class 
	greatcmdl3 obj = new greatcmdl3();
	int l1 = obj.larger(x,y);
	int l = obj.larger(l1,z);
	System.out.println("Greatest number is "+l);
}
//function to compute the larger between the two
int larger(int x,int y)
{
	if(x>y)
    	return x;
    else
   		return y;
}
}
