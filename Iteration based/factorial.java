
class factorial
{
public static void main(String[] args)
{
/*fac stores the value of factorial
x represents the number whose factorial we're going to find out
fac is initialised with 1 as we are multiplying it with numbers and would make no sense if it was initialised with 0 
also the factorial of 0 is 1 and with this initialisation we can output the same when x was 0
*/
    int x=5,fac=1;  
    for(int i=1;i<=x;i++)
        fac = fac * i;
    
    System.out.println("factorial is "+fac);
}
}