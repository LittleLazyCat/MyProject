//��һ���ַ����д�д��ĸ����Сд��ĸ���ͷ�Ӣ����ĸ��
public class CompareChar 
{
	public static void main(String[] args) 
	{
		String s = "12345678";
		char[] ca = s.toCharArray();//���ַ���ת��Ϊ����
		int Total_Len = s.length(); //ca.length; //�ַ����ܳ���
		int S_Num=0;//����Сд��ĸ�ĸ���
		int B_Num=0;//�����д��ĸ�ĸ���
		for(int i=0;i<ca.length;i++)
		{	
			Character c = ca[i];
			if(c.compareTo('a')>=0&&c.compareTo('z')<=0)
			{
				S_Num++;
			}
			if(c.compareTo('A')>=0&&c.compareTo('Z')<=0)
			{
				B_Num++;
			}
		}
		int Other_Num = Total_Len - S_Num - B_Num;//�����ַ��ĸ��� = �ַ����ܳ��� - Сд��ĸ���� - ��д��ĸ����

		System.out.println("�ܣ�" + Total_Len+ ",Сд��"+S_Num+",��д��"+B_Num+"��������"+Other_Num);
	}
}
