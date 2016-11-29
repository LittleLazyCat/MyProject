//求指定字符串在某一字符串中出现的次数
public class SplitTestDrive
{
	public static void main(String[] args) 
	{
		String s = "booaaaaa:aoond:fooaaaaa";
		String t_s = "c";//指定字符串
		String[] sa1 = s.split(t_s,-2);
		String[] sa2 = s.split(t_s,0);
		int E_Count = sa1.length - sa2.length;//确定末尾出现了几次指定字符串
		int No_Count = 0;//中间出现非指定字符的个数，初始为0
		for(int i = 0;i<sa2.length;i++)
		{
			if(sa2[i].equals(""))
			{
				//System.out.println("empty");
			}
			else
			{
				//System.out.println(sa[i]);
				//取得中间非指定字符串的字符的个数
				char[] c =  sa2[i].toCharArray();
				No_Count +=c.length;
			}
		
		}
		int S_Count = (s.length() - No_Count - E_Count*t_s.length())/t_s.length();
		//前面指定字符串出现次数 = （总字符串长度 - 非指定字符的长度 - 末尾指定字符串出现的次数*指定字符串的长度）/ 指定字符串的长度
		int T_Count = S_Count + E_Count; //指定字符串出现次数 = 前面指定字符串出现次数 + 末尾指定字符串出现的次数
		System.out.println(T_Count);
	
	}
}
