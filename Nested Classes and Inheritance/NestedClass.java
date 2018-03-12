
class OuterClass
{
	void display()
	{
		System.out.println("Display function of Outer Class Implemented");
	}

	class InnerClass
	{
		void display()
		{
			System.out.println("Display function of Inner Class Implemented");
		}
	}
}

class NestedClass
{
	public static void main(String args[])
	{
		OuterClass outerOb = new OuterClass();
		OuterClass.InnerClass innerOb = outerOb.new InnerClass();
		outerOb.display();
		innerOb.display();
	}
}