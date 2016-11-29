//求一个字符串中大写字母数，小写字母数和非英文字母数
public class CompareChar 
{
	public static void main(String[] args) 
	{
		String s = "12345678";
		char[] ca = s.toCharArray();//把字符串转换为数组
		int Total_Len = s.length(); //ca.length; //字符串总长度
		int S_Num=0;//保存小写字母的个数
		int B_Num=0;//保存大写字母的个数
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
		int Other_Num = Total_Len - S_Num - B_Num;//其他字符的个数 = 字符串总长度 - 小写字母个数 - 大写字母个数

		System.out.println("总：" + Total_Len+ ",小写："+S_Num+",大写："+B_Num+"，其他："+Other_Num);
	}
}
