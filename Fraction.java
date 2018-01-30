import java.util.*;
class Fraction
{
int num,denum;
Fraction()
{
num=1;
denum=2;
}
Fraction(int n,int d)
{
num = n;
denum = d;
}

Fraction add(Fraction f1,Fraction f2)
{
Fraction f3 = new Fraction();
f3.num = (f1.num * f2.denum) + (f1.denum * f2.num);
f3.denum = f1.denum * f2.denum;
return f3;
}

Fraction sub(Fraction f1,Fraction f2)
{
Fraction f3 = new Fraction();
f3.num = (f1.num * f2.denum) - (f1.denum * f2.num);
f3.denum = f1.denum * f2.denum;
return f3;
}

Fraction mul(Fraction f1,Fraction f2)
{
Fraction f3 = new Fraction();
f3.num = f1.num * f2.num;
f3.denum = f1.denum * f2.denum;
return f3;
}

void display(Fraction f3)
{
System.out.println("The fraction is "+f3.num+"/"+f3.denum);

}


public static void main(String args[])
{
Fraction obj = new Fraction();
Scanner fp = new Scanner(System.in);
System.out.println("Enter numerator and denominator for f2");
int n = fp.nextInt();
int d = fp.nextInt();

Fraction f1 = new Fraction();
Fraction f2 = new Fraction(n,d);

Fraction f3 = new Fraction();
f3 = obj.add(f1,f2);
obj.display(f3);

Fraction f4 = new Fraction();
f4 = obj.sub(f1,f2);
obj.display(f4);

Fraction f5 = new Fraction();
f5 = obj.mul(f1,f2);
obj.display(f5);

}
}
