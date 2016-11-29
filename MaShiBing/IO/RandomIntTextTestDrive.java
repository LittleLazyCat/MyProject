import java.io.*;
public class RandomIntTextTestDrive 
{

	static String filename;//�ļ���
	static int intNum;//��������
	static int max,min;//���ֵ����Сֵ
	public static void main(String[] args) 
	{
		
		
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//���ڻ�ü�������
			try
			{
				String s ="";//����ÿ�μ�������
				File f = null;//�½�һ���ļ�����
				System.out.println("�������ļ�����");
				filename =  br.readLine();
				if(filename.length() != 0)//�ж��ļ����Ƿ�Ϊ��
				{
					f = new File("D:"+File.separator+filename+".txt");
					if(f.exists())//�ж��ļ��Ƿ����
					{ 
						f.delete();
					}
					f.createNewFile();
				}
				else
				{
					System.out.println("�����ļ�������");
					System.exit(-1);

				}
				System.out.println("����������������");
				s = br.readLine();
				if(s.length() != 0 && s!="0")//�ж���������������Ƿ�Ϊ���Լ���Ϊ0
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
					System.out.println("����������������");
					System.exit(-1);

				}
				System.out.println("��������С������");
				s = br.readLine();
				if(s.length() != 0)//�ж��������Сֵ�Ƿ�Ϊ��
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
					System.out.println("������С��������");
					System.exit(-1);

				}
				System.out.println("���������������");
				s = br.readLine();
				if(s.length() != 0)
				{
					try
					{
						max =Integer.parseInt(s);
						if(min >= max)//�ж���Сֵ�Ƿ�������ֵ
						{
							System.out.println("��Сֵ���ڻ�������ֵ");
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
					System.out.println("���������������");
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
					bw.flush();//��ջ���
					bw.close();//�ر���
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
