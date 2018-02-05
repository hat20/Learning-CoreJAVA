import java.util.*;
class findStringInString
{
public static void main(String args[])
{
Scanner fp = new Scanner(System.in);
System.out.println("Enter a string/sentence");
String str = fp.nextLine();
System.out.println("Enter the string you want to find");
String s = fp.nextLine();
int p = str.indexOf(s);
if(p==-1)
System.out.println("String not found");
else
System.out.println("String found at position number "+(p+1));
}
} 
