import java.io.*;

class ReadingDataFromFile
{
	public static void main(String[] args)throws Exception
	{
	readFile();
	}

	public static void readFile()throws Exception
	{
		FileReader fr = new FileReader("C:/Users/htewa/Desktop/Programs/RndNum.txt");
		BufferedReader br = new BufferedReader(fr);

		String s;
		while((s=br.readLine())!= null)
		{
		System.out.println(s);
		}
		br.close();
		fr.close();
	}
}