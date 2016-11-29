import java.io.*;

public class BufferedWriteTestDrive 
{
	public static void main(String[] args) 
	{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("f:\\bat.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter( "f:\\bat.txt",true));
			String s = null;
			for(int i = 0;i<100;i++)
			{
				s = String.valueOf(Math.random());
				bw.write(s);
				bw.newLine();

			}
			bw.flush();
			while (br.readLine() != null)
			{
				s=br.readLine();
				System.out.println(s);
			}
			bw.close();
			br.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			
		}
		
	}
}
