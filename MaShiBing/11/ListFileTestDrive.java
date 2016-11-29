import java.io.*;
public class ListFileTestDrive
{
	public static void main(String[] args) 
	{
		File f = new File("F:/A");
		
		System.out.println("A");
		listFile(f,1);
	}
	public static void listFile(File f,int level)
	{
		String preStr = "";
		for(int i=0;i<level;i++)
		{
			preStr+="    ";
		}
		File[] fa = f.listFiles();
		for(int i =0;i<fa.length;i++)
		{
			
			System.out.println(preStr+fa[i].getName());
			if(fa[i].isDirectory())
			{
				listFile(fa[i],level+1);
			}
			
		}
	}
}
