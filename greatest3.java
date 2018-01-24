
class greatest3
{
public static void main(String[] args)
{
 int x=137,y=114,z=258;
 greatest3 obj = new greatest3();
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