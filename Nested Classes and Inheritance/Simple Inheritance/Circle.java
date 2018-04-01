import java.util.Scanner;
class Circle extends Point
{
	double radius,area;	
	void calcLength()
	{
		radius = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
	}

	void calcArea()
	{
		area = 3.14 * radius * radius;
	}

	void display()
	{
		super.display();
		System.out.println("Radius is ->" + radius);
		System.out.println("Area is ->" + area);
	}

	public static void main(String args[])
	{
		Scanner fp = new Scanner(System.in);
		Circle obj = new Circle();
		System.out.println("Enter X coordinate of point 1");
		double a = fp.nextDouble();
		System.out.println("Enter Y coordinate of point 1");
		double b = fp.nextDouble();
		System.out.println("Enter X coordinate of point 2");
		double c = fp.nextDouble();
		System.out.println("Enter Y coordinate of point 2");
		double d = fp.nextDouble();

		obj.setPrint(a,b,c,d);
		obj.calcLength();
		obj.calcArea();
		obj.display();
	}
}