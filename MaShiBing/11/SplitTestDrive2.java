public class SplitTestDrive2 
{
	public static void main(String[] args) 
	{
		String s ="javaqqqqjavawwwwjava2222javajavajava";
		String t_String = "a";
		int count = 0;
		while(s.indexOf(t_String) >= 0)
		{
			count++;
			s=s.substring(s.indexOf(t_String) + t_String.length());
		}
		System.out.println(count);
	}
}
