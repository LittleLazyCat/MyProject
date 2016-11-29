import java.io.*;
public class  SystemTestDrive
{
	public static void main(String[] args) 
	{
		try
		{
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(in);
			String s = br.readLine();
			while (s!=null)
			{
				if("exit".equalsIgnoreCase(s))
				{
					break;
				}
				System.out.println(s);
				s = br.readLine();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
		
	}
}
