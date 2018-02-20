import java.util.*;
class AcceptablePassword
{
public static void main(String args[])
{
AcceptablePassword obj = new AcceptablePassword();
Scanner fp = new Scanner(System.in);
System.out.println("Enter a string for password that is atlease 9 characters long and contains both upper and lower case letters: ");
int l;
String pass = "";
while(true)
{
pass = fp.nextLine();
l = pass.length();
if(obj.lengthAcc(l) && obj.alpha(pass,l))
break;
else
System.out.println("Criteria not fulfilled, Enter password again");
}

}

boolean lengthAcc(int l)
{
if(l>=9)
return true;
else
return false;
}

boolean alpha(String str,int l)
{
int e=0,d =0;
for(int i=0;i<l;i++)
{
int c = (int)str.charAt(i);
if(c >=65 && c<=91)
{
e=1;
break;
}
}
for(int i=0;i<l;i++)
{
int c = (int)str.charAt(i);
if(c >=97 && c<=122)
{
d=1;
break;
}
}
if(e==1 && d==1)
return true;
else
return false;
} 

}

