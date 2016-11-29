import java.io.*;
public class  OutputStreamWriterTestDrive
{
	public static void main(String[] args) 
	{
		try
		{
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d:\\bat.txt"));
			osw.write("22222222222222222qruoqiuroiquropiqurpuqoriuqpiruiquriquriurieuwiuqwiruiqow");
			osw.flush();
			
			System.out.println(osw.getEncoding());
			osw.close();
			osw = new OutputStreamWriter(new FileOutputStream("d:\\bat.txt",true),"ISO8859_1");

			osw.write("33333333333333qruoqiuroiquropiqurpuqoriuqpiruiquriquriurieuwiuqwiruiqow");
			osw.flush();
			
			System.out.println(osw.getEncoding());
			osw.close();



		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
