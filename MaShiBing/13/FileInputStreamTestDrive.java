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
			System.out.println("δ�����ļ���");
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
			System.out.println("���ƶ�ȡ��"+num+"���ֽ�");
		}
		catch (IOException e)
		{
			System.out.println("�ļ���ȡ����");
			System.exit(-1);
		}
		
	}
}
