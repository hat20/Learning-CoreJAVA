import java.util.Scanner;

class Anagrams
{
	void isAnagram(String a,String b)
	{	
		//removing spaces from strings and converting them to lowercase
		String s1 = a.replaceAll("\\s","").toLowerCase();
		String s2 = b.replaceAll("\\s","").toLowerCase();

		boolean flag = true;

		if(s1.length() != s2.length())
			flag = false;
		else
		{
			for(int i=0; i < s1.length(); i++)
			{
				if(s1.indexOf(s2.charAt(i))>=0)
					flag = true;
				else
				{
					flag = false;
					return;
				}
			}
		}

		if(flag)
			System.out.println(a + " and " +b + " are anagrams");
		else
			System.out.println(a + " and " +b + " are not anagrams");
	}

	public static void main(String args[])
	{
		Anagrams obj = new Anagrams();
		Scanner fp = new Scanner(System.in);
		System.out.println("Enter two strings ");
		String s1 = fp.nextLine();
		String s2 = fp.nextLine();
		obj.isAnagram(s1,s2);

	}		
}