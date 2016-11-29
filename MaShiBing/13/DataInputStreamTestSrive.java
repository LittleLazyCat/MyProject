import java.io.*;
public class DataInputStreamTestSrive
{
	public static void main(String[] args) 
	{
		try
		{
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			DataOutputStream dos = new DataOutputStream(bos);
			dos.writeDouble(Math.random());
			dos.writeInt((int)(Math.random()*10));
			dos.flush();
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			System.out.println(bis.available());
			DataInputStream dis = new DataInputStream(bis);
			System.out.println(dis.readDouble());
			System.out.println(dis.readInt());
			

		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		

		//System.out.println("Hello World!");
	}
}
