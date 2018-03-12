import java.util.*;
class StringTest
{
Scanner fp = new Scanner(System.in);
public static void main(String args[])
{
StringTest obj = new StringTest();
System.out.println("Enter a string");
String str = obj.fp.nextLine();

System.out.println("Reversed string");
obj.reverse(str);
System.out.println("Concatenated string");
obj.concatenate(str);
System.out.println("Lowercase string");
obj.lowercase(str);
System.out.println("Comparing string");
obj.compare_str(str);
System.out.println("Inserting substring 'JAYPEE'");
obj.insert_str(str);
System.out.println("Appending a string");
obj.append_str(str);
System.out.println("Deleting string");
str = obj.delete(str);

}

void reverse(String str)
{
int l = str.length();
String s = "";
for(int i = l-1;i>=0;i--)
s = s + str.charAt(i);
display(s);
}

void concatenate(String str)
{
System.out.println("Enter a string to concatenate");
String s = fp.nextLine();
System.out.println("Concatenated string -> "+(str.concat(s)));
}

void lowercase(String s)
{
s = s.toLowerCase();
display(s);
}

void compare_str(String str)
{
System.out.println("Enter a string for comparing");
String s = fp.nextLine();
System.out.println("Using CompareTo.. will return 0 if equal otherwise -ve or +ve depending on which string is greater lexicographically");
System.out.println(str.compareTo(s));
System.out.println("Using equals");
System.out.println(s.equals(str));
}

void insert_str(String str)
{
String s = "JAYPEE";
System.out.println(str.substring(0,2)+s+str.substring(2));
}

void append_str(String str)
{
str = str + "JAYPEE";
display(str);
}

String delete(String str)
{
str = "";
return str;
}

void display(String s)
{
System.out.println(s);
}

}