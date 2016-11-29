import java.io.*;
public class FileTestDrive
{
	public static void main(String[] args) 
	{
		String separator = File.separator;
		String filename = "myfile.txt";
		String directory = "mydir1"+separator+"mydir2";
		File f = new File(directory,filename);
		
		
		
		if(f.exists())
		{
			System.out.println("�ļ�����"+f.getAbsolutePath());
			System.out.println("�ļ���С��"+f.length());
		}else
		{
			f.getParentFile().mkdirs();
			try
			{
				f.createNewFile();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		String f2 ="F:/���Java����/codes/MSB/11";
		File nf =new File(f2);
		File[] fa = nf.listFiles();
		for(int i =0;i<fa.length;i++)
		{
			System.out.println(fa[i].getName());
		}
		
	}
}
