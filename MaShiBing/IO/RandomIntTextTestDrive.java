import java.io.*;
public class RandomIntTextTestDrive 
{

	static String filename;//文件名
	static int intNum;//整数个数
	static int max,min;//最大值，最小值
	public static void main(String[] args) 
	{
		
		
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//用于获得键盘输入
			try
			{
				String s ="";//保存每次键盘输入
				File f = null;//新建一个文件对象
				System.out.println("请输入文件名：");
				filename =  br.readLine();
				if(filename.length() != 0)//判断文件名是否为空
				{
					f = new File("D:"+File.separator+filename+".txt");
					if(f.exists())//判断文件是否存在
					{ 
						f.delete();
					}
					f.createNewFile();
				}
				else
				{
					System.out.println("输入文件名有误");
					System.exit(-1);

				}
				System.out.println("请输入整数个数：");
				s = br.readLine();
				if(s.length() != 0 && s!="0")//判断输入的整数个数是否为空以及不为0
				{
					try
					{
						intNum =Integer.parseInt(s);
						
					}
					catch (NumberFormatException e1)
					{
						System.out.println(e1.getMessage());
					}
					
				}
				else
				{
					System.out.println("输入整数个数有误");
					System.exit(-1);

				}
				System.out.println("请输入最小整数：");
				s = br.readLine();
				if(s.length() != 0)//判断输入的最小值是否为空
				{
					try
					{
						min =Integer.parseInt(s);
						
					}
					catch (NumberFormatException e1)
					{
						System.out.println(e1.getMessage());
					}
					
				}
				else
				{
					System.out.println("输入最小整数有误");
					System.exit(-1);

				}
				System.out.println("请输入最大整数：");
				s = br.readLine();
				if(s.length() != 0)
				{
					try
					{
						max =Integer.parseInt(s);
						if(min >= max)//判断最小值是否大于最大值
						{
							System.out.println("最小值大于或等于最大值");
							System.exit(-1);
						}
						
					}
					catch (NumberFormatException e1)
					{
						System.out.println(e1.getMessage());
					}
					
				}
				else
				{
					System.out.println("输入最大整数有误");
					System.exit(-1);

				}
				try
				{
					BufferedWriter bw = new BufferedWriter(new FileWriter(f));

					while(intNum>0)
					{
						Integer z = (int)(Math.random() *10);
						if((z = min+z)<max && (z-min!=0))
						{
							bw.write(z.toString());
							bw.newLine();
							intNum--;
						}
					}
					bw.flush();//清空缓存
					bw.close();//关闭流
				}
				catch (IOException e2)
				{
					System.out.println(e2.getMessage());
				}


			}
			catch (IOException e)
			{
				e.printStackTrace();
			}

		}
		catch (Exception e)
			{
				e.printStackTrace();
			}
		

		
	}
}
