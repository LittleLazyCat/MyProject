import java.io.*;
public class  FileOutputStreamTestDrive
{
	public static void main(String[] args) 
	{
		int b = 0;
		FileInputStream in = null;
		FileOutputStream out = null;
		try
		{
			in = new FileInputStream("f:\\���Java����\\codes\\MSB\\13\\FileInputStreamTestDrive.java");
			out = new FileOutputStream("d:/Backup/OUT.java");
			int num = 0;
			while ((b = in.read())!=-1)
			{
				out.write(b);
				num++;
			}
			in.close();
			out.close();
			System.out.println("����"+num+"���ַ�");
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
		}

		
	}
}
