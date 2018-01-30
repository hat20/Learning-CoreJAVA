/*
This is an object oriented programming based program which is based to perform certain operations such as addition, subtraction and multiplication on fractions
*/
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
int h = hcf(f3.num,f3.denum);
f3.num = f3.num/h;
f3.denum = f3.denum/h;
return f3;
}

Fraction sub(Fraction f1,Fraction f2)
{
Fraction f3 = new Fraction();
f3.num = (f1.num * f2.denum) - (f1.denum * f2.num);
f3.denum = f1.denum * f2.denum;
int h = hcf(f3.num,f3.denum);
f3.num = f3.num/h;
f3.denum = f3.denum/h;
return f3;
}

Fraction mul(Fraction f1,Fraction f2)
{
Fraction f3 = new Fraction();
f3.num = f1.num * f2.num;
f3.denum = f1.denum * f2.denum;
int h = hcf(f3.num,f3.denum);
f3.num = f3.num/h;
f3.denum = f3.denum/h;
return f3;
}

int hcf(int n,int d)
{
int h=1;
int div=1;
if(n>d && d>0)
div = d;
else if(n<d && n>0)
div = n;
else if(n<0 && d<0)
{
if(d>n)
div = n*(-1);
else
div = d*(-1);
}
for(int i=1;i<= div;i++)
{
if(n%i == 0 && d%i == 0)
h = i;
}
return h;
}



void display(Fraction f3)
{
if(f3.num == 0 || f3.denum ==1)
System.out.println("The fraction is "+f3.num);
else
System.out.println("The fraction is "+f3.num+"/"+f3.denum);

}


public static void main(String args[])
{
Fraction obj = new Fraction();
Scanner fp = new Scanner(System.in);
System.out.println("Enter numerator and denominator for f2");
int n = fp.nextInt();
int d = fp.nextInt();
if(d<0)
{
n = n*(-1);
d = d*(-1);
}
Fraction f1 = new Fraction();
Fraction f2 = new Fraction(n,d);

System.out.println("Performing ADDITION : ");
Fraction f3 = new Fraction();
f3 = obj.add(f1,f2);
obj.display(f3);

System.out.println("Performing SUBTRACTION : ");
Fraction f4 = new Fraction();
f4 = obj.sub(f1,f2);
obj.display(f4);

System.out.println("Performing MULTIPLICATION : ");
Fraction f5 = new Fraction();
f5 = obj.mul(f1,f2);
obj.display(f5);

}
}
