import java.util.*;
class ASCII_add
{
public static void main(String args[])
{
Scanner fp = new Scanner(System.in);
System.out.println("Enter any string");
String s = fp.nextLine();
int l = s.length();
int sum =0;

for(int i=0;i<l;i++)
sum += s.charAt(i);

System.out.println("Sum of the ASCII codes of the characters of the string is "+sum);

}
}