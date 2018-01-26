import java.util.*;
class scanner_input
{

void display(int i, float j,char c, String s)
{
System.out.println("You entered the following");
System.out.println("Integer -> "+i+"\nFloating point integer -> "+j+"\nCharacter -> "+c+"\nString -> "+s);
}

public static void main(String args[])
{
scanner_input obj = new scanner_input();
Scanner fp = new Scanner(System.in);
System.out.println("Enter any integer");
int i = fp.nextInt();
System.out.println("Enter any floating point integer");
float j = fp.nextFloat();
System.out.println("Enter any character");
char c = fp.next().charAt(0);
System.out.println("Enter any string");
String s = fp.next();
obj.display(i,j,c,s);
}


}
