class Point
{
	double x1,y1,x2,y2;

	void setPrint(double a,double b,double c,double d)
	{
		x1 = a;
		y1 = b;
		x2 = c;
		y2 = d;

	}
	void display()
	{
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(x2);
		System.out.println(y2);
	}	
}