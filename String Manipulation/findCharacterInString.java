import java.util.*;
class findCharacterInString
{
public static void main(String args[])
{
Scanner fp = new Scanner(System.in);
System.out.println("Enter a string");
String str = fp.next();
System.out.println("Enter the character you want to find");
char ch = fp.next().charAt(0);
int p = str.indexOf(ch);
if(p==-1)
System.out.println("Character not found");
else
System.out.println("Character found at position number "+(p+1));
}
} 
