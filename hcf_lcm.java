import java.util.*;
class hcf_lcm
{
public static void main(String args[])
{
hcf_lcm obj = new hcf_lcm();
Scanner fp = new Scanner(System.in);
System.out.println("Enter the two numbers");
int n1 = fp.nextInt();
int n2 = fp.nextInt();
obj.display(n1,n2);
}
void display(int n1,int n2)
{
System.out.println("HCF of the two numbers is:"+hcf_num(n1,n2));
System.out.println("LCM of the two numbers is:"+lcm_num(n1,n2));
}

int hcf_num(int n1,int n2)
{
int h=1, div=1;
div = (n1>n2)?n2:n1;
for(int i = 1;i<=div;i++)
{
if(n1%i == 0 && n2%i==0)
h = i;
}
return h;
}

int lcm_num(int n1,int n2)
{
int h = hcf_num(n1,n2);
int l = ((n1*n2)/h);
return l;
}

}
