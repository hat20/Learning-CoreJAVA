
class SurnameChange
{
public static void main(String args[])
{
String s = "Sachin Tendulkar";
String s2 = "Amitabh Bachhan";

int l1 = s.indexOf(' ');
int l2 = s2.indexOf(' ');

String temp = s.substring(0,l1) +" "+ s2.substring(l2+1);
s2 = s2.substring(0,l2) +" "+ s.substring(l1+1);
s = temp;

System.out.println(s);
System.out.println(s2);
}
}