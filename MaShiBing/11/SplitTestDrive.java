//��ָ���ַ�����ĳһ�ַ����г��ֵĴ���
public class SplitTestDrive
{
	public static void main(String[] args) 
	{
		String s = "booaaaaa:aoond:fooaaaaa";
		String t_s = "c";//ָ���ַ���
		String[] sa1 = s.split(t_s,-2);
		String[] sa2 = s.split(t_s,0);
		int E_Count = sa1.length - sa2.length;//ȷ��ĩβ�����˼���ָ���ַ���
		int No_Count = 0;//�м���ַ�ָ���ַ��ĸ�������ʼΪ0
		for(int i = 0;i<sa2.length;i++)
		{
			if(sa2[i].equals(""))
			{
				//System.out.println("empty");
			}
			else
			{
				//System.out.println(sa[i]);
				//ȡ���м��ָ���ַ������ַ��ĸ���
				char[] c =  sa2[i].toCharArray();
				No_Count +=c.length;
			}
		
		}
		int S_Count = (s.length() - No_Count - E_Count*t_s.length())/t_s.length();
		//ǰ��ָ���ַ������ִ��� = �����ַ������� - ��ָ���ַ��ĳ��� - ĩβָ���ַ������ֵĴ���*ָ���ַ����ĳ��ȣ�/ ָ���ַ����ĳ���
		int T_Count = S_Count + E_Count; //ָ���ַ������ִ��� = ǰ��ָ���ַ������ִ��� + ĩβָ���ַ������ֵĴ���
		System.out.println(T_Count);
	
	}
}
