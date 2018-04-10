import java.util.Scanner;

class eCarType extends eCar
{	
	eCarType(float a, float b,float c)
	{
		super(a,b,c);
	}
	public static void main(String args[])
	{
		Scanner fp = new Scanner(System.in);
		System.out.println("Enter start kilometer, end kilometer and number of liters consumed respectively");
		float a = fp.nextFloat();
		float b = fp.nextFloat();
		float c = fp.nextFloat();

		eCarType obj = new eCarType(a,b,c);

		if(obj.powerfulCar())
			System.out.println("It is a powerful car");
		else if(obj.economyCar())
			System.out.println("It is an economical car");
		else
			System.out.println("It is just a regular car");
	}	
}