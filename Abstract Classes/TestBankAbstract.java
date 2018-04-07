abstract class Bank
{    
	abstract int getRateOfInterest();    
}    


class Axis extends Bank
{    
	int getRateOfInterest(){return 7;}    
}    


class UBI extends Bank{    
	int getRateOfInterest(){return 8;}    
}    
    
class TestBankAbstract
{    
	public static void main(String args[])
	{    
	Bank b;  
	b=new UBI();  
	System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
	b=new Axis();  
	System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
	}
}  