import java.util.*;
class RemoveX
{
public static void main(String args[])
{
Scanner fp = new Scanner(System.in);
String str = fp.nextLine();
String s = "";
int l = str.length();
s = s+ str.charAt(0);

for(int i=1;i<(l-1);i++)
{
if(str.charAt(i)=='x')
continue;
else
s = s + str.charAt(i);
}

s = s+str.charAt(l-1);
System.out.println("Updated String -> " + s);

}
}