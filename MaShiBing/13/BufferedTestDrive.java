import java.io.*;
public class BufferedTestDrive 
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fin = new FileInputStream("f:\\bat.txt");
			BufferedInputStream bin = new BufferedInputStream(fin,2);
			int b = 0;
			bin.mark(1);
			while ((b = bin.read())!=-1)
			{
				System.out.print((char)b);
			}
			bin.reset();
		}
		catch (FileNotFoundException e1)
		{
			e1.printStackTrace();
		}
		catch (IOException e2)
		{
			e2.printStackTrace();
		}

		
	}
}
