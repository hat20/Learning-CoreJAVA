import java.util.*;
class num_to_words
{
public static void main(String args[])
{
int num;
num_to_words obj = new num_to_words();
System.out.println("Enter a number");
Scanner fp = new Scanner(System.in);
num = fp.nextInt();
String num_word = obj.words(num);
System.out.println(num + " -> " + num_word);
}


String words(int num)
{
String n[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
String str = "";

for(int i=num;i>0;i=i/10)
{
str = n[(i%10)] + " " +str;
}
return str;
}
}