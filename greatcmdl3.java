
class greatcmdl3
{
public static void main(String[] args)
{
System.out.println("X is "+ args[0]);

System.out.println("Y is "+ args[1]);

System.out.println("Z is "+ args[2]);

 int x= Integer.parseInt(args[0]),y=Integer.parseInt(args[1]),z=Integer.parseInt(args[2]);
 greatcmdl3 obj = new greatcmdl3();
 int l1 = obj.larger(x,y);
 int l = obj.larger(l1,z);
 System.out.println("Greatest number is "+l);
}
 int larger(int x,int y)
 {
  if(x>y)
   return x;
  else
   return y;
}
}