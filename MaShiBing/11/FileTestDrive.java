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
			System.out.println("文件名："+f.getAbsolutePath());
			System.out.println("文件大小："+f.length());
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
		String f2 ="F:/疯狂Java讲义/codes/MSB/11";
		File nf =new File(f2);
		File[] fa = nf.listFiles();
		for(int i =0;i<fa.length;i++)
		{
			System.out.println(fa[i].getName());
		}
		
	}
}
