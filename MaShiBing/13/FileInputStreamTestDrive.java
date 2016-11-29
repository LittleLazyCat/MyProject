import java.io.*;
public class FileInputStreamTestDrive 
{
	public static void main(String[] args) 
	{
		int b = 0;
		FileInputStream in = null;
		try
		{
			in = new FileInputStream("d:\\111.txt");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("未发现文件！");
			System.exit(-1);
		}
		try
		{
			long num = 0;
			while ((b = in.read())!=-1)
			{
				System.out.print((char)b);
				num++;
			}
			in.close();
			System.out.println();
			System.out.println("共计读取了"+num+"个字节");
		}
		catch (IOException e)
		{
			System.out.println("文件读取错误！");
			System.exit(-1);
		}
		
	}
}
